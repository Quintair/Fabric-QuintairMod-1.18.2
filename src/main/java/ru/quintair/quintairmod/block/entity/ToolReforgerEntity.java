package ru.quintair.quintairmod.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import ru.quintair.quintairmod.item.ModItems;
import ru.quintair.quintairmod.item.inventory.ImplementedInventory;
import ru.quintair.quintairmod.screen.ToolReforgerScreenHandler;

public class ToolReforgerEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {

    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(4, ItemStack.EMPTY);


    public ToolReforgerEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.TOOL_REFORGER, pos, state);
    }

    @Override
    public Text getDisplayName() {
        return new LiteralText("Aboba Block");
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new ToolReforgerScreenHandler(syncId, inv, this);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, inventory);
        super.writeNbt(nbt);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
    }

    public static void tick(World world, BlockPos pos, BlockState state, ToolReforgerEntity entity) {
        if(hasRecipe(entity) && hasNotReachedStackLimit(entity)) {
            craftItem(entity);
        }
    }

    private static void craftItem(ToolReforgerEntity entity) {
        entity.removeStack(0, 1);
        entity.removeStack(1, 1);
        entity.removeStack(2, 1);

        entity.setStack(3, new ItemStack(ModItems.LOUFRIUM_INGOT,
                entity.getStack(3).getCount() + 1));
    }

    private static boolean hasRecipe(ToolReforgerEntity entity) {
        boolean hasItemInFirstSlot = entity.getStack(0).getItem() == ModItems.CRANBERRY_COOKIES;
        boolean hasItemInSecondSlot = entity.getStack(1).getItem() == Items.GOLDEN_PICKAXE;
        boolean hasItemInThirdSlot = entity.getStack(2).getItem() == ModItems.BALTIC_NINE;

        return hasItemInFirstSlot && hasItemInSecondSlot && hasItemInThirdSlot;
    }

    private static boolean hasNotReachedStackLimit(ToolReforgerEntity entity) {
        return entity.getStack(3).getCount() < entity.getStack(3).getMaxCount();
    }
}

package ru.quintair.quintairmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import ru.quintair.quintairmod.QuintairMod;

import javax.annotation.Nullable;
import java.util.List;

public class ModItems {

    public static final Item JADE_INGOT = ModItems.registerItem ("jade_ingot",
            new Item(new FabricItemSettings().maxCount(64).group(ModItemGroup.QUINTAIRGROUP)));

    public static final Item JADE_NUGGET = ModItems.registerItem("jade_nugget",
            new Item(new FabricItemSettings().maxCount(64).group(ModItemGroup.QUINTAIRGROUP)));

    public static final Item DRY_FUEL = ModItems.registerItem("dry_fuel",
            new Item(new FabricItemSettings().maxCount(8).group(ModItemGroup.QUINTAIRGROUP)));

    public static final Item CRANBERRY_SNACK = ModItems.registerItem("cranberry_snack",
            new Item(new FabricItemSettings().maxCount(64).group(ItemGroup.FOOD).food(ModFoodComponents.CRANBERRY_SNACK)));

    public static final Item BALTIC_NINE = ModItems.registerItem("baltic_nine",
            new Item(new FabricItemSettings().maxCount(16).group(ItemGroup.FOOD).food(ModFoodComponents.BALTIC_NINE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(QuintairMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        QuintairMod.LOGGER.info("Registering Mod Items for " + QuintairMod.MOD_ID);
    }

}

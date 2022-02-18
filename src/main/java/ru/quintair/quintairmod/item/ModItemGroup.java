package ru.quintair.quintairmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import ru.quintair.quintairmod.QuintairMod;

public class ModItemGroup {

    public static final ItemGroup QUINTAIRGROUP = FabricItemGroupBuilder.
            build(new Identifier(QuintairMod.MOD_ID, "quintairgroup"),
                    () -> new ItemStack(ModItems.JADE_INGOT));

}

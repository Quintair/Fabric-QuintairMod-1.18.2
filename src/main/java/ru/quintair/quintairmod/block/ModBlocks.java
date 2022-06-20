package ru.quintair.quintairmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.quintair.quintairmod.QuintairMod;
import ru.quintair.quintairmod.item.ModItemGroups;

public class ModBlocks {

    public static final Block LOUFRIUM_BLOCK = registerBlock("loufrium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroups.QUINTAIRGROUP);

    public static final Block LOUFRIUM_ORE = registerBlock("loufrium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroups.QUINTAIRGROUP);



    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(QuintairMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup group){
        Registry.register(Registry.ITEM, new Identifier(QuintairMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        QuintairMod.LOGGER.debug("Registering Mod Blocks for " + QuintairMod.MOD_ID);
    }

}

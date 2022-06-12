package ru.quintair.quintairmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
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
import ru.quintair.quintairmod.item.ModItemGroup;

import javax.annotation.Nullable;
import java.util.List;

public class ModBlocks {

    public static final Block JADE_BLOCK = registerBlock("jade_block",
        new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.QUINTAIRGROUP);

    public static final Block JADE_ORE = registerBlock("jade_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.QUINTAIRGROUP);



    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(QuintairMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup group){
        Registry.register(Registry.ITEM, new Identifier(QuintairMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        QuintairMod.LOGGER.info("Registering Mod Blocks for " + QuintairMod.MOD_ID);
    }

}

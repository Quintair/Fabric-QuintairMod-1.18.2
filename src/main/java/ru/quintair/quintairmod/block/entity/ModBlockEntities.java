package ru.quintair.quintairmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.quintair.quintairmod.QuintairMod;
import ru.quintair.quintairmod.block.ModBlocks;

public class ModBlockEntities {

    public static BlockEntityType<LoufriumBlockEntity> LOUFRIUM_BLOCK;

    public static void registerAllBlockEntities(){
        LOUFRIUM_BLOCK = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(QuintairMod.MOD_ID, "loufrium_block"), FabricBlockEntityTypeBuilder.
                        create(LoufriumBlockEntity::new, ModBlocks.LOUFRIUM_BLOCK).build(null));
    }


}

package ru.quintair.quintairmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.quintair.quintairmod.QuintairMod;
import ru.quintair.quintairmod.block.ModBlocks;

public class ModBlockEntities {

    public static BlockEntityType<ToolReforgerEntity> TOOL_REFORGER;

    public static void registerAllBlockEntities() {
        TOOL_REFORGER = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(QuintairMod.MOD_ID, "tool_reforger"), FabricBlockEntityTypeBuilder.
                        create(ToolReforgerEntity::new, ModBlocks.TOOL_REFORGER).build(null));
    }


}

package ru.quintair.quintairmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;
import ru.quintair.quintairmod.block.ModBlocks;
import ru.quintair.quintairmod.screen.LoufriumBlockScreen;
import ru.quintair.quintairmod.screen.ModScreenHandlers;

public class QuintairModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MUSHROOM_TINDER, RenderLayer.getCutout());

        ScreenRegistry.register(ModScreenHandlers.LOUFRIUM_BLOCK_SCREEN_HANDLER, LoufriumBlockScreen::new);

    }
}

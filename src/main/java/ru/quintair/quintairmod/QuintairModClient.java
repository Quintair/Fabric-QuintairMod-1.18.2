package ru.quintair.quintairmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import ru.quintair.quintairmod.screen.LoufriumBlockScreen;
import ru.quintair.quintairmod.screen.ModScreenHandlers;

public class QuintairModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ScreenRegistry.register(ModScreenHandlers.LOUFRIUM_BLOCK_SCREEN_HANDLER, LoufriumBlockScreen::new);

    }
}

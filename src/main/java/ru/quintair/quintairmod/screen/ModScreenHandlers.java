package ru.quintair.quintairmod.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import ru.quintair.quintairmod.QuintairMod;

public class ModScreenHandlers {
    public static ScreenHandlerType<ToolReforgerScreenHandler> TOOL_REFORGER_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(QuintairMod.MOD_ID, "tool_reforger"),
                    ToolReforgerScreenHandler::new);

}

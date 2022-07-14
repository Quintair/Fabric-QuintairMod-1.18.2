package ru.quintair.quintairmod.painting;

import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.quintair.quintairmod.QuintairMod;

public class ModPaintings {

    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(QuintairMod.MOD_ID, name), paintingMotive);
    }

    public static void registerPaintings() {
        QuintairMod.LOGGER.info("Registering Paintings for " + QuintairMod.MOD_ID);
    }
}

package ru.quintair.quintairmod.potion;

import net.minecraft.potion.Potion;
import net.minecraft.util.registry.Registry;
import ru.quintair.quintairmod.QuintairMod;

public class ModPotions extends Potion {

    public ModPotions() {
    }

    private static Potion register(String name, Potion potion) {
        return (Potion) Registry.register(Registry.POTION, name, potion);
    }

    public static void registerModPotion() {
        QuintairMod.LOGGER.debug("Registering Mod Potion for " + QuintairMod.MOD_ID);
    }

    static {

    }
}

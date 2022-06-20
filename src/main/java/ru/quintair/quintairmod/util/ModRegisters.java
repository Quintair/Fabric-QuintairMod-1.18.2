package ru.quintair.quintairmod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import ru.quintair.quintairmod.QuintairMod;
import ru.quintair.quintairmod.item.ModItems;

public class ModRegisters {

    public static void registerModStuffs() {
        registerFuels();
    }

    public static void registerFuels(){
        QuintairMod.LOGGER.debug("Registering Fuels for " + QuintairMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.DRY_FUEL, 6000);
    }

}

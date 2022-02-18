package ru.quintair.quintairmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.quintair.quintairmod.QuintairMod;

public class ModItems {
    //TODO Сделать крафты в 1-ну ячейку.

    public static final Item JADE_INGOT = registerItem("jade_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.QUINTAIRGROUP).maxCount(64)));

    public static final Item JADE_NUGGET = registerItem("jade_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.QUINTAIRGROUP).maxCount(64)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(QuintairMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        QuintairMod.LOGGER.info("Registering Mod Items for " + QuintairMod.MOD_ID);
    }

}

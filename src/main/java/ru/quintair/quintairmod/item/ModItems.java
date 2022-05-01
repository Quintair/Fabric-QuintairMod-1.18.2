package ru.quintair.quintairmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.quintair.quintairmod.QuintairMod;

public class ModItems {

    public static final Item JADE_INGOT = ModItems.registerItem ("jade_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.QUINTAIRGROUP).maxCount(64)));

    public static final Item JADE_NUGGET = ModItems.registerItem("jade_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.QUINTAIRGROUP).maxCount(64)));

    public static final Item DRY_FUEL = ModItems.registerItem("dry_fuel",
            new Item(new FabricItemSettings().group(ModItemGroup.QUINTAIRGROUP).maxCount(8)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(QuintairMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        QuintairMod.LOGGER.info("Registering Mod Items for " + QuintairMod.MOD_ID);
    }

}

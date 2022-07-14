package ru.quintair.quintairmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import ru.quintair.quintairmod.QuintairMod;
import ru.quintair.quintairmod.custom.ModMusicDiscItem;
import ru.quintair.quintairmod.item.custom.BalticNine;
import ru.quintair.quintairmod.sound.ModSounds;

public class ModItems {

    //Items

    public static final Item LOUFRIUM_INGOT = ModItems.registerItem("loufrium_ingot",
            new Item(new FabricItemSettings().maxCount(64).group(ModItemGroups.QUINTAIRGROUP)));

    //Fuels

    public static final Item DRY_FUEL = ModItems.registerItem("dry_fuel",
            new Item(new FabricItemSettings().maxCount(8).group(ModItemGroups.QUINTAIRGROUP)));

    //Foods

    public static final Item CRANBERRY_COOKIES = ModItems.registerItem("cranberry_cookies",
            new Item(new FabricItemSettings().maxCount(64).group(ItemGroup.FOOD).food(ModFoodComponents.CRANBERRY_COOKIES)));

    public static final Item BALTIC_NINE = ModItems.registerItem("baltic_nine",
            new BalticNine(new FabricItemSettings().maxCount(16).group(ItemGroup.FOOD).food(ModFoodComponents.BALTIC_NINE)));

    //Musics

    public static final Item ENIGMATIC_MUSIC_DISC = ModItems.registerItem("enigmatic_music_disc",
            new ModMusicDiscItem(16, ModSounds.ENIGMATIC,
                    new FabricItemSettings().maxCount(1).group(ModItemGroups.QUINTAIRGROUP).rarity(Rarity.RARE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(QuintairMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        QuintairMod.LOGGER.debug("Registering Mod Items for " + QuintairMod.MOD_ID);
    }

}

package ru.quintair.quintairmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.quintair.quintairmod.block.ModBlocks;
import ru.quintair.quintairmod.item.ModItems;
import ru.quintair.quintairmod.potion.ModPotions;
import ru.quintair.quintairmod.util.ModRegisters;

public class QuintairMod implements ModInitializer {

	public static final String MOD_ID = "quintairmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegisters.registerFuels();

		LOGGER.info("Hello Fabric world!");
	}
}

package ru.quintair.quintairmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.quintair.quintairmod.item.ModItems;

public class QuintairMod implements ModInitializer {

	public static final String MOD_ID = "quintairmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}

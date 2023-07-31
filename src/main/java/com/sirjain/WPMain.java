package com.sirjain;

import com.sirjain.content.WPItems;
import com.sirjain.content.WPUtil;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WPMain implements ModInitializer {
	public static final String MOD_ID = "wither_potions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Wither Potions mod!");

		WPItems.registerItems();
		WPUtil.registerPotions();
		WPUtil.addRecipes();
	}
}
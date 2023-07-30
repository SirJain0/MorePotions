package com.wither_potion;

import com.wither_potion.potion.WitherPotions;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WitherPotion implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("wither_potion");
	public static final String MOD_ID = "wither_potion";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Wither Potion mod!");
		WitherPotions.registerPotions();
		WitherPotions.addRecipes();
	}
}
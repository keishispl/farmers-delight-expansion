package io.github.keishispl;

import io.github.keishispl.register.EffectRegister;
import io.github.keishispl.register.ItemRegister;
import io.github.keishispl.register.TabRegister;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodExpansion implements ModInitializer {
	public static final String MOD_ID = "farmersdelightexpansion";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		FoodExpansion.LOGGER.info("[FoodExpansion] Farmer's Delight exists! Thank you!");
		FoodExpansion.LOGGER.info("[FoodExpansion] Loading delicious meals...");
		ItemRegister.init();
		TabRegister.init();
		EffectRegister.init();
		FoodExpansion.LOGGER.info("[FoodExpansion] Successfully loaded! Have fun!");
	}
}
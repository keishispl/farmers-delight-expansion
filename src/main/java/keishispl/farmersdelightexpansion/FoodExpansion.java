package keishispl.farmersdelightexpansion;

import keishispl.farmersdelightexpansion.registry.ModBlocks;
import keishispl.farmersdelightexpansion.registry.ModStatusEffects;
import keishispl.farmersdelightexpansion.registry.ModItems;
import keishispl.farmersdelightexpansion.registry.ModCreativeTabs;
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
		ModStatusEffects.STATUS_EFFECT.register();
		ModBlocks.BLOCKS.register();
		ModItems.ITEMS.register();
		ModCreativeTabs.CREATIVE_TABS.register();
		FoodExpansion.LOGGER.info("[FoodExpansion] Successfully loaded! Have fun!");
	}
}
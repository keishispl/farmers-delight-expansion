package net.kacey__;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.kacey__.project.lists.loadFeatures;

public class KaceysMod implements ModInitializer {
	public static final String MOD_ID = "kaceysmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("kaceysmod");

	@Override
	public void onInitialize() {
		KaceysMod.LOGGER.info("[Kacey's Mod] Loading Mod...");
		loadFeatures.features();
		loadFeatures.tab();
		KaceysMod.LOGGER.info("[Kacey's Mod] Loaded Successfully! Have fun!");
	}
}
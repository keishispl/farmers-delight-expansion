package net.kacey__;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KaceysDatapack implements ModInitializer {
	public static final String MOD_ID = "kaceysdatapack";
    public static final Logger LOGGER = LoggerFactory.getLogger("kaceysdatapack");

	@Override
	public void onInitialize() {
		KaceysDatapack.LOGGER.info("Loading Kacey's Datapack...");
	}
}
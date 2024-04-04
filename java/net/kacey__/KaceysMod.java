package net.kacey__;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.kacey__.project.*;

public class KaceysMod implements ModInitializer {
	public static final String MOD_ID = "kaceysmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("kaceysmod");

	@Override
	public void onInitialize() {
		load.all();
	}
}
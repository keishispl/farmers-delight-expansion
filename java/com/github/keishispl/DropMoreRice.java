package com.github.keishispl;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DropMoreRice implements ModInitializer {
	public static final String MOD_ID = "getmorerice";
    public static final Logger LOGGER = LoggerFactory.getLogger("getmorerice");
	@Override
	public void onInitialize() {
		DropMoreRice.LOGGER.info("[DropMoreRice] Loading...");
	}
}
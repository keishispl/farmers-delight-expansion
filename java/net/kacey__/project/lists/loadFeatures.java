package net.kacey__.project.lists;

import net.kacey__.KaceysMod;
import net.kacey__.project.features;
import net.kacey__.project.settings.loadRegister;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class loadFeatures {
	public static void features() {
		loadRegister.block("quartz_tiles", features.QUARTZ_TILES);
		loadRegister.block("quartz_tile_stairs", features.QUARTZ_TILE_STAIRS);
		loadRegister.block("quartz_tile_slab", features.QUARTZ_TILE_SLAB);

		loadRegister.block("cleansed_amethyst", features.CLEANSED_AMETHYST);
		loadRegister.block("cleansed_amethyst_bricks", features.CLEANSED_AMETHYST_BRICKS);
		loadRegister.item("amethyst_sheet", features.AMETHYST_SHEET);
		loadRegister.item("condensed_amethyst", features.CONDENSED_AMETHYST);
		loadRegister.item("amethyst_core", features.AMETHYST_CORE);
		loadRegister.item("amethyst_netherite_ingot", features.AMETHYST_NETHERITE_INGOT);
		loadRegister.item("amethyst_longsword", features.AMETHYST_LONGSWORD);

		loadRegister.item("metal_sheet", features.METAL_SHEET);
		loadRegister.block("metal_block", features.METAL_BLOCK);
		loadRegister.block("metal_pillar", features.METAL_PILLAR);
		loadRegister.block("metal_scaffolding", features.METAL_SCAFFOLDING);
		loadRegister.block("metal_walkway", features.METAL_WALKWAY);

		loadRegister.block("polished_diorite_bricks", features.POLISHED_DIORITE_BRICKS);
		loadRegister.block("polished_diorite_brick_stairs", features.POLISHED_DIORITE_BRICK_STAIRS);
		loadRegister.block("polished_diorite_brick_slab", features.POLISHED_DIORITE_BRICK_SLAB);
		loadRegister.block("polished_diorite_brick_wall", features.POLISHED_DIORITE_BRICK_WALL);
		loadRegister.block("polished_andesite_bricks", features.POLISHED_ANDESITE_BRICKS);
		loadRegister.block("polished_andesite_brick_stairs", features.POLISHED_ANDESITE_BRICK_STAIRS);
		loadRegister.block("polished_andesite_brick_slab", features.POLISHED_ANDESITE_BRICK_SLAB);
		loadRegister.block("polished_andesite_brick_wall", features.POLISHED_ANDESITE_BRICK_WALL);
		loadRegister.block("polished_granite_bricks", features.POLISHED_GRANITE_BRICKS);
		loadRegister.block("polished_granite_brick_stairs", features.POLISHED_GRANITE_BRICK_STAIRS);
		loadRegister.block("polished_granite_brick_slab", features.POLISHED_GRANITE_BRICK_SLAB);
		loadRegister.block("polished_granite_brick_wall", features.POLISHED_GRANITE_BRICK_WALL);

		loadRegister.item("smallsword", features.SMALLSWORD);
	}
	public static void tab() {
		Registry.register(Registries.ITEM_GROUP, new Identifier(KaceysMod.MOD_ID, "main"), creativeTab.CREATIVE_TAB);
		KaceysMod.LOGGER.info("[Kacey's Mod] Loaded Creative TAB");
	}
	public static void all() {
	}
}

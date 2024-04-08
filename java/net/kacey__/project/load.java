package net.kacey__.project;

import net.kacey__.KaceysMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class load {
	public static void features() {
		net.kacey__.project.settings.load.block("quartz_tiles", features.QUARTZ_TILES);
		net.kacey__.project.settings.load.block("quartz_tiles_stairs", features.QUARTZ_TILES_STAIRS);
		net.kacey__.project.settings.load.block("quartz_tiles_slab", features.QUARTZ_TILES_SLAB);

		net.kacey__.project.settings.load.block("cleansed_amethyst", features.CLEANSED_AMETHYST);
		net.kacey__.project.settings.load.block("cleansed_amethyst_bricks", features.CLEANSED_AMETHYST_BRICKS);
		net.kacey__.project.settings.load.item("amethyst_sheet", features.AMETHYST_SHEET);
		net.kacey__.project.settings.load.item("condensed_amethyst", features.CONDENSED_AMETHYST);
		net.kacey__.project.settings.load.item("amethyst_core", features.AMETHYST_CORE);
		net.kacey__.project.settings.load.item("amethyst_netherite_ingot", features.AMETHYST_NETHERITE_INGOT);
		net.kacey__.project.settings.load.item("amethyst_longsword", features.AMETHYST_LONGSWORD);

		net.kacey__.project.settings.load.item("metal_sheet", features.METAL_SHEET);
		net.kacey__.project.settings.load.block("metal_block", features.METAL_BLOCK);
		net.kacey__.project.settings.load.block("metal_pillar", features.METAL_PILLAR);
		net.kacey__.project.settings.load.block("metal_scaffolding", features.METAL_SCAFFOLDING);
		net.kacey__.project.settings.load.block("metal_walkway", features.METAL_WALKWAY);

		net.kacey__.project.settings.load.block("polished_diorite_bricks", features.POLISHED_DIORITE_BRICKS);
		net.kacey__.project.settings.load.block("polished_diorite_bricks_stairs", features.POLISHED_DIORITE_BRICKS_STAIRS);
		net.kacey__.project.settings.load.block("polished_diorite_bricks_slab", features.POLISHED_DIORITE_BRICKS_SLAB);
		net.kacey__.project.settings.load.block("polished_andesite_bricks", features.POLISHED_ANDESITE_BRICKS);
		net.kacey__.project.settings.load.block("polished_andesite_bricks_stairs", features.POLISHED_ANDESITE_BRICKS_STAIRS);
		net.kacey__.project.settings.load.block("polished_andesite_bricks_slab", features.POLISHED_ANDESITE_BRICKS_SLAB);
		net.kacey__.project.settings.load.block("polished_granite_bricks", features.POLISHED_GRANITE_BRICKS);
		net.kacey__.project.settings.load.block("polished_granite_bricks_stairs", features.POLISHED_GRANITE_BRICKS_STAIRS);
		net.kacey__.project.settings.load.block("polished_granite_bricks_slab", features.POLISHED_GRANITE_BRICKS_SLAB);

		net.kacey__.project.settings.load.item("smallsword", features.SMALLSWORD);
	}
	public static void tab() {
		Registry.register(Registries.ITEM_GROUP, new Identifier(KaceysMod.MOD_ID, "main"), tab.CREATIVE_TAB);
		KaceysMod.LOGGER.info("[Kacey's Mod] Loaded Creative TAB");
	}
	public static void all() {
		KaceysMod.LOGGER.info("[Kacey's Mod] Loading Mod...");
		features();
		tab();
		KaceysMod.LOGGER.info("[Kacey's Mod] Loaded Successfully! Have fun!");
	}
}

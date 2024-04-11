package net.kacey__.project;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.*;
import net.minecraft.block.*;
import net.kacey__.project.settings.*;

public class features {
	public static Block QUARTZ_TILES = new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ));
	public static Block QUARTZ_TILE_STAIRS = new StairsBlock(QUARTZ_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ));
	public static Block QUARTZ_TILE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ));

	public static Item METAL_SHEET = createTools.item();
	public static Block METAL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK));
	public static Block METAL_PILLAR = new PillarBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK));
	public static Block METAL_SCAFFOLDING = new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).nonOpaque());
	public static Block METAL_WALKWAY = new SlabBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).nonOpaque());

	public static Block POLISHED_DIORITE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE));
	public static Block POLISHED_DIORITE_BRICK_STAIRS = new StairsBlock(POLISHED_DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE));
	public static Block POLISHED_DIORITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE));
	public static Block POLISHED_DIORITE_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE));
	public static Block POLISHED_ANDESITE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE));
	public static Block POLISHED_ANDESITE_BRICK_STAIRS = new StairsBlock(POLISHED_ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE));
	public static Block POLISHED_ANDESITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE));
	public static Block POLISHED_ANDESITE_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE));
	public static Block POLISHED_GRANITE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE));
	public static Block POLISHED_GRANITE_BRICK_STAIRS = new StairsBlock(POLISHED_GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE));
	public static Block POLISHED_GRANITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE));
	public static Block POLISHED_GRANITE_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE));

	public static Block CLEANSED_AMETHYST = new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK));
	public static Block CLEANSED_AMETHYST_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK));
	public static Item AMETHYST_SHEET = createTools.item();
	public static Item CONDENSED_AMETHYST = createTools.item();
	public static Item AMETHYST_CORE = createTools.item();
	public static Item AMETHYST_NETHERITE_INGOT = createTools.item();
	public static ToolItem AMETHYST_LONGSWORD = createTools.customsword(CustomSwordMaterials.AMETHYSTLONGSWORD, 5, -3f);

	public static ToolItem SMALLSWORD = createTools.sword(net.minecraft.item.ToolMaterials.IRON, 2, -1.5f);
}

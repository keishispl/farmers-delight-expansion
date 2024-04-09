package net.kacey__.project;

import net.minecraft.item.*;
import net.minecraft.block.*;

import net.minecraft.sound.BlockSoundGroup;
import net.kacey__.project.settings.*;

public class features {
	public static Block QUARTZ_TILES = create.block(0.8f, 0.8f, BlockSoundGroup.STONE, true);
	public static Block QUARTZ_TILE_STAIRS = new StairsBlock(QUARTZ_TILES.getDefaultState(), create.blockSettings(0.8f, 0.8f, BlockSoundGroup.STONE, true));
	public static Block QUARTZ_TILE_SLAB = new SlabBlock(create.blockSettings(0.8f, 0.8f, BlockSoundGroup.STONE, true));

	public static Item METAL_SHEET = create.item();
	public static Block METAL_BLOCK = create.block(7.5f, 7.5f, BlockSoundGroup.COPPER, true);
	public static Block METAL_PILLAR = create.block(7.5f, 7.5f, BlockSoundGroup.COPPER, true);
	public static Block METAL_SCAFFOLDING = create.transblock(7.5f, 7.5f, BlockSoundGroup.COPPER, false);
	public static Block METAL_WALKWAY = new SlabBlock(create.transblockSettings(7.5f, 7.5f, BlockSoundGroup.COPPER, false));

	public static Block POLISHED_DIORITE_BRICKS = create.block(1.5f, 6f, BlockSoundGroup.STONE, true);
	public static Block POLISHED_DIORITE_BRICK_STAIRS = new StairsBlock(POLISHED_DIORITE_BRICKS.getDefaultState(), create.blockSettings(1.5f, 6f, BlockSoundGroup.STONE, true));
	public static Block POLISHED_DIORITE_BRICK_SLAB = new SlabBlock(create.blockSettings(1.5f, 6f, BlockSoundGroup.STONE, true));
	public static Block POLISHED_DIORITE_BRICK_WALL = new WallBlock(create.blockSettings(1.5f, 6f, BlockSoundGroup.STONE, false));
	public static Block POLISHED_ANDESITE_BRICKS = create.block(1.5f, 6f, BlockSoundGroup.STONE, true);
	public static Block POLISHED_ANDESITE_BRICK_STAIRS = new StairsBlock(POLISHED_ANDESITE_BRICKS.getDefaultState(), create.blockSettings(1.5f, 6f, BlockSoundGroup.STONE, true));
	public static Block POLISHED_ANDESITE_BRICK_SLAB = new SlabBlock(create.blockSettings(1.5f, 6f, BlockSoundGroup.STONE, true));
	public static Block POLISHED_GRANITE_BRICKS = create.block(1.5f, 6f, BlockSoundGroup.STONE, true);
	public static Block POLISHED_GRANITE_BRICK_STAIRS = new StairsBlock(POLISHED_GRANITE_BRICKS.getDefaultState(), create.blockSettings(1.5f, 6f, BlockSoundGroup.STONE, true));
	public static Block POLISHED_GRANITE_BRICK_SLAB = new SlabBlock(create.blockSettings(1.5f, 6f, BlockSoundGroup.STONE, true));

	public static Block CLEANSED_AMETHYST = create.block(0.8f, 0.8f, BlockSoundGroup.AMETHYST_BLOCK, true);
	public static Block CLEANSED_AMETHYST_BRICKS = create.block(0.8f, 0.8f, BlockSoundGroup.AMETHYST_BLOCK, true);
	public static Item AMETHYST_SHEET = create.item();
	public static Item CONDENSED_AMETHYST = create.item();
	public static Item AMETHYST_CORE = create.item();
	public static Item AMETHYST_NETHERITE_INGOT = create.item();
	public static ToolItem AMETHYST_LONGSWORD = create.customsword(CustomSwordMaterials.AMETHYSTLONGSWORD, 5, -3f);

	public static ToolItem SMALLSWORD = create.sword(net.minecraft.item.ToolMaterials.IRON, 2, -1.5f);
}

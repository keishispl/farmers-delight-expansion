package net.kacey__.project.util;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.kacey__.project.features;

public class tagsLootTable extends FabricBlockLootTableProvider {
    public tagsLootTable(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(features.QUARTZ_TILES, drops(features.QUARTZ_TILES));
        addDrop(features.QUARTZ_TILE_STAIRS, drops(features.QUARTZ_TILE_STAIRS));
        addDrop(features.QUARTZ_TILE_SLAB, slabDrops(features.QUARTZ_TILE_SLAB));

        addDrop(features.METAL_BLOCK, drops(features.METAL_BLOCK));
        addDrop(features.METAL_PILLAR, drops(features.METAL_PILLAR));
        addDrop(features.METAL_SCAFFOLDING, drops(features.METAL_SCAFFOLDING));
        addDrop(features.METAL_WALKWAY, slabDrops(features.METAL_WALKWAY));

        addDrop(features.POLISHED_DIORITE_BRICKS, drops(features.POLISHED_DIORITE_BRICKS));
        addDrop(features.POLISHED_DIORITE_BRICK_STAIRS, drops(features.POLISHED_DIORITE_BRICK_STAIRS));
        addDrop(features.POLISHED_DIORITE_BRICK_SLAB, slabDrops(features.POLISHED_DIORITE_BRICK_SLAB));
        addDrop(features.POLISHED_DIORITE_BRICK_WALL, drops(features.POLISHED_DIORITE_BRICK_WALL));
        addDrop(features.POLISHED_ANDESITE_BRICKS, drops(features.POLISHED_ANDESITE_BRICKS));
        addDrop(features.POLISHED_ANDESITE_BRICK_STAIRS, drops(features.POLISHED_ANDESITE_BRICK_STAIRS));
        addDrop(features.POLISHED_ANDESITE_BRICK_SLAB, slabDrops(features.POLISHED_ANDESITE_BRICK_SLAB));
        addDrop(features.POLISHED_ANDESITE_BRICK_WALL, drops(features.POLISHED_ANDESITE_BRICK_WALL));
        addDrop(features.POLISHED_GRANITE_BRICKS, drops(features.POLISHED_GRANITE_BRICKS));
        addDrop(features.POLISHED_GRANITE_BRICK_STAIRS, drops(features.POLISHED_GRANITE_BRICK_STAIRS));
        addDrop(features.POLISHED_GRANITE_BRICK_SLAB, slabDrops(features.POLISHED_GRANITE_BRICK_SLAB));
        addDrop(features.POLISHED_GRANITE_BRICK_WALL, drops(features.POLISHED_GRANITE_BRICK_WALL));

        addDrop(features.CLEANSED_AMETHYST, drops(features.CLEANSED_AMETHYST));
        addDrop(features.CLEANSED_AMETHYST_BRICKS, drops(features.CLEANSED_AMETHYST_BRICKS));
    }
}
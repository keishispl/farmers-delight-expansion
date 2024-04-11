package net.kacey__.project.util;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.kacey__.project.features;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class tagsBlock extends FabricTagProvider.BlockTagProvider {
    public tagsBlock(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(features.QUARTZ_TILES)
                .add(features.QUARTZ_TILE_STAIRS)
                .add(features.QUARTZ_TILE_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(BlockTags.FENCES);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(features.POLISHED_DIORITE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(features.METAL_PILLAR);
    }
}

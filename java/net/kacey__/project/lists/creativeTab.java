
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.kacey__.project.lists;

import net.kacey__.project.features;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.text.Text;

import net.fabricmc.fabric.api.itemgroup.v1.*;

public class creativeTab {

    public static ItemGroup CREATIVE_TAB = FabricItemGroup.builder()
            .icon(() -> new ItemStack(features.SMALLSWORD))
            .displayName(Text.translatable("Kacey's Mod"))
            .entries((context, entries) -> {
                entries.add(features.QUARTZ_TILES);
                entries.add(features.QUARTZ_TILE_STAIRS);
                entries.add(features.QUARTZ_TILE_SLAB);

                entries.add(features.METAL_SHEET);
                entries.add(features.METAL_BLOCK);
                entries.add(features.METAL_PILLAR);
                entries.add(features.METAL_SCAFFOLDING);
                entries.add(features.METAL_WALKWAY);

                entries.add(features.POLISHED_DIORITE_BRICKS);
                entries.add(features.POLISHED_DIORITE_BRICK_STAIRS);
                entries.add(features.POLISHED_DIORITE_BRICK_SLAB);
                entries.add(features.POLISHED_DIORITE_BRICK_WALL);
                entries.add(features.POLISHED_ANDESITE_BRICKS);
                entries.add(features.POLISHED_ANDESITE_BRICK_STAIRS);
                entries.add(features.POLISHED_ANDESITE_BRICK_SLAB);
                entries.add(features.POLISHED_ANDESITE_BRICK_WALL);
                entries.add(features.POLISHED_GRANITE_BRICKS);
                entries.add(features.POLISHED_GRANITE_BRICK_STAIRS);
                entries.add(features.POLISHED_GRANITE_BRICK_SLAB);
                entries.add(features.POLISHED_GRANITE_BRICK_WALL);

                entries.add(features.CLEANSED_AMETHYST);
                entries.add(features.CLEANSED_AMETHYST_BRICKS);
                entries.add(features.AMETHYST_SHEET);
                entries.add(features.CONDENSED_AMETHYST);
                entries.add(features.AMETHYST_CORE);
                entries.add(features.AMETHYST_NETHERITE_INGOT);
                entries.add(features.AMETHYST_LONGSWORD);

                entries.add(features.SMALLSWORD);
            })
            .build();
}

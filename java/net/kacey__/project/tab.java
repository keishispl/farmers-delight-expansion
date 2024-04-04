
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.kacey__.project;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.text.Text;

import net.fabricmc.fabric.api.itemgroup.v1.*;

import net.kacey__.KaceysMod;

public class tab {

    public static ItemGroup CREATIVE_TAB = FabricItemGroup.builder()
            .icon(() -> new ItemStack(features.SMALLSWORD))
            .displayName(Text.translatable("Kacey's Mod"))
            .entries((context, entries) -> {
                entries.add(features.QUARTZ_TILES);
                entries.add(features.QUARTZ_TILES_STAIRS);
                entries.add(features.QUARTZ_TILES_SLAB);

                entries.add(features.METAL_SCAFFOLDING);
                entries.add(features.METAL_WALKWAY);

                entries.add(features.POLISHED_DIORITE_BRICKS);
                entries.add(features.POLISHED_DIORITE_BRICKS_STAIRS);
                entries.add(features.POLISHED_DIORITE_BRICKS_SLAB);
                entries.add(features.POLISHED_ANDESITE_BRICKS);
                entries.add(features.POLISHED_ANDESITE_BRICKS_STAIRS);
                entries.add(features.POLISHED_ANDESITE_BRICKS_SLAB);
                entries.add(features.POLISHED_GRANITE_BRICKS);
                entries.add(features.POLISHED_GRANITE_BRICKS_STAIRS);
                entries.add(features.POLISHED_GRANITE_BRICKS_SLAB);

                entries.add(features.CLEANSED_AMETHYST);
                entries.add(features.CLEANSED_AMETHYST_BRICKS);
                entries.add(features.AMETHYST_SHEET);
                entries.add(features.CONDENSED_AMETHYST);
                entries.add(features.AMETHYST_CORE);
                entries.add(features.AMETHYST_NETHERITE_INGOT);
                entries.add(features.AMETHYST_LONGSWORD);

                entries.add(features.SMALLSWORD);
                entries.add(features.SCYTHE);
            })
            .build();
}

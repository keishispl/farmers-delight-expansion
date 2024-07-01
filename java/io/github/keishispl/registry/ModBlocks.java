package io.github.keishispl.registry;

import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.keishispl.FoodExpansion;
import io.github.keishispl.specify.block.GrapeBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.Registries;
import net.minecraft.sound.BlockSoundGroup;

import java.util.function.Supplier;

public class ModBlocks {
    public static final LazyRegistrar<Block> BLOCKS = LazyRegistrar.create(Registries.BLOCK, FoodExpansion.MOD_ID);


    // Crops
    public static final Supplier<Block> GRAPE = BLOCKS.register("grape",
            () -> new GrapeBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY).nonOpaque()));
}

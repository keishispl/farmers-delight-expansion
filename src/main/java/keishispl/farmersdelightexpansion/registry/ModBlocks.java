package keishispl.farmersdelightexpansion.registry;

import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import keishispl.farmersdelightexpansion.FoodExpansion;
import keishispl.farmersdelightexpansion.specify.block.BushBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import vectorwing.farmersdelight.common.block.PieBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final LazyRegistrar<Block> BLOCKS = LazyRegistrar.create(Registries.BLOCK, FoodExpansion.MOD_ID);


    // Crops
    public static final Supplier<Block> GRAPE = BLOCKS.register("grape", () -> new BushBlock(ModItems.GRAPES));
    public static final Supplier<Block> BLUEBERRY = BLOCKS.register("blueberry", () -> new BushBlock(ModItems.BLUEBERRIES));


    // Pastries
    public static final Supplier<Block> BLUEBERRY_CHEESECAKE = BLOCKS.register("blueberry_cheesecake", () -> new PieBlock(Block.Settings.copy(Blocks.CAKE), ModItems.BLUEBERRY_CHEESECAKE_SLICE));
}

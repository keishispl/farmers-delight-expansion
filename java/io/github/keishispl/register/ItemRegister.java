package io.github.keishispl.register;

import io.github.keishispl.FoodExpansion;
import io.github.keishispl.Items.*;
import io.github.keishispl.Blocks.grape;
import io.github.keishispl.ItemTypes.Foods;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import io.github.keishispl.ItemTypes.Drinks;

public class ItemRegister {
    public static final Block GRAPE = new grape(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY).nonOpaque());

    public static final Item ORANGE = new Item(new Item.Settings().food(Foods.ORANGE));
    public static final Item ORANGE_SLICE = new Item(new Item.Settings().food(Foods.ORANGE_SLICE));
    public static final Item ORANGE_JUICE = new DrinkableItem(new Item.Settings().food(Drinks.ORANGE_JUICE));
    public static final Item GRAPES = new AliasedBlockItem(GRAPE, new Item.Settings().food(Foods.GRAPES));
    public static final Item GRAPE_JUICE = new DrinkableItem(new Item.Settings().food(Drinks.GRAPE_JUICE));

    public static void init() {
        Registry.register(Registries.BLOCK, new Identifier(FoodExpansion.MOD_ID, "grape"), GRAPE);

        Registry.register(Registries.ITEM, new Identifier(FoodExpansion.MOD_ID, "orange"), ORANGE);
        Registry.register(Registries.ITEM, new Identifier(FoodExpansion.MOD_ID, "orange_slice"), ORANGE_SLICE);
        Registry.register(Registries.ITEM, new Identifier(FoodExpansion.MOD_ID, "orange_juice"), ORANGE_JUICE);
        Registry.register(Registries.ITEM, new Identifier(FoodExpansion.MOD_ID, "grapes"), GRAPES);
        Registry.register(Registries.ITEM, new Identifier(FoodExpansion.MOD_ID, "grape_juice"), GRAPE_JUICE);
    }

}

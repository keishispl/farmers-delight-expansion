package io.github.keishispl.register;

import io.github.keishispl.FoodExpansion;
import io.github.keishispl.itemtype.*;
import io.github.keishispl.block.GrapeBlock;
import io.github.keishispl.itemconfig.FoodConfig;
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
import io.github.keishispl.itemconfig.DrinkConfig;

public class ItemRegister {
    // Blocks
    public static final Block GRAPE = new GrapeBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY).nonOpaque());

    // Items
    public static final Item ORANGE = new Item(new Item.Settings().food(FoodConfig.ORANGE));
    public static final Item ORANGE_SLICE = new Item(new Item.Settings().food(FoodConfig.ORANGE_SLICE));
    public static final Item GRAPES = new AliasedBlockItem(GRAPE, new Item.Settings().food(FoodConfig.GRAPES));

    // Drinks
    public static final Item ORANGE_JUICE = new DrinkableItemType(new Item.Settings().food(DrinkConfig.ORANGE_JUICE));
    public static final Item GRAPE_JUICE = new DrinkableItemType(new Item.Settings().food(DrinkConfig.GRAPE_JUICE));

    // Foods
    public static final Item TOMATO_EGG_RICE = new ConsumableItemType(new Item.Settings().food(FoodConfig.TOMATO_EGG_RICE));
    public static final Item MIXED_FRUIT_BOWL = new ConsumableItemType(new Item.Settings().food(FoodConfig.MIXED_FRUIT_BOWL));

    public static void init() {
        Registry.register(Registries.BLOCK, new Identifier(FoodExpansion.MOD_ID, "grape"), GRAPE);

        Registry.register(Registries.ITEM, new Identifier(FoodExpansion.MOD_ID, "orange"), ORANGE);
        Registry.register(Registries.ITEM, new Identifier(FoodExpansion.MOD_ID, "orange_slice"), ORANGE_SLICE);
        Registry.register(Registries.ITEM, new Identifier(FoodExpansion.MOD_ID, "grapes"), GRAPES);

        Registry.register(Registries.ITEM, new Identifier(FoodExpansion.MOD_ID, "orange_juice"), ORANGE_JUICE);
        Registry.register(Registries.ITEM, new Identifier(FoodExpansion.MOD_ID, "grape_juice"), GRAPE_JUICE);

        Registry.register(Registries.ITEM, new Identifier(FoodExpansion.MOD_ID, "tomato_egg_rice"), TOMATO_EGG_RICE);
        Registry.register(Registries.ITEM, new Identifier(FoodExpansion.MOD_ID, "mixed_fruit_bowl"), MIXED_FRUIT_BOWL);
    }

}

package io.github.keishispl.registry;

import com.google.common.collect.Sets;
import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.keishispl.FoodExpansion;
import io.github.keishispl.common.FoodValues;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

public class ModItems {
    public static final LazyRegistrar<Item> ITEMS = LazyRegistrar.create(Registries.ITEM, FoodExpansion.MOD_ID);
    public static LinkedHashSet<Supplier<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

    public static Supplier<Item> registerWithTab(final String name, final Supplier<Item> supplier) {
        Supplier<Item> block = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(block);
        return block;
    }

    // Helper methods
    public static Item.Settings basicItem() {
        return new Item.Settings();
    }
    public static Item.Settings foodItem(FoodComponent food) {
        return new Item.Settings().food(food);
    }
    public static Item.Settings bowlFoodItem(FoodComponent food) {
        return new Item.Settings().food(food).recipeRemainder(Items.BOWL).maxCount(16);
    }
    public static Item.Settings drinkItem() {
        return new Item.Settings().recipeRemainder(Items.GLASS_BOTTLE).maxCount(16);
    }
    public static Item.Settings drinkEffectItem(FoodComponent food) {
        return drinkItem().food(food);
    }


    // Materials & Basic Foods
    public static final Supplier<Item> ORANGE = registerWithTab("orange",
            () -> new Item(foodItem(FoodValues.ORANGE)));
    public static final Supplier<Item> ORANGE_SLICE = registerWithTab("orange_slice",
            () -> new Item(foodItem(FoodValues.ORANGE_SLICE)));
    public static final Supplier<Item> GRAPES = registerWithTab("grapes",
            () -> new AliasedBlockItem(ModBlocks.GRAPE.get(), foodItem(FoodValues.GRAPES)));


    // Actual Good Foods
    public static final Supplier<Item> TOMATO_EGG_RICE = registerWithTab("tomato_egg_rice",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.TOMATO_EGG_RICE), true));
    public static final Supplier<Item> MIXED_FRUIT_BOWL = registerWithTab("mixed_fruit_bowl",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.MIXED_FRUIT_BOWL)));


    // Drinks
    public static final Supplier<Item> ORANGE_JUICE = registerWithTab("orange_juice",
            () -> new DrinkableItem(drinkEffectItem(FoodValues.ORANGE_JUICE), true));
    public static final Supplier<Item> GRAPE_JUICE = registerWithTab("grape_juice",
            () -> new DrinkableItem(drinkEffectItem(FoodValues.GRAPE_JUICE), true));
}

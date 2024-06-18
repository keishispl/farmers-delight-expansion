package io.github.keishispl.itemconfig;

import net.minecraft.item.FoodComponent;

public class FoodConfig {

    public static final FoodComponent ORANGE = (new FoodComponent.Builder())
            .hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent ORANGE_SLICE = (new FoodComponent.Builder())
            .hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent GRAPES = (new FoodComponent.Builder())
            .hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent TOMATO_EGG_RICE = (new FoodComponent.Builder())
            .hunger(14).saturationModifier(0.75f).build();
    public static final FoodComponent MIXED_FRUIT_BOWL = (new FoodComponent.Builder())
            .hunger(6).saturationModifier(0.6f).build();
}
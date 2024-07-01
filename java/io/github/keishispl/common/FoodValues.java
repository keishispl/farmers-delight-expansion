package io.github.keishispl.common;

import io.github.keishispl.registry.ModStatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class FoodValues {
    public static final int BRIEF_DURATION = 600;    // 30 seconds
    public static final int SHORT_DURATION = 1200;    // 1 minute
    public static final int MEDIUM_DURATION = 3600;    // 3 minutes
    public static final int LONG_DURATION = 6000;    // 5 minutes


    // Drinks
    public static final FoodComponent ORANGE_JUICE = (new FoodComponent.Builder())
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(ModStatusEffects.REFRESHING.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodComponent GRAPE_JUICE = (new FoodComponent.Builder())
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(ModStatusEffects.REFRESHING.get(), MEDIUM_DURATION, 0), 1.0F).build();


    // Basic Foods
    public static final FoodComponent ORANGE = (new FoodComponent.Builder())
            .hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent ORANGE_SLICE = (new FoodComponent.Builder())
            .hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent GRAPES = (new FoodComponent.Builder())
            .hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent BLUEBERRIES = (new FoodComponent.Builder())
            .hunger(2).saturationModifier(0.1F).build();


    // Nice Foods
    public static final FoodComponent TOMATO_EGG_RICE = (new FoodComponent.Builder())
            .hunger(14).saturationModifier(0.75f)
            .statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), LONG_DURATION, 0), 1.0F).build();
    public static final FoodComponent PORK_RAMEN = (new FoodComponent.Builder())
            .hunger(14).saturationModifier(0.75f)
            .statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodComponent MIXED_FRUIT_BOWL = (new FoodComponent.Builder())
            .hunger(6).saturationModifier(0.6f).build();
}

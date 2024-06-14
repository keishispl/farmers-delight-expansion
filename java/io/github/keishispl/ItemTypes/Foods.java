package io.github.keishispl.ItemTypes;

import net.minecraft.item.FoodComponent;

public class Foods {
    public static final FoodComponent ORANGE = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent ORANGE_SLICE = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent GRAPES = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.1F).build();
}

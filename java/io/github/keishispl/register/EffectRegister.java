package io.github.keishispl.register;

import io.github.keishispl.Effects.Refreshing;
import io.github.keishispl.FoodExpansion;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EffectRegister {
    public static final StatusEffect REFRESHING = new Refreshing();

    public static void init() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier(FoodExpansion.MOD_ID, "refreshing"), REFRESHING);
    }
}

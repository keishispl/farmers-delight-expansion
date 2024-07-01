package io.github.keishispl.registry;

import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.keishispl.FoodExpansion;
import io.github.keishispl.specify.effect.RefreshingEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;

import java.util.function.Supplier;

public class ModStatusEffects {
    public static final LazyRegistrar<StatusEffect> STATUS_EFFECT = LazyRegistrar.create(Registries.STATUS_EFFECT, FoodExpansion.MOD_ID);

    public static final Supplier<StatusEffect> REFRESHING = STATUS_EFFECT.register("refreshing", RefreshingEffect::new);
}

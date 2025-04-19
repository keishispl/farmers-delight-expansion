package keishispl.farmersdelightexpansion.registry;

import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import keishispl.farmersdelightexpansion.FoodExpansion;
import keishispl.farmersdelightexpansion.specify.effect.RefreshingEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;

import java.util.function.Supplier;

public class ModStatusEffects {
    public static final LazyRegistrar<StatusEffect> STATUS_EFFECT = LazyRegistrar.create(Registries.STATUS_EFFECT, FoodExpansion.MOD_ID);

    public static final Supplier<StatusEffect> REFRESHING = STATUS_EFFECT.register("refreshing", RefreshingEffect::new);
}

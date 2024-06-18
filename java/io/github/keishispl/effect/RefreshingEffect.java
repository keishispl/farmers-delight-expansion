package io.github.keishispl.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

import static net.minecraft.entity.effect.StatusEffectCategory.*;

public class RefreshingEffect extends StatusEffect {
    public RefreshingEffect() {
        super(BENEFICIAL, 0);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return false;
    }
    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        (entity).addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 6000, 0, false, false, false));
        (entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 6000, 0, false, false, false));
    }
    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        (entity).removeStatusEffect(StatusEffects.REGENERATION);
        (entity).removeStatusEffect(StatusEffects.SPEED);
    }
}

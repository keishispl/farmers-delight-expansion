package io.github.keishispl.itemtype;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.registry.ModEffects;

import java.util.List;

public class ConsumableItemType extends Item {
    public ConsumableItemType(Settings settings) {
        super(settings.maxCount(16));
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        PlayerEntity playerEntity = user instanceof PlayerEntity ? (PlayerEntity)user : null;
        (user).addStatusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 6000));
        if (playerEntity != null) {
            playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
            if (!playerEntity.getAbilities().creativeMode) {
                stack.decrement(1);
                ((PlayerEntity) user).giveItemStack(new ItemStack(Items.BOWL, 1));
            }
        }
        return stack;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("effect.farmersdelightexpansion.nourishment.tooltip").formatted(Formatting.BLUE));
    }
}

package io.github.keishispl.registry;

import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.keishispl.FoodExpansion;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final LazyRegistrar<ItemGroup> CREATIVE_TABS = LazyRegistrar.create(Registries.ITEM_GROUP, FoodExpansion.MOD_ID);

    public static final Supplier<ItemGroup> TAB_EXPANSION = CREATIVE_TABS.register(FoodExpansion.MOD_ID,
            () -> FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.GRAPE_JUICE.get()))
            .displayName(Text.of("Farmer's Delight Expansion"))
            .entries((parameters, output) -> ModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.add(item.get())))
            .build());
}

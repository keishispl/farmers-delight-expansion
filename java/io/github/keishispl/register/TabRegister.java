package io.github.keishispl.register;

import io.github.keishispl.FoodExpansion;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TabRegister {
    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ItemRegister.GRAPE_JUICE))
            .displayName(Text.of("Farmer's Delight Expansion"))
            .entries((context, entries) -> {
                entries.add(ItemRegister.ORANGE);
                entries.add(ItemRegister.ORANGE_SLICE);
                entries.add(ItemRegister.GRAPES);
                entries.add(ItemRegister.ORANGE_JUICE);
                entries.add(ItemRegister.GRAPE_JUICE);
            })
            .build();
    public static void init() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(FoodExpansion.MOD_ID, "creativetab"), ITEM_GROUP);
    }
}

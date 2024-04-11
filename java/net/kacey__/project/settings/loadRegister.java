package net.kacey__.project.settings;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kacey__.KaceysMod;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class loadRegister {
    public static void block(String name, Block block) {
        Registry.register(Registries.BLOCK, identifier(name), block);
        Registry.register(Registries.ITEM, identifier(name), blockitem(block));
    }
    public static void item(String name, Item item) {
        Registry.register(Registries.ITEM, identifier(name), item);
    }

    public static Identifier identifier(String name) {
        return new Identifier(KaceysMod.MOD_ID, name);
    }
    public static BlockItem blockitem(Block block) {
        return new BlockItem(block, new FabricItemSettings());
    }
}
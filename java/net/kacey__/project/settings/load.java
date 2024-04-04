package net.kacey__.project.settings;

import net.kacey__.KaceysMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class load {
    public static void block(String name, Block block) {
        Registry.register(Registries.BLOCK, register.identifier(name), block);
        Registry.register(Registries.ITEM, register.identifier(name), register.blockitem(block));
        KaceysMod.LOGGER.info("[Kacey's Mod] Registered " + KaceysMod.MOD_ID + ":block:" + name);
    }
    public static void item(String name, Item item) {
        Registry.register(Registries.ITEM, register.identifier(name), item);
        KaceysMod.LOGGER.info("[Kacey's Mod] Registered " + KaceysMod.MOD_ID + ":item:" + name);
    }
}
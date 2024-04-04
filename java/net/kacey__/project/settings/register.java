package net.kacey__.project.settings;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.kacey__.KaceysMod;

public class register {
    public static Identifier identifier(String name) {
        return new Identifier(KaceysMod.MOD_ID, name);
    }
    public static BlockItem blockitem(Block block) {
        return new BlockItem(block, new FabricItemSettings());
    }
}

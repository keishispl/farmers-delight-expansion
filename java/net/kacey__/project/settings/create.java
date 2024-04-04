package net.kacey__.project.settings;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.kacey__.project.CustomSwordMaterials;
import net.minecraft.sound.BlockSoundGroup;

public class create {
    public static SwordItem sword(ToolMaterials tool, Integer damage, Float speed) {
        return new SwordItem(tool, damage, speed, new Item.Settings());
    }
    public static SwordItem customsword(CustomSwordMaterials tool, Integer damage, Float speed) {
        return new SwordItem(tool, damage, speed, new Item.Settings());
    }
    public static Item item() {
        return new Item(new Item.Settings());
    }
    public static Block block(Float hardness, Float resistance, BlockSoundGroup sound, Boolean redstone) {
        return new Block(FabricBlockSettings.create().strength(hardness, resistance).sounds(sound).postProcess((bs, br, bp) -> redstone));
    }
    public static Block transblock(Float hardness, Float resistance, BlockSoundGroup sound, Boolean redstone) {
        return new Block(FabricBlockSettings.create().nonOpaque().strength(hardness, resistance).sounds(sound).postProcess((bs, br, bp) -> redstone));
    }
    public static FabricBlockSettings blockSettings(Float hardness, Float resistance, BlockSoundGroup sound, Boolean redstone) {
        return FabricBlockSettings.create().strength(hardness, resistance).sounds(sound).postProcess((bs, br, bp) -> redstone);
    }
    public static FabricBlockSettings transblockSettings(Float hardness, Float resistance, BlockSoundGroup sound, Boolean redstone) {
        return FabricBlockSettings.create().nonOpaque().strength(hardness, resistance).sounds(sound).postProcess((bs, br, bp) -> redstone);
    }
}
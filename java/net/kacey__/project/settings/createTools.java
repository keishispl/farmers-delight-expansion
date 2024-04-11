package net.kacey__.project.settings;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.kacey__.project.CustomSwordMaterials;

public class createTools {
    public static SwordItem sword(ToolMaterials tool, Integer damage, Float speed) {
        return new SwordItem(tool, damage, speed, new Item.Settings());
    }
    public static SwordItem customsword(CustomSwordMaterials tool, Integer damage, Float speed) {
        return new SwordItem(tool, damage, speed, new Item.Settings());
    }
    public static Item item() {
        return new Item(new Item.Settings());
    }

}
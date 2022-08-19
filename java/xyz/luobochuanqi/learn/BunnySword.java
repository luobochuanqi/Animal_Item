package xyz.luobochuanqi.learn;

import net.minecraft.item.SwordItem;

public class BunnySword extends SwordItem {
    public BunnySword() {
        super(ModItemTier.BUNNY, 3, -2.4F, new Properties().tab(ModGroup.AnimalItemGroup));
    }
}

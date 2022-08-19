package xyz.luobochuanqi.learn;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class AnimalItem extends ItemGroup {
    public AnimalItem() {
        super("animal_item");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.BunnyEars.get());
    }
}

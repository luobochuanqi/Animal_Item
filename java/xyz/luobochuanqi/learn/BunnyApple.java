package xyz.luobochuanqi.learn;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class BunnyApple extends Item {
    private static final Food BunnyApple = (new Food.Builder())
            .saturationMod(10)
            .nutrition(20)
            .effect(() -> new EffectInstance(Effects.POISON, 3 * 20, 1), 1)
            .build();

    public BunnyApple() {
        super(new Properties().food(BunnyApple).tab(ModGroup.AnimalItemGroup));
    }
}


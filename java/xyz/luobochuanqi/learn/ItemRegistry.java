package xyz.luobochuanqi.learn;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "learn");
    public static final RegistryObject<Item> BunnyEars = ITEMS.register("bunny_ears", BunnyEars::new);
    public static final RegistryObject<Item> BunnyApple = ITEMS.register("bunny_apple", BunnyApple::new);
    public static final RegistryObject<Item> BunnySword = ITEMS.register("bunny_sword", BunnySword::new);
}

package net.witchoy.tutorial_mod.item;


import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.witchoy.tutorial_mod.TutorialMod;
import net.witchoy.tutorial_mod.item.custom.OreDetectorItem;

public class ModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ORE_DETECTOR = ITEMS.register("ore_detector",
            () -> new OreDetectorItem(new Item.Properties().durability(100)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}


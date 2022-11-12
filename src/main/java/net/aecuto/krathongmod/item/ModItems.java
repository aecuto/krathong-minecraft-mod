package net.aecuto.krathongmod.item;

import net.aecuto.krathongmod.KrathongMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    private static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KrathongMod.MODID);

    public static final RegistryObject<Item> allium = ITEMS.register("allium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> allium_plus = ITEMS.register("allium_plus",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> cornflower = ITEMS.register("cornflower",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> cornflower_plus = ITEMS.register("cornflower_plus",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> dandelion = ITEMS.register("dandelion",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> dandelion_plus = ITEMS.register("dandelion_plus",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> karb_kluy = ITEMS.register("karb_kluy",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> orange_tulip = ITEMS.register("orange_tulip",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> orange_tulip_plus = ITEMS.register("orange_tulip_plus",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> pink_tulip = ITEMS.register("pink_tulip",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> pink_tulip_plus = ITEMS.register("pink_tulip_plus",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> poppy = ITEMS.register("poppy",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> poppy_plus = ITEMS.register("poppy_plus",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> white_tulip = ITEMS.register("white_tulip",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> white_tulip_plus = ITEMS.register("white_tulip_plus",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> wither_rose = ITEMS.register("wither_rose",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> wither_rose_plus = ITEMS.register("wither_rose_plus",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}


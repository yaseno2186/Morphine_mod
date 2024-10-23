package dev.yass.mod.item;

import dev.yass.mod.Morphine;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class HammersItems {
    public static final DeferredRegister.Items HAMMERS = DeferredRegister.createItems(Morphine.MOD_ID);

    public static final DeferredItem<Item> IRON_HAMMER = HAMMERS.register("iron_hammer",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        HAMMERS.register(eventBus);
    }
}

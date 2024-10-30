package dev.yass.mod.item;

import dev.yass.mod.Morphine;
import dev.yass.mod.item.custom.HammerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class HammersItems {
    public static final DeferredRegister.Items HAMMERS = DeferredRegister.createItems(Morphine.MOD_ID);

    public static final DeferredItem<Item> IRON_HAMMER = HAMMERS.register("iron_hammer",
            () -> new HammerItem(Tiers.IRON, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.IRON, 7F, -3.5f))
                    .durability(1000)));

    public static void register(IEventBus eventBus) {
        HAMMERS.register(eventBus);
    }
}

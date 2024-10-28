package dev.yass.mod.item;

import dev.yass.mod.Morphine;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Morphine.MOD_ID);


    public static final Supplier<CreativeModeTab> MORPHINE_ITEMS_TAB = CREATIVE_MODE_TAB.register("morphine_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(HammersItems.IRON_HAMMER.get()))
                    .title(Component.translatable("creativetab.morphine.morphine_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(HammersItems.IRON_HAMMER);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

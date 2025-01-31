package net.lewapnoob.host.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lewapnoob.host.LewapMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SIGMA_SKIBIDI = registerItem("sigiemka", new Item(new Item.Settings()));
    //public static final Item NAZWA = registerItem("nazwa", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LewapMod.MOD_ID, name), item);
    }

    public static void registerItems() {
        LewapMod.LOGGER.info("Registering Mod Items" + LewapMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SIGMA_SKIBIDI);
            //entries.add(NAZWA);
        });
    }
}

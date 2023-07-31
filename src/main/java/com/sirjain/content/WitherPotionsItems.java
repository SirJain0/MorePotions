package com.sirjain.content;

import com.sirjain.WitherPotions;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WitherPotionsItems {
        public static Item WITHERED_ASHES;

        // Registers mod items
        public static void registerItems() {
                WITHERED_ASHES = Registry.register(
                        Registries.ITEM,
                        new Identifier(WitherPotions.MOD_ID, "withered_ashes"),
                        new Item(new Item.Settings())
                );
        }
}
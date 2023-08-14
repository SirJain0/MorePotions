package com.sirjain.content;

import com.sirjain.MPMain;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MPItems {
        public static Item WITHERED_ASHES;

        // Registers mod items
        public static void registerItems() {
                WITHERED_ASHES = Registry.register(
                        Registry.ITEM,
                        new Identifier(MPMain.MOD_ID, "withered_ashes"),
                        new Item(new Item.Settings().group(ItemGroup.BREWING))
                );
        }
}
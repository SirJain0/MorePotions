package com.sirjain.content;

import com.sirjain.WitherPotions;
import com.sirjain.mixin.BrewingRecipeRegistryMixin;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WitherPotionsUtil {
        public static Potion WITHER_POTION, LONG_WITHER_POTION, STRONG_WITHER_POTION;
        public static StatusEffect WITHER = StatusEffects.WITHER;

        // Registers potions
        public static void registerPotions() {
                WITHER_POTION = registerPotion("wither_potion", new Potion(new StatusEffectInstance(WITHER, 20 * 16, 0)));
                LONG_WITHER_POTION = registerPotion("long_wither_potion", new Potion(new StatusEffectInstance(WITHER, 20 * 36, 0)));
                STRONG_WITHER_POTION = registerPotion("strong_wither_potion", new Potion(new StatusEffectInstance(WITHER, 20 * 10, 1)));
        }

        // Registers potion recipes
        public static void addRecipes() {
                BrewingRecipeRegistryMixin.addRecipe(Potions.AWKWARD, WitherPotionsItems.WITHERED_ASHES, WITHER_POTION);
                BrewingRecipeRegistryMixin.addRecipe(WITHER_POTION, Items.REDSTONE, LONG_WITHER_POTION);
                BrewingRecipeRegistryMixin.addRecipe(LONG_WITHER_POTION, Items.GLOWSTONE_DUST, STRONG_WITHER_POTION);
        }

        // Helper method to shorten process of registering potions
        private static Potion registerPotion(String name, Potion potion) {
                return Registry.register(
                        Registries.POTION,
                        new Identifier(WitherPotions.MOD_ID, name),
                        potion
                );
        }
}

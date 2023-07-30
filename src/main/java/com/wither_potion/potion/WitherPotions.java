package com.wither_potion.potion;

import com.wither_potion.WitherPotion;
import com.wither_potion.mixin.BrewingRecipeRegistryMixin;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WitherPotions {
        public static Potion WITHER_POTION;
        public static Potion LONG_WITHER_POTION;
        public static Potion STRONG_WITHER_POTION;

        public static void registerPotions() {
                WITHER_POTION = registerPotion("wither_potion", new Potion(new StatusEffectInstance(StatusEffects.WITHER, 20 * 20, 0)));
                LONG_WITHER_POTION = registerPotion("long_wither_potion", new Potion(new StatusEffectInstance(StatusEffects.WITHER, 20 * 50, 0)));
                STRONG_WITHER_POTION = registerPotion("strong_wither_potion", new Potion(new StatusEffectInstance(StatusEffects.WITHER, 20 * 12, 1)));
        }

        public static void addRecipes() {
                BrewingRecipeRegistryMixin.addRecipe(Potions.AWKWARD, Items.WITHER_ROSE, WITHER_POTION);
                BrewingRecipeRegistryMixin.addRecipe(Potions.AWKWARD, Items.WITHER_SKELETON_SKULL, WITHER_POTION);

                BrewingRecipeRegistryMixin.addRecipe(WITHER_POTION, Items.REDSTONE, LONG_WITHER_POTION);
                BrewingRecipeRegistryMixin.addRecipe(LONG_WITHER_POTION, Items.GLOWSTONE_DUST, STRONG_WITHER_POTION);
        }

        private static Potion registerPotion(String name, Potion potion) {
                return Registry.register(
                        Registries.POTION,
                        new Identifier(WitherPotion.MOD_ID, name),
                        potion
                );
        }
}

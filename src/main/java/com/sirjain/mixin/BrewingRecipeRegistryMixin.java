package com.sirjain.mixin;

import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.recipe.BrewingRecipeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

// Mixin to help with brewing recipes for Wither potions
@Mixin(BrewingRecipeRegistry.class)
public interface BrewingRecipeRegistryMixin {
	@Invoker("registerPotionRecipe")
	static void addRecipe(Potion input, Item item, Potion output) {
		throw new AssertionError();
	}
}
package com.laroslav.slosew.world;

import com.laroslav.slosew.Slosew;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;

public final class ModWorldGen {
	public static final ResourceKey<net.minecraft.world.level.levelgen.placement.PlacedFeature> AMENEZERITIUM_ORE_PLACED_KEY =
		ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(Slosew.MOD_ID, "amenezeritium_ore"));

	private ModWorldGen() {
	}

	public static void register() {
		BiomeModifications.addFeature(
			BiomeSelectors.foundInTheNether(),
			GenerationStep.Decoration.UNDERGROUND_ORES,
			AMENEZERITIUM_ORE_PLACED_KEY
		);
	}
}

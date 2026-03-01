package com.laroslav.slosew.block;

import com.laroslav.slosew.Slosew;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public final class ModBlocks {
	public static final Block AMENEZERITIUM_ORE = register("amenezeritium_ore",
		new DropExperienceBlock(net.minecraft.util.valueproviders.UniformInt.of(3, 7),
			BlockBehaviour.Properties.of()
				.mapColor(MapColor.NETHER)
				.strength(4.5F, 5.0F)
				.requiresCorrectToolForDrops()
				.sound(SoundType.NETHER_GOLD_ORE))
	);

	private ModBlocks() {
	}

	private static Block register(String name, Block block) {
		ResourceLocation id = ResourceLocation.fromNamespaceAndPath(Slosew.MOD_ID, name);
		Registry.register(BuiltInRegistries.BLOCK, id, block);
		Registry.register(BuiltInRegistries.ITEM, id, new BlockItem(block, new Item.Properties()));
		return block;
	}

	public static void register() {
	}
}

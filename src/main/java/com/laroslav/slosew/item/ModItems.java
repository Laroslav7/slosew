package com.laroslav.slosew.item;

import com.laroslav.slosew.Slosew;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public final class ModItems {
	public static final Item AMENEZERITIUM = register("amenezeritium", new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final Item ULTRA_UPGRADE = register("ultra_upgrade", new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

	private static final Tier LONG_NETHERITE_TIER = new Tier() {
		@Override
		public int getUses() {
			return 2251;
		}

		@Override
		public float getSpeed() {
			return 9.0F;
		}

		@Override
		public float getAttackDamageBonus() {
			return 6.7F;
		}

		@Override
		public TagKey<Block> getIncorrectBlocksForDrops() {
			return BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
		}

		@Override
		public int getEnchantmentValue() {
			return 18;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.of(ItemTags.create(ResourceLocation.withDefaultNamespace("netherite_tool_materials")));
		}
	};

	private static final Tier ULTRA_TIER = new Tier() {
		@Override
		public int getUses() {
			return 5631;
		}

		@Override
		public float getSpeed() {
			return 10.0F;
		}

		@Override
		public float getAttackDamageBonus() {
			return 8.3F;
		}

		@Override
		public TagKey<Block> getIncorrectBlocksForDrops() {
			return BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
		}

		@Override
		public int getEnchantmentValue() {
			return 22;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.of(AMENEZERITIUM);
		}
	};

	public static final Item LONG_NETHERITE_SWORD = register("long_nether_sword",
		new SwordItem(LONG_NETHERITE_TIER, new Item.Properties()
			.sword(LONG_NETHERITE_TIER, 9.7F, -1.7F)
			.durability(2251)
			.fireResistant()
			.rarity(Rarity.RARE))
	);

	public static final Item ULTRA_SWORD = register("ultra_sword",
		new UltraSwordItem(ULTRA_TIER, new Item.Properties()
			.sword(ULTRA_TIER, 11.3F, -1.6F)
			.durability(5631)
			.fireResistant()
			.rarity(Rarity.EPIC))
	);

	private ModItems() {
	}

	private static Item register(String name, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Slosew.MOD_ID, name), item);
	}

	public static void register() {
	}
}

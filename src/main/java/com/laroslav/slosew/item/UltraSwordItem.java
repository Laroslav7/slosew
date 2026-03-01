package com.laroslav.slosew.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class UltraSwordItem extends SwordItem {
	private static final float BREAK_CHANCE = 0.02F;

	public UltraSwordItem(Tier toolMaterial, Properties settings) {
		super(toolMaterial, settings);
	}

	@Override
	public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		boolean result = super.hurtEnemy(stack, target, attacker);
		if (!attacker.level().isClientSide() && attacker.getRandom().nextFloat() < BREAK_CHANCE) {
			stack.shrink(1);
		}
		return result;
	}
}

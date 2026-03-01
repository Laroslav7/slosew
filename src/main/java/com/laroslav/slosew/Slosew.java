package com.laroslav.slosew;

import com.laroslav.slosew.block.ModBlocks;
import com.laroslav.slosew.item.ModItems;
import com.laroslav.slosew.world.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slosew implements ModInitializer {
	public static final String MOD_ID = "slosew";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.register();
		ModItems.register();
		ModWorldGen.register();
		LOGGER.info("Slosew loaded with custom swords and ore");
	}
}

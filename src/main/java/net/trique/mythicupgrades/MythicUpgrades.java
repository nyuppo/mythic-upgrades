package net.trique.mythicupgrades;

import net.fabricmc.api.ModInitializer;
import net.trique.mythicupgrades.block.ModBlocks;
import net.trique.mythicupgrades.item.ModItems;
import net.trique.mythicupgrades.util.ModRegistries;
import net.trique.mythicupgrades.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MythicUpgrades implements ModInitializer {
	public static final String MOD_ID = "mythicupgrades";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

		ModOreGeneration.generateOres();

	}
}

package net.trique.mythicupgrades.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.block.ModBlocks;
import net.trique.mythicupgrades.item.ModItems;

public class ModRegistries {

    public static void registerModStuffs() {
        registerFuels();

    }

    private static void registerFuels() {
        MythicUpgrades.LOGGER.info("Registering Fuels for " + MythicUpgrades.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.URANIUM, 2000);
        registry.add(ModBlocks.URANIUM_BLOCK, 20000);
    }
}

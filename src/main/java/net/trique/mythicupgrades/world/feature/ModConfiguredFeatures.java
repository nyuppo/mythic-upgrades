package net.trique.mythicupgrades.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_RUBY_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE =
            ConfiguredFeatures.register("ruby_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_RUBY_ORES, 4));

    public static final List<OreFeatureConfig.Target> OVERWORLD_SAPPHIRE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAPPHIRE_ORE =
            ConfiguredFeatures.register("sapphire_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_SAPPHIRE_ORES, 4));

    public static final List<OreFeatureConfig.Target> OVERWORLD_TOPAZ_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TOPAZ_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TOPAZ_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TOPAZ_ORE =
            ConfiguredFeatures.register("topaz_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_TOPAZ_ORES, 4));

    public static final List<OreFeatureConfig.Target> OVERWORLD_JADE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.JADE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_JADE_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> JADE_ORE =
            ConfiguredFeatures.register("jade_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_JADE_ORES, 4));

    public static final List<OreFeatureConfig.Target> END_AMETRINE_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.AMETRINE_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> AMETRINE_ORE =
            ConfiguredFeatures.register("ametrine_ore",Feature.ORE,
                    new OreFeatureConfig(END_AMETRINE_ORES, 4));

    public static final List<OreFeatureConfig.Target> OVERWORLD_AQUAMARINE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.AQUAMARINE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_AQUAMARINE_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> AQUAMARINE_ORE =
            ConfiguredFeatures.register("aquamarine_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_AQUAMARINE_ORES, 4));



    public static void registerConfiguredFeatures() {
        MythicUpgrades.LOGGER.debug("Registering the ModConfiguredFeatures for " + MythicUpgrades.MOD_ID);
    }
}
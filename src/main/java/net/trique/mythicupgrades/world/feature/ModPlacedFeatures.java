package net.trique.mythicupgrades.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> RUBY_ORE_PLACED = PlacedFeatures.register("ruby_ore_placed",
            ModConfiguredFeatures.RUBY_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-48), YOffset.fixed(16))));

    public static final RegistryEntry<PlacedFeature> SAPPHIRE_ORE_PLACED = PlacedFeatures.register("sapphire_ore_placed",
            ModConfiguredFeatures.SAPPHIRE_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-48), YOffset.fixed(16))));

    public static final RegistryEntry<PlacedFeature> TOPAZ_ORE_PLACED = PlacedFeatures.register("topaz_ore_placed",
            ModConfiguredFeatures.TOPAZ_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-48), YOffset.fixed(16))));

    public static final RegistryEntry<PlacedFeature> JADE_ORE_PLACED = PlacedFeatures.register("jade_ore_placed",
            ModConfiguredFeatures.JADE_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-48), YOffset.fixed(16))));

    public static final RegistryEntry<PlacedFeature> AMETRINE_ORE_PLACED = PlacedFeatures.register("ametrine_ore_placed",
            ModConfiguredFeatures.AMETRINE_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(64))));

    public static final RegistryEntry<PlacedFeature> AQUAMARINE_ORE_PLACED = PlacedFeatures.register("aquamarine_ore_placed",
            ModConfiguredFeatures.AQUAMARINE_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-48), YOffset.fixed(16))));


    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
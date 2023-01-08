package net.trique.mythicupgrades.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.item.custom.*;

public class ModItems {

    public static final Item SAPPHIRE = registerItem("sapphire",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));
    public static final Item SAPPHIRE_APPLE = registerItem("sapphire_apple",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHIC_UPGRADES_GROUP).food(ModFoodComponents.SAPPHIRE_APPLE)));

    public static final Item SAPPHIRE_NETHERITE_SWORD = registerItem("sapphire_netherite_sword",
            new SwordItem(ModToolMaterials.SAPPHIRE_NETHERITE, 4, -2.4f,(new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP))));
    public static final Item SAPPHIRE_NETHERITE_AXE = registerItem("sapphire_netherite_axe",
            new ModAxeItem(ModToolMaterials.SAPPHIRE_NETHERITE, 5.5f, -3f,(new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP))));
    public static final Item SAPPHIRE_NETHERITE_PICKAXE = registerItem("sapphire_netherite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.SAPPHIRE_NETHERITE, 1, -2.8f,(new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP))));
    public static final Item SAPPHIRE_NETHERITE_HOE = registerItem("sapphire_netherite_hoe",
            new ModHoeItem(ModToolMaterials.SAPPHIRE_NETHERITE, -3, 0f,(new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP))));
    public static final Item SAPPHIRE_NETHERITE_SHOVEL = registerItem("sapphire_netherite_shovel",
            new ShovelItem(ModToolMaterials.SAPPHIRE_NETHERITE, 1.5f, -3.0f,(new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP))));

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));
    public static final Item RUBY_APPLE = registerItem("ruby_apple",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHIC_UPGRADES_GROUP).food(ModFoodComponents.RUBY_APPLE)));

    public static final Item RUBY_NETHERITE_SWORD = registerItem("ruby_netherite_sword",
            new SwordItem(ModToolMaterials.RUBY_NETHERITE, 3, -1.8f,(new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP))));
    public static final Item RUBY_NETHERITE_AXE = registerItem("ruby_netherite_axe",
            new ModAxeItem(ModToolMaterials.RUBY_NETHERITE, 5f, -2.4f,(new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP))));
    public static final Item RUBY_NETHERITE_PICKAXE = registerItem("ruby_netherite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.RUBY_NETHERITE, 1, -2.2f,(new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP))));
    public static final Item RUBY_NETHERITE_HOE = registerItem("ruby_netherite_hoe",
            new ModHoeItem(ModToolMaterials.RUBY_NETHERITE, -3, 1f,(new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP))));
    public static final Item RUBY_NETHERITE_SHOVEL = registerItem("ruby_netherite_shovel",
            new ShovelItem(ModToolMaterials.RUBY_NETHERITE, 1.5f, -2.2f,(new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP))));

    public static final Item JADE = registerItem("jade",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));
    public static final Item JADE_APPLE = registerItem("jade_apple",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHIC_UPGRADES_GROUP).food(ModFoodComponents.JADE_APPLE)));

    public static final Item JADE_NETHERITE_HELMET = registerItem("jade_netherite_helmet",
            new ArmorItem(ModArmorMaterials.JADE_NETHERITE, EquipmentSlot.HEAD, new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));
    public static final Item JADE_NETHERITE_CHESTPLATE = registerItem("jade_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.JADE_NETHERITE, EquipmentSlot.CHEST, new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));
    public static final Item JADE_NETHERITE_LEGGINGS = registerItem("jade_netherite_leggings",
            new ArmorItem(ModArmorMaterials.JADE_NETHERITE, EquipmentSlot.LEGS, new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));
    public static final Item JADE_NETHERITE_BOOTS = registerItem("jade_netherite_boots",
            new ArmorItem(ModArmorMaterials.JADE_NETHERITE, EquipmentSlot.FEET, new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));

    public static final Item TOPAZ = registerItem("topaz",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));
    public static final Item TOPAZ_APPLE = registerItem("topaz_apple",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHIC_UPGRADES_GROUP).food(ModFoodComponents.TOPAZ_APPLE)));

    public static final Item TOPAZ_NETHERITE_SWORD = registerItem("topaz_netherite_sword",
            new SwordItem(ModToolMaterials.TOPAZ_NETHERITE, 3, -2.4f,(new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP))));
    public static final Item TOPAZ_NETHERITE_AXE = registerItem("topaz_netherite_axe",
            new ModAxeItem(ModToolMaterials.TOPAZ_NETHERITE, 5f, -3f,(new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP))));
    public static final Item TOPAZ_NETHERITE_PICKAXE = registerItem("topaz_netherite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.TOPAZ_NETHERITE, 1, -2.8f,(new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP))));
    public static final Item TOPAZ_NETHERITE_HOE = registerItem("topaz_netherite_hoe",
            new ModHoeItem(ModToolMaterials.TOPAZ_NETHERITE, -3, 0f,(new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP))));
    public static final Item TOPAZ_NETHERITE_SHOVEL = registerItem("topaz_netherite_shovel",
            new ShovelItem(ModToolMaterials.TOPAZ_NETHERITE, 1.5f, -3.0f,(new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP))));

    public static final Item TOPAZ_NETHERITE_HELMET = registerItem("topaz_netherite_helmet",
            new ArmorItem(ModArmorMaterials.TOPAZ_NETHERITE, EquipmentSlot.HEAD, new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));
    public static final Item TOPAZ_NETHERITE_CHESTPLATE = registerItem("topaz_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.TOPAZ_NETHERITE, EquipmentSlot.CHEST, new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));
    public static final Item TOPAZ_NETHERITE_LEGGINGS = registerItem("topaz_netherite_leggings",
            new ArmorItem(ModArmorMaterials.TOPAZ_NETHERITE, EquipmentSlot.LEGS, new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));
    public static final Item TOPAZ_NETHERITE_BOOTS = registerItem("topaz_netherite_boots",
            new ArmorItem(ModArmorMaterials.TOPAZ_NETHERITE, EquipmentSlot.FEET, new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));

    public static final Item AMETRINE = registerItem("ametrine",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));
    public static final Item AMETRINE_APPLE = registerItem("ametrine_apple",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHIC_UPGRADES_GROUP).food(ModFoodComponents.AMETRINE_APPLE)));

    public static final Item AMETRINE_NETHERITE_HELMET = registerItem("ametrine_netherite_helmet",
            new ArmorEffectItem(ModArmorMaterials.AMETRINE_NETHERITE, EquipmentSlot.HEAD, new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP), StatusEffects.SPEED));
    public static final Item AMETRINE_NETHERITE_CHESTPLATE = registerItem("ametrine_netherite_chestplate",
            new ArmorEffectItem(ModArmorMaterials.AMETRINE_NETHERITE, EquipmentSlot.CHEST, new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP), StatusEffects.JUMP_BOOST));
    public static final Item AMETRINE_NETHERITE_LEGGINGS = registerItem("ametrine_netherite_leggings",
            new ArmorItem(ModArmorMaterials.AMETRINE_NETHERITE, EquipmentSlot.LEGS, new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));
    public static final Item AMETRINE_NETHERITE_BOOTS = registerItem("ametrine_netherite_boots",
            new ArmorItem(ModArmorMaterials.AMETRINE_NETHERITE, EquipmentSlot.FEET, new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));

    public static final Item AQUAMARINE = registerItem("aquamarine",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));
    public static final Item AQUAMARINE_FISH = registerItem("aquamarine_fish",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHIC_UPGRADES_GROUP).food(ModFoodComponents.AQUAMARINE_FISH)));

    public static final Item AQUAMARINE_NETHERITE_HELMET = registerItem("aquamarine_netherite_helmet",
            new ArmorEffectItem(ModArmorMaterials.AQUAMARINE_NETHERITE, EquipmentSlot.HEAD, new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP), StatusEffects.DOLPHINS_GRACE));
    public static final Item AQUAMARINE_NETHERITE_CHESTPLATE = registerItem("aquamarine_netherite_chestplate",
            new ArmorEffectItem(ModArmorMaterials.AQUAMARINE_NETHERITE, EquipmentSlot.CHEST, new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP), StatusEffects.CONDUIT_POWER));
    public static final Item AQUAMARINE_NETHERITE_LEGGINGS = registerItem("aquamarine_netherite_leggings",
            new ArmorItem(ModArmorMaterials.AQUAMARINE_NETHERITE, EquipmentSlot.LEGS, new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));
    public static final Item AQUAMARINE_NETHERITE_BOOTS = registerItem("aquamarine_netherite_boots",
            new ArmorItem(ModArmorMaterials.AQUAMARINE_NETHERITE, EquipmentSlot.FEET, new FabricItemSettings().fireproof().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));

    public static final Item URANIUM = registerItem("uranium",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHIC_UPGRADES_GROUP)));
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MythicUpgrades.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MythicUpgrades.LOGGER.info("Registering Mod Items for " + MythicUpgrades.MOD_ID);
    }
}


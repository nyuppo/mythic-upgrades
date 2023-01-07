package net.trique.mythicupgrades.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.trique.mythicupgrades.MythicUpgrades;

public class ModItemGroup {
    public static final ItemGroup MYTHIC_UPGRADES_GROUP = FabricItemGroupBuilder.build(new Identifier(MythicUpgrades.MOD_ID, "mythicupgradesgroup"),
            () -> new ItemStack(ModItems.RUBY_NETHERITE_AXE));
}
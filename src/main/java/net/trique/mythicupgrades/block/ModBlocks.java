package net.trique.mythicupgrades.block;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.item.ModItemGroup;

public class ModBlocks {

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE)
                    .sounds(BlockSoundGroup.STONE).strength(3f, 3f).requiresTool(),
                    UniformIntProvider.create(20, 160)), ModItemGroup.MYTHIC_UPGRADES_GROUP);
    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE)
                    .sounds(BlockSoundGroup.DEEPSLATE).strength(4.5f, 3f).requiresTool(),
                    UniformIntProvider.create(20, 160)), ModItemGroup.MYTHIC_UPGRADES_GROUP);
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new SapphireBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(5f, 6f).requiresTool()), ModItemGroup.MYTHIC_UPGRADES_GROUP);

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE)
                    .sounds(BlockSoundGroup.STONE).strength(3f, 3f).requiresTool(),
                    UniformIntProvider.create(20, 160)), ModItemGroup.MYTHIC_UPGRADES_GROUP);
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE)
                    .sounds(BlockSoundGroup.DEEPSLATE).strength(4.5f, 3f).requiresTool(),
                    UniformIntProvider.create(20, 160)), ModItemGroup.MYTHIC_UPGRADES_GROUP);
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(5f, 6f).requiresTool()), ModItemGroup.MYTHIC_UPGRADES_GROUP);

    public static final Block JADE_ORE = registerBlock("jade_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE)
                    .sounds(BlockSoundGroup.STONE).strength(3f, 3f).requiresTool(),
                    UniformIntProvider.create(20, 160)), ModItemGroup.MYTHIC_UPGRADES_GROUP);
    public static final Block DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE)
                    .sounds(BlockSoundGroup.DEEPSLATE).strength(4.5f, 3f).requiresTool(),
                    UniformIntProvider.create(20, 160)), ModItemGroup.MYTHIC_UPGRADES_GROUP);
    public static final Block JADE_BLOCK = registerBlock("jade_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(5f, 6f).requiresTool()), ModItemGroup.MYTHIC_UPGRADES_GROUP);

    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE)
                    .sounds(BlockSoundGroup.STONE).strength(3f, 3f).requiresTool(),
                    UniformIntProvider.create(20, 160)), ModItemGroup.MYTHIC_UPGRADES_GROUP);
    public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE)
                    .sounds(BlockSoundGroup.DEEPSLATE).strength(4.5f, 3f).requiresTool(),
                    UniformIntProvider.create(20, 160)), ModItemGroup.MYTHIC_UPGRADES_GROUP);
    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(5f, 6f).requiresTool()), ModItemGroup.MYTHIC_UPGRADES_GROUP);

    public static final Block AMETRINE_ORE = registerBlock("ametrine_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE)
                    .sounds(BlockSoundGroup.STONE).strength(4.5f, 4.5f).requiresTool(),
                    UniformIntProvider.create(20, 160)), ModItemGroup.MYTHIC_UPGRADES_GROUP);
    public static final Block AMETRINE_BLOCK = registerBlock("ametrine_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(5f, 6f).requiresTool()), ModItemGroup.MYTHIC_UPGRADES_GROUP);

    public static final Block AQUAMARINE_ORE = registerBlock("aquamarine_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE)
                    .sounds(BlockSoundGroup.STONE).strength(3f, 3f).requiresTool(),
                    UniformIntProvider.create(20, 160)), ModItemGroup.MYTHIC_UPGRADES_GROUP);
    public static final Block DEEPSLATE_AQUAMARINE_ORE = registerBlock("deepslate_aquamarine_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE)
                    .sounds(BlockSoundGroup.DEEPSLATE).strength(4.5f, 3f).requiresTool(),
                    UniformIntProvider.create(20, 160)), ModItemGroup.MYTHIC_UPGRADES_GROUP);
    public static final Block AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(5f, 6f).requiresTool()), ModItemGroup.MYTHIC_UPGRADES_GROUP);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MythicUpgrades.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MythicUpgrades.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        MythicUpgrades.LOGGER.info("Registering ModBlocks for" + MythicUpgrades.MOD_ID);
    }
}


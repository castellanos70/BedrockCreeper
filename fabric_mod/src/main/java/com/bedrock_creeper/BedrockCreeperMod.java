package com.bedrock_creeper;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PaneBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BedrockCreeperMod implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("BedrockCreeper");

    // @formatter:off
    public static final Identifier SANDSTONE_MOSSY_IDENTIFIER = new Identifier("bedrock_creeper", "sandstone_mossy");
    public static final Identifier BIRCH_PARQUET_IDENTIFIER = new Identifier("bedrock_creeper", "birch_parkay");
    public static final Identifier OAK_PARQUET_IDENTIFIER = new Identifier("bedrock_creeper", "oak_parkay");
    public static final Identifier SPRUCE_PARQUET_IDENTIFIER = new Identifier("bedrock_creeper", "spruce_parkay");
    public static final Identifier ACACIA_PARQUET_IDENTIFIER = new Identifier("bedrock_creeper", "acacia_parkay");
    public static final Identifier CLASS_PANE_WHITE_IDENTIFIER = new Identifier("bedrock_creeper", "glass_came_white");
    public static final Identifier CLASS_PANE_GREEN_IDENTIFIER = new Identifier("bedrock_creeper", "glass_came_green");
    public static final Identifier CLASS_PANE_LIGHT_GRAY_IDENTIFIER = new Identifier("bedrock_creeper", "glass_came_light_gray");
    public static final Identifier CLASS_PANE_RED_IDENTIFIER = new Identifier("bedrock_creeper", "glass_came_red");
    public static final Identifier CLASS_PANE_BLUE_IDENTIFIER = new Identifier("bedrock_creeper", "glass_came_blue");
    public static final Identifier CLASS_PANE_YELLOW_IDENTIFIER = new Identifier("bedrock_creeper", "glass_came_yellow");
    // @formatter:on

    /* set our block material to `STONE`, which requires a pickaxe to efficiently break.
       `strength` sets both the hardness and the resistance of a block to the same value.
       Hardness determines how long the block takes to break, and resistance determines how strong
       the block is against blast damage (e.g. explosions).
       Stone has a hardness of 1.5f and a resistance of 6.0f, while Obsidian has a hardness of 50.0f
       and a resistance of 1200.0f.
       You can find the stats of all vanilla blocks in the class `Blocks`, where you can also
       reference other blocks.
    */
    // @formatter:off
    public static final Block SANDSTONE_MOSSY_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(0.8f).requiresTool());
    public static final Item SANDSTONE_MOSSY_BLOCK_ITEM = new BlockItem(SANDSTONE_MOSSY_BLOCK, new FabricItemSettings());

    public static final Block BIRCH_PARQUET_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2f).requiresTool());
    public static final Item BIRCH_PARQUET_BLOCK_ITEM = new BlockItem(BIRCH_PARQUET_BLOCK, new FabricItemSettings());

    public static final Block OAK_PARQUET_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2f).requiresTool());
    public static final Item OAK_PARQUET_BLOCK_ITEM = new BlockItem(OAK_PARQUET_BLOCK, new FabricItemSettings());

    public static final Block SPRUCE_PARQUET_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2f).requiresTool());
    public static final Item SPRUCE_PARQUET_BLOCK_ITEM = new BlockItem(SPRUCE_PARQUET_BLOCK, new FabricItemSettings());

    public static final Block ACACIA_PARQUET_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2f).requiresTool());
    public static final Item ACACIA_PARQUET_BLOCK_ITEM = new BlockItem(ACACIA_PARQUET_BLOCK, new FabricItemSettings());

    public static final Block CLASS_PANE_WHITE = new PaneBlock(FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS_PANE).strength(0.3f).requiresTool());
    public static final Item CLASS_PANE_WHITE_ITEM = new BlockItem(CLASS_PANE_WHITE, new FabricItemSettings());
    public static final Block CLASS_PANE_GREEN = new PaneBlock(FabricBlockSettings.copyOf(Blocks.GREEN_STAINED_GLASS_PANE).strength(0.3f).requiresTool());
    public static final Item CLASS_PANE_GREEN_ITEM = new BlockItem(CLASS_PANE_GREEN, new FabricItemSettings());
    public static final Block CLASS_PANE_LIGHT_GRAY = new PaneBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE).strength(0.3f).requiresTool());
    public static final Item CLASS_PANE_LIGHT_GRAY_ITEM = new BlockItem(CLASS_PANE_LIGHT_GRAY, new FabricItemSettings());
    public static final Block CLASS_PANE_RED = new PaneBlock(FabricBlockSettings.copyOf(Blocks.RED_STAINED_GLASS_PANE).strength(0.3f).requiresTool());
    public static final Item CLASS_PANE_RED_ITEM = new BlockItem(CLASS_PANE_RED, new FabricItemSettings());
    public static final Block CLASS_PANE_BLUE = new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLUE_STAINED_GLASS_PANE).strength(0.3f).requiresTool());
    public static final Item CLASS_PANE_BLUE_ITEM = new BlockItem(CLASS_PANE_BLUE, new FabricItemSettings());
    public static final Block CLASS_PANE_YELLOW = new PaneBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_STAINED_GLASS_PANE).strength(0.3f).requiresTool());
    public static final Item CLASS_PANE_YELLOW_ITEM = new BlockItem(CLASS_PANE_YELLOW, new FabricItemSettings());
    // @formatter:on

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        Registry.register(Registries.BLOCK, SANDSTONE_MOSSY_IDENTIFIER, SANDSTONE_MOSSY_BLOCK);
        Registry.register(Registries.ITEM, SANDSTONE_MOSSY_IDENTIFIER, SANDSTONE_MOSSY_BLOCK_ITEM);


        Registry.register(Registries.BLOCK, BIRCH_PARQUET_IDENTIFIER, BIRCH_PARQUET_BLOCK);
        Registry.register(Registries.ITEM, BIRCH_PARQUET_IDENTIFIER, BIRCH_PARQUET_BLOCK_ITEM);
        Registry.register(Registries.BLOCK, OAK_PARQUET_IDENTIFIER, OAK_PARQUET_BLOCK);
        Registry.register(Registries.ITEM, OAK_PARQUET_IDENTIFIER, OAK_PARQUET_BLOCK_ITEM);
        Registry.register(Registries.BLOCK, SPRUCE_PARQUET_IDENTIFIER, SPRUCE_PARQUET_BLOCK);
        Registry.register(Registries.ITEM, SPRUCE_PARQUET_IDENTIFIER, SPRUCE_PARQUET_BLOCK_ITEM);
        Registry.register(Registries.BLOCK, ACACIA_PARQUET_IDENTIFIER, ACACIA_PARQUET_BLOCK);
        Registry.register(Registries.ITEM, ACACIA_PARQUET_IDENTIFIER, ACACIA_PARQUET_BLOCK_ITEM);


        Registry.register(Registries.BLOCK, CLASS_PANE_WHITE_IDENTIFIER, CLASS_PANE_WHITE);
        Registry.register(Registries.ITEM, CLASS_PANE_WHITE_IDENTIFIER, CLASS_PANE_WHITE_ITEM);
        Registry.register(Registries.BLOCK, CLASS_PANE_GREEN_IDENTIFIER, CLASS_PANE_GREEN);
        Registry.register(Registries.ITEM, CLASS_PANE_GREEN_IDENTIFIER, CLASS_PANE_GREEN_ITEM);
        Registry.register(Registries.BLOCK, CLASS_PANE_LIGHT_GRAY_IDENTIFIER,
            CLASS_PANE_LIGHT_GRAY
        );
        Registry.register(Registries.ITEM, CLASS_PANE_LIGHT_GRAY_IDENTIFIER,
            CLASS_PANE_LIGHT_GRAY_ITEM
        );
        Registry.register(Registries.BLOCK, CLASS_PANE_RED_IDENTIFIER, CLASS_PANE_RED);
        Registry.register(Registries.ITEM, CLASS_PANE_RED_IDENTIFIER, CLASS_PANE_RED_ITEM);
        Registry.register(Registries.BLOCK, CLASS_PANE_BLUE_IDENTIFIER, CLASS_PANE_BLUE);
        Registry.register(Registries.ITEM, CLASS_PANE_BLUE_IDENTIFIER, CLASS_PANE_BLUE_ITEM);
        Registry.register(Registries.BLOCK, CLASS_PANE_YELLOW_IDENTIFIER, CLASS_PANE_YELLOW);
        Registry.register(Registries.ITEM, CLASS_PANE_YELLOW_IDENTIFIER, CLASS_PANE_YELLOW_ITEM);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.add(SANDSTONE_MOSSY_BLOCK_ITEM);
            content.add(BIRCH_PARQUET_BLOCK_ITEM);
            content.add(OAK_PARQUET_BLOCK_ITEM);
            content.add(SPRUCE_PARQUET_BLOCK_ITEM);
            content.add(ACACIA_PARQUET_BLOCK_ITEM);
            content.add(CLASS_PANE_WHITE_ITEM);
            content.add(CLASS_PANE_GREEN_ITEM);
            content.add(CLASS_PANE_LIGHT_GRAY_ITEM);
            content.add(CLASS_PANE_RED_ITEM);
            content.add(CLASS_PANE_BLUE_ITEM);
            content.add(CLASS_PANE_YELLOW_ITEM);
        });
    }
}

package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.StainedGlassPaneBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BedrockCreeperMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("BedrockCreeper");

	/* set our block material to `STONE`, which requires a pickaxe to efficiently break.
       `strength` sets both the hardness and the resistance of a block to the same value.
       Hardness determines how long the block takes to break, and resistance determines how strong
       the block is against blast damage (e.g. explosions).
       Stone has a hardness of 1.5f and a resistance of 6.0f, while Obsidian has a hardness of 50.0f
       and a resistance of 1200.0f.
       You can find the stats of all vanilla blocks in the class `Blocks`, where you can also reference other blocks.
    */
	public static final Block SANDSTONE_MOSSY_BLOCK =
			new Block(FabricBlockSettings.of(Material.STONE).strength(0.8f).requiresTool());

	public static final Block BIRCH_PARKAY_BLOCK =
			new Block(FabricBlockSettings.of(Material.WOOD).strength(2f).requiresTool());

	public static final Block OAK_PARKAY_BLOCK =
			new Block(FabricBlockSettings.of(Material.WOOD).strength(2f).requiresTool());

	public static final Block SPRUCE_PARKAY_BLOCK =
			new Block(FabricBlockSettings.of(Material.WOOD).strength(2f).requiresTool());

	public static final Block ACACIA_PARKAY_BLOCK =
			new Block(FabricBlockSettings.of(Material.WOOD).strength(2f).requiresTool());

	public static final Block GLASS_CAME_WHITE =
			new PaneBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool());
	public static final Block GLASS_CAME_GREEN =
			new PaneBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool());
	public static final Block GLASS_CAME_LIGHT_GRAY =
			new PaneBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool());
	public static final Block GLASS_CAME_RED =
			new PaneBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool());

	public static final Block GLASS_CAME_BLUE =
			new PaneBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool());
	public static final Block GLASS_CAME_YELLOW =
			new PaneBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool());

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.BLOCK,
				new Identifier("bedrock_creeper", "sandstone_mossy"), SANDSTONE_MOSSY_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("bedrock_creeper", "sandstone_mossy"),
				new BlockItem(SANDSTONE_MOSSY_BLOCK, new FabricItemSettings().group(ItemGroup.MATERIALS)));


		Registry.register(Registry.BLOCK,
				new Identifier("bedrock_creeper", "birch_parkay"), BIRCH_PARKAY_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("bedrock_creeper", "birch_parkay"),
				new BlockItem(BIRCH_PARKAY_BLOCK, new FabricItemSettings().group(ItemGroup.MATERIALS)));
		Registry.register(Registry.BLOCK,
				new Identifier("bedrock_creeper", "oak_parkay"), OAK_PARKAY_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("bedrock_creeper", "oak_parkay"),
				new BlockItem(OAK_PARKAY_BLOCK, new FabricItemSettings().group(ItemGroup.MATERIALS)));
		Registry.register(Registry.BLOCK,
				new Identifier("bedrock_creeper", "spruce_parkay"), SPRUCE_PARKAY_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("bedrock_creeper", "spruce_parkay"),
				new BlockItem(SPRUCE_PARKAY_BLOCK, new FabricItemSettings().group(ItemGroup.MATERIALS)));
		Registry.register(Registry.BLOCK,
				new Identifier("bedrock_creeper", "acacia_parkay"), ACACIA_PARKAY_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("bedrock_creeper", "acacia_parkay"),
				new BlockItem(ACACIA_PARKAY_BLOCK, new FabricItemSettings().group(ItemGroup.MATERIALS)));


		Registry.register(Registry.BLOCK,
				new Identifier("bedrock_creeper", "glass_came_white"), GLASS_CAME_WHITE);
		Registry.register(Registry.ITEM, new Identifier("bedrock_creeper", "glass_came_white"),
				new BlockItem(GLASS_CAME_WHITE, new FabricItemSettings().group(ItemGroup.MATERIALS)));


		Registry.register(Registry.BLOCK,
				new Identifier("bedrock_creeper", "glass_came_green"), GLASS_CAME_GREEN);
		Registry.register(Registry.ITEM, new Identifier("bedrock_creeper", "glass_came_green"),
				new BlockItem(GLASS_CAME_GREEN, new FabricItemSettings().group(ItemGroup.MATERIALS)));

		Registry.register(Registry.BLOCK,
				new Identifier("bedrock_creeper", "glass_came_light_gray"), GLASS_CAME_LIGHT_GRAY);
		Registry.register(Registry.ITEM, new Identifier("bedrock_creeper", "glass_came_light_gray"),
				new BlockItem(GLASS_CAME_LIGHT_GRAY, new FabricItemSettings().group(ItemGroup.MATERIALS)));


		Registry.register(Registry.BLOCK,
				new Identifier("bedrock_creeper", "glass_came_red"), GLASS_CAME_RED);
		Registry.register(Registry.ITEM, new Identifier("bedrock_creeper", "glass_came_red"),
				new BlockItem(GLASS_CAME_RED, new FabricItemSettings().group(ItemGroup.MATERIALS)));


		Registry.register(Registry.BLOCK,
				new Identifier("bedrock_creeper", "glass_came_blue"), GLASS_CAME_BLUE);
		Registry.register(Registry.ITEM, new Identifier("bedrock_creeper", "glass_came_blue"),
				new BlockItem(GLASS_CAME_BLUE, new FabricItemSettings().group(ItemGroup.MATERIALS)));


		Registry.register(Registry.BLOCK,
				new Identifier("bedrock_creeper", "glass_came_yellow"), GLASS_CAME_YELLOW);
		Registry.register(Registry.ITEM, new Identifier("bedrock_creeper", "glass_came_yellow"),
				new BlockItem(GLASS_CAME_YELLOW, new FabricItemSettings().group(ItemGroup.MATERIALS)));
	}
}

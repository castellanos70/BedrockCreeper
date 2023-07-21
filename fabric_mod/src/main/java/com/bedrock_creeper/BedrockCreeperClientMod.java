package com.bedrock_creeper;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BedrockCreeperClientMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(BedrockCreeperMod.CLASS_PANE_WHITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BedrockCreeperMod.CLASS_PANE_GREEN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BedrockCreeperMod.CLASS_PANE_LIGHT_GRAY, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BedrockCreeperMod.CLASS_PANE_RED, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BedrockCreeperMod.CLASS_PANE_BLUE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BedrockCreeperMod.CLASS_PANE_YELLOW, RenderLayer.getTranslucent());
    }
}

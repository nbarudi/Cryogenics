package ca.bungo;

import ca.bungo.content.blocks.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class CryogenicsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        //Transparent Blocks
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRYSTALLINE_CHUNK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRYSTALLINE_CHUNK, RenderLayer.getTranslucent());
    }

}

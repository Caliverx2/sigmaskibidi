package net.lewapnoob.host;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.lewapnoob.host.entity.ModEntities;
import net.lewapnoob.host.entity.client.RedPandaModel;
import net.lewapnoob.host.entity.client.RedPandaRenderer;
import net.minecraft.client.render.RenderLayer;


public class LewapModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(RedPandaModel.REDPANDA, RedPandaModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.REDPANDA, RedPandaRenderer::new);
    }
}

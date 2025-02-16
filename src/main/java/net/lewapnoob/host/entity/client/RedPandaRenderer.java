package net.lewapnoob.host.entity.client;

import net.lewapnoob.host.LewapMod;
import net.lewapnoob.host.entity.custom.RedPandaEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class RedPandaRenderer extends MobEntityRenderer<RedPandaEntity, RedPandaModel<RedPandaEntity>> {
    public RedPandaRenderer(EntityRendererFactory.Context context) {
        super(context, new RedPandaModel<>(context.getPart(RedPandaModel.REDPANDA)), 0.75f);
    }

    @Override
    public Identifier getTexture(RedPandaEntity entity) {
        return Identifier.of(LewapMod.MOD_ID, "textures/entity/redpanda/red_panda.png");
    }

    @Override
    public void render(RedPandaEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}

package net.lewapnoob.host.entity.client;

import net.lewapnoob.host.LewapMod;
import net.lewapnoob.host.entity.custom.RedPandaEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class RedPandaModel<T extends RedPandaEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer REDPANDA = new EntityModelLayer(Identifier.of(LewapMod.MOD_ID, "redpanda"), "main");

    private final ModelPart cyce;
    private final ModelPart leg1;
    private final ModelPart leg2;
    private final ModelPart leg3;
    private final ModelPart leg4;
    private final ModelPart torso;
    private final ModelPart tail;
    private final ModelPart head;
    private final ModelPart ucho1;
    private final ModelPart ucho2;

    public RedPandaModel(ModelPart root) {
        this.cyce = root.getChild("cyce");
        this.leg1 = this.cyce.getChild("leg1");
        this.leg2 = this.cyce.getChild("leg2");
        this.leg3 = this.cyce.getChild("leg3");
        this.leg4 = this.cyce.getChild("leg4");
        this.torso = this.cyce.getChild("torso");
        this.tail = this.cyce.getChild("tail");
        this.head = this.cyce.getChild("head");
        this.ucho1 = this.head.getChild("ucho1");
        this.ucho2 = this.head.getChild("ucho2");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData cyce = modelPartData.addChild("cyce", ModelPartBuilder.create(), ModelTransform.of(0.0F, 24.0F, -2.0F, 0.0F, -3.098F, 0.0F));

        ModelPartData leg1 = cyce.addChild("leg1", ModelPartBuilder.create().uv(28, 28).cuboid(-1.0F, -2.25F, -1.0F, 2.0F, 4.5F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -2.25F, -6.0F));

        ModelPartData leg2 = cyce.addChild("leg2", ModelPartBuilder.create().uv(0, 32).cuboid(-1.0F, -2.25F, -1.0F, 2.0F, 4.5F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -2.25F, 1.0F));

        ModelPartData leg3 = cyce.addChild("leg3", ModelPartBuilder.create().uv(16, 32).cuboid(-1.0F, -2.25F, -1.0F, 2.0F, 4.5F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -2.25F, 1.0F));

        ModelPartData leg4 = cyce.addChild("leg4", ModelPartBuilder.create().uv(8, 32).cuboid(-1.0F, -2.25F, -1.0F, 2.0F, 4.5F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -2.25F, -6.0F));

        ModelPartData torso = cyce.addChild("torso", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -3.0F, -5.5F, 6.0F, 6.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.5F, -2.5F));

        ModelPartData tail = cyce.addChild("tail", ModelPartBuilder.create().uv(0, 17).cuboid(-2.0F, -2.5F, -5.0F, 4.0F, 5.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.5F, -13.0F));

        ModelPartData head = cyce.addChild("head", ModelPartBuilder.create().uv(28, 17).cuboid(-4.0F, -4.0F, -4.0F, 8.0F, 6.0F, 5.0F, new Dilation(0.0F))
                .uv(34, 0).cuboid(-2.0F, 0.0F, 1.0F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 11).cuboid(4.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 6).cuboid(3.0F, -6.0F, -1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 13).cuboid(2.0F, -5.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 3).cuboid(-5.0F, -6.0F, -1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(24, 32).cuboid(-5.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 9).cuboid(-3.0F, -5.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -6.0F, 7.0F));

        ModelPartData ucho1 = head.addChild("ucho1", ModelPartBuilder.create().uv(34, 3).cuboid(-1.3333F, -1.6667F, -0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(24, 32).cuboid(-1.3333F, 0.3333F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 9).cuboid(0.6667F, -0.6667F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.6667F, -4.3333F, -0.5F));

        ModelPartData ucho2 = head.addChild("ucho2", ModelPartBuilder.create().uv(34, 11).cuboid(0.3333F, 0.3333F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 13).cuboid(-1.6667F, -0.6667F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 6).cuboid(-0.6667F, -1.6667F, -0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.6667F, -4.3333F, -0.5F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(RedPandaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAnles(netHeadYaw, headPitch);
    }

    private void setHeadAnles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.F, 30.F);
        headPitch = MathHelper.clamp(headPitch, -25.F, 45.F);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        cyce.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return cyce;
    }
}

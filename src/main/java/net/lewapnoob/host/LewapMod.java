package net.lewapnoob.host;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.lewapnoob.host.block.ModBlocks;
import net.lewapnoob.host.entity.ModEntities;
import net.lewapnoob.host.entity.custom.RedPandaEntity;
import net.lewapnoob.host.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LewapMod implements ModInitializer {

	public static final String MOD_ID = "lewapnoob";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerModBlocks();
		ModEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(ModEntities.REDPANDA, RedPandaEntity.createMobAttributes());
	}
}
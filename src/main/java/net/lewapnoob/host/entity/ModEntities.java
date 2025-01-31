package net.lewapnoob.host.entity;

import net.lewapnoob.host.LewapMod;
import net.lewapnoob.host.entity.custom.RedPandaEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {


    public static final EntityType<RedPandaEntity> REDPANDA = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(LewapMod.MOD_ID, "redpanda"),
            EntityType.Builder.create(RedPandaEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1f, 2.5f).build());

    public static void registerModEntities() {
        LewapMod.LOGGER.info("Registering Mod Entities" + LewapMod.MOD_ID);
    }
}

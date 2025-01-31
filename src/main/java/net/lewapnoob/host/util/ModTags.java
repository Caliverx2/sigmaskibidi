package net.lewapnoob.host.util;

import net.lewapnoob.host.LewapMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(LewapMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_item");

        private static TagKey<Item> createTag(String name) {
            LewapMod.LOGGER.info("dodano skibiid tag");
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(LewapMod.MOD_ID, name));
        }
    }
}

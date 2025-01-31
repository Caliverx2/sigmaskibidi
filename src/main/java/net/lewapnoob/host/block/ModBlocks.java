package net.lewapnoob.host.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lewapnoob.host.LewapMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SKIBIDI_FRAME = registerBlock("skibidi_frame",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.GLASS)));

    public static final Block SKIBIDI_GRASS = registerBlock("skibidi_grass",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.GLASS)));

    private static Block registerBlock(String name, Block block) {
        registerBlocksItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(LewapMod.MOD_ID, name), block);
    }

    private static void registerBlocksItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(LewapMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        LewapMod.LOGGER.info("Registering Mod Blocks for" + LewapMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.SKIBIDI_FRAME);
            entries.add(ModBlocks.SKIBIDI_GRASS);
        });
    }
}

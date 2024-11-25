package ca.bungo.content.blocks;

import ca.bungo.Cryogenics;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CRYSTALLINE_CHUNK = registerBlock("crystalline_chunk", new Block(
            AbstractBlock.Settings.copy(Blocks.ICE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Cryogenics.MOD_ID, "crystalline_chunk")))
    ));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Cryogenics.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Cryogenics.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Cryogenics.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        Cryogenics.LOGGER.info("Registering Mod Block");
    }
}



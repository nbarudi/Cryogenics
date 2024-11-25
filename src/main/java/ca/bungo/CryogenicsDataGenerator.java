package ca.bungo;

import ca.bungo.content.blocks.ModBlocks;
import ca.bungo.content.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class CryogenicsDataGenerator implements DataGeneratorEntrypoint {

	private static class CryogenicsLootTableGenerator extends FabricBlockLootTableProvider {

		protected CryogenicsLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
			super(dataOutput, registryLookup);
		}

		@Override
		public void generate() {
			addDrop(ModBlocks.CRYSTALLINE_CHUNK, drops(ModItems.ICE_CRYSTAL, UniformLootNumberProvider.create(2, 5)));
			addDropWithSilkTouch(ModBlocks.CRYSTALLINE_CHUNK);

		}
	}

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();


		pack.addProvider(CryogenicsLootTableGenerator::new);

	}
}

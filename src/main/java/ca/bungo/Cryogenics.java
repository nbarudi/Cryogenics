package ca.bungo;

import ca.bungo.content.blocks.ModBlocks;
import ca.bungo.content.creativetabs.ModItemGroups;
import ca.bungo.content.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cryogenics implements ModInitializer {

	public static final String MOD_ID = "cryogenics";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.reigsterItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

}
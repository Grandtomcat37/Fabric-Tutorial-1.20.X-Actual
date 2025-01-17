package net.christian.tutorialmod;

import net.christian.tutorialmod.block.ModBlocks;
import net.christian.tutorialmod.item.ModItemGroups;
import net.christian.tutorialmod.item.ModsItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModsItems.registerModItems();

		ModBlocks.registerModBLocks();
	}
}
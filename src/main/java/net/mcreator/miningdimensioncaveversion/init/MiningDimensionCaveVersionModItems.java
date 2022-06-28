
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.miningdimensioncaveversion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.miningdimensioncaveversion.item.PortalcoreItem;
import net.mcreator.miningdimensioncaveversion.item.Miningdimension1Item;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MiningDimensionCaveVersionModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item MINERALWORLDPORTAL = register(MiningDimensionCaveVersionModBlocks.MINERALWORLDPORTAL,
			MiningDimensionCaveVersionModTabs.TAB_MININGDIMENSIONCAVEVERSION);
	public static final Item PORTALCORE = register(new PortalcoreItem());
	public static final Item MININGDIMENSION_1 = register(new Miningdimension1Item());
	public static final Item CLAYORE = register(MiningDimensionCaveVersionModBlocks.CLAYORE,
			MiningDimensionCaveVersionModTabs.TAB_MININGDIMENSIONCAVEVERSION);
	public static final Item STICKYORE = register(MiningDimensionCaveVersionModBlocks.STICKYORE,
			MiningDimensionCaveVersionModTabs.TAB_MININGDIMENSIONCAVEVERSION);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}

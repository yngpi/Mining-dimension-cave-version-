
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.miningdimensioncaveversion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.miningdimensioncaveversion.block.StickyoreBlock;
import net.mcreator.miningdimensioncaveversion.block.Miningdimension1PortalBlock;
import net.mcreator.miningdimensioncaveversion.block.MineralworldportalBlock;
import net.mcreator.miningdimensioncaveversion.block.ClayoreBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MiningDimensionCaveVersionModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block MINERALWORLDPORTAL = register(new MineralworldportalBlock());
	public static final Block MININGDIMENSION_1_PORTAL = register(new Miningdimension1PortalBlock());
	public static final Block CLAYORE = register(new ClayoreBlock());
	public static final Block STICKYORE = register(new StickyoreBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}

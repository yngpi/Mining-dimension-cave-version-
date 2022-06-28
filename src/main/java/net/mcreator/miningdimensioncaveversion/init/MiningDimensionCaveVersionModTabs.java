
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.miningdimensioncaveversion.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MiningDimensionCaveVersionModTabs {
	public static CreativeModeTab TAB_MININGDIMENSIONCAVEVERSION;

	public static void load() {
		TAB_MININGDIMENSIONCAVEVERSION = new CreativeModeTab("tabminingdimensioncaveversion") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MiningDimensionCaveVersionModBlocks.MINERALWORLDPORTAL);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}


package net.mcreator.miningdimensioncaveversion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.miningdimensioncaveversion.init.MiningDimensionCaveVersionModTabs;

public class PortalcoreItem extends Item {
	public PortalcoreItem() {
		super(new Item.Properties().tab(MiningDimensionCaveVersionModTabs.TAB_MININGDIMENSIONCAVEVERSION).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("portalcore");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}

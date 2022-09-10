
package io.itch.awesomekalin.noob.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import io.itch.awesomekalin.noob.init.NoobModTabs;

public class SalivaItem extends Item {
	public SalivaItem() {
		super(new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("saliva");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}

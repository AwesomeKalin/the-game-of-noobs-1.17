
package io.itch.awesomekalin.noob.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import io.itch.awesomekalin.noob.init.NoobModTabs;

public class MudShovelBottomItem extends Item {
	public MudShovelBottomItem() {
		super(new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("mud_shovel_bottom");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}

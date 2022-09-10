
package io.itch.awesomekalin.noob.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import io.itch.awesomekalin.noob.init.NoobModTabs;

public class NoobFoodItem extends Item {
	public NoobFoodItem() {
		super(new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("noob_food");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}

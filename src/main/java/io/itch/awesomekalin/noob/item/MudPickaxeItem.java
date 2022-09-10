
package io.itch.awesomekalin.noob.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import io.itch.awesomekalin.noob.procedures.MudAxeMobIsHitWithToolProcedure;
import io.itch.awesomekalin.noob.init.NoobModTabs;

public class MudPickaxeItem extends PickaxeItem {
	public MudPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 10;
			}

			public float getSpeed() {
				return 0.1f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 1;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB));
		setRegistryName("mud_pickaxe");
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level;

		MudAxeMobIsHitWithToolProcedure.execute(entity, itemstack);
		return retval;
	}
}


package io.itch.awesomekalin.noob.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import io.itch.awesomekalin.noob.init.NoobModTabs;
import io.itch.awesomekalin.noob.init.NoobModItems;

public abstract class NoobArmorItem extends ArmorItem {
	public NoobArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 5;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{1, 2, 2, 1}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 3;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(NoobModItems.NOOB_DUST));
			}

			@Override
			public String getName() {
				return "noob_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends NoobArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB));
			setRegistryName("noob_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "noob:textures/models/armor/noob_layer_1.png";
		}
	}

	public static class Chestplate extends NoobArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB));
			setRegistryName("noob_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "noob:textures/models/armor/noob_layer_1.png";
		}
	}

	public static class Leggings extends NoobArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB));
			setRegistryName("noob_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "noob:textures/models/armor/noob_layer_2.png";
		}
	}

	public static class Boots extends NoobArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB));
			setRegistryName("noob_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "noob:textures/models/armor/noob_layer_1.png";
		}
	}
}

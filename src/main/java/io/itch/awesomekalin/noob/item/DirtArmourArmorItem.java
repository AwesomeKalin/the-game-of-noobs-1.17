
package io.itch.awesomekalin.noob.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
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

public abstract class DirtArmourArmorItem extends ArmorItem {
	public DirtArmourArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 2;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{0, 1, 1, 0}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 1;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.DIRT));
			}

			@Override
			public String getName() {
				return "dirt_armour_armor";
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

	public static class Helmet extends DirtArmourArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB));
			setRegistryName("dirt_armour_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "noob:textures/models/armor/dirtarmour__layer_1.png";
		}
	}

	public static class Chestplate extends DirtArmourArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB));
			setRegistryName("dirt_armour_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "noob:textures/models/armor/dirtarmour__layer_1.png";
		}
	}

	public static class Leggings extends DirtArmourArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB));
			setRegistryName("dirt_armour_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "noob:textures/models/armor/dirtarmour__layer_2.png";
		}
	}

	public static class Boots extends DirtArmourArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB));
			setRegistryName("dirt_armour_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "noob:textures/models/armor/dirtarmour__layer_1.png";
		}
	}
}

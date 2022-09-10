
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.itch.awesomekalin.noob.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

import io.itch.awesomekalin.noob.item.SalivaItem;
import io.itch.awesomekalin.noob.item.NoobSwordItem;
import io.itch.awesomekalin.noob.item.NoobShovelItem;
import io.itch.awesomekalin.noob.item.NoobPickaxeItem;
import io.itch.awesomekalin.noob.item.NoobHoeItem;
import io.itch.awesomekalin.noob.item.NoobFoodItem;
import io.itch.awesomekalin.noob.item.NoobDustItem;
import io.itch.awesomekalin.noob.item.NoobDimItem;
import io.itch.awesomekalin.noob.item.NoobAxeItem;
import io.itch.awesomekalin.noob.item.NoobArmorItem;
import io.itch.awesomekalin.noob.item.MudSwordItem;
import io.itch.awesomekalin.noob.item.MudShovelTopItem;
import io.itch.awesomekalin.noob.item.MudShovelItem;
import io.itch.awesomekalin.noob.item.MudShovelBottomItem;
import io.itch.awesomekalin.noob.item.MudPickaxeItem;
import io.itch.awesomekalin.noob.item.MudHoeItem;
import io.itch.awesomekalin.noob.item.MudAxeItem;
import io.itch.awesomekalin.noob.item.DirtArmourArmorItem;
import io.itch.awesomekalin.noob.item.CreativeGauntletItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NoobModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item NOOB_CHEST = register(NoobModBlocks.NOOB_CHEST, NoobModTabs.TAB_NOOB_TAB);
	public static final Item NOOB_DIM = register(new NoobDimItem());
	public static final Item MUD_AXE = register(new MudAxeItem());
	public static final Item MUD_SWORD = register(new MudSwordItem());
	public static final Item MUD_PICKAXE = register(new MudPickaxeItem());
	public static final Item NOOB_DUST = register(new NoobDustItem());
	public static final Item NOOB_ORE = register(NoobModBlocks.NOOB_ORE, NoobModTabs.TAB_NOOB_TAB);
	public static final Item NOOB_BLOCK = register(NoobModBlocks.NOOB_BLOCK, NoobModTabs.TAB_NOOB_TAB);
	public static final Item NOOB_PICKAXE = register(new NoobPickaxeItem());
	public static final Item NOOB_AXE = register(new NoobAxeItem());
	public static final Item NOOB_SWORD = register(new NoobSwordItem());
	public static final Item NOOB_SHOVEL = register(new NoobShovelItem());
	public static final Item NOOB_HOE = register(new NoobHoeItem());
	public static final Item NOOB_ARMOR_HELMET = register(new NoobArmorItem.Helmet());
	public static final Item NOOB_ARMOR_CHESTPLATE = register(new NoobArmorItem.Chestplate());
	public static final Item NOOB_ARMOR_LEGGINGS = register(new NoobArmorItem.Leggings());
	public static final Item NOOB_ARMOR_BOOTS = register(new NoobArmorItem.Boots());
	public static final Item MUD_SHOVEL = register(new MudShovelItem());
	public static final Item MUD_HOE = register(new MudHoeItem());
	public static final Item MUD_SHOVEL_TOP = register(new MudShovelTopItem());
	public static final Item MUD_SHOVEL_BOTTOM = register(new MudShovelBottomItem());
	public static final Item DIRT_ARMOUR_ARMOR_HELMET = register(new DirtArmourArmorItem.Helmet());
	public static final Item DIRT_ARMOUR_ARMOR_CHESTPLATE = register(new DirtArmourArmorItem.Chestplate());
	public static final Item DIRT_ARMOUR_ARMOR_LEGGINGS = register(new DirtArmourArmorItem.Leggings());
	public static final Item DIRT_ARMOUR_ARMOR_BOOTS = register(new DirtArmourArmorItem.Boots());
	public static final Item SALIVA = register(new SalivaItem());
	public static final Item CREATIVE_GAUNTLET = register(new CreativeGauntletItem());
	public static final Item THE_NOOB = register(
			new SpawnEggItem(NoobModEntities.THE_NOOB, -13421569, -10027009, new Item.Properties().tab(NoobModTabs.TAB_NOOB_TAB))
					.setRegistryName("the_noob_spawn_egg"));
	public static final Item NOOB_FOOD = register(new NoobFoodItem());

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

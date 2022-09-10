
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.itch.awesomekalin.noob.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

import io.itch.awesomekalin.noob.block.NoobOreBlock;
import io.itch.awesomekalin.noob.block.NoobDimPortalBlock;
import io.itch.awesomekalin.noob.block.NoobChestBlock;
import io.itch.awesomekalin.noob.block.NoobBlockBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NoobModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block NOOB_CHEST = register(new NoobChestBlock());
	public static final Block NOOB_DIM_PORTAL = register(new NoobDimPortalBlock());
	public static final Block NOOB_ORE = register(new NoobOreBlock());
	public static final Block NOOB_BLOCK = register(new NoobBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}

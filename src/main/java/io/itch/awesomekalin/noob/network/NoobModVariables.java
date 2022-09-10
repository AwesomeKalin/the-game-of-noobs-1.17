package io.itch.awesomekalin.noob.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NoobModVariables {
	public static String NameHit = "";
	public static String NameThanks = "";

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}

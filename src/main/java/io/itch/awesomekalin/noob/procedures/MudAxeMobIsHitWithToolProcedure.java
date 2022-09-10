package io.itch.awesomekalin.noob.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class MudAxeMobIsHitWithToolProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		entity.setCustomName(new TextComponent("Noobed"));
		(itemstack).setHoverName(new TextComponent("HOW DARE YOU!"));
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"effect @p poison 5 5");
		}
	}
}

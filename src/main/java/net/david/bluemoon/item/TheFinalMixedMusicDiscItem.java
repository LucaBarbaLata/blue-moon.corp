
package net.david.bluemoon.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class TheFinalMixedMusicDiscItem extends RecordItem {
	public TheFinalMixedMusicDiscItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bluemoon:the_final_ogg")), new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.RARE), 9280);
	}
}

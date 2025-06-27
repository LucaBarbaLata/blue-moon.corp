
package net.david.bluemoon.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class PurpleNoiseMusicDiscItem extends RecordItem {
	public PurpleNoiseMusicDiscItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bluemoon:purple_noise_ogg")), new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.RARE), 10780);
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.david.bluemoon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.david.bluemoon.item.TheFinalMixedMusicDiscItem;
import net.david.bluemoon.item.PurpleNoiseMusicDiscItem;
import net.david.bluemoon.item.NightOwlMusicDiscItem;
import net.david.bluemoon.item.KittysJourneyMusicDiscItem;
import net.david.bluemoon.item.BluedimensionItem;
import net.david.bluemoon.BluemoonMod;

public class BluemoonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BluemoonMod.MODID);
	public static final RegistryObject<Item> NIGHT_OWL_MUSIC_DISC = REGISTRY.register("night_owl_music_disc", () -> new NightOwlMusicDiscItem());
	public static final RegistryObject<Item> KITTYS_JOURNEY_MUSIC_DISC = REGISTRY.register("kittys_journey_music_disc", () -> new KittysJourneyMusicDiscItem());
	public static final RegistryObject<Item> THE_FINAL_MIXED_MUSIC_DISC = REGISTRY.register("the_final_mixed_music_disc", () -> new TheFinalMixedMusicDiscItem());
	public static final RegistryObject<Item> PURPLE_NOISE_MUSIC_DISC = REGISTRY.register("purple_noise_music_disc", () -> new PurpleNoiseMusicDiscItem());
	public static final RegistryObject<Item> BLUEDIMENSION = REGISTRY.register("bluedimension", () -> new BluedimensionItem());
	// Start of user code block custom items
	// End of user code block custom items
}

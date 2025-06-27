
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.david.bluemoon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.david.bluemoon.BluemoonMod;

public class BluemoonModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BluemoonMod.MODID);
	public static final RegistryObject<SoundEvent> KITTYS_JOURNEY_OGG = REGISTRY.register("kittys_journey_ogg", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bluemoon", "kittys_journey_ogg")));
	public static final RegistryObject<SoundEvent> NIGHT_OWL_OGG = REGISTRY.register("night_owl_ogg", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bluemoon", "night_owl_ogg")));
	public static final RegistryObject<SoundEvent> THE_FINAL_OGG = REGISTRY.register("the_final_ogg", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bluemoon", "the_final_ogg")));
	public static final RegistryObject<SoundEvent> PURPLE_NOISE_OGG = REGISTRY.register("purple_noise_ogg", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bluemoon", "purple_noise_ogg")));
}

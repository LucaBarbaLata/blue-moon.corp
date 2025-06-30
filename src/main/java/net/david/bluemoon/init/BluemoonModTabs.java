
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.david.bluemoon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.david.bluemoon.BluemoonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BluemoonModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BluemoonMod.MODID);
	public static final RegistryObject<CreativeModeTab> BLUE_MOON = REGISTRY.register("blue_moon",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.bluemoon.blue_moon")).icon(() -> new ItemStack(Items.ZOMBIE_HEAD)).displayItems((parameters, tabData) -> {
				tabData.accept(BluemoonModItems.NIGHT_OWL_MUSIC_DISC.get());
				tabData.accept(BluemoonModItems.KITTYS_JOURNEY_MUSIC_DISC.get());
				tabData.accept(BluemoonModItems.THE_FINAL_MIXED_MUSIC_DISC.get());
				tabData.accept(BluemoonModItems.PURPLE_NOISE_MUSIC_DISC.get());
				tabData.accept(BluemoonModItems.BLUEDIMENSION.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(BluemoonModItems.BLUEDIMENSION.get());
		}
	}
}

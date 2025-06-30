
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.david.bluemoon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.david.bluemoon.block.BluedimensionPortalBlock;
import net.david.bluemoon.BluemoonMod;

public class BluemoonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BluemoonMod.MODID);
	public static final RegistryObject<Block> BLUEDIMENSION_PORTAL = REGISTRY.register("bluedimension_portal", () -> new BluedimensionPortalBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

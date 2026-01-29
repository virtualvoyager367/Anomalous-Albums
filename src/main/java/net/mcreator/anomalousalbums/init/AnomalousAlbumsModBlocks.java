
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomalousalbums.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.anomalousalbums.block.SpeakerBlock;
import net.mcreator.anomalousalbums.AnomalousAlbumsMod;

public class AnomalousAlbumsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AnomalousAlbumsMod.MODID);
	public static final RegistryObject<Block> SPEAKER = REGISTRY.register("speaker", () -> new SpeakerBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomalousalbums.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.anomalousalbums.AnomalousAlbumsMod;

public class AnomalousAlbumsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AnomalousAlbumsMod.MODID);
	public static final RegistryObject<SoundEvent> RECORD_92 = REGISTRY.register("record_92", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("anomalous_albums", "record_92")));
}

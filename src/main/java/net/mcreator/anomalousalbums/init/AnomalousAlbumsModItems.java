
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomalousalbums.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorItem;

import net.mcreator.anomalousalbums.item.HeadphonesItem;
import net.mcreator.anomalousalbums.block.display.SpeakerDisplayItem;
import net.mcreator.anomalousalbums.AnomalousAlbumsMod;

public class AnomalousAlbumsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AnomalousAlbumsMod.MODID);
	public static final RegistryObject<Item> SPEAKER = REGISTRY.register(AnomalousAlbumsModBlocks.SPEAKER.getId().getPath(), () -> new SpeakerDisplayItem(AnomalousAlbumsModBlocks.SPEAKER.get(), new Item.Properties()));
	public static final RegistryObject<HeadphonesItem> HEADPHONES_HELMET = REGISTRY.register("headphones_helmet", () -> new HeadphonesItem(ArmorItem.Type.HELMET, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}

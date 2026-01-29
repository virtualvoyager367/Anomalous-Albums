
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomalousalbums.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.anomalousalbums.AnomalousAlbumsMod;

public class AnomalousAlbumsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AnomalousAlbumsMod.MODID);
	public static final RegistryObject<CreativeModeTab> ANOMALOUS_ALBUMS_TAB = REGISTRY.register("anomalous_albums_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.anomalous_albums.anomalous_albums_tab")).icon(() -> new ItemStack(Blocks.AIR)).displayItems((parameters, tabData) -> {
				tabData.accept(AnomalousAlbumsModBlocks.SPEAKER.get().asItem());
			}).build());
}

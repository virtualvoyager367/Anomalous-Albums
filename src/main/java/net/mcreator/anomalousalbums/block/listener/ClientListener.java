package net.mcreator.anomalousalbums.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.anomalousalbums.init.AnomalousAlbumsModBlockEntities;
import net.mcreator.anomalousalbums.block.renderer.SpeakerTileRenderer;
import net.mcreator.anomalousalbums.AnomalousAlbumsMod;

@Mod.EventBusSubscriber(modid = AnomalousAlbumsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(AnomalousAlbumsModBlockEntities.SPEAKER.get(), context -> new SpeakerTileRenderer());
	}
}

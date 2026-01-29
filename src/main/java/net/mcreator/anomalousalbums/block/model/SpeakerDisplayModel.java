package net.mcreator.anomalousalbums.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.anomalousalbums.block.display.SpeakerDisplayItem;

public class SpeakerDisplayModel extends GeoModel<SpeakerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpeakerDisplayItem animatable) {
		return new ResourceLocation("anomalous_albums", "animations/speaker_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpeakerDisplayItem animatable) {
		return new ResourceLocation("anomalous_albums", "geo/speaker_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpeakerDisplayItem entity) {
		return new ResourceLocation("anomalous_albums", "textures/block/texture.png");
	}
}

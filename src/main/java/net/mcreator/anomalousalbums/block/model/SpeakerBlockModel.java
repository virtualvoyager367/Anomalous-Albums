package net.mcreator.anomalousalbums.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.anomalousalbums.block.entity.SpeakerTileEntity;

public class SpeakerBlockModel extends GeoModel<SpeakerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpeakerTileEntity animatable) {
		return new ResourceLocation("anomalous_albums", "animations/speaker_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpeakerTileEntity animatable) {
		return new ResourceLocation("anomalous_albums", "geo/speaker_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpeakerTileEntity animatable) {
		return new ResourceLocation("anomalous_albums", "textures/block/texture.png");
	}
}

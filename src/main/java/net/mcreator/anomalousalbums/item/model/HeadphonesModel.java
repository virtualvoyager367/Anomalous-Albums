package net.mcreator.anomalousalbums.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.anomalousalbums.item.HeadphonesItem;

public class HeadphonesModel extends GeoModel<HeadphonesItem> {
	@Override
	public ResourceLocation getAnimationResource(HeadphonesItem object) {
		return new ResourceLocation("anomalous_albums", "animations/headphones.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HeadphonesItem object) {
		return new ResourceLocation("anomalous_albums", "geo/headphones.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HeadphonesItem object) {
		return new ResourceLocation("anomalous_albums", "textures/item/headphone_texture.png");
	}
}

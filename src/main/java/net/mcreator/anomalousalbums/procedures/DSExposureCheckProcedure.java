package net.mcreator.anomalousalbums.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.anomalousalbums.network.AnomalousAlbumsModVariables;

public class DSExposureCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(AnomalousAlbumsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AnomalousAlbumsModVariables.PlayerVariables())).Is_Exposed_to_Deafening_silence) {
			return true;
		}
		return false;
	}
}

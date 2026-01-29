package net.mcreator.anomalousalbums.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SpeakerispoweredProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if ((world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(BlockPos.containing(x, y, z)) : 0) >= 1
				&& (blockstate.getBlock().getStateDefinition().getProperty("Is_Playing_92") instanceof BooleanProperty _getbp2 && blockstate.getValue(_getbp2)) == true) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("anomalous_albums:record_92")), SoundSource.RECORDS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("anomalous_albums:record_92")), SoundSource.RECORDS, 1, 1, false);
				}
			}
		} else if ((world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(BlockPos.containing(x, y, z)) : 0) == 0
				&& (blockstate.getBlock().getStateDefinition().getProperty("Is_Playing_92") instanceof BooleanProperty _getbp6 && blockstate.getValue(_getbp6)) == false) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beehive.enter")), SoundSource.RECORDS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beehive.enter")), SoundSource.RECORDS, 1, 1, false);
				}
			}
		} else if ((world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(BlockPos.containing(x, y, z)) : 0) >= 1
				&& !(blockstate.getBlock().getStateDefinition().getProperty("Is_Playing_92") instanceof BooleanProperty _getbp10 && blockstate.getValue(_getbp10)) == true) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("Is_Playing_92") instanceof BooleanProperty _booleanProp)
					world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
			}
		} else if ((world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(BlockPos.containing(x, y, z)) : 0) == 0
				&& (blockstate.getBlock().getStateDefinition().getProperty("Is_Playing_92") instanceof BooleanProperty _getbp14 && blockstate.getValue(_getbp14)) == true) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("Is_Playing_92") instanceof BooleanProperty _booleanProp)
					world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
			}
		}
	}
}

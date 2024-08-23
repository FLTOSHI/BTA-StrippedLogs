package fltoshi.stripped_logs;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;
import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;


public class StrippedLogs implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
	public static final String MOD_ID = "stripped_logs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static TomlConfigHandler tconfig;

	static {
		tconfig = new TomlConfigHandler(MOD_ID,
				new Toml()
						.addEntry("block-id-start", "All mod blocks will have ids starting at this number. Edit this only if you are having id collision with other mods", "1100")
		);
	}

	Block blockStrippedOakLog;
	Block blockStrippedBirchLog;
	Block blockStrippedPineLog;
	Block blockStrippedMossyOakLog;
	Block blockStrippedCherryLog;
	Block blockStrippedEucalyptusLog;
	Block blockStrippedPalmLog;
	Block blockStrippedThornLog;

	@Override
	public void onInitialize() {
		int start_id = tconfig.getInt("block-id-start");

		BlockBuilder strippedLog_builder = new BlockBuilder(MOD_ID)
				.setHardness(2.0f)
				.setResistance(2.0f)
				.addTags(BlockTags.MINEABLE_BY_AXE);

		blockStrippedOakLog = strippedLog_builder.clone()
				.setTextures("stripped_logs:block/stripped_oak_side")
				.setTopBottomTextures("stripped_logs:block/stripped_oak_top")
				.build(new Block("stripped.oakLog", start_id++, Material.wood));

		blockStrippedPineLog = strippedLog_builder.clone()
				.setTextures("stripped_logs:block/stripped_pine_side")
				.setTopBottomTextures("stripped_logs:block/stripped_pine_top")
				.build(new Block("stripped.pineLog", start_id++, Material.wood));

		blockStrippedBirchLog = strippedLog_builder.clone()
				.setTextures("stripped_logs:block/stripped_birch_side")
				.setTopBottomTextures("stripped_logs:block/stripped_birch_top")
				.build(new Block("stripped.birchLog", start_id++, Material.wood));

		blockStrippedMossyOakLog = strippedLog_builder.clone()
				.setTextures("stripped_logs:block/stripped_oak_mossy_side")
				.setTopBottomTextures("stripped_logs:block/stripped_oak_mossy_top")
				.build(new Block("stripped.mossyOakLog", start_id++, Material.wood));

		blockStrippedCherryLog = strippedLog_builder.clone()
				.setTextures("stripped_logs:block/stripped_cherry_side")
				.setTopBottomTextures("stripped_logs:block/stripped_cherry_top")
				.build(new Block("stripped.cherryLog", start_id++, Material.wood));

		blockStrippedEucalyptusLog = strippedLog_builder.clone()
				.setTextures("stripped_logs:block/stripped_eucalyptus_side")
				.setTopBottomTextures("stripped_logs:block/stripped_eucalyptus_top")
				.build(new Block("stripped.eucalyptusLog", start_id++, Material.wood));

		blockStrippedPalmLog = strippedLog_builder.clone()
				.setTextures("stripped_logs:block/stripped_palm_side")
				.setTopBottomTextures("stripped_logs:block/stripped_palm_top")
				.build(new Block("stripped.palmLog", start_id++, Material.wood));

		blockStrippedThornLog = strippedLog_builder.clone()
				.setTextures("stripped_logs:block/stripped_thorn_side")
				.setTopBottomTextures("stripped_logs:block/stripped_thorn_top")
				.build(new Block("stripped.thornLog", start_id++, Material.wood));


		LOGGER.info(MOD_ID + " initialized");
	}

	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {

	}
}

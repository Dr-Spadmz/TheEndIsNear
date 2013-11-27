package spadmz.tein.lib;

import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {

	public static void initConfigs(Configuration config) {
		config.load();
		BlockIds.MEMORY_TABLE = config.getBlock(BlockNames.MEMORY_TABLE, BlockIds.MEMORY_TABLE_DEFAULT).getInt();
		config.save();
	}
}

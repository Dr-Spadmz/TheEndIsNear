package spadmz.tein.block;

import cpw.mods.fml.common.registry.GameRegistry;
import spadmz.tein.lib.BlockIds;
import spadmz.tein.lib.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TEINBlocks{

	public static Block memoryTable;
	
	
	public static void init() {
		memoryTable = new MemoryTable(BlockIds.MEMORY_TABLE, Material.wood);
	
		GameRegistry.registerBlock(memoryTable,BlockNames.MEMORY_TABLE);
	}

}

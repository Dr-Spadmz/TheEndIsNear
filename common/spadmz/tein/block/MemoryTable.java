package spadmz.tein.block;

import spadmz.tein.lib.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MemoryTable extends Block{

	public MemoryTable(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName(BlockNames.MEMORY_TABLE);
	}
	

}

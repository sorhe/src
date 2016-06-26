package erfurt.eadore.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class EadoreBlock extends Block
{
	public EadoreBlock(Material mat, String name)
	{
		super(mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
}

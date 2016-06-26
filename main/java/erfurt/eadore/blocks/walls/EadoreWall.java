package erfurt.eadore.blocks.walls;

import java.util.List;

import erfurt.eadore.init.EadoreBlocks;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EadoreWall extends AbstractBlockWall
{
	public EadoreWall(Block block, String name)
	{
		super(block);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
	
	public void getSubBlocks (Item item, CreativeTabs tabs, List list)
	{
		for(int i = 0; i < EadoreBlocks.Walls.length; i++)
		{
			list.add(new ItemStack(item, 1, i));
		}
	}
}

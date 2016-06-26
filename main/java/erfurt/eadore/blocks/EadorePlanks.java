package erfurt.eadore.blocks;

import java.util.List;

import erfurt.eadore.init.EadoreBlocks;
import net.minecraft.block.BlockPlanks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EadorePlanks extends BlockPlanks
{
	public EadorePlanks(String name)
	{
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
	
	public void getSubBlocks (Item item, CreativeTabs tabs, List list)
	{
		for(int i = 0; i < EadoreBlocks.Trees.length; i++)
		{
			list.add(new ItemStack(item, 1, i));
		}
	}
}
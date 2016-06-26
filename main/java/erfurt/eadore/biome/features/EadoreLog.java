package erfurt.eadore.biome.features;

import java.util.List;

import erfurt.eadore.init.EadoreBlocks;
import net.minecraft.block.BlockLog;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EadoreLog extends BlockLog
{
	public EadoreLog(String name)
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
	
	public String getUnlocalizedName(ItemStack itemstack)
	{
		int i = itemstack.getItemDamage();
		if(i < 0 || i >= EadoreBlocks.Trees.length)
		{
			i = 0;
		}
		
		return super.getUnlocalizedName() + "_" + EadoreBlocks.Trees[i];
	}
}
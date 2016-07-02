package erfurt.eadore.blocks;

import java.util.List;

import erfurt.eadore.init.EadoreBlocks;
import net.minecraft.block.BlockPlanks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class EadorePlanks extends BlockPlanks
{
	public EadorePlanks(String name)
	{
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		OreDictionary.registerOre("plankWood", new ItemStack(this));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List<ItemStack> list)
    {
        list.add(new ItemStack(item, 1, 0));
    }
	/*public void getSubBlocks (Item item, CreativeTabs tabs, List list)
	{
		for(int i = 0; i < EadoreBlocks.Trees.length; i++)
		{
			list.add(new ItemStack(item, 1, i));
		}
	}*/
}
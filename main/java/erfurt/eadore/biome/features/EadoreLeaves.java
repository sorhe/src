package erfurt.eadore.biome.features;

import java.util.Arrays;
import java.util.List;

import erfurt.eadore.init.EadoreBlocks;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class EadoreLeaves extends BlockLeaves
{
	
	public EadoreLeaves(String name)
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
	
	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
	{
		return Arrays.asList(new ItemStack(this, 1));
	}

	@Override
	public EnumType getWoodType(int meta)
	{
		return null;
	}
	
}
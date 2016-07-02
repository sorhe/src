package erfurt.eadore.biome.features;

import java.util.Arrays;
import java.util.List;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EadoreLeaves extends BlockLeaves
{
	
	public EadoreLeaves(String name)
	{
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
	
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return Blocks.leaves.getBlockLayer();
	}
	
	public boolean isOpaqueCube(IBlockState state)
	{
		return Blocks.leaves.isOpaqueCube(state);
	}
	
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side)
	{
		return Blocks.leaves.shouldSideBeRendered(state, world, pos, side);
	}
	
	/*public void getSubBlocks (Item item, CreativeTabs tabs, List list)
	{
		for(int i = 0; i < EadoreBlocks.Trees.length; i++)
		{
			list.add(new ItemStack(item, 1, i));
		}
	}*/
	
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
package erfurt.eadore.blocks.walls;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public abstract class AbstractBlockWall extends BlockWall
{
	public AbstractBlockWall(Block block)
	{
		super(block);
	}
	
	public int damageDropped(int meta)
	{
		return meta;
	}
	
	public boolean canPlaceTorchOnTop(IBlockAccess world, BlockPos pos)
	{
		return true;
	}
	
	public boolean canConnectTo(IBlockAccess world, BlockPos pos)
    {
		IBlockState state = world.getBlockState(pos);
        Block block = state.getBlock();
        return block == Blocks.barrier ? false : (((block != this && !(block instanceof BlockFenceGate) && !(block instanceof BlockWall))) ? (block.getMaterial(state).isOpaque() && state.isFullCube() ? block.getMaterial(state) != Material.gourd : false) : true);
    }
}

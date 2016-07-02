package erfurt.eadore.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class EadoreStairs extends BlockStairs
{
	private static IBlockState state;
	public EadoreStairs(Block block, String name)
	{
        super(block.getStateFromMeta(0));
	    setHarvestLevel(block.getHarvestTool(block.getDefaultState()), block.getHarvestLevel(block.getDefaultState()));
	    this.useNeighborBrightness = true;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
}

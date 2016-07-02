package erfurt.eadore.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EadoreFenceGates extends BlockFenceGate
{
	public EadoreFenceGates(String name)
	{
		super(BlockPlanks.EnumType.OAK);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
}
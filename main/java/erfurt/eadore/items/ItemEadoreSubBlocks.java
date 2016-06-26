package erfurt.eadore.items;

import erfurt.eadore.Reference;
import erfurt.eadore.biome.features.EadoreLeaves;
import erfurt.eadore.biome.features.EadoreLog;
import erfurt.eadore.blocks.EadorePlanks;
import erfurt.eadore.blocks.walls.EadoreLogWall;
import erfurt.eadore.blocks.walls.EadoreWall;
import erfurt.eadore.init.EadoreBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemEadoreSubBlocks extends ItemBlock
{
	private static Block subBlock;
	
	public ItemEadoreSubBlocks(Block block)
	{
		super(block);
		this.setHasSubtypes(true);
		subBlock = block;
	}
	
	public String getUnlocalizedName(ItemStack itemstack)
	{
		int i = itemstack.getItemDamage();
		if(block instanceof EadoreLog || block instanceof EadoreLeaves || block instanceof EadorePlanks)
		{
			if(i < 0 || i >= EadoreBlocks.Trees.length)
			{
				i = 0;
		 	}
			
			return super.getUnlocalizedName() + "_" + EadoreBlocks.Trees[i];
			
		}else if(block instanceof EadoreWall)
		{
			if(i < 0 || i >= EadoreBlocks.Walls.length)
			{
				i = 0;
		 	}
			
			return super.getUnlocalizedName() + "_" + EadoreBlocks.Walls[i];
			
	 	}else if(block instanceof EadoreLogWall)
	 	{
	 		if(i < 0 || i >= EadoreBlocks.LogWalls.length)
			{
				i = 0;
		 	}
			
			return super.getUnlocalizedName() + "_" + EadoreBlocks.LogWalls[i];
	 	}else
	 	{
		return super.getUnlocalizedName();
	 	}
	}
	
	public int getMetaData(int meta)
	{
		return meta;
	}
}

package erfurt.eadore.blocks;

import java.util.Random;

import erfurt.eadore.init.EadoreBlocks;
import erfurt.eadore.init.EadoreItems;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EadoreOre extends BlockOre
{
	public EadoreOre(String toolClass, int level, String name)
	{
		this.setHarvestLevel(toolClass, level);
		this.setHardness(3);
		this.setResistance(15);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this == EadoreBlocks.amethyst_ore ? EadoreItems.amethyst : Item.getItemFromBlock(this);
    }
	
	@Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune)
    {
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
        {
            int i = 0;

            if (this == EadoreBlocks.amethyst_ore)
            {
                i = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }
            return i;
        }
		return 0;
    }
}

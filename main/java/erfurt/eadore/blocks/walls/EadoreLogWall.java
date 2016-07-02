package erfurt.eadore.blocks.walls;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EadoreLogWall extends BaseBlockWall
{
	public EadoreLogWall(String name)
	{
		super(Blocks.log);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		Blocks.fire.setFireInfo(this, 5, 5);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List<ItemStack> list)
    {
        list.add(new ItemStack(item, 1, 0));
    }
	/*public void getSubBlocks (Item item, CreativeTabs tabs, List list)
	{
		for(int i = 0; i < EadoreBlocks.LogWalls.length; i++)
		{
			list.add(new ItemStack(item, 1, i));
		}
	}*/
}

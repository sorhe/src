package erfurt.eadore.blocks.walls;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EadoreLightWall extends BaseBlockWall
{

	public EadoreLightWall(Block block, String name)
	{
		super(block);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		float lightLevel = block.getLightValue(block.getDefaultState())/15;
		int lightOpacity = block.getLightOpacity(block.getDefaultState());
		this.setLightLevel(lightLevel);
		this.setLightOpacity(lightOpacity);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List<ItemStack> list)
    {
        list.add(new ItemStack(item, 1, 0));
    }
}
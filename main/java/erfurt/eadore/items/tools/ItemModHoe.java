package erfurt.eadore.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemModHoe extends ItemHoe
{
	public ItemModHoe(ToolMaterial mat, String name)
	{
		super(mat);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
}

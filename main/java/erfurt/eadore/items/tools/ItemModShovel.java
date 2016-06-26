package erfurt.eadore.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ItemModShovel extends ItemSpade
{
	public ItemModShovel(ToolMaterial mat, String name)
	{
		super(mat);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
}

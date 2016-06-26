package erfurt.eadore.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class ItemModSword extends ItemSword
{
	public ItemModSword(ToolMaterial mat, String name)
	{
		super(mat);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
}

package erfurt.eadore.items.tools;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemModPickaxe extends ItemPickaxe
{
	public ItemModPickaxe(ToolMaterial mat, String name)
	{
		super(mat);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
}

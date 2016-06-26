package erfurt.eadore.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemModArmor extends ItemArmor
{

	public ItemModArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String name)
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
	
}

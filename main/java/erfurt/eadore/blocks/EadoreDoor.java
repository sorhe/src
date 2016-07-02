package erfurt.eadore.blocks;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;

public class EadoreDoor extends BlockDoor
{

	public EadoreDoor(Material mat, String name)
	{
		super(mat);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
	
}
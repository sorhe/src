package erfurt.eadore.blocks;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;

public class EadoreFences extends BlockFence
{
	public EadoreFences(String name)
	{
		super(Material.wood, null);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
}

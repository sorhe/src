package erfurt.eadore.proxy;

import erfurt.eadore.ModColorManager;
import erfurt.eadore.init.EadoreBlocks;
import erfurt.eadore.init.EadoreItems;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockWall;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.oredict.OreDictionary;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit()
	{
		EadoreItems.init();
		EadoreItems.register();
		EadoreBlocks.init();
		EadoreBlocks.register();
		
		registerRenders();
		
		//Planks
		ModelLoader.setCustomStateMapper(EadoreBlocks.planks_maple, (new StateMap.Builder()).ignore(BlockPlanks.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.planks_poplar, (new StateMap.Builder()).ignore(BlockPlanks.VARIANT).build());
		
		//Walls
		ModelLoader.setCustomStateMapper(EadoreBlocks.log_wall_oak, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.log_wall_spruce, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.log_wall_birch, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.log_wall_jungle, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.log_wall_acacia, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.log_wall_dark_oak, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.log_wall_maple, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.log_wall_poplar, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		
		ModelLoader.setCustomStateMapper(EadoreBlocks.wall_stonebrick, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.wall_stonebrick_mossy, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.wall_stonebrick_cracked, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.wall_prismarine_bricks, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.wall_cobblestone, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.wall_cobblestone_mossy, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		
		ModelLoader.setCustomStateMapper(EadoreBlocks.wall_glowstone, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.wall_sea_lantern, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		/*ModelLoader.setCustomStateMapper(EadoreBlocks.walls, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.log_walls, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());*/
	}
	
	@Override
	public void init()
	{
		ModColorManager.registerColorHandlers();
		
		//OreDictionary
		OreDictionary.registerOre("logWood", new ItemStack(EadoreBlocks.log_maple));
		OreDictionary.registerOre("logWood", new ItemStack(EadoreBlocks.log_poplar));
		OreDictionary.registerOre("treeLeaves", new ItemStack(EadoreBlocks.leaves_maple));
		OreDictionary.registerOre("treeLeaves", new ItemStack(EadoreBlocks.leaves_poplar));
		OreDictionary.registerOre("plankWood", new ItemStack(EadoreBlocks.planks_maple));
		OreDictionary.registerOre("plankWood", new ItemStack(EadoreBlocks.planks_poplar));
		//OreDictionary.registerOre("slabWood", new ItemStack(EadoreBlocks.wooden_slab, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("stairWood", new ItemStack(EadoreBlocks.stairs_maple));
		OreDictionary.registerOre("stairWood", new ItemStack(EadoreBlocks.stairs_poplar));
		//OreDictionary.registerOre("treeSapling", new ItemStack(EadoreBlocks.saplings, 1, OreDictionary.WILDCARD_VALUE));
	}
	
	
	@Override
	public void registerRenders()
	{
		EadoreItems.registerRenders();
		EadoreBlocks.registerRenders();
	}
}
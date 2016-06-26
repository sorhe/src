package erfurt.eadore.init;

import erfurt.eadore.biome.features.EadoreLeaves;
import erfurt.eadore.biome.features.EadoreLog;
import erfurt.eadore.blocks.EadoreBlock;
import erfurt.eadore.blocks.EadoreOre;
import erfurt.eadore.blocks.EadorePlanks;
import erfurt.eadore.blocks.walls.EadoreLightWall;
import erfurt.eadore.blocks.walls.EadoreLogWall;
import erfurt.eadore.blocks.walls.EadoreWall;
import erfurt.eadore.items.ItemEadoreSubBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EadoreBlocks
{
	public static Block amethyst_ore;
	public static Block amethyst_block;
	
	//Trees
	public static final String[] Trees = new String[] {"maple", "poplar"};
	
	public static Block logs;
	public static Block leaves;
	
	//Wooden stuff
	public static BlockPlanks planks;

	//Hedges
	public static final String[] Hedges = new String[] {"oak", "spruce", "birch", "jungle", "acacia", "dark_oak", "maple", "poplar"};
	
	public static Block hedges;
	
	//Walls
	public static final String[] Walls = new String[] {"stonebrick", "stonebrick_mossy", "stonebrick_cracked", "prismarine_bricks", "cobblestone", "cobblestone_mossy"};
	
	public static final String[] LogWalls = new String[] {"oak", "spruce", "birch", "jungle", "acacia", "dark_oak", "maple", "poplar"};
	
	public static BlockWall walls;
	public static BlockWall log_walls;
	public static BlockWall wall_glowstone;
	public static BlockWall wall_sea_lantern;
	
	
	public static void init()
	{
		amethyst_ore = new EadoreOre("Pickaxe", 3, "amethyst_ore");
		amethyst_block = new EadoreBlock(Material.ground, "amethyst_block");
		
		//Trees
		logs = new EadoreLog("log");
		leaves = new EadoreLeaves("leaves");
		
		//Wooden stuff
		planks = new EadorePlanks("planks");

		//Hedges
		
		
		//Walls
		walls = new EadoreWall(Blocks.stonebrick, "wall");
		log_walls = new EadoreLogWall(Blocks.log, "log_wall");
		wall_glowstone = new EadoreLightWall(Blocks.glowstone, "wall_glowstone");
		wall_sea_lantern = new EadoreLightWall(Blocks.sea_lantern, "wall_sea_lantern");
	}
	
	public static void register()
	{
		registerBlock(amethyst_ore);
		registerBlock(amethyst_block);
		
		//Trees
		registerSubBlock(logs);
		registerSubBlock(leaves);
		
		//Wooden stuff
		registerSubBlock(planks);
		
		//Hedges
		
		
		//Walls
		registerSubBlock(walls);
		registerSubBlock(log_walls);
		registerBlock(wall_glowstone);
		registerBlock(wall_sea_lantern);
	}
	
	public static void registerRenders()
	{
		registerRender(amethyst_ore);
		registerRender(amethyst_block);
		
		//Trees
		registerSubBlocksRender(logs, 0, "maple");
		registerSubBlocksRender(logs, 1, "poplar");
		
		registerSubBlocksRender(leaves, 0, "maple");
		registerSubBlocksRender(leaves, 1, "poplar");
		
		//Wooden stuff
		registerSubBlocksRender(planks, 0, "maple");
		registerSubBlocksRender(planks, 1, "poplar");
		
		//Hedges
		
		
		//Walls
		registerSubBlocksRender(walls, 0, "stonebrick");
		registerSubBlocksRender(walls, 1, "stonebrick_mossy");
		registerSubBlocksRender(walls, 2, "stonebrick_cracked");
		registerSubBlocksRender(walls, 3, "prismarine_bricks");
		registerSubBlocksRender(walls, 4, "cobblestone");
		registerSubBlocksRender(walls, 5, "cobblestone_mossy");
		
		registerSubBlocksRender(log_walls, 0, "oak");
		registerSubBlocksRender(log_walls, 1, "spruce");
		registerSubBlocksRender(log_walls, 2, "birch");
		registerSubBlocksRender(log_walls, 3, "jungle");
		registerSubBlocksRender(log_walls, 4, "acacia");
		registerSubBlocksRender(log_walls, 5, "dark_oak");
		registerSubBlocksRender(log_walls, 6, "maple");
		registerSubBlocksRender(log_walls, 7, "poplar");
		
		registerRender(wall_glowstone);
		registerRender(wall_sea_lantern);
	}
	
	public static void registerBlock(Block block)
	{
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	
	public static void registerSubBlock(Block block)
	{
		GameRegistry.register(block);
		GameRegistry.register(new ItemEadoreSubBlocks(block).setRegistryName(block.getRegistryName()));
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	public static void registerSubBlocksRender(Block block, int meta, String name)
	{
		Item item = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName() + "_" + name, "normal"));
	}
}

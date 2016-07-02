package erfurt.eadore.init;

import erfurt.eadore.biome.features.EadoreLeaves;
import erfurt.eadore.biome.features.EadoreLog;
import erfurt.eadore.blocks.EadoreBlock;
import erfurt.eadore.blocks.EadoreDoor;
import erfurt.eadore.blocks.EadoreFenceGates;
import erfurt.eadore.blocks.EadoreFences;
import erfurt.eadore.blocks.EadoreOre;
import erfurt.eadore.blocks.EadorePlanks;
import erfurt.eadore.blocks.EadoreStairs;
import erfurt.eadore.blocks.walls.EadoreLightWall;
import erfurt.eadore.blocks.walls.EadoreLogWall;
import erfurt.eadore.blocks.walls.EadoreWall;
import net.minecraft.block.Block;
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
	
	public static Block log_maple;
	public static Block log_poplar;
	public static Block leaves_maple;
	public static Block leaves_poplar;
	
	//Wooden planks, stairs and slabs
	public static Block planks_maple;
	public static Block planks_poplar;
	
	public static Block stairs_maple;
	public static Block stairs_poplar;
	
	//Wooden doors
	public static Block door_maple;
	public static Block door_poplar;
	
	//Fence gates
	public static Block fence_gate_maple;
	public static Block fence_gate_poplar;
	
	//Fences
	public static Block fence_maple;
	public static Block fence_poplar;
	
	//Hedges
	public static final String[] Hedges = new String[] {"oak", "spruce", "birch", "jungle", "acacia", "dark_oak", "maple", "poplar"};
	
	public static Block hedges;
	
	//Walls
	public static final String[] Walls = new String[] {"stonebrick", "stonebrick_mossy", "stonebrick_cracked", "prismarine_bricks", "cobblestone", "cobblestone_mossy"};
	
	public static final String[] LogWalls = new String[] {"oak", "spruce", "birch", "jungle", "acacia", "dark_oak", "maple", "poplar"};
	
	//public static BlockWall walls;
	//public static BlockWall log_walls;
	public static Block log_wall_oak;
	public static Block log_wall_spruce;
	public static Block log_wall_birch;
	public static Block log_wall_jungle;
	public static Block log_wall_acacia;
	public static Block log_wall_dark_oak;
	public static Block log_wall_maple;
	public static Block log_wall_poplar;
	
	public static Block wall_stonebrick;
	public static Block wall_stonebrick_mossy;
	public static Block wall_stonebrick_cracked;
	public static Block wall_prismarine_bricks;
	public static Block wall_cobblestone;
	public static Block wall_cobblestone_mossy;
	
	public static Block wall_glowstone;
	public static Block wall_sea_lantern;
	
	
	public static void init()
	{
		amethyst_ore = new EadoreOre("Pickaxe", 3, "amethyst_ore");
		amethyst_block = new EadoreBlock(Material.ground, "amethyst_block");
		
		//Trees
		log_maple = new EadoreLog("log_maple");
		log_poplar = new EadoreLog("log_poplar");
		leaves_maple = new EadoreLeaves("leaves_maple");
		leaves_poplar = new EadoreLeaves("leaves_poplar");
		
		//Wooden stuff
		planks_maple = new EadorePlanks("planks_maple");
		planks_poplar = new EadorePlanks("planks_poplar");
		
		stairs_maple = new EadoreStairs(planks_maple, "stairs_maple");
		stairs_poplar = new EadoreStairs(planks_poplar, "stairs_poplar");
		
		//Wooden doors
		//door_maple = new EadoreDoor(Material.wood, "door_maple");
		//door_maple = new EadoreDoor(Material.wood, "door_poplar");
		
		//Fence gates
		fence_gate_maple = new EadoreFenceGates("fence_gate_maple");
		fence_gate_poplar = new EadoreFenceGates("fence_gate_poplar");
		
		//Fences
		fence_maple = new EadoreFences("fence_maple");
		fence_poplar = new EadoreFences("fence_poplar");
		
		
		//Hedges
		
		
		//Walls
		//log_walls = new EadoreLogWall("log_wall");
		//walls = new EadoreWall(Blocks.stonebrick, "wall");
		log_wall_oak = new EadoreLogWall("log_wall_oak");
		log_wall_spruce = new EadoreLogWall("log_wall_spruce");
		log_wall_birch = new EadoreLogWall("log_wall_birch");
		log_wall_jungle = new EadoreLogWall("log_wall_jungle");
		log_wall_acacia = new EadoreLogWall("log_wall_acacia");
		log_wall_dark_oak = new EadoreLogWall("log_wall_dark_oak");
		log_wall_maple = new EadoreLogWall("log_wall_maple");
		log_wall_poplar = new EadoreLogWall("log_wall_poplar");
		
		wall_stonebrick = new EadoreWall(Blocks.stonebrick, "wall_stonebrick");
		wall_stonebrick_mossy = new EadoreWall(Blocks.stonebrick, "wall_stonebrick_mossy");
		wall_stonebrick_cracked = new EadoreWall(Blocks.stonebrick, "wall_stonebrick_cracked");
		wall_prismarine_bricks = new EadoreWall(Blocks.prismarine ,"wall_prismarine_bricks");
		wall_cobblestone = new EadoreWall(Blocks.cobblestone ,"wall_cobblestone");
		wall_cobblestone_mossy = new EadoreWall(Blocks.cobblestone ,"wall_cobblestone_mossy");
		
		wall_glowstone = new EadoreLightWall(Blocks.glowstone, "wall_glowstone");
		wall_sea_lantern = new EadoreLightWall(Blocks.sea_lantern, "wall_sea_lantern");
	}
	
	public static void register()
	{
		registerBlock(amethyst_ore);
		registerBlock(amethyst_block);
		
		//Trees
		registerBlock(log_maple);
		registerBlock(log_poplar);
		registerBlock(leaves_maple);
		registerBlock(leaves_poplar);
		
		//Wooden stuff
		registerBlock(planks_maple);
		registerBlock(planks_poplar);
		
		registerBlock(stairs_maple);
		registerBlock(stairs_poplar);
		
		//Wooden doors
		//registerBlock(door_maple);
		//registerBlock(door_poplar);
		
		//Fence gates
		registerBlock(fence_gate_maple);
		registerBlock(fence_gate_poplar);
		
		//Fences
		registerBlock(fence_maple);
		registerBlock(fence_poplar);
		
		//Hedges
		
		
		//Walls
		//registerBlock(log_walls);
		//registerBlock(walls);
		registerBlock(log_wall_oak);
		registerBlock(log_wall_spruce);
		registerBlock(log_wall_birch);
		registerBlock(log_wall_jungle);
		registerBlock(log_wall_acacia);
		registerBlock(log_wall_dark_oak);
		registerBlock(log_wall_maple);
		registerBlock(log_wall_poplar);
		
		registerBlock(wall_stonebrick);
		registerBlock(wall_stonebrick_mossy);
		registerBlock(wall_stonebrick_cracked);
		registerBlock(wall_prismarine_bricks);
		registerBlock(wall_cobblestone);
		registerBlock(wall_cobblestone_mossy);
		
		registerBlock(wall_glowstone);
		registerBlock(wall_sea_lantern);
	}
	
	public static void registerRenders()
	{
		registerRender(amethyst_ore);
		registerRender(amethyst_block);
		
		//Trees
		registerRender(log_maple);
		registerRender(log_poplar);
		
		registerRender(leaves_maple);
		registerRender(leaves_poplar);
		
		//Wooden stuff
		registerRender(planks_maple);
		registerRender(planks_poplar);
		
		registerRender(stairs_maple);
		registerRender(stairs_poplar);
		
		//Wooden doors
		//registerRender(door_maple);
		//registerRender(door_poplar);
		
		//Fence gates
		registerRender(fence_gate_maple);
		registerRender(fence_gate_poplar);
		
		//Fences
		registerRender(fence_maple);
		registerRender(fence_poplar);
		
		//Hedges
		
		
		//Walls
		/*registerSubBlocksRender(log_walls, 0, "oak");
		registerSubBlocksRender(log_walls, 1, "spruce");
		registerSubBlocksRender(log_walls, 2, "birch");
		registerSubBlocksRender(log_walls, 3, "jungle");
		registerSubBlocksRender(log_walls, 4, "acacia");
		registerSubBlocksRender(log_walls, 5, "dark_oak");
		registerSubBlocksRender(log_walls, 6, "maple");
		registerSubBlocksRender(log_walls, 7, "poplar");
		
		registerSubBlocksRender(walls, 0, "stonebrick");
		registerSubBlocksRender(walls, 1, "stonebrick_mossy");
		registerSubBlocksRender(walls, 2, "stonebrick_cracked");
		registerSubBlocksRender(walls, 3, "prismarine_bricks");
		registerSubBlocksRender(walls, 4, "cobblestone");
		registerSubBlocksRender(walls, 5, "cobblestone_mossy");*/
		
		registerRender(log_wall_oak);
		registerRender(log_wall_spruce);
		registerRender(log_wall_birch);
		registerRender(log_wall_jungle);
		registerRender(log_wall_acacia);
		registerRender(log_wall_dark_oak);
		registerRender(log_wall_maple);
		registerRender(log_wall_poplar);
		
		registerRender(wall_stonebrick);
		registerRender(wall_stonebrick_mossy);
		registerRender(wall_stonebrick_cracked);
		registerRender(wall_prismarine_bricks);
		registerRender(wall_cobblestone);
		registerRender(wall_cobblestone_mossy);
		
		registerRender(wall_glowstone);
		registerRender(wall_sea_lantern);
	}
	
	public static void registerBlock(Block block)
	{
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(block.getRegistryName(), "normal"));
	}
	
	public static void registerSubBlocksRender(Block block, int meta, String name)
	{
		Item item = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(block.getRegistryName() + "_" + name, "normal"));
	}
}

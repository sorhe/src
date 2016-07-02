package erfurt.eadore;

import erfurt.eadore.init.EadoreBlocks;
import erfurt.eadore.init.EadoreItems;
import erfurt.eadore.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class EadoreMod
{
	@Instance("EadoreMod")
	public static EadoreMod instance = new EadoreMod();
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init();
		
		//Crafting
		//Armor
		GameRegistry.addRecipe(new ItemStack(EadoreItems.amethyst_helmet, 1),
				"aaa",
				"a a",
				'a', EadoreItems.amethyst);
		GameRegistry.addRecipe(new ItemStack(EadoreItems.amethyst_chestplate, 1),
				"a a",
				"aaa",
				"aaa",
				'a', EadoreItems.amethyst);
		GameRegistry.addRecipe(new ItemStack(EadoreItems.amethyst_leggings, 1),
				"aaa",
				"a a",
				"a a",
				'a', EadoreItems.amethyst);
		GameRegistry.addRecipe(new ItemStack(EadoreItems.amethyst_boots, 1),
				"a a",
				"a a",
				'a', EadoreItems.amethyst);
		
		//Tools
		GameRegistry.addRecipe(new ItemStack(EadoreItems.amethyst_pickaxe, 1),
				"aaa",
				" s ",
				" s ",
				'a', EadoreItems.amethyst, 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(EadoreItems.amethyst_hoe, 1),
				"aa",
				" s",
				" s",
				'a', EadoreItems.amethyst, 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(EadoreItems.amethyst_axe, 1),
				"aa",
				"as",
				" s",
				'a', EadoreItems.amethyst, 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(EadoreItems.amethyst_shovel, 1),
				"a",
				"s",
				"s",
				'a', EadoreItems.amethyst, 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(EadoreItems.amethyst_sword, 1),
				"a",
				"a",
				"s",
				'a', EadoreItems.amethyst, 's', Items.stick);
		
		//Blocks
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.amethyst_block, 1),
				"aaa",
				"aaa",
				"aaa",
				'a', EadoreItems.amethyst);
		
		//Wooden planks
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.planks_maple, 4),
				"w",
				'w', new ItemStack(EadoreBlocks.log_maple));
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.planks_poplar, 4),
				"w",
				'w', new ItemStack(EadoreBlocks.log_poplar));
		
		/*//Wooden slabs
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.block_wood_slab, 6, 0),
				"www",
				'w', new ItemStack(EadoreBlocks.block_planks, 1, 0));
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.block_wood_slab, 6, 1),
				"www",
				'w', new ItemStack(EadoreBlocks.block_planks, 1, 1));*/
		
		//Wooden stairs
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.stairs_maple, 4),
				"  w",
				" ww",
				"www",
				'w', new ItemStack(EadoreBlocks.planks_maple));
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.stairs_maple, 4),
				"w  ",
				"ww ",
				"www",
				'w', new ItemStack(EadoreBlocks.planks_maple));
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.stairs_poplar, 4),
				"  w",
				" ww",
				"www",
				'w', new ItemStack(EadoreBlocks.planks_poplar));
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.stairs_poplar, 4),
				"w  ",
				"ww ",
				"www",
				'w', new ItemStack(EadoreBlocks.planks_poplar));
		
		//Wooden fences, gates and doors
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.fence_maple, 3),
				"wsw",
				"wsw",
				'w', new ItemStack(EadoreBlocks.planks_maple), 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.fence_poplar, 3),
				"wsw",
				"wsw",
				'w', new ItemStack(EadoreBlocks.planks_poplar), 's', Items.stick);
		/*GameRegistry.addRecipe(new ItemStack(EadoreBlocks.block_wood_gate, 1, 0),
				"sws",
				"sws",
				'w', new ItemStack(EadoreBlocks.block_planks, 1, 0), 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.block_wood_gate, 1, 1),
				"sws",
				"sws",
				'w', new ItemStack(EadoreBlocks.block_planks, 1, 1), 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.block_wood_door, 3, 0),
				"ww",
				"ww",
				"ww",
				'w', new ItemStack(EadoreBlocks.block_planks, 1, 0));
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.block_wood_door, 3, 1),
				"ww",
				"ww",
				"ww",
				'w', new ItemStack(EadoreBlocks.block_planks, 1, 1));*/
		
		/*//Hedges
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.hedges, 6, 0), new Object[]{
				"lll",
				"lll",
				'l', new ItemStack(Blocks.leaves, 1, 0)
			});
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.hedges, 6, 1), new Object[]{
				"lll",
				"lll",
				'l', new ItemStack(Blocks.leaves, 1, 1)
			});
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.hedges, 6, 2), new Object[]{
				"lll",
				"lll",
				'l', new ItemStack(Blocks.leaves, 1, 2)
			});
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.hedges, 6, 3), new Object[]{
				"lll",
				"lll",
				'l', new ItemStack(Blocks.leaves, 1, 3)
			});
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.hedges, 6, 4), new Object[]{
				"lll",
				"lll",
				'l', new ItemStack(Blocks.leaves2, 1, 0)
			});
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.hedges, 6, 5), new Object[]{
				"lll",
				"lll",
				'l', new ItemStack(Blocks.leaves2, 1, 1)
			});
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.hedges, 6, 6), new Object[]{
				"lll",
				"lll",
				'l', new ItemStack(EadoreBlocks.leaves, 1, 0)
			});
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.hedges, 6, 7), new Object[]{
				"lll",
				"lll",
				'l', new ItemStack(EadoreBlocks.leaves, 1, 1)
			});*/
		
		/*//Walls
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.walls, 6, 0), new Object[]{
				"sss",
				"sss",
				's', new ItemStack(Blocks.stonebrick, 1, 0)
			});
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.walls, 6 ,1), new Object[]{
				"sss",
				"sss",
				's', new ItemStack(Blocks.stonebrick, 1, 1)
			});
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.walls, 6, 2), new Object[]{
				"sss",
				"sss",
				's', new ItemStack(Blocks.stonebrick, 1, 2)
			});
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.walls, 6, 3), new Object[]{
				"sss",
				"sss",
				's', new ItemStack(Blocks.prismarine, 1, 1)
			});
		
		//Vanilla Walls
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.walls, 1, 4), new Object[]{
				"s",
				's', new ItemStack(Blocks.cobblestone_wall, 1, 0)
			});
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.walls, 1, 5), new Object[]{
				"s",
				's', new ItemStack(Blocks.cobblestone_wall, 1, 1)
			});*/
		
		//Light Walls
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.wall_glowstone, 6),
				"sss",
				"sss",
				's', new ItemStack(Blocks.glowstone));
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.wall_sea_lantern, 6),
				"sss",
				"sss",
				's', new ItemStack(Blocks.sea_lantern));
		
		/*//Log Walls
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.log_walls, 6, 0), new Object[]{
				"www",
				"www",
				'w', new ItemStack(Blocks.log, 1, 0)
			});
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.log_walls, 6, 1), new Object[]{
				"www",
				"www",
				'w', new ItemStack(Blocks.log, 1, 1)
			});
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.log_walls, 6, 2), new Object[]{
				"www",
				"www",
				'w', new ItemStack(Blocks.log, 1, 2)
			});
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.log_walls, 6, 3), new Object[]{
				"www",
				"www",
				'w', new ItemStack(Blocks.log, 1, 3)
			});

		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.log_walls, 6, 4), new Object[]{
				"www",
				"www",
				'w', new ItemStack(Blocks.log2, 1, 0)
			});

		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.log_walls, 6, 5), new Object[]{
				"www",
				"www",
				'w', new ItemStack(Blocks.log2, 1, 1)
			});
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.log_walls, 6, 6), new Object[]{
				"www",
				"www",
				'w', new ItemStack(EadoreBlocks.logs, 1, 0)
			});
		GameRegistry.addRecipe(new ItemStack(EadoreBlocks.log_walls, 6, 7), new Object[]{
				"www",
				"www",
				'w', new ItemStack(EadoreBlocks.logs, 1, 1)
			});*/
		
		//Furnace Output
		GameRegistry.addSmelting(EadoreBlocks.log_maple, new ItemStack(Items.coal, 1, 1), 0.15F);
		GameRegistry.addSmelting(EadoreBlocks.log_poplar, new ItemStack(Items.coal, 1, 1), 0.15F);
		//GameRegistry.addSmelting(EadoreBlocks.log_walls, new ItemStack(Items.coal, 1, 1), 0.15F);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}

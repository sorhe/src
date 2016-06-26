package erfurt.eadore.proxy;

import erfurt.eadore.ModColorManager;
import erfurt.eadore.init.EadoreBlocks;
import erfurt.eadore.init.EadoreItems;
import net.minecraft.block.BlockWall;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

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
	}
	
	@Override
	public void init()
	{
		subBlocks();
		
		ModColorManager.registerColorHandlers();
		
		//Walls
		ModelLoader.setCustomStateMapper(EadoreBlocks.wall_glowstone, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.wall_sea_lantern, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.walls, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
		ModelLoader.setCustomStateMapper(EadoreBlocks.log_walls, (new StateMap.Builder()).ignore(BlockWall.VARIANT).build());
	}
	
	
	@Override
	public void registerRenders()
	{
		EadoreItems.registerRenders();
		EadoreBlocks.registerRenders();
	}
	
	@Override
	public void subBlocks()
	{
		/*//Trees
		Item log = Item.getItemFromBlock(EadoreBlocks.logs);
		ModelBakery.registerItemVariants(log, new ResourceLocation("em:log_maple"), new ResourceLocation("em:log_poplar"));
		
		Item leaf = Item.getItemFromBlock(EadoreBlocks.leaves);
		ModelBakery.registerItemVariants(leaf, new ResourceLocation("em:leaves_maple"), new ResourceLocation("em:leaves_poplar"));
		ModelLoader.setCustomModelResourceLocation(leaf, 0, new ModelResourceLocation("leaves_maple"));
		ModelLoader.setCustomModelResourceLocation(leaf, 1, new ModelResourceLocation("em:leaves_poplar"));
		
		Item sapling = Item.getItemFromBlock(EadoreBlocks.block_log);
		ModelBakery.registerItemVariants(sapling, new ResourceLocation("em:sapling_maple"), new ResourceLocation("em:sapling_poplar"));
		
		//Wooden stuff
		Item planks = Item.getItemFromBlock(EadoreBlocks.planks);
		ModelBakery.registerItemVariants(planks, new ResourceLocation("em:planks_maple"), new ResourceLocation("em:planks_poplar"));
		ModelLoader.setCustomModelResourceLocation(planks, 0, new ModelResourceLocation("em:blockstates/planks_maple"));
		ModelLoader.setCustomModelResourceLocation(planks, 1, new ModelResourceLocation("em:planks_poplar", "inventory"));
		
		//Walls
		Item wall = Item.getItemFromBlock(EadoreBlocks.walls);
		ModelBakery.registerItemVariants(wall, new ResourceLocation("em:wall_stonebrick"), new ResourceLocation("em:wall_stonebrick_mossy"), new ResourceLocation("em:wall_stonebrick_cracked"), new ResourceLocation("em:wall_prismarine_bricks"), new ResourceLocation("em:wall_cobblestone"), new ResourceLocation("em:wall_cobblestone_mossy"));
		
		Item log_wall = Item.getItemFromBlock(EadoreBlocks.log_walls);
		ModelBakery.registerItemVariants(wall, new ResourceLocation("em:log_wall_oak"), new ResourceLocation("em:log_wall_spruce"), new ResourceLocation("em:log_wall_birch"), new ResourceLocation("em:log_wall_jungle"), new ResourceLocation("em:log_wall_acacia"), new ResourceLocation("em:log_wall_dark_oak"), new ResourceLocation("em:log_wall_maple"), new ResourceLocation("em:log_wall_poplar"));
		*/
	}
}
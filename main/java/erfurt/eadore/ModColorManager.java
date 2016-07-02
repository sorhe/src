package erfurt.eadore;

import erfurt.eadore.init.EadoreBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.biome.BiomeColorHelper;

public class ModColorManager
{
	private static final Minecraft minecraft = Minecraft.getMinecraft();
	
	public static void registerColorHandlers()
	{
		final BlockColors blockColors = minecraft.getBlockColors();
		final ItemColors itemColors = minecraft.getItemColors();

		registerBlockColorHandlers(blockColors);
		registerItemColorHandlers(blockColors, itemColors);
	}
	
	private static void registerBlockColorHandlers(final BlockColors blockColors)
	{
		final IBlockColor foliageColorHandler = (state, blockAccess, pos, tintIndex) -> {
			if (blockAccess != null && pos != null)
			{
				return BiomeColorHelper.getFoliageColorAtPos(blockAccess, pos);
			}

			return ColorizerFoliage.getFoliageColorBasic();
		};
		final IBlockColor foliageColorBirch = (state, blockAccess, pos, tintIndex) -> {
			return ColorizerFoliage.getFoliageColorBirch();
		};
		final IBlockColor foliageColorPine = (state, blockAccess, pos, tintIndex) -> {
			return ColorizerFoliage.getFoliageColorPine();
		};

		blockColors.registerBlockColorHandler(foliageColorHandler, EadoreBlocks.leaves_poplar);
		
	}
	
	private static void registerItemColorHandlers(final BlockColors blockColors, final ItemColors itemColors)
	{
		final IItemColor itemBlockColorHandler = (stack, tintIndex) -> {
			IBlockState iblockstate = ((ItemBlock) stack.getItem()).getBlock().getStateFromMeta(stack.getMetadata());
			return blockColors.colorMultiplier(iblockstate, null, null, tintIndex);
		};
		final IItemColor itemBlockColorBirch = (stack, tintIndex) -> {
			IBlockState iblockstate = ((ItemBlock) stack.getItem()).getBlock().getStateFromMeta(stack.getMetadata());
			return ColorizerFoliage.getFoliageColorBirch();
		};
		final IItemColor itemBlockColorPine = (stack, tintIndex) -> {
			IBlockState iblockstate = ((ItemBlock) stack.getItem()).getBlock().getStateFromMeta(stack.getMetadata());
			return ColorizerFoliage.getFoliageColorPine();
		};

		itemColors.registerItemColorHandler(itemBlockColorHandler, EadoreBlocks.leaves_poplar);
	}
}
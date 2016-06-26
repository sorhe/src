package erfurt.eadore.init;

import erfurt.eadore.Reference;
import erfurt.eadore.items.ItemModArmor;
import erfurt.eadore.items.tools.ItemModAxe;
import erfurt.eadore.items.tools.ItemModHoe;
import erfurt.eadore.items.tools.ItemModPickaxe;
import erfurt.eadore.items.tools.ItemModShovel;
import erfurt.eadore.items.tools.ItemModSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EadoreItems
{
	
	public static Item amethyst;
	
	//Materials
	public static ArmorMaterial amethystArmorMaterial = EnumHelper.addArmorMaterial("amethyst", "em:amethyst_armor", 33, new int[]{3, 8, 6, 3}, 25, SoundEvents.item_armor_equip_diamond);
	public static ToolMaterial amethystToolMaterial = EnumHelper.addToolMaterial("amethyst", 3, 1561, 12.0F, 4.0F, 22);
	
	//Armor
	public static ItemArmor amethyst_helmet;
	public static ItemArmor amethyst_chestplate;
	public static ItemArmor amethyst_leggings;
	public static ItemArmor amethyst_boots;
	
	//Tools
	public static Item amethyst_pickaxe;
	public static Item amethyst_hoe;
	public static Item amethyst_axe;
	public static Item amethyst_shovel;
	public static Item amethyst_sword;
	
	
	public static void init()
	{
		amethyst = new Item().setUnlocalizedName("amethyst").setCreativeTab(CreativeTabs.tabMaterials).setRegistryName("amethyst");
		
		//Armor
		amethyst_helmet = new ItemModArmor(amethystArmorMaterial, 0, EntityEquipmentSlot.HEAD, "amethyst_helmet");
		amethyst_chestplate = new ItemModArmor(amethystArmorMaterial, 0, EntityEquipmentSlot.CHEST, "amethyst_chestplate");
		amethyst_leggings = new ItemModArmor(amethystArmorMaterial, 0, EntityEquipmentSlot.LEGS, "amethyst_leggings");
		amethyst_boots = new ItemModArmor(amethystArmorMaterial, 0, EntityEquipmentSlot.FEET, "amethyst_boots");
		
		//Tools
		amethyst_pickaxe = new ItemModPickaxe(amethystToolMaterial, "amethyst_pickaxe");
		amethyst_hoe = new ItemModHoe(amethystToolMaterial, "amethyst_hoe");
		amethyst_axe = new ItemModAxe(amethystToolMaterial, "amethyst_axe");
		amethyst_shovel = new ItemModShovel(amethystToolMaterial, "amethyst_shovel");
		amethyst_sword = new ItemModSword(amethystToolMaterial, "amethyst_sword");
	}
	
	public static void register()
	{
		GameRegistry.register(amethyst);
		
		//Armor
		GameRegistry.register(amethyst_helmet);
		GameRegistry.register(amethyst_chestplate);
		GameRegistry.register(amethyst_leggings);
		GameRegistry.register(amethyst_boots);
		
		//Tools
		GameRegistry.register(amethyst_pickaxe);
		GameRegistry.register(amethyst_hoe);
		GameRegistry.register(amethyst_axe);
		GameRegistry.register(amethyst_shovel);
		GameRegistry.register(amethyst_sword);
	}
	
	public static void registerRenders()
	{
		registerRender(amethyst);
		
		//Armor
		registerRender(amethyst_helmet);
		registerRender(amethyst_chestplate);
		registerRender(amethyst_leggings);
		registerRender(amethyst_boots);
		
		//Tools
		registerRender(amethyst_pickaxe);
		registerRender(amethyst_hoe);
		registerRender(amethyst_axe);
		registerRender(amethyst_shovel);
		registerRender(amethyst_sword);
	}
	
	public static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}

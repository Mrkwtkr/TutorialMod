package mrkwtkr.tutorialmod.init;

import mrkwtkr.tutorialmod.init.items.CustomIngot;
import mrkwtkr.tutorialmod.init.tools.CustomPickaxe;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ToolInit 
{
	public static final ToolMaterial tutorial = EnumHelper.addToolMaterial("tutorial", 3, 1200, 7.0F, 2.5F, 8);
	
	public static Item tutorial_pickaxe;
	
	public static void init()
	{
		tutorial_pickaxe = new CustomPickaxe("tutorial_pickaxe", tutorial);
	}
	
	public static void register()
	{
		registerItem(tutorial_pickaxe);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}

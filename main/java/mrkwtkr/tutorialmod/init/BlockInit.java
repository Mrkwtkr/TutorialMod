package mrkwtkr.tutorialmod.init;

import mrkwtkr.tutorialmod.TutorialMod;
import mrkwtkr.tutorialmod.init.blocks.CustomOre;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit 
{
	public static Block tutorial_ore;
	
	public static void init() 
	{
		tutorial_ore = new CustomOre("tutorial_ore", 2.0F, 4.0F, 2);
	}
	
	public static void register() 
	{
		registerBlock(tutorial_ore);
	}
	
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(TutorialMod.tutorialtab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}

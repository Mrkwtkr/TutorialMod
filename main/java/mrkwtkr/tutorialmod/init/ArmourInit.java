package mrkwtkr.tutorialmod.init;

import mrkwtkr.tutorialmod.Reference;
import mrkwtkr.tutorialmod.init.armour.CustomArmour;
import mrkwtkr.tutorialmod.init.items.CustomIngot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ArmourInit {
	
	public static final ArmorMaterial tutorial_armour = EnumHelper.addArmorMaterial("tutorial_armour", Reference.MODID + "tutorial", 25, new int[]{3, 5, 7, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);
	
	public static Item tutorial_helmet;
	
	public static void init()
	{
		tutorial_helmet = new CustomArmour("tutorial_helmet", tutorial_armour, 1, EntityEquipmentSlot.HEAD);
	}
	
	public static void register()
	{
		registerItem(tutorial_helmet);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
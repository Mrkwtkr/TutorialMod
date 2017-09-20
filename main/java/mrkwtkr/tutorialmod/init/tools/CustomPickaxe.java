package mrkwtkr.tutorialmod.init.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class CustomPickaxe extends ItemPickaxe {

	public CustomPickaxe(String name,ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}

}

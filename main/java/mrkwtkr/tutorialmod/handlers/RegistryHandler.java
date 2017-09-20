package mrkwtkr.tutorialmod.handlers;

import mrkwtkr.tutorialmod.init.ArmourInit;
import mrkwtkr.tutorialmod.init.BlockInit;
import mrkwtkr.tutorialmod.init.ItemInit;
import mrkwtkr.tutorialmod.init.ToolInit;

public class RegistryHandler 
{
	public static void Client()
	{	}
	
	public static void Common()
	{
		ItemInit.init();
		ItemInit.register();
		
		BlockInit.init();
		BlockInit.register();
		
		ToolInit.init();
		ToolInit.register();
		
		ArmourInit.init();
		ArmourInit.register();
	}
}

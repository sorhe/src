package erfurt.eadore.proxy;

import erfurt.eadore.init.EadoreBlocks;
import erfurt.eadore.init.EadoreItems;

public class CommonProxy
{
	public void preInit() 
	{
		EadoreItems.init();
		EadoreItems.register();
		EadoreBlocks.init();
		EadoreBlocks.register();
	}
	
	public void init()
	{
		
	}
	
	public void registerRenders()
	{
		
	}
}
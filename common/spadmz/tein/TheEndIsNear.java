package spadmz.tein;

import net.minecraftforge.common.Configuration;
import spadmz.tein.block.TEINBlocks;
import spadmz.tein.lib.ConfigurationHandler;
import spadmz.tein.lib.Reference;
import spadmz.tein.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TheEndIsNear {
	
	@Instance(Reference.MOD_ID)
	public static TheEndIsNear instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.initConfigs(new Configuration(event.getSuggestedConfigurationFile()));
		
		TEINBlocks.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}

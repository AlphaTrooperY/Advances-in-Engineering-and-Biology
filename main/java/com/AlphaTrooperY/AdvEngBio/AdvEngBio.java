package com.AlphaTrooperY.AdvEngBio;

import com.AlphaTrooperY.AdvEngBio.proxy.CommonProxy;

import init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refrence.MOD_ID, name = Refrence.NAME, version = Refrence.VERSION, acceptedMinecraftVersions = Refrence.ACCEPTED_VERSIONS)
public class AdvEngBio {

	@Mod.Instance(Refrence.MOD_ID)
	public static AdvEngBio instance;

	@SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModItems.register();
		proxy.registerRenders();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	@EventHandler
	public void postinit(FMLPostInitializationEvent event)
	{
		
	}
}

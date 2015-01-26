package eu.noggscraft.runecraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import eu.noggscraft.runecraft.init.ModItems;
import eu.noggscraft.runecraft.init.Recipes;
import eu.noggscraft.runecraft.proxy.IProxy;
import eu.noggscraft.runecraft.reference.Reference;

@Mod(modid= Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class RuneCraft
{
    @Mod.Instance(Reference.MOD_ID)
    public static RuneCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASSS, serverSide = Reference.SERVER_PROXY_CLASSS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        ModItems.init();

        Recipes.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {}

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {}

}

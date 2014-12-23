package eu.noggscraft.runecraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="RuneCraft", name = "RuneCraft" , version = "1.7.10-0.1")
public class RuneCraft
{
    @Mod.Instance("RuneCraft")
    public static RuneCraft instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {}

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {}

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {}

}

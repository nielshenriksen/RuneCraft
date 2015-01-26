package eu.noggscraft.runecraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import eu.noggscraft.runecraft.item.*;
import scala.xml.dtd.impl.Base;

/**
 * Created by Niels on 23-12-2014.
 */
public class ModItems {

    public static final BaseItem blankRune = new ItemBlankRune();
    public static final BaseItem fireRune = new ItemFireRune();
    public static final BaseItem waterRune = new ItemWaterRune();
    public static final BaseItem earthRune = new ItemEarthRune();
    public static final BaseItem orbOfFarmer = new ItemOrbOfFarmer();

    public static void init()
    {
        GameRegistry.registerItem(blankRune,"blankRune");
        GameRegistry.registerItem(fireRune,"fireRune");
        GameRegistry.registerItem(waterRune,"waterRune");
        GameRegistry.registerItem(earthRune,"earthRune");
        GameRegistry.registerItem(orbOfFarmer, "orbOfFarmer");
    }
}

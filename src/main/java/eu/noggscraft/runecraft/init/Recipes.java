package eu.noggscraft.runecraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import eu.noggscraft.runecraft.utility.DyeColorHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Niels on 24-12-2014.
 */
public class Recipes {
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.blankRune, 2),new Object[] { "nnn", "nsn" , "nnn", 'n' , new ItemStack(Items.gold_nugget), 's' , Blocks.stone});
        GameRegistry.addRecipe(new ItemStack(ModItems.fireRune, 4), new Object[]{"dld", "lbl" , "dld", 'd' , DyeColorHelper.Red, 'b' , ModItems.blankRune, 'l' , new ItemStack(Items.lava_bucket)});
        GameRegistry.addRecipe(new ItemStack(ModItems.waterRune, 4), new Object[]{"dld", "lbl" , "dld", 'd' , DyeColorHelper.Blue, 'b' , ModItems.blankRune, 'l' , new ItemStack(Items.water_bucket)});
        GameRegistry.addRecipe(new ItemStack(ModItems.earthRune, 4), new Object[]{"dld", "lbl" , "dld", 'd' , DyeColorHelper.Brown, 'b' , ModItems.blankRune, 'l' , new ItemStack(Blocks.dirt)});
    }
}

package eu.noggscraft.runecraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Niels on 27-12-2014.
 */
public class ItemOrbOfFarmer extends BaseItem {
    public ItemOrbOfFarmer()
    {
        super();
//        this.setUnlocalizedName("orbOfFarmer");

    }



    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
        player.addExperience(-1);

        return itemStack;
    }
}

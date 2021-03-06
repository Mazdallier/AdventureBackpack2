package com.darkona.adventurebackpack.item;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by Darkona on 11/10/2014.
 */
public class ItemPistonBoots extends ArmorAB
{

    public ItemPistonBoots()
    {
        super(2, 3);
        setUnlocalizedName("pistonBoots");
    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        if (player.isSprinting())
        {
            player.stepHeight = 1.001F;
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 1));
        } else
        {
            player.stepHeight = 0.5001F;
        }
    }

}

package me.Asrieldmr.spikeeffects;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static org.bukkit.event.EventPriority.LOW;

import org.bukkit.entity.LivingEntity;

public class SpikeListner implements Listener {

	public SpikeListner(JavaPlugin plugin) { plugin.getServer().getPluginManager().registerEvents(this, plugin);}
	
	@EventHandler(priority = LOW)
    public void onPlayerWalkOnSpike(EntityInteractEvent e) {
        if (!(e.getEntity() instanceof LivingEntity)) {
            return;
        }
 
        LivingEntity livEnt = (LivingEntity) e.getEntity();
 
        if (e.getBlock() instanceof WoodenSpike) {
            livEnt.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 1, 1));
        }else if (e.getBlock() instanceof StoneSpike) {
            livEnt.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 1, 1));
        }else if (e.getBlock() instanceof IronSpike) {
            livEnt.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 1, 2));
        }else if (e.getBlock() instanceof GoldSpike) {
            livEnt.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 1, 1));
        }else if (e.getBlock() instanceof DiamondSpike) {
            livEnt.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 1, 1));
        	}
	}
    
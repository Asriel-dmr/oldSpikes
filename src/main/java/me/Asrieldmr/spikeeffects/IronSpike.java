package me.Asrieldmr.spikeeffects;

import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

public class IronSpike extends SlimefunItem {

	public IronSpike(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
			ItemStack recipeOutput) {
		super(category, item, recipeType, recipe, recipeOutput);
		
	}
	public void onPlayerWalkOnSpike(EntityInteractEvent e){
		

	}
}



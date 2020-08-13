package me.Asrieldmr.spikes;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.bstats.bukkit.Metrics;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.Asrieldmr.spikeeffects.SpikeListner;
public class Recipies extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
       
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            
        }

        
        int bStatsId = -1;
        new Metrics(this, bStatsId);

      
        ItemStack categoryItem = new CustomItem(Material.HEAVY_WEIGHTED_PRESSURE_PLATE, "&eSpikes", "", "&a> Click to open");

       
        NamespacedKey categoryId = new NamespacedKey(this, "SPIKES");
        Category category = new Category(categoryId, categoryItem);

        
       
      
                
        SlimefunItemStack woodenSpike = new SlimefunItemStack("WOODEN_SPIKE", Material.OAK_PRESSURE_PLATE, "&Wooden Spike", "&aThe Basic Spike - almost kill everyone who steps on it (half a heart left)");

        
        ItemStack[] recipewoodenspike = { null , null, null , null, new ItemStack(Material.WOODEN_SWORD), null, new ItemStack(Material.WOODEN_SWORD), new ItemStack(Material.OAK_LOG), new ItemStack(Material.WOODEN_SWORD) };
        
        SlimefunItemStack stoneSpike = new SlimefunItemStack("STONE_SPIKE", Material.STONE_PRESSURE_PLATE, "&eStone Spike", "&alike the wooden spike , but it can kill");

        
        ItemStack[] recipestonespike = { null , null, null , null, new ItemStack(Material.STONE_SWORD), null, new ItemStack(Material.STONE_SWORD), new ItemStack(Material.STONE), new ItemStack(Material.STONE_SWORD) };

        
        SlimefunItemStack ironSpike = new SlimefunItemStack("IRON_SPIKE", Material.HEAVY_WEIGHTED_PRESSURE_PLATE, "&eIron Spike", "&aSecond best spike - the complete balance between price and damage");
        
        ItemStack[] recipeironspike = { null , null, null , null, new ItemStack(Material.IRON_SWORD), null, new ItemStack(Material.IRON_SWORD), new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_SWORD) };

        
        SlimefunItemStack goldenSpike = new SlimefunItemStack("GOLDEN_SPIKE", Material.LIGHT_WEIGHTED_PRESSURE_PLATE, "&eGolden Spike", "&aFancier Stone Spikes");

        
        ItemStack[] recipegoldspike = { null , null, null , null, new ItemStack(Material.GOLDEN_SWORD), null, new ItemStack(Material.GOLDEN_SWORD), new ItemStack(Material.GOLD_BLOCK), new ItemStack(Material.GOLDEN_SWORD) };

        
        SlimefunItemStack diamondSpike = new SlimefunItemStack("DIAMOND_SPIKE", Material.WARPED_PRESSURE_PLATE, "&eDiamond Spike", "&aExpnsive but destructive.");

        
        ItemStack[] recipediamondspike = { null , null, null , null, new ItemStack(Material.DIAMOND_SWORD), null, new ItemStack(Material.DIAMOND_SWORD), new ItemStack(Material.DIAMOND_BLOCK), new ItemStack(Material.DIAMOND_SWORD) };


        
        // wooden spike
        SlimefunItem Woodenspike = new SlimefunItem(category, woodenSpike, RecipeType.ENHANCED_CRAFTING_TABLE, recipewoodenspike);
        Woodenspike.register(this);
        
        
        // stone spike
        SlimefunItem StoneSpike = new SlimefunItem(category, stoneSpike, RecipeType.ENHANCED_CRAFTING_TABLE, recipestonespike);
        StoneSpike.register(this);
        
      //iron spike
        SlimefunItem IronSpike = new SlimefunItem(category, ironSpike, RecipeType.ENHANCED_CRAFTING_TABLE, recipeironspike);
        IronSpike.register(this);
        
        
        // golden spike
        SlimefunItem GoldenSpike = new SlimefunItem(category, goldenSpike, RecipeType.ENHANCED_CRAFTING_TABLE, recipegoldspike);
        GoldenSpike.register(this);
        
        
        // diamond spike
        SlimefunItem DiamondSpike = new SlimefunItem(category, diamondSpike, RecipeType.ENHANCED_CRAFTING_TABLE, recipediamondspike);
        DiamondSpike.register(this);

        new SpikeListner (this);

    }
    
   
		
    

	@Override
    public void onDisable() {
      
    }

    @Override
    public String getBugTrackerURL() {
       
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

}




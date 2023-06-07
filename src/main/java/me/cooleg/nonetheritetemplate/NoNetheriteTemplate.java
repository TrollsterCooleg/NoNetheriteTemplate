package me.cooleg.nonetheritetemplate;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.SmithingTransformRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoNetheriteTemplate extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        registerTools();
        registerArmor();
    }

    @EventHandler
    private void smithingEvent(PrepareSmithingEvent event) {
        if (!event.getInventory().contains(Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE)) {return;}
        event.setResult(null);
    }

    private void registerTools() {
        NamespacedKey swordKey = new NamespacedKey(this, "sword");
        SmithingTransformRecipe sword = new SmithingTransformRecipe(
                swordKey, new ItemStack(Material.NETHERITE_SWORD),
                new RecipeChoice.MaterialChoice(Material.AIR),
                new RecipeChoice.MaterialChoice(Material.DIAMOND_SWORD),
                new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT));
        Bukkit.addRecipe(sword);

        NamespacedKey axeKey = new NamespacedKey(this, "axe");
        SmithingTransformRecipe axe = new SmithingTransformRecipe(
                axeKey, new ItemStack(Material.NETHERITE_AXE),
                new RecipeChoice.MaterialChoice(Material.AIR),
                new RecipeChoice.MaterialChoice(Material.DIAMOND_AXE),
                new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT));
        Bukkit.addRecipe(axe);

        NamespacedKey pickaxeKey = new NamespacedKey(this, "pickaxe");
        SmithingTransformRecipe pickaxe = new SmithingTransformRecipe(
                pickaxeKey, new ItemStack(Material.NETHERITE_PICKAXE),
                new RecipeChoice.MaterialChoice(Material.AIR),
                new RecipeChoice.MaterialChoice(Material.DIAMOND_PICKAXE),
                new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT));
        Bukkit.addRecipe(pickaxe);

        NamespacedKey hoeKey = new NamespacedKey(this, "hoe");
        SmithingTransformRecipe hoe = new SmithingTransformRecipe(
                hoeKey, new ItemStack(Material.NETHERITE_HOE),
                new RecipeChoice.MaterialChoice(Material.AIR),
                new RecipeChoice.MaterialChoice(Material.DIAMOND_HOE),
                new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT));
        Bukkit.addRecipe(hoe);

        NamespacedKey shovelKey = new NamespacedKey(this, "shovel");
        SmithingTransformRecipe shovel = new SmithingTransformRecipe(
                shovelKey, new ItemStack(Material.NETHERITE_SHOVEL),
                new RecipeChoice.MaterialChoice(Material.AIR),
                new RecipeChoice.MaterialChoice(Material.DIAMOND_SHOVEL),
                new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT));
        Bukkit.addRecipe(shovel);
    }

    private void registerArmor() {
        NamespacedKey helmetKey = new NamespacedKey(this, "helmet");
        SmithingTransformRecipe helmet = new SmithingTransformRecipe(
                helmetKey, new ItemStack(Material.NETHERITE_HELMET),
                new RecipeChoice.MaterialChoice(Material.AIR),
                new RecipeChoice.MaterialChoice(Material.DIAMOND_HELMET),
                new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT));
        Bukkit.addRecipe(helmet);

        NamespacedKey chestplateKey = new NamespacedKey(this, "chestplate");
        SmithingTransformRecipe chestplate = new SmithingTransformRecipe(
                chestplateKey, new ItemStack(Material.NETHERITE_CHESTPLATE),
                new RecipeChoice.MaterialChoice(Material.AIR),
                new RecipeChoice.MaterialChoice(Material.DIAMOND_CHESTPLATE),
                new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT));
        Bukkit.addRecipe(chestplate);

        NamespacedKey leggingsKey = new NamespacedKey(this, "leggings");
        SmithingTransformRecipe leggings = new SmithingTransformRecipe(
                leggingsKey, new ItemStack(Material.NETHERITE_LEGGINGS),
                new RecipeChoice.MaterialChoice(Material.AIR),
                new RecipeChoice.MaterialChoice(Material.DIAMOND_LEGGINGS),
                new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT));
        Bukkit.addRecipe(leggings);

        NamespacedKey bootsKey = new NamespacedKey(this, "boots");
        SmithingTransformRecipe boots = new SmithingTransformRecipe(
                bootsKey, new ItemStack(Material.NETHERITE_BOOTS),
                new RecipeChoice.MaterialChoice(Material.AIR),
                new RecipeChoice.MaterialChoice(Material.DIAMOND_BOOTS),
                new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT));
        Bukkit.addRecipe(boots);
    }

}

package me.kc.secondplugin.events;

import me.kc.secondplugin.events.extra.JoinOrLeave;
import me.kc.secondplugin.events.extra.OnDeath;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;

public final class Events extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("IT STARTED!!!");
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new OnDeath(), this);
        getServer().getPluginManager().registerEvents(new JoinOrLeave(), this);
    }

    @EventHandler
    public void onEnterBed(PlayerBedEnterEvent e){
        Player player = e.getPlayer();
        player.setHealth(player.getMaxHealth());
        player.sendMessage("Health Refilled!");
    }

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent e){
        //runs when leave bed
        Player player = e.getPlayer();
    }
}

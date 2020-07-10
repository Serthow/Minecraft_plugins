package me.kc.secondplugin.events.extra;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinOrLeave implements Listener {

    @EventHandler
    public void playerJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        String cat = p.getName();
        e.setJoinMessage(ChatColor.AQUA + "Welcome " + ChatColor.DARK_RED + cat + ChatColor.AQUA + "!");
    }

    @EventHandler
    public void playerLeave(PlayerQuitEvent e){
        Player p = e.getPlayer();
        String cat = p.getName();
        e.setQuitMessage(ChatColor.AQUA + "Bye! " + ChatColor.DARK_RED + cat);
    }
}

package cirosanchezb.ezrename;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class EZRename extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE+"EZRename "+ChatColor.WHITE+"Enabled.");
        getCommand("rename").setExecutor(new RenameCommand());
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE+"EZRename "+ChatColor.WHITE+"Disabled.");
    }
}

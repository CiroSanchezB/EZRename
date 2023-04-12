package cirosanchezb.ezrename;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class RenameCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player ) sender;
            if (sender.hasPermission("ezrename.use")){
                if (args.length >= 1){
                    ItemStack item = player.getItemInHand();
                    ItemMeta itemMeta = item.getItemMeta();

                    itemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', args[0]));
                    item.setItemMeta(itemMeta);
                    player.sendMessage(ChatColor.LIGHT_PURPLE+"[EzRename] "+ChatColor.WHITE+"Renamed.");
                } else {
                    player.sendMessage(ChatColor.LIGHT_PURPLE+"[EzRename] "+ChatColor.RED+"Usage: /rename <name>");
                }

            }

        } else {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"Use this command in game!");
        }
        return true;
    }

}

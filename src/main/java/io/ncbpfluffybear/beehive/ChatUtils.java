package io.ncbpfluffybear.beehive;

import lombok.NoArgsConstructor;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

@NoArgsConstructor
public class ChatUtils {

    public static String prefix = color("&7&l[&x&e&b&c&f&3&4Beehive&7&l]");

    public static String color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }

    public static void send(CommandSender sender, String msg) {
        sender.sendMessage(String.format("%s %s", prefix, color(msg)));
    }

    public static void setPrefix(String prefix) {
        prefix = color(prefix);
    }

}

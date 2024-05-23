package org.badlyac.backpack;

import org.badlyac.backpack.Commands.enderbox;
import org.bukkit.plugin.java.JavaPlugin;


public class BackpackMain extends JavaPlugin {

    private static BackpackMain instance;

    @Override
    public void onEnable() {
        instance = this;
        this.getCommand("enderbox").setExecutor(new enderbox());
        getLogger().info("EnderBoxPlugin has been enabled!");

    }

    public static BackpackMain getInstance() {
        return instance;
    }
}

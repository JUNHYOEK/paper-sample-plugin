package com.github.junhyeok

import org.bukkit.plugin.java.JavaPlugin

class PluginMain: JavaPlugin() {
    override fun onEnable() {
        server.consoleSender.sendMessage("Hello world!")
    }
}
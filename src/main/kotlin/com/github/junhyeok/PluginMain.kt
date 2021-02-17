package com.github.junhyeok

import org.bukkit.plugin.Plugin
import org.bukkit.plugin.java.JavaPlugin

class PluginMain: JavaPlugin() {

    lateinit var instance:Plugin

    override fun onEnable() {
        instance = this
        server.consoleSender.sendMessage("Hello world!")
    }
}
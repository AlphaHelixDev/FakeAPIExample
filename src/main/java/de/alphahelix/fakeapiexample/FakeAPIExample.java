package de.alphahelix.fakeapiexample;

import org.bukkit.plugin.java.JavaPlugin;

public class FakeAPIExample extends JavaPlugin {

    private static FakeAPIExample instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    public static FakeAPIExample getInstance() {
        return instance;
    }
}

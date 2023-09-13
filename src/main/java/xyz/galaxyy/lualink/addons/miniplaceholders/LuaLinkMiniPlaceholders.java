package xyz.galaxyy.lualink.addons.miniplaceholders;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.galaxyy.lualink.addons.miniplaceholders.wrapper.LuaGetAudienceGlobalPlaceholders;
import xyz.galaxyy.lualink.addons.miniplaceholders.wrapper.LuaGetAudiencePlaceholders;
import xyz.galaxyy.lualink.addons.miniplaceholders.wrapper.LuaGetGlobalPlaceHolders;
import xyz.galaxyy.lualink.addons.miniplaceholders.wrapper.LuaGetRelationalPlaceholders;
import xyz.galaxyy.lualink.api.LuaLinkAPI;
import xyz.galaxyy.lualink.api.addons.LuaAddon;

public class LuaLinkMiniPlaceholders extends JavaPlugin {

    @Override
    public void onEnable() {
        LuaAddon luaAddon = new LuaAddon();

        luaAddon.addFunction("getRelationalPlaceholders", new LuaGetRelationalPlaceholders());
        luaAddon.addFunction("getRelationalGlobalPlaceholders", new LuaGetRelationalPlaceholders());
        luaAddon.addFunction("getAudiencePlaceholders", new LuaGetAudiencePlaceholders());
        luaAddon.addFunction("getAudienceGlobalPlaceholders", new LuaGetAudienceGlobalPlaceholders());
        luaAddon.addFunction("getGlobalPlaceholders", new LuaGetGlobalPlaceHolders());

        LuaLinkAPI.Companion.registerAddon("MiniPlaceholders", luaAddon);
    }
}
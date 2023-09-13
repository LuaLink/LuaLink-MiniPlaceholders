package xyz.galaxyy.lualink.addons.miniplaceholders.wrapper;

import io.github.miniplaceholders.api.MiniPlaceholders;
import org.bukkit.entity.Player;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.OneArgFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;
import org.luaj.vm2.lib.jse.CoerceLuaToJava;

public class LuaGetAudienceGlobalPlaceholders extends OneArgFunction {

    @Override
    public LuaValue call(LuaValue lPlayer) {
        Player player = (Player) CoerceLuaToJava.coerce(lPlayer, Player.class);

        return CoerceJavaToLua.coerce(MiniPlaceholders.getAudienceGlobalPlaceholders(player));
    }
}

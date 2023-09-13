package xyz.galaxyy.lualink.addons.miniplaceholders.wrapper;

import io.github.miniplaceholders.api.MiniPlaceholders;
import org.bukkit.entity.Player;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.TwoArgFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;
import org.luaj.vm2.lib.jse.CoerceLuaToJava;

public class LuaGetRelationalGlobalPlaceholders extends TwoArgFunction {
    @Override
    public LuaValue call(LuaValue lPlayer1, LuaValue lPlayer2) {
        Player player1 = (Player) CoerceLuaToJava.coerce(lPlayer1, Player.class);
        Player player2 = (Player) CoerceLuaToJava.coerce(lPlayer2, Player.class);

        return CoerceJavaToLua.coerce(MiniPlaceholders.getRelationalGlobalPlaceholders(player1, player2));
    }
}

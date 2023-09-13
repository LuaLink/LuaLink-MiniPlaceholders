package xyz.galaxyy.lualink.addons.miniplaceholders.wrapper;

import io.github.miniplaceholders.api.MiniPlaceholders;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.ZeroArgFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public class LuaGetGlobalPlaceHolders extends ZeroArgFunction {
    @Override
    public LuaValue call() {
        return CoerceJavaToLua.coerce(MiniPlaceholders.getGlobalPlaceholders());
    }
}

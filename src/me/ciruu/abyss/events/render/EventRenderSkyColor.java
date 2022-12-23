package me.ciruu.abyss.events.render;

import me.ciruu.abyss.events.MinecraftEvent;
import net.minecraft.util.math.Vec3d;

public class EventRenderSkyColor
extends MinecraftEvent {
    private Vec3d Field1611;

    public void Method512(Vec3d vec3d) {
        this.Field1611 = vec3d;
    }

    public Vec3d Method2003() {
        return this.Field1611;
    }
}

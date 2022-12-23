package me.ciruu.abyss.events.render;

import me.ciruu.abyss.events.MinecraftEvent;

public class EventRenderItemSide
extends MinecraftEvent {
    float x = 1.0f;
    float y = 1.0f;
    float z = 1.0f;
    boolean Field3158;

    public EventRenderItemSide(boolean bl) {
        this.Field3158 = bl;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float f) {
        this.x = f;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float f) {
        this.y = f;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float f) {
        this.z = f;
    }

    public boolean Method3708() {
        return this.Field3158;
    }
}

package me.ciruu.abyss.events.player;

import java.util.function.Consumer;
import me.ciruu.abyss.enums.Class53;
import me.ciruu.abyss.events.MinecraftEvent;

public class EventPlayerUpdateWalking
extends MinecraftEvent {
    protected float yaw;
    protected float pitch;
    protected double x;
    protected double y;
    protected double z;
    protected boolean onGround;
    private Consumer Field397 = null;
    private boolean Field398;

    public EventPlayerUpdateWalking(Class53 class53, double d, double d2, double d3, boolean bl) {
        super(class53);
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.onGround = bl;
    }

    public Consumer Method471() {
        return this.Field397;
    }

    public void Method472(Consumer consumer) {
        this.Field397 = consumer;
    }

    public float getYaw() {
        return this.yaw;
    }

    public void setYaw(float f) {
        this.yaw = f;
    }

    public float getPitch() {
        return this.pitch;
    }

    public void setPitch(float f) {
        this.pitch = f;
    }

    public void setYaw(double d) {
        this.yaw = (float)d;
    }

    public void setPitch(double d) {
        this.pitch = (float)d;
    }

    public void Method479() {
        this.Field398 = true;
    }

    public boolean Method480() {
        return this.Field398;
    }

    public void setX(double d) {
        this.x = d;
    }

    public void setY(double d) {
        this.y = d;
    }

    public void setZ(double d) {
        this.z = d;
    }

    public void setOnGround(boolean bl) {
        this.onGround = bl;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public boolean isOnGround() {
        return this.onGround;
    }
}

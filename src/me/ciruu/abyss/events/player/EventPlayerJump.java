package me.ciruu.abyss.events.player;

import me.ciruu.abyss.events.MinecraftEvent;

public class EventPlayerJump
extends MinecraftEvent {
    public double Field2806;
    public double Field2807;

    public EventPlayerJump(double d, double d2) {
        this.Field2806 = d;
        this.Field2807 = d2;
    }
}

package me.ciruu.abyss.events.player;

import me.ciruu.abyss.events.MinecraftEvent;

public class EventPlayerPushOutOfBlocks
extends MinecraftEvent {
    public double Field541;
    public double Field542;
    public double Field543;

    public EventPlayerPushOutOfBlocks(double d, double d2, double d3) {
        this.Field541 = d;
        this.Field542 = d2;
        this.Field543 = d3;
    }
}

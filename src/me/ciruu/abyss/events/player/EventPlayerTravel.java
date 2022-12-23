package me.ciruu.abyss.events.player;

import me.ciruu.abyss.events.MinecraftEvent;

public class EventPlayerTravel
extends MinecraftEvent {
    public float Field177;
    public float Field178;
    public float Field179;

    public EventPlayerTravel(float f, float f2, float f3) {
        this.Field177 = f;
        this.Field178 = f2;
        this.Field179 = f3;
    }
}

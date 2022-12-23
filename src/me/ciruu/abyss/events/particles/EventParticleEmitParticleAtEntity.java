package me.ciruu.abyss.events.particles;

import me.ciruu.abyss.events.MinecraftEvent;

public class EventParticleEmitParticleAtEntity
extends MinecraftEvent {
    private final int Field2493;

    public EventParticleEmitParticleAtEntity(int n) {
        this.Field2493 = n;
    }

    public int Method1065() {
        return this.Field2493;
    }
}

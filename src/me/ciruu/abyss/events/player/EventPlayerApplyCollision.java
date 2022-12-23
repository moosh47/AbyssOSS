package me.ciruu.abyss.events.player;

import me.ciruu.abyss.events.MinecraftEvent;
import net.minecraft.entity.Entity;

public class EventPlayerApplyCollision
extends MinecraftEvent {
    public Entity Field796;

    public EventPlayerApplyCollision(Entity entity) {
        this.Field796 = entity;
    }
}

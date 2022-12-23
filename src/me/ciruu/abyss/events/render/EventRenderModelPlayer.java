package me.ciruu.abyss.events.render;

import me.ciruu.abyss.events.MinecraftEvent;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class EventRenderModelPlayer
extends MinecraftEvent {
    public ModelBase Field1573;
    public Entity Field224;
    public float Field1574;
    public float Field1575;
    public float Field1576;
    public float Field1577;
    public float Field1578;
    public float Field1579;

    public EventRenderModelPlayer(ModelBase modelBase, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Field1573 = modelBase;
        this.Field224 = entity;
        this.Field1574 = f;
        this.Field1575 = f2;
        this.Field1576 = f3;
        this.Field1577 = f4;
        this.Field1578 = f5;
        this.Field1579 = f6;
    }
}

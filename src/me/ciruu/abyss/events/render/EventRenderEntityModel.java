package me.ciruu.abyss.events.render;

import me.ciruu.abyss.events.MinecraftEvent;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class EventRenderEntityModel
extends MinecraftEvent {
    public ModelBase modelBase;
    public Entity entity;
    public float Field238;
    public float Field239;
    public float Field240;
    public float Field241;
    public float Field242;
    public float Field243;

    public EventRenderEntityModel(ModelBase modelBase, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.modelBase = modelBase;
        this.entity = entity;
        this.Field238 = f;
        this.Field239 = f2;
        this.Field240 = f3;
        this.Field241 = f4;
        this.Field242 = f5;
        this.Field243 = f6;
    }
}

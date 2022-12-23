package me.ciruu.abyss.events.player;

import me.ciruu.abyss.events.MinecraftEvent;
import net.minecraft.util.DamageSource;

public class EntityPlayerAttackEntityFrom
extends MinecraftEvent {
    private DamageSource Field1211;
    private float Field1212;

    public EntityPlayerAttackEntityFrom(DamageSource damageSource, float f) {
        this.Field1211 = damageSource;
        this.Field1212 = f;
    }

    public DamageSource Method1565() {
        return this.Field1211;
    }

    public float Method1566() {
        return this.Field1212;
    }
}

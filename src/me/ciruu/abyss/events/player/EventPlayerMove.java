package me.ciruu.abyss.events.player;

import me.ciruu.abyss.enums.Class53;
import me.ciruu.abyss.events.MinecraftEvent;
import net.minecraft.entity.MoverType;

public class EventPlayerMove
extends MinecraftEvent {
    private MoverType Field711;
    private double Field712;
    private double Field713;
    private double Field714;

    public EventPlayerMove(Class53 class53, MoverType moverType, double d, double d2, double d3) {
        this.Method982(class53);
        this.Field711 = moverType;
        this.Field712 = d;
        this.Field713 = d2;
        this.Field714 = d3;
    }

    public MoverType Method102() {
        return this.Field711;
    }

    public void Method983(MoverType moverType) {
        this.Field711 = moverType;
    }

    public double Method984() {
        return this.Field712;
    }

    public double Method985() {
        return this.Field713;
    }

    public double Method986() {
        return this.Field714;
    }

    public void Method107(double d) {
        this.Field712 = d;
    }

    public void Method105(double d) {
        this.Field713 = d;
    }

    public void Method108(double d) {
        this.Field714 = d;
    }

    public void Method987() {
        this.cancel();
        this.Field712 = 0.0;
        this.Field714 = 0.0;
    }
}

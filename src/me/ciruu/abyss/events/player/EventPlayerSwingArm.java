package me.ciruu.abyss.events.player;

import me.ciruu.abyss.events.MinecraftEvent;
import net.minecraft.util.EnumHand;

public class EventPlayerSwingArm
extends MinecraftEvent {
    public EnumHand Field2189;

    public EventPlayerSwingArm(EnumHand enumHand) {
        this.Field2189 = enumHand;
    }
}

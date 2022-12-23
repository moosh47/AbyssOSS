package me.ciruu.abyss.events.player;

import me.ciruu.abyss.enums.Class53;
import me.ciruu.abyss.events.player.EventPlayerUpdateWalking;

public class EventPlayerMotionUpdate
extends EventPlayerUpdateWalking {
    public EventPlayerMotionUpdate(Class53 class53, float f, float f2) {
        super(class53, 0.0, 0.0, 0.0, false);
        this.Field1350 = f;
        this.Field1351 = f2;
    }
}

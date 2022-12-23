package me.ciruu.abyss.events.client;

import me.ciruu.abyss.enums.Class53;
import me.ciruu.abyss.events.MinecraftEvent;

public class EventClientKeyDown
extends MinecraftEvent {
    public boolean Field881;
    public boolean toggled;

    public EventClientKeyDown(Class53 class53, boolean bl, boolean bl2) {
        super(class53);
        this.Field881 = bl;
        this.toggled = bl2;
    }
}

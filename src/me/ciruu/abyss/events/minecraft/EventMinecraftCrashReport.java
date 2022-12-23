package me.ciruu.abyss.events.minecraft;

import me.ciruu.abyss.events.MinecraftEvent;
import net.minecraft.crash.CrashReport;

public class EventMinecraftCrashReport
extends MinecraftEvent {
    public final CrashReport Field77;

    public EventMinecraftCrashReport(CrashReport crashReport) {
        this.Field77 = crashReport;
    }
}

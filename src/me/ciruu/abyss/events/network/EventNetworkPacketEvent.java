package me.ciruu.abyss.events.network;

import me.ciruu.abyss.events.MinecraftEvent;
import net.minecraft.network.Packet;

public class EventNetworkPacketEvent
extends MinecraftEvent {
    private final Packet m_Packet;

    public EventNetworkPacketEvent(Packet packet) {
        this.m_Packet = packet;
    }

    public Packet getPacket() {
        return this.m_Packet;
    }
}

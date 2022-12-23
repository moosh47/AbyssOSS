package me.ciruu.abyss.events.player;

import me.ciruu.abyss.events.MinecraftEvent;
import net.minecraft.util.math.BlockPos;

public class EventPlayerDestroyBlock
extends MinecraftEvent {
    public BlockPos Field974;

    public EventPlayerDestroyBlock(BlockPos blockPos) {
        this.Field974 = blockPos;
    }
}

package me.ciruu.abyss.events.player;

import me.ciruu.abyss.events.MinecraftEvent;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class EventPlayerClickBlock
extends MinecraftEvent {
    public BlockPos Field3064;
    public EnumFacing Field3065;

    public EventPlayerClickBlock(BlockPos blockPos, EnumFacing enumFacing) {
        this.Field3064 = blockPos;
        this.Field3065 = enumFacing;
    }
}

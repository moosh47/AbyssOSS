package me.ciruu.abyss.events.liquid;

import me.ciruu.abyss.events.MinecraftEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class EventLiquidCollisionBB
extends MinecraftEvent {
    private final BlockPos Field1722;
    private AxisAlignedBB Field1723;

    public EventLiquidCollisionBB(BlockPos blockPos) {
        this.Field1722 = blockPos;
    }

    public BlockPos Method2133() {
        return this.Field1722;
    }

    public AxisAlignedBB Method2134() {
        return this.Field1723;
    }

    public void Method2135(AxisAlignedBB axisAlignedBB) {
        this.Field1723 = axisAlignedBB;
    }
}

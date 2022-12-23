package me.ciruu.abyss.events.player;

import me.ciruu.abyss.events.MinecraftEvent;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class EventPlayerDamageBlock
extends MinecraftEvent {
    private BlockPos Field1;
    private EnumFacing Field2;

    public EventPlayerDamageBlock(BlockPos blockPos, EnumFacing enumFacing) {
        this.Field1 = blockPos;
        this.Method1(enumFacing);
    }

    public BlockPos Method2() {
        return this.Field1;
    }

    public EnumFacing Method3() {
        return this.Field2;
    }

    public void Method1(EnumFacing enumFacing) {
        this.Field2 = enumFacing;
    }
}

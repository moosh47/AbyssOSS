package me.ciruu.abyss.events.render;

import me.ciruu.abyss.events.MinecraftEvent;
import net.minecraft.item.ItemStack;

public class EventRenderToolTip
extends MinecraftEvent {
    private final ItemStack Field1339;
    private final int Field1340;
    private final int Field1341;

    public EventRenderToolTip(ItemStack itemStack, int n, int n2) {
        this.Field1339 = itemStack;
        this.Field1340 = n;
        this.Field1341 = n2;
    }

    public ItemStack Method89() {
        return this.Field1339;
    }

    public int Method90() {
        return this.Field1340;
    }

    public int Method91() {
        return this.Field1341;
    }
}

package ml.meddiwale.ingotfarm;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class IngotHolder implements InventoryHolder {
    Player player;

    public IngotHolder(Player player) {
        this.player = player;
    }

    @Override
    public Inventory getInventory() {
        return null;
    }

    public Player getPlayer() {
        return player;
    }
}

package com.ryandw11.structure.api;

import com.ryandw11.structure.CustomStructures;
import com.ryandw11.structure.loottables.LootTablesHandler;
import com.ryandw11.structure.loottables.customitems.CustomItemManager;
import com.ryandw11.structure.structure.StructureHandler;

/**
 * The class for the general API of CustomStructures.
 */
public class CustomStructuresAPI {

    private CustomStructures plugin;

    public CustomStructuresAPI() {
        this.plugin = CustomStructures.plugin;
    }

    /**
     * Get the number of structures.
     *
     * @return The number of structures.
     */
    public int getNumberOfStructures() {
        return getStructureHandler().getStructures().size();
    }

    /**
     * Get the structure handler.
     *
     * @return The structure handler.
     */
    public StructureHandler getStructureHandler() {
        return plugin.getStructureHandler();
    }

    /**
     * Get the loot table handler.
     *
     * @return The loot table handler.
     */
    public LootTablesHandler getLootTableHandler() {
        return plugin.getLootTableHandler();
    }

    /**
     * Get the custom item manager.
     *
     * @return The custom item manager.
     */
    public CustomItemManager getCustomItemManager() {
        return plugin.getCustomItemManager();
    }

    /**
     * Get the schematics folder.
     *
     * @return The schematics folder.
     */
    public String getSchematicsFolder() {
        return plugin.getDataFolder() + "/schematics/";
    }
}

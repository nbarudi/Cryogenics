package ca.bungo.content.items;

import ca.bungo.Cryogenics;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ICE_CRYSTAL = registerItem("ice_crystal", new Item(
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Cryogenics.MOD_ID, "ice_crystal")))
    ));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Cryogenics.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Cryogenics.LOGGER.info("Registering Mod Items");
    }

}

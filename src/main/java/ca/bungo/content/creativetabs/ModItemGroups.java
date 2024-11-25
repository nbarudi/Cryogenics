package ca.bungo.content.creativetabs;

import ca.bungo.Cryogenics;
import ca.bungo.content.blocks.ModBlocks;
import ca.bungo.content.items.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CRYOGENICS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Cryogenics.MOD_ID, "cryogenics_item_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.ICE_CRYSTAL))
                    .displayName(Text.translatable("itemgroup.cryogenics.cryogenic_items"))
                    .entries((displayContext, entries) -> {

                        //Items
                        entries.add(ModItems.ICE_CRYSTAL);


                        //Blocks
                        entries.add(ModBlocks.CRYSTALLINE_CHUNK);

                    })
                    .build());

    public static void reigsterItemGroups() {
        Cryogenics.LOGGER.info("Registering Item Groups");
    }

}

package com.mnazz.qualities_of_life.block;

import com.mnazz.qualities_of_life.Qualities_of_life;
import net.minecraft. world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net. minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister. create(ForgeRegistries. BLOCKS, Qualities_of_life.MODID);

    // Register the Gem Charging Station block
    public static final RegistryObject<Block> GEM_CHARGING_STATION = BLOCKS.register("gem_charging_station",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
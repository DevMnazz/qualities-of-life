package com.mnazz.qualities_of_life.item;

import com.mnazz.qualities_of_life.Qualities_of_life;
import net.minecraft.ChatFormatting;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Qualities_of_life.MODID);


    public static final RegistryObject<Item> INTERGEM = ITEMS.register("intergem",
            () -> new Item(new Item.Properties().fireResistant()) {
        @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
        }
                public void appendHoverText(ItemStack stack, Level level, List<Component> tooltipComponents, TooltipFlag isAdvanced) {
                    tooltipComponents.add(Component.translatable("tooltip.qualities_of_life.intergem. line1")
                            .withStyle(ChatFormatting.AQUA));
                    tooltipComponents.add(Component.translatable("tooltip.qualities_of_life.intergem.line2")
                            . withStyle(ChatFormatting. GRAY, ChatFormatting.ITALIC));

                    super. appendHoverText(stack, level, tooltipComponents, isAdvanced);
                }
            });


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

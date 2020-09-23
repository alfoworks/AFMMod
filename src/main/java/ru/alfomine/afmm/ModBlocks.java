package ru.alfomine.afmm;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ru.alfomine.afmm.blocks.BlockDisplay;

@Mod.EventBusSubscriber
public class ModBlocks {
    @GameRegistry.ObjectHolder("afmm:display")
    public static BlockDisplay display;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlockDisplay());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(ModBlocks.display).setRegistryName(ModBlocks.display.getRegistryName()));
    }
}

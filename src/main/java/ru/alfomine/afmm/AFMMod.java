package ru.alfomine.afmm;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ru.alfomine.afmm.proxy.CommonProxy;

@Mod(
        modid = AFMMod.MOD_ID,
        name = AFMMod.MOD_NAME,
        version = AFMMod.VERSION
)
public class AFMMod {

    public static final String MOD_ID = "afmm";
    public static final String MOD_NAME = "AFMMod";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "ru.alfomine.afmm.proxy.ClientProxy", serverSide = "ru.alfomine.afmm.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MOD_ID)
    public static AFMMod INSTANCE;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}

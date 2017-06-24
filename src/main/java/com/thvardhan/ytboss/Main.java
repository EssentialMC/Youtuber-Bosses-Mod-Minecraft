package com.thvardhan.ytboss;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by thvardhan on 6/20/17.
 */
@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "ytboss";
    public static final String VERSION = "1.0";
    public static final String NAME = "YouTuber's Boss Mod";
    @SidedProxy(clientSide = "thvardhan.ytboss.ClientProxy", serverSide = "thvardhan.ytboss.ServerProxy")
    public static CommonProxy proxy;
    @Mod.Instance(MODID)
    public static Main instance;



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

        proxy.postInit(e);
    }
}

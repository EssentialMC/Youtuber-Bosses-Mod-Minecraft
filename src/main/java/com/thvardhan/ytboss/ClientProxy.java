package com.thvardhan.ytboss;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by thvardhan on 6/24/17.
 */
public class ClientProxy extends CommonProxy {


    @Override
    public void preInit(FMLPreInitializationEvent e) {


        super.preInit(e);

    }


    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);

//        BlockRenderRegister.registerBlockRenderer();
//        ItemRenderRegistry.registerItemRender();

    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }


}

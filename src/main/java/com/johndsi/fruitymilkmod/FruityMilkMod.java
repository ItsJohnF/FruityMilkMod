package com.johndsi.fruitymilkmod;

import com.johndsi.fruitymilkmod.registry.ModItems;

import net.fabricmc.api.ModInitializer;

public class FruityMilkMod implements ModInitializer {

    public static final String MOD_ID = "fruitymilkmod";
    
    @Override
    public void onInitialize(){
        ModItems.registerItems();
    }
}

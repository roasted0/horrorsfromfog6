package com.jared.horrors;
import net.fabricmc.api.ModInitializer;
public class HorrorsMod implements ModInitializer {
    @Override public void onInitialize(){ HorrorsConfig.load(); ModEntities.register(); ModSounds.register(); }
}

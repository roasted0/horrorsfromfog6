package com.jared.horrors;
import com.google.gson.Gson; import com.google.gson.GsonBuilder; import net.fabricmc.loader.api.FabricLoader;
import java.io.File; import java.io.FileReader; import java.io.FileWriter;
public class HorrorsConfig {
    public static class Config{ public boolean manFromFogEnabled=true; public boolean boiledOneEnabled=true; public boolean caveDwellerEnabled=true; public boolean goatManEnabled=true; public boolean boiledOneOneHit=true; public boolean warningSounds=true; public double spawnRateManFromFog=0.02; public double spawnRateBoiledOne=0.01; public double spawnRateCaveDweller=0.03; public double spawnRateGoatMan=0.02; }
    public static Config INSTANCE=new Config(); private static final Gson GSON=new GsonBuilder().setPrettyPrinting().create();
    public static File getConfigFile(){ return FabricLoader.getInstance().getConfigDir().resolve("horrorsfromfog.json").toFile(); }
    public static void load(){ File f=getConfigFile(); if(f.exists()){ try(FileReader r=new FileReader(f)){ INSTANCE=GSON.fromJson(r, Config.class);}catch(Exception e){e.printStackTrace();}} else save(); }
    public static void save(){ File f=getConfigFile(); try(FileWriter w=new FileWriter(f)){ GSON.toJson(INSTANCE,w);}catch(Exception e){e.printStackTrace();} }
}

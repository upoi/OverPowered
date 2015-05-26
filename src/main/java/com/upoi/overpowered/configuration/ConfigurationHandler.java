package com.upoi.overpowered.configuration;



import net.minecraftforge.common.config.Configuration;

import java.io.File;
import java.util.Locale;

public class ConfigurationHandler {

    public static void init(File configFile){

        Configuration configuration = new Configuration(configFile);

        boolean configValue = false;
        try{
            configuration.load();
            configValue=configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Test test").getBoolean(true);
        }
        catch(Exception e){

        }
        finally{
            configuration.save();
        }
        System.out.println("ConfigTest; " +configValue);
    }
}

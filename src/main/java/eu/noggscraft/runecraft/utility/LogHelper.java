package eu.noggscraft.runecraft.utility;

import cpw.mods.fml.common.FMLLog;
import eu.noggscraft.runecraft.reference.Reference;
import org.apache.logging.log4j.Level;

public class LogHelper {

    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(object));
    }

    public static void all(Object object) { log(Level.ALL, object); }
    public static void debug(Object object) { log(Level.ALL, object); }
    public static void error(Object object) { log(Level.ALL, object); }
    public static void fatal(Object object) { log(Level.ALL, object); }
    public static void info(Object object) { log(Level.ALL, object); }
    public static void off(Object object) { log(Level.ALL, object); }
    public static void trace(Object object) { log(Level.ALL, object); }
    public static void worn(Object object) { log(Level.ALL, object); }
}

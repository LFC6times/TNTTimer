package ml.ikwid.tnttimer;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Tnttimer implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("tnttimer");

    @Override
    public void onInitialize() {
        LOGGER.info("timing tnt");
    }
}

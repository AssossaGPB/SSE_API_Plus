package xyz.assossa.sap.util;

import xyz.assossa.sap.color.Color;
import xyz.assossa.sap.handlers.EventBindHandler;
import xyz.assossa.sap.handlers.EventHandler;
import xyz.assossa.sap.handlers.GameEventHandler;
import xyz.assossa.sap.type.DeviceType;
import xyz.assossa.sap.type.Mode;
import xyz.assossa.sap.type.Zone;

public class SSEUtil {

    private static int count = Integer.MIN_VALUE;

    public static void setRGB(DeviceType type, Zone zone, Color color) {
        setRGB(type, zone, color, "SAP");
    }

    public static void setRGB(DeviceType type, Zone zone, Color color, String game) {
        updateCount();
        String event = "SSEUTIL-" + count;
        EventBindHandler e = new EventBindHandler(game, event, 1, new EventHandler(type, Mode.COLOR, zone, color));
        e.register();
        new GameEventHandler(game, event, 1).send();
        e.unregister();
    }

    private static void updateCount() {
        if (count + 1 == Integer.MAX_VALUE)
            count = Integer.MIN_VALUE;
        count++;
    }
}

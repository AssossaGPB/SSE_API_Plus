package xyz.assossa.sap.handlers;

import org.json.JSONObject;
import xyz.assossa.sap.color.Color;
import xyz.assossa.sap.type.DeviceType;
import xyz.assossa.sap.type.Mode;
import xyz.assossa.sap.type.Zone;

public class EventHandler {

    private DeviceType deviceType;
    private Mode mode;
    private Color color;
    private Zone zone;

    public EventHandler(DeviceType deviceType, Mode mode, Zone zone, Color color) {
        this.deviceType = deviceType;
        this.mode = mode;
        this.color = color;
        this.zone = zone;
    }

    public String getJSON() {
        JSONObject e = new JSONObject();
        e.put("device-type", deviceType.getType());
        e.put("zone", zone.getZone());
        e.put("color", color.getJSON());
        e.put("mode", mode.getMode());
        return e.toString();
    }
}

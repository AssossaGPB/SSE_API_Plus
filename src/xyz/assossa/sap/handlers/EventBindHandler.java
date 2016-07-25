package xyz.assossa.sap.handlers;

import org.json.JSONObject;
import xyz.assossa.sap.util.SteelSeriesEngine;

public class EventBindHandler {

    private String game, event;
    private int min = -1, max = -1, iconId;
    private EventHandler handler;

    public EventBindHandler(String game, String event, EventHandler handler) {
        this.game = game;
        this.event = event;
        this.handler = handler;
    }

    public EventBindHandler(String game, String event, EventHandler handler, int min) {
        this.game = game;
        this.event = event;
        this.handler = handler;
        this.min = min;
    }

    public EventBindHandler(String game, String event, int max, EventHandler handler) {
        this.game = game;
        this.event = event;
        this.max = max;
        this.handler = handler;
    }

    public EventBindHandler(String game, int iconId, String event, EventHandler handler) {
        this.game = game;
        this.event = event;
        this.iconId = iconId;
        this.handler = handler;
    }

    public EventBindHandler(String game, String event, int min, int max, EventHandler handler) {
        this.game = game;
        this.event = event;
        this.min = min;
        this.max = max;
        this.handler = handler;
    }

    public EventBindHandler(String game, String event, EventHandler handler, int max, int iconId) {
        this.game = game;
        this.event = event;
        this.handler = handler;
        this.max = max;
        this.iconId = iconId;
    }

    public EventBindHandler(String game, String event, int min, EventHandler handler, int iconId) {
        this.game = game;
        this.event = event;
        this.handler = handler;
        this.min = min;
        this.iconId = iconId;
    }

    public EventBindHandler(String game, String event, int min, int max, int iconId, EventHandler handler) {
        this.game = game;
        this.event = event;
        this.min = min;
        this.max = max;
        this.iconId = iconId;
        this.handler = handler;
    }

    public void register() {
        JSONObject e = new JSONObject();
        e.put("game", game.toUpperCase());
        e.put("event", event.toUpperCase());
        if (min != -1)
            e.put("min_value", min);
        if (max != -1)
            e.put("max_value", max);
        e.put("icon_id", iconId);
        e.put("handlers", handler.getJSON());
        SteelSeriesEngine.send("/bind_game_event", e.toString());
    }

    public void unregister() {
        JSONObject e = new JSONObject();
        e.put("game", game.toUpperCase());
        e.put("event", event.toUpperCase());
        SteelSeriesEngine.send("/remove_game_event", e.toString());
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public EventHandler getHandler() {
        return handler;
    }

    public void setHandler(EventHandler handler) {
        this.handler = handler;
    }
}

package xyz.assossa.sap.handlers;

import org.json.JSONObject;
import xyz.assossa.sap.util.SSE;

public class EventRegisterHandler {

    private String game, event;
    private int min = -1, max = -1, iconId;

    public EventRegisterHandler(String game, String event) {
        this.game = game;
        this.event = event;
    }

    public EventRegisterHandler(String game, String event, int min) {
        this.game = game;
        this.event = event;
        this.min = min;
    }

    public EventRegisterHandler(String game, int max, String event) {
        this.game = game;
        this.event = event;
        this.max = max;
    }

    public EventRegisterHandler(int iconId, String game, String event) {
        this.game = game;
        this.event = event;
        this.iconId = iconId;
    }

    public EventRegisterHandler(String game, String event, int min, int max) {
        this.game = game;
        this.event = event;
        this.min = min;
        this.max = max;
    }

    public EventRegisterHandler(String game, int iconId, String event, int max) {
        this.game = game;
        this.event = event;
        this.iconId = iconId;
        this.max = max;
    }

    public EventRegisterHandler(String game, int iconId, int min, String event) {
        this.game = game;
        this.event = event;
        this.iconId = iconId;
        this.min = min;
    }

    public EventRegisterHandler(String game, String event, int min, int max, int iconId) {
        this.game = game;
        this.event = event;
        this.min = min;
        this.max = max;
        this.iconId = iconId;
    }

    public void register() {
        JSONObject e = new JSONObject();
        e.put("game", game.toUpperCase());
        e.put("event", event.toUpperCase());
        if (min != -1)
            e.put("min", min);
        if (max != -1)
            e.put("max", max);
        if (iconId != 0)
            e.put("icon_id", iconId);
        SSE.send("/register_game_event", e.toString());
    }

    public void unregister() {
        JSONObject e = new JSONObject();
        e.put("game", game.toUpperCase());
        e.put("event", event.toUpperCase());
        SSE.send("/remove_game_event", e.toString());
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
}

package xyz.assossa.sap.handlers;

import org.json.JSONObject;
import xyz.assossa.sap.util.SSE;

public class GameEventHandler {

    private String game, event;
    private Object data;

    public GameEventHandler(String game, String event, Object data) {
        this.game = game;
        this.event = event;
        this.data = data;
    }

    public void send() {
        JSONObject g = new JSONObject();
        g.put("game", game.toUpperCase());
        g.put("event", event.toUpperCase());

        JSONObject v = new JSONObject();
        v.put("value", data);

        g.put("data", v.toString());

        SSE.send("/game_event", g.toString());
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

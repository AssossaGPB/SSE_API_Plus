package xyz.assossa.sap.handlers;

import org.json.JSONObject;
import xyz.assossa.sap.util.SSE;

public class GameHandler {

    private String game, name;
    private int colorId;

    public GameHandler(String game) {
        this.game = game;
        colorId = -1;
    }

    public GameHandler(String game, String name) {
        this.game = game;
        this.name = name;
        colorId = -1;
    }

    public GameHandler(String game, String name, int colorId) {
        this.game = game;
        this.name = name;
        this.colorId = colorId;
    }

    public GameHandler(String game, int colorId) {
        this.game = game;
        this.colorId = colorId;
    }

    public void register() {
        JSONObject g = new JSONObject();
        g.put("game", game.toUpperCase());
        if (!name.equals(""))
            g.put("game_display_name", name);
        if (colorId != -1)
            g.put("icon_color_id", colorId);
        SSE.send("/game_metadata", g.toString());
    }

    public void unregister() {
        JSONObject g = new JSONObject();
        g.put("game", game.toUpperCase());
        SSE.send("/remove_game", g.toString());
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }
}

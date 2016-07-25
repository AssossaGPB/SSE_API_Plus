package xyz.assossa.sap.color;

import org.json.JSONObject;

public class StaticColor extends Color {
    private int r, g, b;

    public StaticColor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String getJSON() {
        JSONObject c = new JSONObject();
        c.put("red", r);
        c.put("green", g);
        c.put("blue", b);
        return c.toString();
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

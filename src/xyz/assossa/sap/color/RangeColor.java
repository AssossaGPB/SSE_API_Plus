package xyz.assossa.sap.color;

import org.json.JSONObject;

public class RangeColor extends Color {

    private int low, high;
    private Color color;

    public RangeColor(int low, int high, Color color) {
        this.low = low;
        this.high = high;
        this.color = color;
    }

    public String getJSON() {
        JSONObject rc = new JSONObject();
        rc.put("low", low);
        rc.put("high", low);
        rc.put("color", color.getJSON());
        return rc.toString();
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

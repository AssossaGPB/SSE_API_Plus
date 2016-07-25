package xyz.assossa.sap.color;

import org.json.JSONObject;

public class GradientColor extends Color {

    private StaticColor start, end;

    public GradientColor(StaticColor start, StaticColor end) {
        this.start = start;
        this.end = end;
    }

    public GradientColor(int sr, int sg, int sb, int er, int eg, int eb) {
        this.start = new StaticColor(sr, sg, sb);
        this.end = new StaticColor(er, eg, eb);
    }

    public String getJSON() {
        JSONObject gc = new JSONObject();
        gc.put("zero", start.getJSON());
        gc.put("hundred", end.getJSON());
        return gc.toString();
    }

    public StaticColor getStart() {
        return start;
    }

    public void setStart(StaticColor start) {
        this.start = start;
    }

    public StaticColor getEnd() {
        return end;
    }

    public void setEnd(StaticColor end) {
        this.end = end;
    }
}

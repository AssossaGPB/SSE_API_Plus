package xyz.assossa.sap.type;

public enum Mode {
    COLOR("color"),
    PERCENT("percent"),
    COUNT("count");

    private final String mode;

    Mode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }
}

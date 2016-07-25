package xyz.assossa.sap.type;

public enum Zone {
    FUNCTIONKEYS("function-keys"),
    MAINKEYBOARD("main-keyboard"),
    KEYPAD("keypad"),
    KEYPAD_NUMS("keypad-nums"),
    NUMBERKEYS("number-keys"),
    MACROKEYS("macro-keys"),
    MACROKEYS_ALL("all-macro-keys"),
    MOUSEWHEEL("wheel"),
    MOUSELOGO("logo"),
    MOUSEBASE("base"),
    EARCUPS("earcups"),
    INDICATOR("one"),
    RGB1("one"),
    RGB2("two"),
    RGB3("three"),
    RGB4("four"),
    RGB5("five"),
    KEYBOARDLOGO("logo"),
    KEY_A("a"),
    KEY_B("b"),
    KEY_C("c"),
    KEY_D("d"),
    KEY_E("e"),
    KEY_F("f"),
    KEY_G("g"),
    KEY_H("h"),
    KEY_I("i"),
    KEY_J("j"),
    KEY_K("k"),
    KEY_L("l"),
    KEY_M("m"),
    KEY_N("n"),
    KEY_O("o"),
    KEY_P("p"),
    KEY_Q("q"),
    KEY_R("r"),
    KEY_S("s"),
    KEY_T("t"),
    KEY_U("u"),
    KEY_V("v"),
    KEY_W("w"),
    KEY_X("x"),
    KEY_Y("y"),
    KEY_Z("z"),
    KEY_1("keyboard-1"),
    KEY_2("keyboard-2"),
    KEY_3("keyboard-3"),
    KEY_4("keyboard-4"),
    KEY_5("keyboard-5"),
    KEY_6("keyboard-6"),
    KEY_7("keyboard-7"),
    KEY_8("keyboard-8"),
    KEY_9("keyboard-9"),
    KEY_0("keyboard-0"),
    KEY_RETURN("return"),
    KEY_ESCAPE("escape"),
    KEY_BACKSPACE("backspace"),
    KEY_TAB("tab"),
    KEY_SPACE("spacebar"),
    KEY_CAPSLOCK("caps"),
    KEY_DASH("dash"),
    KEY_EQUAL("equal"),
    KEY_LBRACKET("l-bracket"),
    KEY_RBRACKET("r-bracket"),
    KEY_BACKSLASH("backslash"),
    KEY_POUND("pound"),
    KEY_SEMICOLON("semicolon"),
    KEY_QUOTE("quote"),
    KEY_BACKQUOTE("backquote"),
    KEY_COMMA("comma"),
    KEY_PERIOD("period"),
    KEY_SLASH("slash"),
    KEY_F1("f1"),
    KEY_F2("f2"),
    KEY_F3("f3"),
    KEY_F4("f4"),
    KEY_F5("f5"),
    KEY_F6("f6"),
    KEY_F7("f7"),
    KEY_F8("f8"),
    KEY_F9("f9"),
    KEY_F10("f10"),
    KEY_F11("f11"),
    KEY_F12("f12"),
    KEY_PRINTSCREEN("printscreen"),
    KEY_SCROLLLOCK("scrolllock"),
    KEY_PAUSE("pause"),
    KEY_INSERT("insert"),
    KEY_HOME("home"),
    KEY_PAGEUP("pageup"),
    KEY_DELETE("delete"),
    KEY_END("end"),
    KEY_PAGEDOWN("pagedown"),
    KEY_RIGHT("rightarrow"),
    KEY_LEFT("leftarrow"),
    KEY_DOWN("downarrow"),
    KEY_UP("uparrow"),
    NUM_LOCK("keypad-num-lock"),
    NUM_DIVIDE("keypad-divide"),
    NUM_TIMES("keypad-times"),
    NUM_MINUS("keypad-minus"),
    NUM_PLUS("keypad-plus"),
    NUM_ENTER("keypad-enter"),
    NUM_PERIOD("keypad-period"),
    NUM_1("keypad-1"),
    NUM_2("keypad-2"),
    NUM_3("keypad-3"),
    NUM_4("keypad-4"),
    NUM_5("keypad-5"),
    NUM_6("keypad-6"),
    NUM_7("keypad-7"),
    NUM_8("keypad-8"),
    NUM_9("keypad-9"),
    NUM_0("keypad-0"),
    KEY_LCTRL("l-ctrl"),
    KEY_LSHIFT("l-shift"),
    KEY_LALT("l-alt"),
    KEY_LWIN("l-win"),
    KEY_RCTRL("r-ctrl"),
    KEY_RSHIFT("r-shift"),
    KEY_RALT("r-alt"),
    KEY_RWIN("r-win"),
    KEY_SS("ss-key"),
    KEY_MENU("win-menu"),
    MACRO_0("m0"),
    MACRO_1("m1"),
    MACRO_2("m2"),
    MACRO_3("m3"),
    MACRO_4("m4"),
    MACRO_5("m5"),
    ROW_Q("q-row"),
    ROW_A("a-row"),
    ROW_Z("z-row"),
    NAV_CLUSTER("nav-cluster"),
    ARROW_KEYS("arrows"),
    ALL("all"),
    TACTILE("one"),
    SCREENED("one");

    private final String zone;

    Zone(String zone) {
        this.zone = zone;
    }

    public String getZone() {
        return zone;
    }
}

package X;

/* renamed from: X.6y0  reason: invalid class name and case insensitive filesystem */
public enum C142916y0 {
    STATIC("static"),
    ANIMATED("animated"),
    ANIMATED_WHILE_LOADING("animated_while_loading"),
    ANIMATED_WHILE_LOADED("animated_while_loaded"),
    DISABLED("disabled");
    
    public static final C142916y0[] A00 = null;
    public final String value;

    /* access modifiers changed from: public */
    static {
        A00 = values();
    }

    public static C142916y0 A00(String str) {
        for (C142916y0 r1 : A00) {
            if (r1.toString().equals(str)) {
                return r1;
            }
        }
        C159557m5.A01(C141226vE.ERROR, "CdsOpenScreenConfig", AnonymousClass000.A0V("Error finding BackgroundMode enum value for: ", str, AnonymousClass001.A0o()));
        return STATIC;
    }

    public String toString() {
        return this.value;
    }

    /* access modifiers changed from: public */
    C142916y0(String str) {
        this.value = str;
    }
}

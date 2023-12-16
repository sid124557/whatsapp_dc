package X;

/* renamed from: X.6xy  reason: invalid class name and case insensitive filesystem */
public enum C142896xy {
    AUTO("auto"),
    ENABLED("enabled"),
    DISABLED("disabled");
    
    public static final C142896xy[] A00 = null;
    public final String value;

    /* access modifiers changed from: public */
    static {
        A00 = values();
    }

    public static C142896xy A00(String str) {
        for (C142896xy r1 : A00) {
            if (r1.toString().equals(str)) {
                return r1;
            }
        }
        C159557m5.A01(C141226vE.ERROR, "CdsOpenScreenConfig", AnonymousClass000.A0V("Error finding DragToDismiss enum value for: ", str, AnonymousClass001.A0o()));
        return AUTO;
    }

    public String toString() {
        return this.value;
    }

    /* access modifiers changed from: public */
    C142896xy(String str) {
        this.value = str;
    }
}

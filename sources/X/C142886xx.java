package X;

/* renamed from: X.6xx  reason: invalid class name and case insensitive filesystem */
public enum C142886xx {
    AUTO("auto"),
    ENABLED("enabled"),
    DISABLED("disabled");
    
    public static final C142886xx[] A00 = null;
    public final String value;

    /* access modifiers changed from: public */
    static {
        A00 = values();
    }

    public static C142886xx A00(String str) {
        for (C142886xx r1 : A00) {
            if (r1.toString().equals(str)) {
                return r1;
            }
        }
        C159557m5.A01(C141226vE.ERROR, "CdsOpenScreenConfig", AnonymousClass000.A0V("Error finding DimmedBackgroundTapToDismiss enum value for: ", str, AnonymousClass001.A0o()));
        return AUTO;
    }

    public String toString() {
        return this.value;
    }

    /* access modifiers changed from: public */
    C142886xx(String str) {
        this.value = str;
    }
}

package X;

/* renamed from: X.6xz  reason: invalid class name and case insensitive filesystem */
public enum C142906xz {
    FULL_SHEET("full_sheet"),
    HALF_SHEET("half_sheet"),
    FULL_SCREEN("full_screen"),
    FLEXIBLE_SHEET("flexible_sheet");
    
    public static final C142906xz[] A00 = null;
    public final String value;

    /* access modifiers changed from: public */
    static {
        A00 = values();
    }

    public static C142906xz A00(String str) {
        for (C142906xz r1 : A00) {
            if (r1.toString().equals(str)) {
                return r1;
            }
        }
        C159557m5.A01(C141226vE.ERROR, "CdsOpenScreenConfig", AnonymousClass000.A0V("Error finding Mode enum value for ", str, AnonymousClass001.A0o()));
        return FULL_SHEET;
    }

    public String toString() {
        return this.value;
    }

    /* access modifiers changed from: public */
    C142906xz(String str) {
        this.value = str;
    }
}

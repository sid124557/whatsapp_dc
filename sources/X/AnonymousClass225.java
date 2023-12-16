package X;

/* renamed from: X.225  reason: invalid class name */
public enum AnonymousClass225 {
    UPTO_DATE(0, true, true),
    FETCH_ERROR(1, false, false),
    NETWORK_ERROR(2, false, false),
    LANGUAGE_UNAVAILABLE(3, false, true);
    
    public final boolean fetchSuccessful;
    public final String fieldStatString;
    public final boolean gotDictionary;

    /* access modifiers changed from: public */
    static {
        AnonymousClass225[] r0;
        A00 = C73653fr.A00(r0);
    }

    /* access modifiers changed from: public */
    AnonymousClass225(int i, boolean z, boolean z2) {
        this.gotDictionary = z;
        this.fetchSuccessful = z2;
        this.fieldStatString = r2;
    }
}

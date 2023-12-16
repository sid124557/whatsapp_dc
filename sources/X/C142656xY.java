package X;

/* renamed from: X.6xY  reason: invalid class name and case insensitive filesystem */
public enum C142656xY {
    A02("BAD_REQUEST", false),
    A04("GROUP_NOT_FOUND", false),
    A05("GROUP_SUSPENDED", false),
    A07("RATE_LIMITED", true),
    A06("INTERNAL_SERVER_ERROR", true),
    A03("DEFAULT", false);
    
    public final int code;
    public final boolean isRecoverable;

    /* access modifiers changed from: public */
    static {
        C142656xY[] r0;
        A00 = C73653fr.A00(r0);
    }

    /* access modifiers changed from: public */
    C142656xY(String str, boolean z) {
        this.code = r2;
        this.isRecoverable = z;
    }
}

package X;

/* renamed from: X.6xR  reason: invalid class name and case insensitive filesystem */
public enum C142586xR {
    USER_NOT_ADMIN(401),
    GROUP_NOT_FOUND(404),
    GROUP_SUSPENDED(423),
    RATE_OVER_LIMIT(429),
    INTERNAL_SERVER_ERROR(500),
    DEFAULT(1);
    
    public final int code;

    /* access modifiers changed from: public */
    static {
        C142586xR[] r0;
        A00 = C73653fr.A00(r0);
    }

    /* access modifiers changed from: public */
    C142586xR(int i) {
        this.code = i;
    }
}

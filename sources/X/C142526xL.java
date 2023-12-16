package X;

/* renamed from: X.6xL  reason: invalid class name and case insensitive filesystem */
public enum C142526xL {
    USER_NOT_FOUND(400),
    PARTICIPANT_NOT_AUTHORIZED(401),
    PARTICIPANT_REQUEST_NOT_FOUND(404),
    DEFAULT(1);
    
    public final int code;

    /* access modifiers changed from: public */
    static {
        C142526xL[] r1;
        A00 = C73653fr.A00(r1);
    }

    /* access modifiers changed from: public */
    C142526xL(int i) {
        this.code = i;
    }
}

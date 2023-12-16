package X;

/* renamed from: X.59L  reason: invalid class name */
public enum AnonymousClass59L {
    TEXT((byte) 0, 0, 1),
    PHOTO((byte) 1, 1, 2),
    VIDEO((byte) 3, 2, 3),
    AUDIO((byte) 2, 3, 4),
    PTT((byte) 2, 4, 5),
    LOCATION((byte) 5, 5, 6),
    CONTACT((byte) 4, 6, 7),
    DOCUMENT((byte) 9, 7, 8),
    URL((byte) 0, 8, 9),
    GIF((byte) 13, 9, 10),
    CONTACT_ARRAY((byte) 14, 10, 11),
    REACTION((byte) 56, 11, 12),
    POLL_CREATE((byte) 66, 12, 13),
    POLL_VOTE((byte) 67, 13, 14);
    
    public final byte androidWaType;
    public final String stringType;
    public final int type;

    /* access modifiers changed from: public */
    static {
        AnonymousClass59L[] r2;
        A00 = C73653fr.A00(r2);
    }

    /* access modifiers changed from: public */
    AnonymousClass59L(byte b, int i, int i2) {
        this.stringType = r2;
        this.type = i2;
        this.androidWaType = b;
    }
}

package X;

/* renamed from: X.1Bk  reason: invalid class name and case insensitive filesystem */
public final class C21331Bk extends C130786cX implements C181378mf {
    public static final int COMMENT_PARENT_KEY_FIELD_NUMBER = 1;
    public static final C21331Bk DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int REPLY_COUNT_FIELD_NUMBER = 2;
    public int bitField0_;
    public AnonymousClass1ET commentParentKey_;
    public int replyCount_;

    static {
        C21331Bk r1 = new C21331Bk();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21331Bk.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1W = C18270x1.A1W();
                A1W[1] = "commentParentKey_";
                A1W[2] = "replyCount_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001", A1W);
            case 3:
                return new C21331Bk();
            case 4:
                return new AnonymousClass194();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21331Bk.class) {
                    r0 = PARSER;
                    if (r0 == null) {
                        r0 = C18320x8.A0B(DEFAULT_INSTANCE);
                        PARSER = r0;
                    }
                }
                return r0;
            default:
                throw C18320x8.A0m();
        }
    }
}

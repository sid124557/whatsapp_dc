package X;

/* renamed from: X.1Ct  reason: invalid class name and case insensitive filesystem */
public final class C21681Ct extends C130786cX implements C181378mf {
    public static final C21681Ct DEFAULT_INSTANCE;
    public static final int EVENT_RESPONSE_MESSAGE_FIELD_NUMBER = 3;
    public static final int EVENT_RESPONSE_MESSAGE_KEY_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 2;
    public static final int UNREAD_FIELD_NUMBER = 4;
    public int bitField0_;
    public AnonymousClass1ET eventResponseMessageKey_;
    public AnonymousClass1BE eventResponseMessage_;
    public long timestampMs_;
    public boolean unread_;

    static {
        C21681Ct r1 = new C21681Ct();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21681Ct.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Y = C18270x1.A1Y();
                A1Y[1] = "eventResponseMessageKey_";
                A1Y[2] = "timestampMs_";
                A1Y[3] = "eventResponseMessage_";
                A1Y[4] = "unread_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", A1Y);
            case 3:
                return new C21681Ct();
            case 4:
                return new AnonymousClass195();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21681Ct.class) {
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

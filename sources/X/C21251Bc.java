package X;

/* renamed from: X.1Bc  reason: invalid class name and case insensitive filesystem */
public final class C21251Bc extends C130786cX implements C181378mf {
    public static final int CALL_RESULT_FIELD_NUMBER = 2;
    public static final C21251Bc DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int USER_JID_FIELD_NUMBER = 1;
    public int bitField0_;
    public int callResult_;
    public String userJid_ = "";

    static {
        C21251Bc r1 = new C21251Bc();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21251Bc.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1X = C18270x1.A1X();
                A1X[1] = "userJid_";
                A1X[2] = "callResult_";
                A1X[3] = C64003Bs.A00;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", A1X);
            case 3:
                return new C21251Bc();
            case 4:
                return new AnonymousClass18E();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21251Bc.class) {
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

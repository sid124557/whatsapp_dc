package X;

/* renamed from: X.1DB  reason: invalid class name */
public final class AnonymousClass1DB extends C130786cX implements C181378mf {
    public static final int CALL_OUTCOME_FIELD_NUMBER = 2;
    public static final int CALL_TYPE_FIELD_NUMBER = 4;
    public static final AnonymousClass1DB DEFAULT_INSTANCE;
    public static final int DURATION_SECS_FIELD_NUMBER = 3;
    public static final int IS_VIDEO_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int PARTICIPANTS_FIELD_NUMBER = 5;
    public int bitField0_;
    public int callOutcome_;
    public int callType_;
    public long durationSecs_;
    public boolean isVideo_;
    public C188248ya participants_ = C130236bd.A02;

    static {
        AnonymousClass1DB r1 = new AnonymousClass1DB();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DB.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[9];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "isVideo_";
                objArr[2] = "callOutcome_";
                objArr[3] = AnonymousClass3BM.A00;
                objArr[4] = "durationSecs_";
                objArr[5] = "callType_";
                objArr[6] = AnonymousClass3BN.A00;
                objArr[7] = "participants_";
                objArr[8] = AnonymousClass1EV.class;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005\u001b", objArr);
            case 3:
                return new AnonymousClass1DB();
            case 4:
                return new AnonymousClass16P();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DB.class) {
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

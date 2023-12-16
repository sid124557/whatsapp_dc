package X;

/* renamed from: X.1Bu  reason: invalid class name and case insensitive filesystem */
public final class C21431Bu extends C130786cX implements C181378mf {
    public static final int CAMPAIGN_EXPIRATION_TIMESTAMP_FIELD_NUMBER = 45;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 44;
    public static final C21431Bu DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public long campaignExpirationTimestamp_;
    public long campaignId_;
    public byte memoizedIsInitialized = 2;

    static {
        C21431Bu r1 = new C21431Bu();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21431Bu.class);
    }

    public final Object A0J(C141056ux r5, Object obj, Object obj2) {
        C178978iP r0;
        int i = 1;
        switch (r5.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                Object[] A1X = AnonymousClass0x9.A1X();
                A1X[0] = "bitField0_";
                A1X[1] = "campaignId_";
                A1X[2] = "campaignExpirationTimestamp_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001,-\u0002\u0000\u0000\u0001,ᔃ\u0000-ဃ\u0001", A1X);
            case 3:
                return new C21431Bu();
            case 4:
                return new AnonymousClass19I();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21431Bu.class) {
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

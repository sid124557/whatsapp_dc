package X;

/* renamed from: X.1EQ  reason: invalid class name */
public final class AnonymousClass1EQ extends C130786cX implements C181378mf {
    public static final AnonymousClass1EQ DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int REF_TOKEN_FIELD_NUMBER = 1;
    public static final int VERSION_FIELD_NUMBER = 2;
    public static final int WEBD_PAYLOAD_FIELD_NUMBER = 3;
    public static final int WEB_SUB_PLATFORM_FIELD_NUMBER = 4;
    public int bitField0_;
    public String refToken_ = "";
    public String version_ = "";
    public int webSubPlatform_;
    public C130706cP webdPayload_;

    static {
        AnonymousClass1EQ r1 = new AnonymousClass1EQ();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EQ.class);
    }

    @Deprecated
    public boolean A0M() {
        return AnonymousClass0x2.A1X(this.bitField0_);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C18270x1.A1Z();
                A1Z[1] = "refToken_";
                A1Z[2] = "version_";
                A1Z[3] = "webdPayload_";
                A1Z[4] = "webSubPlatform_";
                A1Z[5] = AnonymousClass3C6.A00;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", A1Z);
            case 3:
                return new AnonymousClass1EQ();
            case 4:
                return new C207018z();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EQ.class) {
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

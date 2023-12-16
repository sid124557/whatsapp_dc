package X;

/* renamed from: X.1Cr  reason: invalid class name and case insensitive filesystem */
public final class C21661Cr extends C130786cX implements C181378mf {
    public static final C21661Cr DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 4;
    public static final int MAC_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER = null;
    public static final int RECORDS_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    public int bitField0_;
    public AnonymousClass1AY keyId_;
    public C172548Lq mac_ = C172548Lq.A01;
    public C188248ya records_ = C130236bd.A02;
    public C20981Ab version_;

    static {
        C21661Cr r1 = new C21661Cr();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21661Cr.class);
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
                A1Z[1] = "version_";
                A1Z[2] = "records_";
                A1Z[3] = AnonymousClass1CK.class;
                A1Z[4] = "mac_";
                A1Z[5] = "keyId_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ည\u0001\u0004ဉ\u0002", A1Z);
            case 3:
                return new C21661Cr();
            case 4:
                return new AnonymousClass18A();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21661Cr.class) {
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

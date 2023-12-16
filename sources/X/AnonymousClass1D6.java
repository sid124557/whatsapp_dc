package X;

/* renamed from: X.1D6  reason: invalid class name */
public final class AnonymousClass1D6 extends C130786cX implements C181378mf {
    public static final AnonymousClass1D6 DEFAULT_INSTANCE;
    public static final int HISTORY_SYNC_CONFIG_FIELD_NUMBER = 5;
    public static final int OS_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int PLATFORM_TYPE_FIELD_NUMBER = 3;
    public static final int REQUIRE_FULL_SYNC_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 2;
    public int bitField0_;
    public C21811Dg historySyncConfig_;
    public String os_ = "";
    public int platformType_;
    public boolean requireFullSync_;
    public AnonymousClass1D5 version_;

    static {
        AnonymousClass1D6 r1 = new AnonymousClass1D6();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1D6.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[7];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "os_";
                objArr[2] = "version_";
                objArr[3] = "platformType_";
                objArr[4] = AnonymousClass3B7.A00;
                objArr[5] = "requireFullSync_";
                objArr[6] = "historySyncConfig_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဉ\u0004", objArr);
            case 3:
                return new AnonymousClass1D6();
            case 4:
                return new C198515p();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1D6.class) {
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

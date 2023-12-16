package X;

/* renamed from: X.1Bz  reason: invalid class name and case insensitive filesystem */
public final class C21481Bz extends C130786cX implements C181378mf {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C21481Bz DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int VCARD_FIELD_NUMBER = 16;
    public int bitField0_;
    public AnonymousClass1EF contextInfo_;
    public String displayName_ = "";
    public String vcard_ = "";

    static {
        C21481Bz r1 = new C21481Bz();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21481Bz.class);
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
                A1X[1] = "displayName_";
                A1X[2] = "vcard_";
                A1X[3] = "contextInfo_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0011\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0010ဈ\u0001\u0011ဉ\u0002", A1X);
            case 3:
                return new C21481Bz();
            case 4:
                return new AnonymousClass16T();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21481Bz.class) {
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

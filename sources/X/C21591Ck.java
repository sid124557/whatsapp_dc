package X;

/* renamed from: X.1Ck  reason: invalid class name and case insensitive filesystem */
public final class C21591Ck extends C130786cX implements C181378mf {
    public static final int BUTTON_ID_FIELD_NUMBER = 1;
    public static final int BUTTON_TEXT_FIELD_NUMBER = 2;
    public static final C21591Ck DEFAULT_INSTANCE;
    public static final int NATIVE_FLOW_INFO_FIELD_NUMBER = 4;
    public static volatile C178978iP PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    public int bitField0_;
    public String buttonId_ = "";
    public AnonymousClass1AI buttonText_;
    public AnonymousClass1BB nativeFlowInfo_;
    public int type_;

    static {
        C21591Ck r1 = new C21591Ck();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21591Ck.class);
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
                A1Z[1] = "buttonId_";
                A1Z[2] = "buttonText_";
                A1Z[3] = "type_";
                A1Z[4] = AnonymousClass3BJ.A00;
                A1Z[5] = "nativeFlowInfo_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003", A1Z);
            case 3:
                return new C21591Ck();
            case 4:
                return new AnonymousClass16K();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21591Ck.class) {
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

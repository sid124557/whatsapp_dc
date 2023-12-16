package X;

/* renamed from: X.1Ci  reason: invalid class name and case insensitive filesystem */
public final class C21571Ci extends C130786cX implements C181378mf {
    public static final C21571Ci DEFAULT_INSTANCE;
    public static final int LOCATION_FIELD_NUMBER = 2;
    public static final int NEWSLETTER_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER = null;
    public static final int POLYGONVERTICES_FIELD_NUMBER = 1;
    public static final int SHOULD_SKIP_CONFIRMATION_FIELD_NUMBER = 4;
    public int actionCase_ = 0;
    public Object action_;
    public int bitField0_;
    public C188248ya polygonVertices_ = C130236bd.A02;
    public boolean shouldSkipConfirmation_;

    static {
        C21571Ci r1 = new C21571Ci();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21571Ci.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[8];
                objArr[0] = "action_";
                AnonymousClass0x2.A1W(objArr, "actionCase_");
                objArr[3] = "polygonVertices_";
                objArr[4] = C21641Cp.class;
                objArr[5] = C21461Bx.class;
                objArr[6] = AnonymousClass1D9.class;
                objArr[7] = "shouldSkipConfirmation_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ြ\u0000\u0003ြ\u0000\u0004ဇ\u0002", objArr);
            case 3:
                return new C21571Ci();
            case 4:
                return new AnonymousClass168();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21571Ci.class) {
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

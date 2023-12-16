package X;

/* renamed from: X.1Cb  reason: invalid class name and case insensitive filesystem */
public final class C21501Cb extends C130786cX implements C181378mf {
    public static final int CALL_BUTTON_FIELD_NUMBER = 3;
    public static final C21501Cb DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 4;
    public static volatile C178978iP PARSER = null;
    public static final int QUICK_REPLY_BUTTON_FIELD_NUMBER = 1;
    public static final int URL_BUTTON_FIELD_NUMBER = 2;
    public int bitField0_;
    public int buttonCase_ = 0;
    public Object button_;
    public int index_;

    static {
        C21501Cb r1 = new C21501Cb();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21501Cb.class);
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
                objArr[0] = "button_";
                AnonymousClass0x2.A1W(objArr, "buttonCase_");
                objArr[3] = AnonymousClass1BS.class;
                objArr[4] = AnonymousClass1BT.class;
                objArr[5] = AnonymousClass1BR.class;
                objArr[6] = "index_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဋ\u0003", objArr);
            case 3:
                return new C21501Cb();
            case 4:
                return new C201917a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21501Cb.class) {
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

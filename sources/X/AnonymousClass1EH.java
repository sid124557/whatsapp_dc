package X;

/* renamed from: X.1EH  reason: invalid class name */
public final class AnonymousClass1EH extends C130786cX implements C181378mf {
    public static final int CALL_BUTTON_FIELD_NUMBER = 3;
    public static final AnonymousClass1EH DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 4;
    public static volatile C178978iP PARSER = null;
    public static final int QUICK_REPLY_BUTTON_FIELD_NUMBER = 1;
    public static final int URL_BUTTON_FIELD_NUMBER = 2;
    public int bitField0_;
    public int hydratedButtonCase_ = 0;
    public Object hydratedButton_;
    public int index_;

    static {
        AnonymousClass1EH r1 = new AnonymousClass1EH();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EH.class);
    }

    public C21561Ch A0M() {
        if (this.hydratedButtonCase_ == 2) {
            return (C21561Ch) this.hydratedButton_;
        }
        return C21561Ch.DEFAULT_INSTANCE;
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
                objArr[0] = "hydratedButton_";
                AnonymousClass0x2.A1W(objArr, "hydratedButtonCase_");
                objArr[3] = AnonymousClass1B8.class;
                objArr[4] = C21561Ch.class;
                objArr[5] = AnonymousClass1B7.class;
                objArr[6] = "index_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဋ\u0003", objArr);
            case 3:
                return new AnonymousClass1EH();
            case 4:
                return new AnonymousClass164();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EH.class) {
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

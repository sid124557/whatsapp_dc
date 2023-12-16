package X;

/* renamed from: X.1DG  reason: invalid class name */
public final class AnonymousClass1DG extends C130786cX implements C181378mf {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 5;
    public static final AnonymousClass1DG DEFAULT_INSTANCE;
    public static final int ENC_KEY_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER = null;
    public static final int SELECTABLE_OPTIONS_COUNT_FIELD_NUMBER = 4;
    public int bitField0_;
    public AnonymousClass1EF contextInfo_;
    public C172548Lq encKey_ = C172548Lq.A01;
    public String name_ = "";
    public C188248ya options_ = C130236bd.A02;
    public int selectableOptionsCount_;

    static {
        AnonymousClass1DG r1 = new AnonymousClass1DG();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DG.class);
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
                objArr[1] = "encKey_";
                objArr[2] = "name_";
                objArr[3] = "options_";
                objArr[4] = AnonymousClass1AU.class;
                objArr[5] = "selectableOptionsCount_";
                objArr[6] = "contextInfo_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဋ\u0002\u0005ဉ\u0003", objArr);
            case 3:
                return new AnonymousClass1DG();
            case 4:
                return new AnonymousClass17H();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DG.class) {
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

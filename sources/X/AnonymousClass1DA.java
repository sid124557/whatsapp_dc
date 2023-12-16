package X;

/* renamed from: X.1DA  reason: invalid class name */
public final class AnonymousClass1DA extends C130786cX implements C181378mf {
    public static final AnonymousClass1DA DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 2;
    public static final int KIND_NEGATIVE_FIELD_NUMBER = 4;
    public static final int KIND_POSITIVE_FIELD_NUMBER = 5;
    public static final int MESSAGE_KEY_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 3;
    public int bitField0_;
    public long kindNegative_;
    public long kindPositive_;
    public int kind_;
    public AnonymousClass1ET messageKey_;
    public String text_ = "";

    static {
        AnonymousClass1DA r1 = new AnonymousClass1DA();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DA.class);
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
                objArr[1] = "messageKey_";
                objArr[2] = "kind_";
                objArr[3] = AnonymousClass3BI.A00;
                objArr[4] = "text_";
                objArr[5] = "kindNegative_";
                objArr[6] = "kindPositive_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", objArr);
            case 3:
                return new AnonymousClass1DA();
            case 4:
                return new AnonymousClass16J();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DA.class) {
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

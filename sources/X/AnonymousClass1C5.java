package X;

/* renamed from: X.1C5  reason: invalid class name */
public final class AnonymousClass1C5 extends C130786cX implements C181378mf {
    public static final int CURRENCY_FIELD_NUMBER = 2;
    public static final int DATE_TIME_FIELD_NUMBER = 3;
    public static final int DEFAULT_FIELD_NUMBER = 1;
    public static final AnonymousClass1C5 DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public String default_ = "";
    public int paramOneofCase_ = 0;
    public Object paramOneof_;

    static {
        AnonymousClass1C5 r1 = new AnonymousClass1C5();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1C5.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[6];
                objArr[0] = "paramOneof_";
                AnonymousClass0x2.A1W(objArr, "paramOneofCase_");
                objArr[3] = "default_";
                objArr[4] = AnonymousClass1BF.class;
                objArr[5] = C130636cI.class;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ြ\u0000\u0003ြ\u0000", objArr);
            case 3:
                return new AnonymousClass1C5();
            case 4:
                return new C199716e();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1C5.class) {
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

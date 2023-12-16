package X;

/* renamed from: X.1DM  reason: invalid class name */
public final class AnonymousClass1DM extends C130786cX implements C181378mf {
    public static final AnonymousClass1DM DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int PRIMARY_FIELD_NUMBER = 1;
    public static final int QUATERNARY_FIELD_NUMBER = 4;
    public static final int QUINARY_FIELD_NUMBER = 5;
    public static final int SECONDARY_FIELD_NUMBER = 2;
    public static final int TERTIARY_FIELD_NUMBER = 3;
    public int bitField0_;
    public int primary_;
    public int quaternary_;
    public int quinary_;
    public int secondary_;
    public int tertiary_;

    static {
        AnonymousClass1DM r1 = new AnonymousClass1DM();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DM.class);
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
                A1Z[1] = "primary_";
                A1Z[2] = "secondary_";
                A1Z[3] = "tertiary_";
                A1Z[4] = "quaternary_";
                A1Z[5] = "quinary_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", A1Z);
            case 3:
                return new AnonymousClass1DM();
            case 4:
                return new C206818x();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DM.class) {
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

package X;

/* renamed from: X.1D7  reason: invalid class name */
public final class AnonymousClass1D7 extends C130786cX implements C181378mf {
    public static final int ACTION_FIELD_NUMBER = 3;
    public static final int BEHAVIOR_GRAPH_FIELD_NUMBER = 2;
    public static final AnonymousClass1D7 DEFAULT_INSTANCE;
    public static final int INTENSITY_FIELD_NUMBER = 4;
    public static volatile C178978iP PARSER = null;
    public static final int SENTIMENT_FIELD_NUMBER = 1;
    public static final int WORD_COUNT_FIELD_NUMBER = 5;
    public int action_;
    public String behaviorGraph_ = "";
    public int bitField0_;
    public int intensity_;
    public int sentiment_;
    public int wordCount_;

    static {
        AnonymousClass1D7 r1 = new AnonymousClass1D7();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1D7.class);
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
                A1Z[1] = "sentiment_";
                A1Z[2] = "behaviorGraph_";
                A1Z[3] = "action_";
                A1Z[4] = "intensity_";
                A1Z[5] = "wordCount_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", A1Z);
            case 3:
                return new AnonymousClass1D7();
            case 4:
                return new C198815s();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1D7.class) {
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

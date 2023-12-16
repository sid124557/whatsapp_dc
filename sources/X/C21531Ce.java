package X;

/* renamed from: X.1Ce  reason: invalid class name and case insensitive filesystem */
public final class C21531Ce extends C130786cX implements C181378mf {
    public static final int CLAUSES_FIELD_NUMBER = 2;
    public static final int CLAUSE_TYPE_FIELD_NUMBER = 1;
    public static final C21531Ce DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public int clauseType_ = 1;
    public C188248ya clauses_;
    public C188248ya filters_;
    public byte memoizedIsInitialized = 2;

    static {
        C21531Ce r1 = new C21531Ce();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21531Ce.class);
    }

    public C21531Ce() {
        C130236bd r0 = C130236bd.A02;
        this.clauses_ = r0;
        this.filters_ = r0;
    }

    public final Object A0J(C141056ux r5, Object obj, Object obj2) {
        C178978iP r0;
        int i = 1;
        switch (r5.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0003\u0001ᔌ\u0000\u0002Л\u0003Л", new Object[]{"bitField0_", "clauseType_", C63983Bq.A00, "clauses_", C21531Ce.class, "filters_", C130676cM.class});
            case 3:
                return new C21531Ce();
            case 4:
                return new AnonymousClass181();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21531Ce.class) {
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

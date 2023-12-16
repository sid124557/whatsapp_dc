package X;

/* renamed from: X.1Br  reason: invalid class name and case insensitive filesystem */
public final class C21401Br extends C130786cX implements C181378mf {
    public static final C21401Br DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int RANK_FIELD_NUMBER = 2;
    public static final int USER_JID_FIELD_NUMBER = 1;
    public int bitField0_;
    public byte memoizedIsInitialized = 2;
    public int rank_;
    public String userJid_ = "";

    static {
        C21401Br r1 = new C21401Br();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21401Br.class);
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
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "userJid_", "rank_", C63913Bj.A00});
            case 3:
                return new C21401Br();
            case 4:
                return new C202817j();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21401Br.class) {
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

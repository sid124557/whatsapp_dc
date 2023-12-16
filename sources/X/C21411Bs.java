package X;

/* renamed from: X.1Bs  reason: invalid class name and case insensitive filesystem */
public final class C21411Bs extends C130786cX implements C181378mf {
    public static final C21411Bs DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    public static final int MSG_ORDER_ID_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public byte memoizedIsInitialized = 2;
    public AnonymousClass1ES message_;
    public long msgOrderId_;

    static {
        C21411Bs r1 = new C21411Bs();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21411Bs.class);
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
                Object[] A1X = AnonymousClass0x9.A1X();
                A1X[0] = "bitField0_";
                A1X[1] = "message_";
                A1X[2] = "msgOrderId_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဃ\u0001", A1X);
            case 3:
                return new C21411Bs();
            case 4:
                return new C202917k();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21411Bs.class) {
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

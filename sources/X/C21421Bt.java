package X;

/* renamed from: X.1Bt  reason: invalid class name and case insensitive filesystem */
public final class C21421Bt extends C130786cX implements C181378mf {
    public static final int BR_METADATA_FIELD_NUMBER = 2;
    public static final C21421Bt DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int UPI_METADATA_FIELD_NUMBER = 1;
    public int bitField0_;
    public byte memoizedIsInitialized = 2;
    public int metadataValueCase_ = 0;
    public Object metadataValue_;

    static {
        C21421Bt r1 = new C21421Bt();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21421Bt.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        int i = 1;
        switch (r4.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                Object[] objArr = new Object[5];
                objArr[0] = "metadataValue_";
                AnonymousClass0x2.A1W(objArr, "metadataValueCase_");
                objArr[3] = AnonymousClass1DZ.class;
                objArr[4] = AnonymousClass1AX.class;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐼ\u0000\u0002ြ\u0000", objArr);
            case 3:
                return new C21421Bt();
            case 4:
                return new C204217x();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21421Bt.class) {
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

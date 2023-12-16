package X;

/* renamed from: X.1DU  reason: invalid class name */
public final class AnonymousClass1DU extends C130786cX implements C181378mf {
    public static final int BODY_FIELD_NUMBER = 5;
    public static final int BUSINESS_OWNER_JID_FIELD_NUMBER = 2;
    public static final int CATALOG_FIELD_NUMBER = 4;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final AnonymousClass1DU DEFAULT_INSTANCE;
    public static final int FOOTER_FIELD_NUMBER = 6;
    public static volatile C178978iP PARSER = null;
    public static final int PRODUCT_FIELD_NUMBER = 1;
    public int bitField0_;
    public String body_ = "";
    public String businessOwnerJid_ = "";
    public AnonymousClass1CF catalog_;
    public AnonymousClass1EF contextInfo_;
    public String footer_ = "";
    public C21951Du product_;

    static {
        AnonymousClass1DU r1 = new AnonymousClass1DU();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DU.class);
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
                objArr[1] = "product_";
                objArr[2] = "businessOwnerJid_";
                objArr[3] = "catalog_";
                objArr[4] = "body_";
                objArr[5] = "footer_";
                objArr[6] = "contextInfo_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0011ဉ\u0005", objArr);
            case 3:
                return new AnonymousClass1DU();
            case 4:
                return new AnonymousClass17L();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DU.class) {
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

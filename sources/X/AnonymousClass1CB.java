package X;

/* renamed from: X.1CB  reason: invalid class name */
public final class AnonymousClass1CB extends C130786cX implements C181378mf {
    public static final int BUSINESS_OWNER_JID_FIELD_NUMBER = 3;
    public static final AnonymousClass1CB DEFAULT_INSTANCE;
    public static final int HEADER_IMAGE_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER = null;
    public static final int PRODUCT_SECTIONS_FIELD_NUMBER = 1;
    public int bitField0_;
    public String businessOwnerJid_ = "";
    public AnonymousClass1BJ headerImage_;
    public C188248ya productSections_ = C130236bd.A02;

    static {
        AnonymousClass1CB r1 = new AnonymousClass1CB();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1CB.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Y = C18270x1.A1Y();
                A1Y[1] = "productSections_";
                A1Y[2] = AnonymousClass1BK.class;
                A1Y[3] = "headerImage_";
                A1Y[4] = "businessOwnerJid_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဈ\u0001", A1Y);
            case 3:
                return new AnonymousClass1CB();
            case 4:
                return new C201516w();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1CB.class) {
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

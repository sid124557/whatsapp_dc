package X;

/* renamed from: X.1Az  reason: invalid class name and case insensitive filesystem */
public final class C21221Az extends C130786cX implements C181378mf {
    public static final C21221Az DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int SERVER_CAMPAIGN_ID_FIELD_NUMBER = 1;
    public int bitField0_;
    public String serverCampaignId_ = "";

    static {
        C21221Az r1 = new C21221Az();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21221Az.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1a = C18260x0.A1a();
                A1a[1] = "serverCampaignId_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", A1a);
            case 3:
                return new C21221Az();
            case 4:
                return new AnonymousClass19F();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21221Az.class) {
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

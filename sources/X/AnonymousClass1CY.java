package X;

/* renamed from: X.1CY  reason: invalid class name */
public final class AnonymousClass1CY extends C130786cX implements C181378mf {
    public static final AnonymousClass1CY DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int SENDERCHAINKEYS_FIELD_NUMBER = 2;
    public static final int SENDERKEYID_FIELD_NUMBER = 1;
    public static final int SENDERSIGNINGKEY_FIELD_NUMBER = 3;
    public int bitField0_;
    public C188248ya senderChainKeys_ = C130236bd.A02;
    public int senderKeyId_;
    public C21381Bp senderSigningKey_;

    static {
        AnonymousClass1CY r1 = new AnonymousClass1CY();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1CY.class);
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
                A1Y[1] = "senderKeyId_";
                A1Y[2] = "senderChainKeys_";
                A1Y[3] = C21361Bn.class;
                A1Y[4] = "senderSigningKey_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဋ\u0000\u0002\u001b\u0003ဉ\u0001", A1Y);
            case 3:
                return new AnonymousClass1CY();
            case 4:
                return new C207919i();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1CY.class) {
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

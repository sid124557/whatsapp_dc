package X;

/* renamed from: X.1Cx  reason: invalid class name and case insensitive filesystem */
public final class C21721Cx extends C130786cX implements C181378mf {
    public static final C21721Cx DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int SENDERCHAINKEY_FIELD_NUMBER = 2;
    public static final int SENDERKEYID_FIELD_NUMBER = 1;
    public static final int SENDERMESSAGEKEYS_FIELD_NUMBER = 4;
    public static final int SENDERSIGNINGKEY_FIELD_NUMBER = 3;
    public int bitField0_;
    public C21361Bn senderChainKey_;
    public int senderKeyId_;
    public C188248ya senderMessageKeys_ = C130236bd.A02;
    public C21381Bp senderSigningKey_;

    static {
        C21721Cx r1 = new C21721Cx();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21721Cx.class);
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
                A1Z[1] = "senderKeyId_";
                A1Z[2] = "senderChainKey_";
                A1Z[3] = "senderSigningKey_";
                A1Z[4] = "senderMessageKeys_";
                A1Z[5] = C21371Bo.class;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", A1Z);
            case 3:
                return new C21721Cx();
            case 4:
                return new AnonymousClass19U();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21721Cx.class) {
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

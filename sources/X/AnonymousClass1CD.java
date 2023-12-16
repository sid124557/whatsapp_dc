package X;

/* renamed from: X.1CD  reason: invalid class name */
public final class AnonymousClass1CD extends C130786cX implements C181378mf {
    public static final AnonymousClass1CD DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int PEER_DATA_OPERATION_REQUEST_TYPE_FIELD_NUMBER = 1;
    public static final int PEER_DATA_OPERATION_RESULT_FIELD_NUMBER = 3;
    public static final int STANZA_ID_FIELD_NUMBER = 2;
    public int bitField0_;
    public int peerDataOperationRequestType_;
    public C188248ya peerDataOperationResult_ = C130236bd.A02;
    public String stanzaId_ = "";

    static {
        AnonymousClass1CD r1 = new AnonymousClass1CD();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1CD.class);
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
                A1Z[1] = "peerDataOperationRequestType_";
                A1Z[2] = C63833Bb.A00;
                A1Z[3] = "stanzaId_";
                A1Z[4] = "peerDataOperationResult_";
                A1Z[5] = C21611Cm.class;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003\u001b", A1Z);
            case 3:
                return new AnonymousClass1CD();
            case 4:
                return new C207319c();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1CD.class) {
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

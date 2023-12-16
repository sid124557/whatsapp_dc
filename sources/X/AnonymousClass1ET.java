package X;

/* renamed from: X.1ET  reason: invalid class name */
public final class AnonymousClass1ET extends C130786cX implements C181378mf {
    public static final AnonymousClass1ET DEFAULT_INSTANCE;
    public static final int FROM_ME_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 4;
    public static final int REMOTE_JID_FIELD_NUMBER = 1;
    public int bitField0_;
    public boolean fromMe_;
    public String id_ = "";
    public String participant_ = "";
    public String remoteJid_ = "";

    static {
        AnonymousClass1ET r1 = new AnonymousClass1ET();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1ET.class);
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
                A1Y[1] = "remoteJid_";
                A1Y[2] = "fromMe_";
                A1Y[3] = "id_";
                A1Y[4] = "participant_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", A1Y);
            case 3:
                return new AnonymousClass1ET();
            case 4:
                return new AnonymousClass1A1();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1ET.class) {
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

package X;

/* renamed from: X.1BV  reason: invalid class name */
public final class AnonymousClass1BV extends C130786cX implements C181378mf {
    public static final AnonymousClass1BV DEFAULT_INSTANCE;
    public static final int GROUP_JID_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int PAST_PARTICIPANTS_FIELD_NUMBER = 2;
    public int bitField0_;
    public String groupJid_ = "";
    public C188248ya pastParticipants_ = C130236bd.A02;

    static {
        AnonymousClass1BV r1 = new AnonymousClass1BV();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1BV.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1X = C18270x1.A1X();
                A1X[1] = "groupJid_";
                A1X[2] = "pastParticipants_";
                A1X[3] = AnonymousClass1CJ.class;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", A1X);
            case 3:
                return new AnonymousClass1BV();
            case 4:
                return new C203217n();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1BV.class) {
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

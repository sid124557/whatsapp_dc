package X;

/* renamed from: X.1EV  reason: invalid class name */
public final class AnonymousClass1EV extends C130786cX implements C85234Fl {
    public static final int CALL_OUTCOME_FIELD_NUMBER = 2;
    public static final AnonymousClass1EV DEFAULT_INSTANCE;
    public static final int JID_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public int callOutcome_;
    public String jid_ = "";

    static {
        AnonymousClass1EV r1 = new AnonymousClass1EV();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EV.class);
    }

    public AnonymousClass23K B59() {
        AnonymousClass23K A00 = AnonymousClass23K.A00(this.callOutcome_);
        if (A00 == null) {
            return AnonymousClass23K.CONNECTED;
        }
        return A00;
    }

    public boolean BFB() {
        return AnonymousClass000.A1S(this.bitField0_ & 2);
    }

    public boolean BFH() {
        return AnonymousClass0x2.A1X(this.bitField0_);
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
                A1X[1] = "jid_";
                A1X[2] = "callOutcome_";
                A1X[3] = AnonymousClass3BM.A00;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", A1X);
            case 3:
                return new AnonymousClass1EV();
            case 4:
                return new AnonymousClass1A5();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EV.class) {
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

    public String B8p() {
        return this.jid_;
    }
}

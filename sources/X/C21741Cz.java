package X;

/* renamed from: X.1Cz  reason: invalid class name and case insensitive filesystem */
public final class C21741Cz extends C130786cX implements C181378mf {
    public static final int CHAINKEY_FIELD_NUMBER = 3;
    public static final C21741Cz DEFAULT_INSTANCE;
    public static final int MESSAGEKEYS_FIELD_NUMBER = 4;
    public static volatile C178978iP PARSER = null;
    public static final int SENDERRATCHETKEYPRIVATE_FIELD_NUMBER = 2;
    public static final int SENDERRATCHETKEY_FIELD_NUMBER = 1;
    public int bitField0_;
    public C21391Bq chainKey_;
    public C188248ya messageKeys_ = C130236bd.A02;
    public C172548Lq senderRatchetKeyPrivate_;
    public C172548Lq senderRatchetKey_;

    static {
        C21741Cz r1 = new C21741Cz();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21741Cz.class);
    }

    public C21741Cz() {
        C172548Lq r0 = C172548Lq.A01;
        this.senderRatchetKey_ = r0;
        this.senderRatchetKeyPrivate_ = r0;
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
                A1Z[1] = "senderRatchetKey_";
                A1Z[2] = "senderRatchetKeyPrivate_";
                A1Z[3] = "chainKey_";
                A1Z[4] = "messageKeys_";
                A1Z[5] = C21731Cy.class;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004\u001b", A1Z);
            case 3:
                return new C21741Cz();
            case 4:
                return new C208219l();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21741Cz.class) {
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

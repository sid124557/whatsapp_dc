package X;

/* renamed from: X.1E1  reason: invalid class name */
public final class AnonymousClass1E1 extends C130786cX implements C181378mf {
    public static final int ALICEBASEKEY_FIELD_NUMBER = 13;
    public static final AnonymousClass1E1 DEFAULT_INSTANCE;
    public static final int LOCALIDENTITYPUBLIC_FIELD_NUMBER = 2;
    public static final int LOCALREGISTRATIONID_FIELD_NUMBER = 11;
    public static final int NEEDSREFRESH_FIELD_NUMBER = 12;
    public static volatile C178978iP PARSER = null;
    public static final int PENDINGKEYEXCHANGE_FIELD_NUMBER = 8;
    public static final int PENDINGPREKEY_FIELD_NUMBER = 9;
    public static final int PREVIOUSCOUNTER_FIELD_NUMBER = 5;
    public static final int RECEIVERCHAINS_FIELD_NUMBER = 7;
    public static final int REMOTEIDENTITYPUBLIC_FIELD_NUMBER = 3;
    public static final int REMOTEREGISTRATIONID_FIELD_NUMBER = 10;
    public static final int ROOTKEY_FIELD_NUMBER = 4;
    public static final int SENDERCHAIN_FIELD_NUMBER = 6;
    public static final int SESSIONVERSION_FIELD_NUMBER = 1;
    public C172548Lq aliceBaseKey_;
    public int bitField0_;
    public C172548Lq localIdentityPublic_;
    public int localRegistrationId_;
    public boolean needsRefresh_;
    public C130696cO pendingKeyExchange_;
    public C21491Ca pendingPreKey_;
    public int previousCounter_;
    public C188248ya receiverChains_ = C130236bd.A02;
    public C172548Lq remoteIdentityPublic_;
    public int remoteRegistrationId_;
    public C172548Lq rootKey_;
    public C21741Cz senderChain_;
    public int sessionVersion_;

    static {
        AnonymousClass1E1 r1 = new AnonymousClass1E1();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1E1.class);
    }

    public AnonymousClass1E1() {
        C172548Lq r1 = C172548Lq.A01;
        this.localIdentityPublic_ = r1;
        this.remoteIdentityPublic_ = r1;
        this.rootKey_ = r1;
        this.aliceBaseKey_ = r1;
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[15];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "sessionVersion_";
                objArr[2] = "localIdentityPublic_";
                objArr[3] = "remoteIdentityPublic_";
                objArr[4] = "rootKey_";
                objArr[5] = "previousCounter_";
                objArr[6] = "senderChain_";
                objArr[7] = "receiverChains_";
                objArr[8] = C21741Cz.class;
                objArr[9] = "pendingKeyExchange_";
                objArr[10] = "pendingPreKey_";
                objArr[11] = "remoteRegistrationId_";
                objArr[12] = "localRegistrationId_";
                objArr[13] = "needsRefresh_";
                objArr[14] = "aliceBaseKey_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဋ\u0004\u0006ဉ\u0005\u0007\u001b\bဉ\u0006\tဉ\u0007\nဋ\b\u000bဋ\t\fဇ\n\rည\u000b", objArr);
            case 3:
                return new AnonymousClass1E1();
            case 4:
                return new C208119k();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1E1.class) {
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

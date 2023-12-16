package X;

/* renamed from: X.1DY  reason: invalid class name */
public final class AnonymousClass1DY extends C130786cX implements C181378mf {
    public static final int BASEKEY_FIELD_NUMBER = 2;
    public static final AnonymousClass1DY DEFAULT_INSTANCE;
    public static final int IDENTITYKEY_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 4;
    public static volatile C178978iP PARSER = null;
    public static final int PREKEYID_FIELD_NUMBER = 1;
    public static final int REGISTRATIONID_FIELD_NUMBER = 5;
    public static final int SIGNEDPREKEYID_FIELD_NUMBER = 6;
    public C172548Lq baseKey_;
    public int bitField0_;
    public C172548Lq identityKey_;
    public C172548Lq message_;
    public int preKeyId_;
    public int registrationId_;
    public int signedPreKeyId_;

    static {
        AnonymousClass1DY r1 = new AnonymousClass1DY();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DY.class);
    }

    public AnonymousClass1DY() {
        C172548Lq r0 = C172548Lq.A01;
        this.baseKey_ = r0;
        this.identityKey_ = r0;
        this.message_ = r0;
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[7];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "preKeyId_";
                objArr[2] = "baseKey_";
                objArr[3] = "identityKey_";
                objArr[4] = "message_";
                objArr[5] = "registrationId_";
                objArr[6] = "signedPreKeyId_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဋ\u0001\u0002ည\u0003\u0003ည\u0004\u0004ည\u0005\u0005ဋ\u0000\u0006ဋ\u0002", objArr);
            case 3:
                return new AnonymousClass1DY();
            case 4:
                return new AnonymousClass19N();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DY.class) {
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

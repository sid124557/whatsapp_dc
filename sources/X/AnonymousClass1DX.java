package X;

/* renamed from: X.1DX  reason: invalid class name */
public final class AnonymousClass1DX extends C130786cX implements C181378mf {
    public static final int CLIENT_TIMESTAMP_MS_FIELD_NUMBER = 5;
    public static final AnonymousClass1DX DEFAULT_INSTANCE;
    public static final int DEVICE_JID_FIELD_NUMBER = 4;
    public static final int KEEP_TYPE_FIELD_NUMBER = 1;
    public static final int KEY_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER = null;
    public static final int SERVER_TIMESTAMP_FIELD_NUMBER = 2;
    public static final int SERVER_TIMESTAMP_MS_FIELD_NUMBER = 6;
    public int bitField0_;
    public long clientTimestampMs_;
    public String deviceJid_ = "";
    public int keepType_;
    public AnonymousClass1ET key_;
    public long serverTimestampMs_;
    public long serverTimestamp_;

    static {
        AnonymousClass1DX r1 = new AnonymousClass1DX();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DX.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[8];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "keepType_";
                objArr[2] = AnonymousClass3BG.A00;
                objArr[3] = "serverTimestamp_";
                objArr[4] = "key_";
                objArr[5] = "deviceJid_";
                objArr[6] = "clientTimestampMs_";
                objArr[7] = "serverTimestampMs_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", objArr);
            case 3:
                return new AnonymousClass1DX();
            case 4:
                return new AnonymousClass196();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DX.class) {
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

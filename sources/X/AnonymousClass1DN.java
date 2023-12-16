package X;

/* renamed from: X.1DN  reason: invalid class name */
public final class AnonymousClass1DN extends C130786cX implements C181378mf {
    public static final AnonymousClass1DN DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    public static final int MESSAGE_ADD_ON_CONTEXT_INFO_FIELD_NUMBER = 5;
    public static volatile C178978iP PARSER = null;
    public static final int SENDER_TIMESTAMP_MS_FIELD_NUMBER = 3;
    public static final int SERVER_TIMESTAMP_MS_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 1;
    public int bitField0_;
    public AnonymousClass1ET key_;
    public C21201Ax messageAddOnContextInfo_;
    public long senderTimestampMs_;
    public long serverTimestampMs_;
    public int type_;

    static {
        AnonymousClass1DN r1 = new AnonymousClass1DN();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DN.class);
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
                objArr[1] = "type_";
                objArr[2] = AnonymousClass3CA.A00;
                objArr[3] = "key_";
                objArr[4] = "senderTimestampMs_";
                objArr[5] = "serverTimestampMs_";
                objArr[6] = "messageAddOnContextInfo_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဉ\u0004", objArr);
            case 3:
                return new AnonymousClass1DN();
            case 4:
                return new AnonymousClass19C();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DN.class) {
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

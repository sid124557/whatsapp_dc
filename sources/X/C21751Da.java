package X;

/* renamed from: X.1Da  reason: invalid class name and case insensitive filesystem */
public final class C21751Da extends C130786cX implements C181378mf {
    public static final C21751Da DEFAULT_INSTANCE;
    public static final int DELIVERED_DEVICE_JID_FIELD_NUMBER = 6;
    public static volatile C178978iP PARSER = null;
    public static final int PENDING_DEVICE_JID_FIELD_NUMBER = 5;
    public static final int PLAYED_TIMESTAMP_FIELD_NUMBER = 4;
    public static final int READ_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int RECEIPT_TIMESTAMP_FIELD_NUMBER = 2;
    public static final int USER_JID_FIELD_NUMBER = 1;
    public int bitField0_;
    public C188248ya deliveredDeviceJid_;
    public byte memoizedIsInitialized = 2;
    public C188248ya pendingDeviceJid_;
    public long playedTimestamp_;
    public long readTimestamp_;
    public long receiptTimestamp_;
    public String userJid_ = "";

    static {
        C21751Da r1 = new C21751Da();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21751Da.class);
    }

    public C21751Da() {
        C130236bd r0 = C130236bd.A02;
        this.pendingDeviceJid_ = r0;
        this.deliveredDeviceJid_ = r0;
    }

    public final Object A0J(C141056ux r5, Object obj, Object obj2) {
        C178978iP r0;
        int i = 1;
        switch (r5.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0001\u0001ᔈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a", new Object[]{"bitField0_", "userJid_", "receiptTimestamp_", "readTimestamp_", "playedTimestamp_", "pendingDeviceJid_", "deliveredDeviceJid_"});
            case 3:
                return new C21751Da();
            case 4:
                return new AnonymousClass19J();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21751Da.class) {
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

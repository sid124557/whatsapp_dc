package X;

/* renamed from: X.1D1  reason: invalid class name */
public final class AnonymousClass1D1 extends C130786cX implements C181378mf {
    public static final AnonymousClass1D1 DEFAULT_INSTANCE;
    public static final int EDIT_TARGET_ID_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER = null;
    public static final int TARGET_CHAT_JID_FIELD_NUMBER = 3;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    public static final int TARGET_SENDER_JID_FIELD_NUMBER = 4;
    public int bitField0_;
    public String editTargetId_ = "";
    public byte memoizedIsInitialized = 2;
    public String targetChatJid_ = "";
    public String targetId_ = "";
    public String targetSenderJid_ = "";

    static {
        AnonymousClass1D1 r1 = new AnonymousClass1D1();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1D1.class);
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
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "targetId_", "editTargetId_", "targetChatJid_", "targetSenderJid_"});
            case 3:
                return new AnonymousClass1D1();
            case 4:
                return new C202317e();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1D1.class) {
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

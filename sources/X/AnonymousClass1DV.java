package X;

/* renamed from: X.1DV  reason: invalid class name */
public final class AnonymousClass1DV extends C130786cX implements C181378mf {
    public static final int CALL_VIBRATE_FIELD_NUMBER = 6;
    public static final AnonymousClass1DV DEFAULT_INSTANCE;
    public static final int LOW_PRIORITY_NOTIFICATIONS_FIELD_NUMBER = 4;
    public static final int MESSAGE_LIGHT_FIELD_NUMBER = 3;
    public static final int MESSAGE_POPUP_FIELD_NUMBER = 2;
    public static final int MESSAGE_VIBRATE_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int REACTIONS_MUTED_FIELD_NUMBER = 5;
    public int bitField0_;
    public String callVibrate_ = "";
    public boolean lowPriorityNotifications_;
    public String messageLight_ = "";
    public String messagePopup_ = "";
    public String messageVibrate_ = "";
    public boolean reactionsMuted_;

    static {
        AnonymousClass1DV r1 = new AnonymousClass1DV();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DV.class);
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
                objArr[1] = "messageVibrate_";
                objArr[2] = "messagePopup_";
                objArr[3] = "messageLight_";
                objArr[4] = "lowPriorityNotifications_";
                objArr[5] = "reactionsMuted_";
                objArr[6] = "callVibrate_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဈ\u0005", objArr);
            case 3:
                return new AnonymousClass1DV();
            case 4:
                return new C203017l();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DV.class) {
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

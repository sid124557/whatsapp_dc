package X;

/* renamed from: X.1EP  reason: invalid class name */
public final class AnonymousClass1EP extends C130786cX implements C181378mf {
    public static final AnonymousClass1EP DEFAULT_INSTANCE;
    public static final int INITIATED_BY_ME_FIELD_NUMBER = 4;
    public static final int INITIATOR_DEVICE_JID_FIELD_NUMBER = 3;
    public static final int INITIATOR_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int TRIGGER_FIELD_NUMBER = 2;
    public int bitField0_;
    public boolean initiatedByMe_;
    public String initiatorDeviceJid_ = "";
    public int initiator_;
    public int trigger_;

    static {
        AnonymousClass1EP r1 = new AnonymousClass1EP();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EP.class);
    }

    @Deprecated
    public C374922v A0M() {
        int i = this.initiator_;
        if (i != 0) {
            if (i == 1) {
                return C374922v.INITIATED_BY_ME;
            }
            if (i == 2) {
                return C374922v.INITIATED_BY_OTHER;
            }
            if (i == 3) {
                return C374922v.CHANGED_TO_COEX;
            }
        }
        return C374922v.CHANGED_IN_CHAT;
    }

    public C375022w A0N() {
        int i = this.trigger_;
        if (i != 0) {
            if (i == 1) {
                return C375022w.CHAT_SETTING;
            }
            if (i == 2) {
                return C375022w.ACCOUNT_SETTING;
            }
            if (i == 3) {
                return C375022w.BULK_CHANGE;
            }
        }
        return C375022w.UNKNOWN;
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
                objArr[1] = "initiator_";
                objArr[2] = AnonymousClass3BD.A00;
                objArr[3] = "trigger_";
                objArr[4] = AnonymousClass3BE.A00;
                objArr[5] = "initiatorDeviceJid_";
                objArr[6] = "initiatedByMe_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", objArr);
            case 3:
                return new AnonymousClass1EP();
            case 4:
                return new C209019t();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EP.class) {
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

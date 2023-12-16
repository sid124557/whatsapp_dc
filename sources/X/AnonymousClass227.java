package X;

/* renamed from: X.227  reason: invalid class name */
public enum AnonymousClass227 {
    A0L(r14, "REGISTRATION_FULL", 0, 0),
    A0B(r14, "INTERACTIVE_FULL", 1, 1),
    A09(r14, "INTERACTIVE_DELTA", 2, 2),
    A03(r14, "BACKGROUND_FULL", 3, 3),
    A02(r14, "BACKGROUND_DELTA", 4, 4),
    A0H(r25, "NOTIFICATION_CONTACT", 5, 5),
    A0D(r25, "INTERACTIVE_QUERY", 6, 6),
    A0J(r29, "NOTIFICATION_SIDELIST", 7, 7),
    A0A(r29, "INTERACTIVE_DELTA_SIDELIST", 8, 8),
    A01(r25, "ADD_QUERY", 9, 9),
    A06(r39, "BACKGROUND_QUERY_PICTURES", 10, 16),
    A07(r39, "BACKGROUND_QUERY_PICTURES_PREVIEW", 11, 17),
    A0K(r39, "OUT_CONTACT_DISCOVERY", 12, 19),
    A08(r39, "CONTACT_DISCOVERY_DELTA", 13, 20),
    A05(r39, "BACKGROUND_MULTI_PROTOCOL_QUERY", 14, 21),
    A04(r39, "BACKGROUND_FULL_MULTI_PROTOCOL_QUERY", 15, 22),
    A0M(r39, "REGISTRATION_FULL_MULTI_PROTOCOL_QUERY", 16, 23),
    A0C(r39, "INTERACTIVE_MULTI_PROTOCOL_QUERY", 17, 24),
    A0G(r39, "MESSAGE_MULTI_PROTOCOL_QUERY", 18, 25),
    A0N(r39, "VOIP_MULTI_PROTOCOL_QUERY", 19, 26),
    A0I(r39, "NOTIFICATION_MULTI_PROTOCOL_QUERY", 20, 27),
    A0F(r39, "LID_MIGRATION_NOTIFICATION_MULTI_PROTOCOL_QUERY", 21, 28),
    A0E(r39, "LID_MIGRATION_MESSAGE_MULTI_PROTOCOL_QUERY", 22, 29);
    
    public final int code;
    public final C373521x context;
    public final AnonymousClass21Z mode;
    public final C370520t scope;

    public static int A00(AnonymousClass3ZH r1, Object obj) {
        if (obj == A06) {
            return r1.A05;
        }
        return r1.A06;
    }

    /* access modifiers changed from: public */
    AnonymousClass227(C370520t r3, String str, int i, int i2) {
        this.context = r1;
        this.mode = r2;
        this.scope = r3;
        this.code = i2;
    }
}

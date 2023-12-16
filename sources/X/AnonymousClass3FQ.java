package X;

/* renamed from: X.3FQ  reason: invalid class name */
public class AnonymousClass3FQ implements AnonymousClass4E8 {
    public final C59982xo A00;
    public final AnonymousClass4FV A01;

    public void BQW() {
        C59982xo r3 = this.A00;
        long A002 = r3.A00("kic_notifications");
        long A003 = r3.A00("kic_group_notifications");
        if (A002 + A003 > 0) {
            AnonymousClass1Z1 r2 = new AnonymousClass1Z1();
            r2.A03 = Long.valueOf(A002);
            r2.A02 = Long.valueOf(r3.A00("kic_notification_taps"));
            r2.A01 = Long.valueOf(A003);
            r2.A00 = Long.valueOf(r3.A00("kic_group_notification_taps"));
            this.A01.BhA(r2);
        }
        C18270x1.A0m(r3.A01());
    }

    public AnonymousClass3FQ(C59982xo r1, AnonymousClass4FV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String BDW() {
        return "KeepInChatEventDailyCron";
    }

    public /* synthetic */ void BQX() {
    }
}

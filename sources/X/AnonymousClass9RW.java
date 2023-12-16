package X;

/* renamed from: X.9RW  reason: invalid class name */
public class AnonymousClass9RW {
    public final C1907099n A00;
    public final AnonymousClass9TZ A01;
    public final C203499no A02;
    public final C160757oG A03 = C160757oG.A00("ErrorMapGatingManager", "payment", "COMMON");

    public AnonymousClass9RW(C1907099n r4, AnonymousClass9TZ r5, C203499no r6) {
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r6;
    }

    public String A00(int i) {
        String str;
        String valueOf = String.valueOf(i);
        if (this.A00.A02.A0X(698)) {
            str = this.A01.A02(valueOf);
        } else {
            str = null;
        }
        C203499no r4 = this.A02;
        if (r4 != null) {
            C134246ig B0d = r4.B0d();
            C1899593h.A1B(B0d, 4);
            B0d.A0b = "error";
            B0d.A0S = valueOf;
            if (str != null) {
                B0d.A0T = str;
            }
            C1899593h.A1H(this.A03, r4, "PaymentUserActionEvent errorMapLoggingEvent: ", AnonymousClass001.A0o());
            r4.BKA(B0d);
        }
        return str;
    }
}

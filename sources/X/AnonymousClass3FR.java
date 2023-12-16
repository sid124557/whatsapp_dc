package X;

/* renamed from: X.3FR  reason: invalid class name */
public final class AnonymousClass3FR implements AnonymousClass4E8 {
    public final AnonymousClass33p A00;
    public final AnonymousClass4FV A01;

    public void BQW() {
        AnonymousClass33p r3 = this.A00;
        int A02 = C18280x3.A02(AnonymousClass0x2.A0F(r3), "decryption_failure_views");
        if (A02 > 0) {
            AnonymousClass1WD r1 = new AnonymousClass1WD();
            r1.A00 = AnonymousClass0x9.A0m(A02);
            this.A01.BhA(r1);
            C18260x0.A0K(r3, "decryption_failure_views");
        }
    }

    public AnonymousClass3FR(AnonymousClass33p r1, AnonymousClass4FV r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public String BDW() {
        return "PlaceholderViewedEventLoggerDailyCron";
    }

    public /* synthetic */ void BQX() {
    }
}

package X;

/* renamed from: X.0fw  reason: invalid class name and case insensitive filesystem */
public class C09280fw implements C16230sg {
    public final /* synthetic */ C09320g0 A00;

    public C09280fw(C09320g0 r1) {
        this.A00 = r1;
    }

    public void BfC() {
        C09320g0 r2 = this.A00;
        boolean A1T = AnonymousClass000.A1T((r2.A01.A0G() > 1.0f ? 1 : (r2.A01.A0G() == 1.0f ? 0 : -1)));
        if (A1T != r2.A07) {
            r2.A07 = A1T;
            r2.A0K.invalidateSelf();
        }
    }
}

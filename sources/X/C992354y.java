package X;

/* renamed from: X.54y  reason: invalid class name and case insensitive filesystem */
public final class C992354y extends AnonymousClass5ZM {
    public final C91524kJ A00;
    public final C64773Ex A01;
    public final AnonymousClass1VX A02;
    public final C95814uZ A03;
    public final C56402rv A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        boolean z;
        if (!this.A02.A0X(4873) || !C162457s7.A0P(this.A04.A01.A00(), "yes")) {
            return Boolean.FALSE;
        }
        AnonymousClass3ZH A07 = this.A01.A07(this.A03);
        if (A07 != null) {
            z = A07.A0S();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        boolean z;
        Boolean bool = (Boolean) obj;
        C91524kJ r0 = this.A00;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        C18320x8.A18(r0.A0a, z);
    }

    public C992354y(C91524kJ r1, C64773Ex r2, AnonymousClass1VX r3, C95814uZ r4, C56402rv r5) {
        C18260x0.A0R(r3, r2);
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
    }
}

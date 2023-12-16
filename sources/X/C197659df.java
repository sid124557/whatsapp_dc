package X;

import java.util.Map;

/* renamed from: X.9df  reason: invalid class name and case insensitive filesystem */
public final class C197659df implements AnonymousClass4DR {
    public final C620933l A00;
    public final AnonymousClass9U4 A01;

    public /* bridge */ /* synthetic */ Object Bk2(Enum enumR, Object obj, Map map) {
        boolean A0C;
        C194979Vj r8 = (C194979Vj) obj;
        AnonymousClass9KC r7 = (AnonymousClass9KC) enumR;
        boolean A1Y = AnonymousClass0x2.A1Y(r8, r7);
        int ordinal = r7.ordinal();
        if (ordinal == 0) {
            A0C = r8.A0C();
        } else if (ordinal == A1Y) {
            A0C = r8.A01.A03().getBoolean("payments_resume_onboarding_banner_started", false);
        } else if (ordinal == 2) {
            A0C = true;
            if (r8.A0C()) {
                C620933l r2 = this.A00;
                if ((r2.A03().contains("payment_is_first_send") && !r2.A03().getBoolean("payment_is_first_send", false)) || AnonymousClass9U4.A01(this.A01).A07() > 0) {
                    A0C = false;
                }
            }
        } else {
            throw new C73153f1();
        }
        return Boolean.valueOf(A0C);
    }

    public C197659df(C620933l r1, AnonymousClass9U4 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public Class B3E() {
        return AnonymousClass9KC.class;
    }
}

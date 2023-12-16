package X;

import java.util.ArrayList;

/* renamed from: X.2pl  reason: invalid class name and case insensitive filesystem */
public final class C55082pl {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C56982ss A02;
    public final C56652sL A03;
    public final C29311ic A04;
    public final C29181iP A05;
    public final C47252cx A06;
    public final C45372Zu A07;
    public final C161747qM A08;
    public final C56212rc A09;
    public final C162047r8 A0A;

    public void A00(AnonymousClass1RL r3) {
        ArrayList A0m = AnonymousClass8UF.A0m(r3);
        this.A03.A0A(A0m);
        this.A08.A07(A0m);
    }

    public void A01(C95804uY r3, boolean z) {
        AnonymousClass21F r1;
        this.A03.A09(r3, z);
        this.A08.A06(r3);
        if (z) {
            r1 = AnonymousClass21F.MUTE;
        } else {
            r1 = AnonymousClass21F.UNMUTE;
        }
        this.A04.A08(r3, r1);
    }

    public void A02(String str) {
        C55682qk r2 = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C55082pl.class.getSimpleName());
        r2.A0A(AnonymousClass000.A0X("/NewsletterUnexpectedError", A0o), true, str);
    }

    public C55082pl(C55682qk r2, C56972sr r3, C56982ss r4, C56652sL r5, C29311ic r6, C29181iP r7, C47252cx r8, C45372Zu r9, C161747qM r10, C56212rc r11, C162047r8 r12) {
        C18260x0.A0c(r2, r3, r4, r5);
        C18260x0.A0X(r11, r6, r7);
        C162457s7.A0J(r9, 11);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A08 = r10;
        this.A0A = r12;
        this.A06 = r8;
        this.A09 = r11;
        this.A04 = r6;
        this.A05 = r7;
        this.A07 = r9;
    }
}

package X;

import com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$prepare$1;

/* renamed from: X.2d2  reason: invalid class name and case insensitive filesystem */
public final class C47302d2 {
    public long A00;
    public C85474Gj A01;
    public byte[] A02;
    public final AnonymousClass31B A03;
    public final C56612sH A04;
    public final C47922e3 A05;
    public final C56102rQ A06;
    public final AnonymousClass1VW A07;
    public final C73853gB A08;
    public final AnonymousClass4C6 A09;

    public final synchronized void A00() {
        C85474Gj r0;
        AnonymousClass1VW r2 = this.A07;
        if (r2.A0Y(C58422vE.A02, 6430) && ((r0 = this.A01) == null || (!r0.BGz() && (this.A04.A0H() - this.A00 >= C56952sp.A06(r2, 6431) || this.A02 == null)))) {
            this.A01 = C616131n.A02(this.A08, new KeyAttestationLifetimeManager$prepare$1(this, (C84814Du) null), this.A09, (AnonymousClass20D) null, 2);
        }
    }

    public C47302d2(AnonymousClass31B r2, C56612sH r3, C47922e3 r4, C56102rQ r5, AnonymousClass1VW r6, C73853gB r7) {
        C18260x0.A0V(r5, r6, r2);
        C162457s7.A0J(r3, 5);
        this.A06 = r5;
        this.A07 = r6;
        this.A03 = r2;
        this.A05 = r4;
        this.A04 = r3;
        this.A08 = r7;
        this.A09 = AnonymousClass349.A02(r7);
    }
}

package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3WZ  reason: invalid class name */
public final class AnonymousClass3WZ implements C84664Df {
    public final C620433g A00;
    public final C56422rx A01;
    public final C53412n3 A02;
    public final AnonymousClass2YC A03;
    public final AnonymousClass1VX A04;

    public boolean BoJ(C95814uZ r4) {
        return this.A04.A0Y(C58422vE.A02, 6715);
    }

    public AnonymousClass3WZ(C620433g r1, C56422rx r2, C53412n3 r3, AnonymousClass2YC r4, AnonymousClass1VX r5) {
        C18260x0.A0f(r5, r1, r2, r4, r3);
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public void AwZ(C25871bD r4, C95814uZ r5) {
        C108985dt A022;
        UserJid A032 = AnonymousClass32Y.A03(r5);
        if (A032 != null && (A022 = this.A00.A02(A032)) != null) {
            r4.A00 = Boolean.valueOf(A022.A0Y);
            C55502qS A002 = this.A01.A00(A032);
            if (A002 != null) {
                r4.A03 = Boolean.valueOf(A002.A03());
                int i = A002.A01;
                r4.A01 = Boolean.valueOf(AnonymousClass000.A1U(i, 2));
                r4.A02 = Boolean.valueOf(AnonymousClass001.A1T(i));
            }
            r4.A04 = this.A03.A00(A032);
            C55012pe A012 = this.A02.A01.A01(A032);
            if (A012 != null) {
                r4.A0E = A012.A06;
                r4.A0D = A012.A05;
            }
        }
    }
}

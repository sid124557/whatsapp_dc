package X;

import android.content.SharedPreferences;

/* renamed from: X.2g9  reason: invalid class name and case insensitive filesystem */
public final class C49202g9 {
    public final C56612sH A00;
    public final AnonymousClass1VX A01;
    public final C41792Lp A02;

    public final void A00(C369220g r6) {
        C162457s7.A0J(r6, 0);
        if (this.A01.A0Y(C58422vE.A02, 5869)) {
            C41792Lp r3 = this.A02;
            long A0H = this.A00.A0H();
            SharedPreferences.Editor A04 = C18270x1.A04(r3.A01);
            C162457s7.A0D(A04);
            A04.putString("pref_disclosure_source", r6.toString());
            A04.putLong("pref_disclosure_timestamp", A0H);
            A04.apply();
        }
    }

    public final boolean A01(C369220g r9) {
        C162457s7.A0J(r9, 0);
        AnonymousClass1VX r3 = this.A01;
        C58422vE r2 = C58422vE.A02;
        if (r3.A0Y(r2, 5869)) {
            AnonymousClass66R r7 = this.A02.A01;
            String A0Z = C18280x3.A0Z(C18310x6.A0F(r7), "pref_disclosure_source");
            if (A0Z != null && !C162457s7.A0P(r9.toString(), A0Z)) {
                int A0O = r3.A0O(r2, 5591) * 1000;
                C56612sH r4 = this.A00;
                if (C56612sH.A03(r4, C18310x6.A0F(r7).getLong("pref_disclosure_timestamp", r4.A0H())) < ((long) A0O)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C49202g9(C56612sH r1, AnonymousClass1VX r2, C41792Lp r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}

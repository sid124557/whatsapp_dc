package X;

import android.content.SharedPreferences;

/* renamed from: X.5Sk  reason: invalid class name and case insensitive filesystem */
public class C104805Sk {
    public final C55682qk A00;
    public final C56612sH A01;
    public final C57182tE A02;
    public final C50652iY A03;
    public final AnonymousClass5NA A04;

    public void A00() {
        C18270x1.A0g(AnonymousClass5NA.A00(this.A04), "current_search_location");
    }

    public void A01(AnonymousClass5ZO r5) {
        SharedPreferences.Editor A002 = AnonymousClass5NA.A00(this.A04);
        String A06 = r5.A06();
        C18270x1.A0j(A002, "current_search_location", C616731u.A01(this.A00, this.A03, A06));
    }

    public C104805Sk(C55682qk r1, C56612sH r2, C57182tE r3, C50652iY r4, AnonymousClass5NA r5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }
}

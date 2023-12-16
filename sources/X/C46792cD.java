package X;

import android.content.SharedPreferences;

/* renamed from: X.2cD  reason: invalid class name and case insensitive filesystem */
public class C46792cD {
    public SharedPreferences A00;
    public final C60152y5 A01;
    public final Object A02 = AnonymousClass002.A0D();
    public final Object A03 = AnonymousClass002.A0D();
    public final Object A04 = AnonymousClass002.A0D();
    public final Object A05 = AnonymousClass002.A0D();

    public final SharedPreferences A00() {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences A032 = this.A01.A03("stickers");
        this.A00 = A032;
        return A032;
    }

    public C46792cD(C60152y5 r2) {
        this.A01 = r2;
    }
}

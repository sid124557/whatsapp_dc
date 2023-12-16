package X;

import android.content.SharedPreferences;

/* renamed from: X.2Z3  reason: invalid class name */
public final class AnonymousClass2Z3 {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public AnonymousClass2Z3(C60152y5 r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = C60152y5.A02(this.A01, "wabai_consent_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }
}

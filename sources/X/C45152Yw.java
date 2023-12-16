package X;

import android.content.SharedPreferences;

/* renamed from: X.2Yw  reason: invalid class name and case insensitive filesystem */
public final class C45152Yw {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public C45152Yw(C60152y5 r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A03("time_spent_logging_prefs");
            this.A00 = sharedPreferences;
        }
        C162457s7.A0K(sharedPreferences, "null cannot be cast to non-null type android.content.SharedPreferences");
        return sharedPreferences;
    }
}

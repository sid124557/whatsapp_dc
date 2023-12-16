package X;

import android.content.SharedPreferences;

/* renamed from: X.2YA  reason: invalid class name */
public class AnonymousClass2YA {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A03("disappearing_mode_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public AnonymousClass2YA(C60152y5 r1) {
        this.A01 = r1;
    }
}

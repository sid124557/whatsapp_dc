package X;

import android.content.SharedPreferences;

/* renamed from: X.2Yu  reason: invalid class name and case insensitive filesystem */
public class C45132Yu {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A03("time_spent_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public C45132Yu(C60152y5 r1) {
        this.A01 = r1;
    }
}

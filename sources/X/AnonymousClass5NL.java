package X;

import android.content.SharedPreferences;

/* renamed from: X.5NL  reason: invalid class name */
public final class AnonymousClass5NL {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public AnonymousClass5NL(C60152y5 r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A03("waffle_crossposting_prefs");
            this.A00 = sharedPreferences;
        }
        if (sharedPreferences == null) {
            throw C18290x4.A0Y();
        }
        return sharedPreferences;
    }
}

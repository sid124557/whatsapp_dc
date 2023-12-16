package X;

import android.content.SharedPreferences;

/* renamed from: X.2gI  reason: invalid class name and case insensitive filesystem */
public final class C49292gI {
    public SharedPreferences A00;
    public final C56612sH A01;
    public final C60152y5 A02;

    public final SharedPreferences A00() {
        if (this.A00 == null) {
            synchronized (C49292gI.class) {
                if (this.A00 == null) {
                    this.A00 = this.A02.A03("account_linking_prefs");
                }
            }
        }
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw C18290x4.A0Y();
    }

    public C49292gI(C56612sH r1, C60152y5 r2) {
        C18260x0.A0Q(r2, r1);
        this.A02 = r2;
        this.A01 = r1;
    }
}

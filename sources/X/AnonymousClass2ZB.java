package X;

import android.content.SharedPreferences;

/* renamed from: X.2ZB  reason: invalid class name */
public final class AnonymousClass2ZB {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public AnonymousClass2ZB(C60152y5 r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public final SharedPreferences A00() {
        if (this.A00 == null) {
            synchronized (AnonymousClass2ZB.class) {
                if (this.A00 == null) {
                    this.A00 = this.A01.A03("xfamily_crossposting_prefs");
                }
            }
        }
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw C18290x4.A0Y();
    }
}

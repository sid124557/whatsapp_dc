package X;

import android.content.SharedPreferences;

/* renamed from: X.2Z9  reason: invalid class name */
public final class AnonymousClass2Z9 {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public AnonymousClass2Z9(C60152y5 r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public final SharedPreferences A01() {
        if (this.A00 == null) {
            synchronized (AnonymousClass2Z9.class) {
                if (this.A00 == null) {
                    this.A00 = this.A01.A03("xfamily_fb_account_file");
                }
            }
        }
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw C18290x4.A0Y();
    }

    public static SharedPreferences.Editor A00(AnonymousClass2Z9 r0) {
        return r0.A01().edit();
    }
}

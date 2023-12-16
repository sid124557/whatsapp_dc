package X;

import android.content.SharedPreferences;

/* renamed from: X.2fD  reason: invalid class name and case insensitive filesystem */
public class C48632fD {
    public final C60152y5 A00;
    public volatile SharedPreferences A01;

    public final SharedPreferences A00() {
        if (this.A01 == null) {
            synchronized (C48632fD.class) {
                if (this.A01 == null) {
                    this.A01 = this.A00.A03("fb_credentials_prefs");
                }
            }
        }
        return this.A01;
    }

    public void A01(String str) {
        synchronized (C48632fD.class) {
            C18270x1.A0j(A00().edit(), "pref_fb_user_credentials_encrypted", str);
        }
    }

    public C48632fD(C60152y5 r1) {
        this.A00 = r1;
    }
}

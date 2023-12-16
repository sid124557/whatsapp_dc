package X;

import android.content.SharedPreferences;

/* renamed from: X.5Ph  reason: invalid class name and case insensitive filesystem */
public class C104015Ph {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A03("google_migrate_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public C104015Ph(C60152y5 r1) {
        this.A01 = r1;
    }

    public void A01() {
        C18270x1.A0g(A00().edit().remove("google_migrate_ios_funnel_id"), "google_migrate_ios_export_duration");
    }
}

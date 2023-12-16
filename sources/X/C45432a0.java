package X;

import android.content.SharedPreferences;

/* renamed from: X.2a0  reason: invalid class name and case insensitive filesystem */
public class C45432a0 {
    public SharedPreferences A00;
    public final C56612sH A01;
    public final C60152y5 A02;

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A03("core_health_event_pref_file");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public C45432a0(C56612sH r1, C60152y5 r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}

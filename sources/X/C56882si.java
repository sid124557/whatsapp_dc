package X;

import android.content.SharedPreferences;

/* renamed from: X.2si  reason: invalid class name and case insensitive filesystem */
public class C56882si {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public final synchronized SharedPreferences A02() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A03("contact_sync_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public void A03() {
        C18270x1.A0i(A01(this), "contact_sync_backoff", -1);
        C18270x1.A0i(A01(this), "sidelist_sync_backoff", -1);
        C18270x1.A0i(A01(this), "status_sync_backoff", -1);
        C18270x1.A0i(A01(this), "picture_sync_backoff", -1);
        C18270x1.A0i(A01(this), "business_sync_backoff", -1);
        C18270x1.A0i(A01(this), "devices_sync_backoff", -1);
        C18270x1.A0i(A01(this), "payment_sync_backoff", -1);
        C18270x1.A0i(A01(this), "delta_sync_backoff", -1);
        C18270x1.A0i(A01(this), "disappearing_mode_sync_backoff", -1);
        C18270x1.A0i(A01(this), "lid_sync_backoff", -1);
        C18270x1.A0i(A01(this), "bot_sync_backoff", -1);
        C18270x1.A0i(A01(this), "global_backoff_time", -1);
    }

    public C56882si(C60152y5 r1) {
        this.A01 = r1;
    }

    public static long A00(C56882si r0, String str, long j) {
        return r0.A02().getLong(str, j);
    }

    public static SharedPreferences.Editor A01(C56882si r0) {
        return r0.A02().edit();
    }
}

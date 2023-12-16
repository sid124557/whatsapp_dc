package X;

import android.content.SharedPreferences;

/* renamed from: X.5iS  reason: invalid class name and case insensitive filesystem */
public final class C111655iS implements AnonymousClass66U {
    public final C45432a0 A00;
    public final C183538qC A01;
    public final C183538qC A02;
    public final C183538qC A03;
    public final C183538qC A04;

    public String BDW() {
        return "PerfAsyncInit";
    }

    public void BMd() {
        C45432a0 r5 = this.A00;
        synchronized (r5) {
            SharedPreferences.Editor edit = r5.A00().edit();
            edit.putInt("total_cold_start_count_pref", C86664Kz.A08(r5.A00(), "total_cold_start_count_pref", 0));
            if (C58042uc.A00()) {
                edit.putInt("bg_cold_start_count_pref", C86664Kz.A08(r5.A00(), "bg_cold_start_count_pref", 0));
            }
            edit.putInt("last_cold_start_time_min", (int) (((C56612sH.A00(r5.A01) / 60) / 10) * 10));
            edit.apply();
        }
    }

    public /* synthetic */ void BMe() {
    }

    public C111655iS(C45432a0 r1, C183538qC r2, C183538qC r3, C183538qC r4, C183538qC r5) {
        C18260x0.A0f(r2, r3, r1, r4, r5);
        this.A04 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r4;
        this.A03 = r5;
    }
}

package X;

import android.content.SharedPreferences;

/* renamed from: X.5OJ  reason: invalid class name */
public final class AnonymousClass5OJ {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public final C96194vx A04;
    public final C56612sH A05;

    public final String A00() {
        SharedPreferences.Editor putInt;
        C96194vx r7 = this.A04;
        String A0Z = C18280x3.A0Z(r7.A01(), "pref_saved_ps_search_session_id");
        if (!(A0Z == null || A0Z.length() == 0)) {
            long j = r7.A01().getLong("pref_saved_ps_search_session_ts", 0);
            if (j != 0 && AnonymousClass0x9.A05(j) < 1800000) {
                putInt = AnonymousClass5NA.A00(r7).putLong("pref_saved_ps_search_session_ts", System.currentTimeMillis());
                putInt.apply();
                return A0Z;
            }
        }
        A0Z = C86604Kt.A0k();
        C18270x1.A0j(AnonymousClass5NA.A00(r7), "pref_saved_ps_search_session_id", A0Z);
        C18270x1.A0i(AnonymousClass5NA.A00(r7), "pref_saved_ps_search_session_ts", System.currentTimeMillis());
        putInt = AnonymousClass5NA.A00(r7).putInt("pref_saved_search_session_action_order", 0);
        putInt.apply();
        return A0Z;
    }

    public AnonymousClass5OJ(C96194vx r1, C56612sH r2) {
        C18260x0.A0Q(r2, r1);
        this.A05 = r2;
        this.A04 = r1;
    }
}

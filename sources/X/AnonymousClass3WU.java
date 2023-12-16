package X;

import android.content.SharedPreferences;

/* renamed from: X.3WU  reason: invalid class name */
public class AnonymousClass3WU implements C1226865i {
    public final C56142rU A00;

    public void BMW() {
        C56142rU r2 = this.A00;
        synchronized (r2) {
            SharedPreferences.Editor edit = r2.A00.edit();
            edit.remove("ab_props:sys:config_hash");
            edit.remove("ab_props:sys:last_refresh_time");
            edit.apply();
        }
    }

    public AnonymousClass3WU(C56142rU r1) {
        this.A00 = r1;
    }
}

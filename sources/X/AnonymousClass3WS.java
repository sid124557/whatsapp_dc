package X;

import android.content.SharedPreferences;

/* renamed from: X.3WS  reason: invalid class name */
public class AnonymousClass3WS implements C1226865i {
    public final C66663Mh A00;

    public void BMW() {
        C66663Mh r0 = this.A00;
        synchronized (C66663Mh.class) {
            SharedPreferences.Editor edit = r0.A00.edit();
            C18270x1.A0f(edit, "server_props:one_time_unlocked");
            C18270x1.A0g(edit, "server_props:config_hash");
        }
    }

    public AnonymousClass3WS(C66663Mh r1) {
        this.A00 = r1;
    }
}

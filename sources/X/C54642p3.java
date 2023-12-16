package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* renamed from: X.2p3  reason: invalid class name and case insensitive filesystem */
public class C54642p3 {
    public C61272zz A00 = null;
    public Map A01;
    public Set A02;
    public final C56882si A03;

    public synchronized AnonymousClass2KF A00(C61272zz r2) {
        AnonymousClass2KF r0;
        Log.d("SyncRequestStorage/clear-queued-request");
        this.A02.remove(r2);
        r0 = (AnonymousClass2KF) this.A01.remove(r2);
        A01();
        return r0;
    }

    public synchronized void A02(C61272zz r3, Runnable runnable, long j) {
        Log.d("SyncRequestStorage/persist-queued-request");
        this.A02.add(r3);
        this.A01.put(r3, new AnonymousClass2KF(runnable, j));
        A01();
    }

    public final void A01() {
        C56882si r4;
        SharedPreferences.Editor editor;
        Set<C61272zz> set;
        try {
            C61272zz r0 = this.A00;
            if (r0 == null || !r0.A03()) {
                r4 = this.A03;
                C18270x1.A0g(C56882si.A01(r4), "current_running_sync");
            } else {
                r4 = this.A03;
                C18270x1.A0j(C56882si.A01(r4), "current_running_sync", this.A00.A01());
            }
        } catch (JSONException unused) {
            r4 = this.A03;
            C18270x1.A0g(C56882si.A01(r4), "current_running_sync");
        }
        if (!this.A02.isEmpty()) {
            HashSet A0K = AnonymousClass002.A0K();
            synchronized (this) {
                set = this.A02;
            }
            for (C61272zz r1 : set) {
                try {
                    if (r1.A03()) {
                        A0K.add(r1.A01());
                    }
                } catch (JSONException unused2) {
                }
            }
            if (!A0K.isEmpty()) {
                editor = C56882si.A01(r4).putStringSet("queued_running_sync_set", A0K);
                editor.apply();
            }
        }
        editor = C56882si.A01(r4).remove("queued_running_sync_set");
        editor.apply();
    }

    public C54642p3(C56882si r3) {
        this.A03 = r3;
        synchronized (this) {
            this.A02 = AnonymousClass002.A0K();
            this.A01 = AnonymousClass001.A0t();
        }
    }
}

package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.3DE  reason: invalid class name */
public class AnonymousClass3DE implements AnonymousClass66U {
    public final C54412og A00;
    public final C51072jE A01;
    public final C183538qC A02;
    public final C183538qC A03;
    public final C183538qC A04;

    public void BMd() {
        SharedPreferences sharedPreferences = this.A00.A01;
        if (C18280x3.A1W(sharedPreferences, "async_tasks_pending_for_version_change")) {
            Log.d("AppUpdatedEventManager: app updated event (via app async init)");
            Iterator A0j = AnonymousClass0x2.A0j(this.A02);
            while (A0j.hasNext()) {
                AnonymousClass66I r2 = (AnonymousClass66I) A0j.next();
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A1T(A0o, "AppUpdatedEventManager/onAppUpdatedDuringAsyncInitAnyUserState: handling ", r2);
                AnonymousClass0x2.A18(A0o);
                r2.BMc();
            }
            C18270x1.A0l(sharedPreferences.edit(), "async_tasks_pending_for_version_change", false);
            C18320x8.A0J(this.A04).A1Y("client_version_upgrade_timestamp");
        }
    }

    public void BMe() {
        if (C18280x3.A1W(this.A00.A01, "async_tasks_pending_for_version_change")) {
            Log.d("AppUpdatedEventManager: app updated event db ready (via app async init)");
            Iterator A0j = AnonymousClass0x2.A0j(this.A02);
            while (A0j.hasNext()) {
                AnonymousClass66I r2 = (AnonymousClass66I) A0j.next();
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A1T(A0o, "AppUpdatedEventManager/onAppUpdatedDuringAsyncInitUserRegisteredAndDbReady: handling ", r2);
                AnonymousClass0x2.A18(A0o);
                r2.BMb();
            }
        }
    }

    public AnonymousClass3DE(C54412og r1, C51072jE r2, C183538qC r3, C183538qC r4, C183538qC r5) {
        this.A01 = r2;
        this.A04 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r5;
    }

    public String BDW() {
        return "AppUpdatedEventManager";
    }
}

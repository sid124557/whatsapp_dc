package androidx.work.impl.background.systemalarm;

import X.AnonymousClass00X;
import X.C06240Wu;
import X.C09000fU;
import X.C15350rC;
import android.content.Intent;
import android.util.Log;

public class SystemAlarmService extends AnonymousClass00X implements C15350rC {
    public static final String A02 = C06240Wu.A01("SystemAlarmService");
    public C09000fU A00;
    public boolean A01;

    public void onCreate() {
        super.onCreate();
        C09000fU r1 = new C09000fU(this);
        this.A00 = r1;
        if (r1.A02 != null) {
            C06240Wu.A00();
            Log.e(C09000fU.A0A, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            r1.A02 = this;
        }
        this.A01 = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A01 = true;
        C09000fU r3 = this.A00;
        C06240Wu.A00().A04(C09000fU.A0A, "Destroying SystemAlarmDispatcher");
        r3.A04.A03(r3);
        r3.A02 = null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.A01) {
            C06240Wu.A00();
            Log.i(A02, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            C09000fU r3 = this.A00;
            C06240Wu A002 = C06240Wu.A00();
            String str = C09000fU.A0A;
            A002.A04(str, "Destroying SystemAlarmDispatcher");
            r3.A04.A03(r3);
            r3.A02 = null;
            C09000fU r1 = new C09000fU(this);
            this.A00 = r1;
            if (r1.A02 != null) {
                C06240Wu.A00();
                Log.e(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                r1.A02 = this;
            }
            this.A01 = false;
        }
        if (intent == null) {
            return 3;
        }
        this.A00.A02(intent, i2);
        return 3;
    }
}

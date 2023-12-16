package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import java.util.List;

/* renamed from: X.0jB  reason: invalid class name and case insensitive filesystem */
public class C11150jB implements Runnable {
    public final /* synthetic */ C09000fU A00;

    public C11150jB(C09000fU r1) {
        this.A00 = r1;
    }

    public void run() {
        C06240Wu r2;
        StringBuilder sb;
        C09000fU r4 = this.A00;
        List list = r4.A09;
        synchronized (list) {
            r4.A00 = (Intent) list.get(0);
        }
        Intent intent = r4.A00;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = r4.A00.getIntExtra("KEY_START_ID", 0);
            C06240Wu A002 = C06240Wu.A00();
            String str = C09000fU.A0A;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Processing command ");
            A0o.append(r4.A00);
            A002.A04(str, AnonymousClass000.A0Y(", ", A0o, intExtra));
            Context context = r4.A03;
            StringBuilder A0l = AnonymousClass000.A0l(action);
            A0l.append(" (");
            A0l.append(intExtra);
            PowerManager.WakeLock A003 = AnonymousClass0SH.A00(context, AnonymousClass000.A0e(A0l));
            try {
                C06240Wu A004 = C06240Wu.A00();
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("Acquiring operation wake lock (");
                A0o2.append(action);
                C06240Wu.A02(A004, A003, ") ", str, A0o2);
                A003.acquire();
                r4.A06.A01(r4.A00, r4, intExtra);
                r2 = C06240Wu.A00();
                sb = AnonymousClass001.A0o();
                AnonymousClass001.A1K("Releasing operation wake lock (", action, ") ", sb);
            } catch (Throwable th) {
                C06240Wu A005 = C06240Wu.A00();
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("Releasing operation wake lock (");
                A0o3.append(action);
                C06240Wu.A02(A005, A003, ") ", str, A0o3);
                A003.release();
                ((C09160fk) r4.A08).A02.execute(new C11160jC(r4));
                throw th;
            }
            r2.A04(str, AnonymousClass000.A0R(A003, sb));
            A003.release();
            ((C09160fk) r4.A08).A02.execute(new C11160jC(r4));
        }
    }
}

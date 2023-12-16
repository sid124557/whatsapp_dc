package X;

import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0jC  reason: invalid class name and case insensitive filesystem */
public class C11160jC implements Runnable {
    public final C09000fU A00;

    public void run() {
        boolean A1T;
        boolean A1T2;
        C09000fU r2 = this.A00;
        C06240Wu A002 = C06240Wu.A00();
        String str = C09000fU.A0A;
        A002.A04(str, "Checking if commands are complete.");
        C09000fU.A00();
        List list = r2.A09;
        synchronized (list) {
            if (r2.A00 != null) {
                C06240Wu A003 = C06240Wu.A00();
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Removing command ");
                A003.A04(str, AnonymousClass000.A0R(r2.A00, A0o));
                if (((Intent) list.remove(0)).equals(r2.A00)) {
                    r2.A00 = null;
                } else {
                    th = AnonymousClass001.A0e("Dequeue-d command is not the first.");
                    throw th;
                }
            }
            C13700nb r5 = ((C09160fk) r2.A08).A01;
            C08990fT r0 = r2.A06;
            synchronized (r0.A02) {
                try {
                    A1T = AnonymousClass000.A1T(r0.A03.isEmpty() ? 1 : 0);
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                        break;
                    }
                }
            }
            if (!A1T) {
                if (list.isEmpty()) {
                    synchronized (r5.A01) {
                        try {
                            A1T2 = AnonymousClass000.A1T(r5.A02.isEmpty() ? 1 : 0);
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                    if (!A1T2) {
                        C06240Wu.A00().A04(str, "No more commands & intents.");
                        C15350rC r6 = r2.A02;
                        if (r6 != null) {
                            SystemAlarmService systemAlarmService = (SystemAlarmService) r6;
                            systemAlarmService.A01 = true;
                            C06240Wu.A00().A04(SystemAlarmService.A02, "All commands completed in dispatcher");
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            synchronized (C05120Sa.A00) {
                                try {
                                    linkedHashMap.putAll(C05120Sa.A01);
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            Iterator A0q = AnonymousClass000.A0q(linkedHashMap);
                            while (A0q.hasNext()) {
                                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) A0w.getKey();
                                String str2 = (String) A0w.getValue();
                                if (wakeLock != null && wakeLock.isHeld()) {
                                    C06240Wu.A00();
                                    Log.w(AnonymousClass0SH.A00, AnonymousClass000.A0V("WakeLock held for ", str2, AnonymousClass001.A0o()));
                                }
                            }
                            systemAlarmService.stopSelf();
                        }
                    }
                }
            }
            if (!list.isEmpty()) {
                r2.A01();
            }
        }
    }

    public C11160jC(C09000fU r1) {
        this.A00 = r1;
    }
}

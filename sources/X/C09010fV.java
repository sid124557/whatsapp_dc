package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.0fV  reason: invalid class name and case insensitive filesystem */
public class C09010fV implements C16140sX, C16740tt {
    public static final String A0A = C06240Wu.A01("SystemFgDispatcher");
    public Context A00;
    public C06310Xb A01;
    public C16150sY A02;
    public AnonymousClass0PL A03;
    public final C16750tu A04;
    public final C16180sb A05;
    public final Object A06 = AnonymousClass002.A0D();
    public final Map A07;
    public final Map A08;
    public final Set A09;

    public void A00() {
        this.A02 = null;
        synchronized (this.A06) {
            this.A04.reset();
        }
        this.A01.A03.A03(this);
    }

    public void BSX(AnonymousClass0PL r8, boolean z) {
        Map.Entry A0w;
        synchronized (this.A06) {
            C06250Wv r0 = (C06250Wv) this.A08.remove(r8);
            if (r0 != null) {
                Set set = this.A09;
                if (set.remove(r0)) {
                    this.A04.BjY(set);
                }
            }
        }
        Map map = this.A07;
        AnonymousClass0PW r6 = (AnonymousClass0PW) map.remove(r8);
        if (r8.equals(this.A03) && map.size() > 0) {
            Iterator A0q = AnonymousClass000.A0q(map);
            do {
                A0w = AnonymousClass001.A0w(A0q);
            } while (A0q.hasNext());
            this.A03 = (AnonymousClass0PL) A0w.getKey();
            if (this.A02 != null) {
                AnonymousClass0PW r02 = (AnonymousClass0PW) A0w.getValue();
                C16150sY r5 = this.A02;
                int i = r02.A01;
                int i2 = r02.A00;
                SystemForegroundService systemForegroundService = (SystemForegroundService) r5;
                systemForegroundService.A01.post(new C12970mQ(r02.A02, systemForegroundService, i, i2));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.A02;
                systemForegroundService2.A01.post(new C12080kw(systemForegroundService2, i));
            }
        }
        C16150sY r52 = this.A02;
        if (r6 != null && r52 != null) {
            C06240Wu A002 = C06240Wu.A00();
            String str = A0A;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Removing Notification (id: ");
            int i3 = r6.A01;
            A0o.append(i3);
            A0o.append(", workSpecId: ");
            A0o.append(r8);
            A0o.append(", notificationType: ");
            A002.A04(str, AnonymousClass000.A0h(A0o, r6.A00));
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) r52;
            systemForegroundService3.A01.post(new C12080kw(systemForegroundService3, i3));
        }
    }

    public C09010fV(Context context) {
        this.A00 = context;
        C06310Xb A012 = C06310Xb.A01(context);
        this.A01 = A012;
        this.A05 = A012.A06;
        this.A03 = null;
        this.A07 = new LinkedHashMap();
        this.A09 = AnonymousClass002.A0K();
        this.A08 = AnonymousClass001.A0t();
        this.A04 = new C09080fc(this, A012.A09);
        A012.A03.A02(this);
    }

    public void A01(Intent intent) {
        Handler handler;
        C12970mQ r4;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            C06240Wu.A00();
            Log.i(A0A, AnonymousClass000.A0P(intent, "Started foreground service ", AnonymousClass001.A0o()));
            this.A05.B2t(new C12070kv(this, intent.getStringExtra("KEY_WORKSPEC_ID")));
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                C06240Wu.A00();
                Log.i(A0A, AnonymousClass000.A0P(intent, "Stopping foreground work for ", AnonymousClass001.A0o()));
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    C06310Xb r2 = this.A01;
                    r2.A06.B2t(new AnonymousClass0BO(r2, UUID.fromString(stringExtra)));
                    return;
                }
                return;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                C06240Wu.A00();
                Log.i(A0A, "Stopping foreground service");
                C16150sY r0 = this.A02;
                if (r0 != null) {
                    r0.stop();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        AnonymousClass0PL r22 = new AnonymousClass0PL(stringExtra2, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C06240Wu A002 = C06240Wu.A00();
        String str = A0A;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Notifying with (id:");
        A0o.append(intExtra);
        A0o.append(", workSpecId: ");
        A0o.append(stringExtra2);
        A0o.append(", notificationType :");
        A0o.append(intExtra2);
        C06240Wu.A03(A002, ")", str, A0o);
        if (notification != null && this.A02 != null) {
            AnonymousClass0PW r02 = new AnonymousClass0PW(intExtra, notification, intExtra2);
            Map map = this.A07;
            map.put(r22, r02);
            if (this.A03 == null) {
                this.A03 = r22;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.A02;
                handler = systemForegroundService.A01;
                r4 = new C12970mQ(notification, systemForegroundService, intExtra, intExtra2);
            } else {
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.A02;
                systemForegroundService2.A01.post(new AnonymousClass0m0(notification, systemForegroundService2, intExtra));
                if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                    Iterator A0q = AnonymousClass000.A0q(map);
                    while (A0q.hasNext()) {
                        i |= ((AnonymousClass0PW) AnonymousClass001.A0w(A0q).getValue()).A00;
                    }
                    AnonymousClass0PW r03 = (AnonymousClass0PW) map.get(this.A03);
                    if (r03 != null) {
                        C16150sY r23 = this.A02;
                        int i2 = r03.A01;
                        Notification notification2 = r03.A02;
                        SystemForegroundService systemForegroundService3 = (SystemForegroundService) r23;
                        handler = systemForegroundService3.A01;
                        r4 = new C12970mQ(notification2, systemForegroundService3, i2, i);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            handler.post(r4);
        }
    }

    public void BMM(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C06250Wv r5 = (C06250Wv) it.next();
                String str = r5.A0J;
                C06240Wu A002 = C06240Wu.A00();
                String str2 = A0A;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Constraints unmet for WorkSpec ");
                C06240Wu.A03(A002, str, str2, A0o);
                C06310Xb r4 = this.A01;
                r4.A06.B2t(new C13250ms(new C03440Kd(AnonymousClass0J0.A00(r5)), r4, true));
            }
        }
    }

    public void BML(List list) {
    }
}

package X;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.0fU  reason: invalid class name and case insensitive filesystem */
public class C09000fU implements C16140sX {
    public static final String A0A = C06240Wu.A01("SystemAlarmDispatcher");
    public Intent A00 = null;
    public AnonymousClass0QD A01;
    public C15350rC A02;
    public final Context A03;
    public final C09020fW A04;
    public final C06310Xb A05;
    public final C08990fT A06;
    public final C05410Tf A07;
    public final C16180sb A08;
    public final List A09 = AnonymousClass001.A0s();

    public C09000fU(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A03 = applicationContext;
        AnonymousClass0QD r1 = new AnonymousClass0QD();
        this.A01 = r1;
        this.A06 = new C08990fT(applicationContext, r1);
        C06310Xb A012 = C06310Xb.A01(context);
        this.A05 = A012;
        this.A07 = new C05410Tf(A012.A02.A03);
        C09020fW r12 = A012.A03;
        this.A04 = r12;
        this.A08 = A012.A06;
        r12.A02(this);
    }

    public void BSX(AnonymousClass0PL r5, boolean z) {
        Executor executor = ((C09160fk) this.A08).A02;
        Intent intent = new Intent(this.A03, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        C08990fT.A00(intent, r5);
        C12710lz.A00(intent, this, executor, 0);
    }

    public static final void A00() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw AnonymousClass001.A0e("Needs to be invoked on the main thread.");
        }
    }

    public final void A01() {
        A00();
        PowerManager.WakeLock A002 = AnonymousClass0SH.A00(this.A03, "ProcessCommand");
        try {
            A002.acquire();
            this.A05.A06.B2t(new C11150jB(this));
        } finally {
            A002.release();
        }
    }

    public void A02(Intent intent, int i) {
        C06240Wu A002 = C06240Wu.A00();
        String str = A0A;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Adding command ");
        A0o.append(intent);
        A0o.append(" (");
        A0o.append(i);
        C06240Wu.A03(A002, ")", str, A0o);
        A00();
        String action = intent.getAction();
        boolean z = false;
        if (TextUtils.isEmpty(action)) {
            C06240Wu.A00();
            Log.w(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            A00();
            List<Intent> list = this.A09;
            synchronized (list) {
                for (Intent action2 : list) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(action2.getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        List list2 = this.A09;
        synchronized (list2) {
            if (!list2.isEmpty()) {
                z = true;
            }
            list2.add(intent);
            if (!z) {
                A01();
            }
        }
    }
}

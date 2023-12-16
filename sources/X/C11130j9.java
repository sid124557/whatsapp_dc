package X;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.concurrent.Executor;

/* renamed from: X.0j9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C11130j9 implements Runnable {
    public final /* synthetic */ C09070fb A00;

    public final void run() {
        String str;
        C06240Wu r2;
        StringBuilder sb;
        C09070fb r3 = this.A00;
        AnonymousClass0PL r9 = r3.A08;
        String str2 = r9.A01;
        if (r3.A00 < 2) {
            r3.A00 = 2;
            C06240Wu A002 = C06240Wu.A00();
            str = C09070fb.A0C;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Stopping work for WorkSpec ");
            C06240Wu.A03(A002, str2, str, A0o);
            Context context = r3.A04;
            Class<SystemAlarmService> cls = SystemAlarmService.class;
            Intent intent = new Intent(context, cls);
            intent.setAction("ACTION_STOP_WORK");
            C08990fT.A00(intent, r9);
            Executor executor = r3.A0A;
            C09000fU r4 = r3.A06;
            int i = r3.A03;
            C12710lz.A00(intent, r4, executor, i);
            boolean A05 = r4.A04.A05(str2);
            r2 = C06240Wu.A00();
            sb = AnonymousClass001.A0o();
            if (A05) {
                sb.append("WorkSpec ");
                sb.append(str2);
                C06240Wu.A03(r2, " needs to be rescheduled", str, sb);
                Intent intent2 = new Intent(context, cls);
                intent2.setAction("ACTION_SCHEDULE_WORK");
                C08990fT.A00(intent2, r9);
                C12710lz.A00(intent2, r4, executor, i);
                return;
            }
            sb.append("Processor does not have WorkSpec ");
            sb.append(str2);
            str2 = ". No need to reschedule";
        } else {
            r2 = C06240Wu.A00();
            str = C09070fb.A0C;
            sb = AnonymousClass001.A0o();
            sb.append("Already stopped work for ");
        }
        C06240Wu.A03(r2, str2, str, sb);
    }

    public /* synthetic */ C11130j9(C09070fb r1) {
        this.A00 = r1;
    }
}

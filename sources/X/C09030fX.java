package X;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.0fX  reason: invalid class name and case insensitive filesystem */
public class C09030fX implements C16880uB {
    public static final String A01 = C06240Wu.A01("SystemAlarmScheduler");
    public final Context A00;

    public void Bkm(C06250Wv... r8) {
        for (C06250Wv r4 : r8) {
            C06240Wu A002 = C06240Wu.A00();
            String str = A01;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Scheduling work with workSpecId ");
            C06240Wu.A03(A002, r4.A0J, str, A0o);
            Context context = this.A00;
            AnonymousClass0PL A003 = AnonymousClass0J0.A00(r4);
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            C08990fT.A00(intent, A003);
            context.startService(intent);
        }
    }

    public void AyW(String str) {
        Context context = this.A00;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        context.startService(intent);
    }

    public boolean BFJ() {
        return true;
    }

    public C09030fX(Context context) {
        this.A00 = context.getApplicationContext();
    }
}

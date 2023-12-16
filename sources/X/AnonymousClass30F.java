package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.30F  reason: invalid class name */
public class AnonymousClass30F {
    public static final List A0F = Arrays.asList(new String[]{"action_schedule_call", "action_schedule_call_advance_alert"});
    public final C69263Wi A00;
    public final C56972sr A01;
    public final C112515jr A02;
    public final C50862it A03;
    public final C620633i A04;
    public final C56612sH A05;
    public final C54292oU A06;
    public final C66543Lv A07;
    public final C55422qK A08;
    public final AnonymousClass1VX A09;
    public final C29281iZ A0A;
    public final C72173dI A0B;
    public final AnonymousClass4FS A0C;
    public final C183538qC A0D;
    public final C183538qC A0E;

    public void A02(long j, PendingIntent pendingIntent) {
        AlarmManager A072 = this.A04.A07();
        if (A072 != null) {
            long j2 = j;
            PendingIntent pendingIntent2 = pendingIntent;
            if (!C107385bE.A09() || this.A03.A00()) {
                A072.setAlarmClock(new AlarmManager.AlarmClockInfo(j, pendingIntent), pendingIntent);
            } else {
                A072.setWindow(0, j2, 600000, pendingIntent2);
            }
        }
    }

    public void A03(C95814uZ r4, AnonymousClass4BI r5) {
        if (r4 != null) {
            this.A0C.BkP(new C70363aN(this, r4, r5, 8));
        }
    }

    public AnonymousClass30F(C69263Wi r3, C56972sr r4, C112515jr r5, C50862it r6, C620633i r7, C56612sH r8, C54292oU r9, C66543Lv r10, C55422qK r11, AnonymousClass1VX r12, C29281iZ r13, AnonymousClass4FS r14, C183538qC r15, C183538qC r16) {
        this.A05 = r8;
        this.A09 = r12;
        this.A00 = r3;
        this.A06 = r9;
        this.A0C = r14;
        this.A03 = r6;
        this.A01 = r4;
        this.A04 = r7;
        this.A08 = r11;
        this.A02 = r5;
        this.A0A = r13;
        this.A07 = r10;
        this.A0D = r15;
        this.A0E = r16;
        this.A0B = new C72173dI(r14, true);
    }

    public void A00(long j) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A0F.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            Intent A082 = AnonymousClass0x9.A08(this.A06.A00, ScheduleCallBroadcastReceiver.class);
            A082.setAction(A0m);
            A0s.add(A082);
        }
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            Intent intent = (Intent) it2.next();
            PendingIntent A012 = C624735e.A01(this.A06.A00, (int) j, intent, 1610612736);
            if (A012 == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("cancelScheduleCallAlarms no pending intent for ");
                C18260x0.A1J(A0o, intent.getAction());
                return;
            }
            AlarmManager A072 = this.A04.A07();
            if (A072 != null) {
                A072.cancel(A012);
                A012.cancel();
            } else {
                return;
            }
        }
    }

    public void A01(long j, long j2, boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A0F.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            Intent A082 = AnonymousClass0x9.A08(this.A06.A00, ScheduleCallBroadcastReceiver.class);
            A082.setAction(A0m);
            A082.putExtra("extra_message_row_id", j);
            A082.putExtra("extra_scheduled_call_timestamp_ms", j2);
            A0s.add(A082);
        }
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            Intent intent = (Intent) it2.next();
            PendingIntent A012 = C624735e.A01(this.A06.A00, (int) j, intent, 1073741824);
            if (!C18280x3.A1V(intent, "action_schedule_call_advance_alert")) {
                A02(j2, A012);
            } else if (z && j2 - System.currentTimeMillis() > 60000) {
                A02(j2 - 60000, A012);
            }
        }
    }
}

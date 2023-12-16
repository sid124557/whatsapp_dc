package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderMessageAlarmBroadcastReceiver;

/* renamed from: X.2lH  reason: invalid class name and case insensitive filesystem */
public final class C52312lH {
    public final C50862it A00;
    public final C620633i A01;
    public final C54292oU A02;

    public final void A01(C624134x r14, long j) {
        C624134x r8 = r14;
        if (r14 != null) {
            long j2 = r14.A1L;
            AlarmManager A07 = this.A01.A07();
            if (A07 != null) {
                long j3 = j;
                if (j >= 0) {
                    PendingIntent A002 = A00(r8, j2, j);
                    if (!C107385bE.A09() || this.A00.A00()) {
                        A07.setAlarmClock(new AlarmManager.AlarmClockInfo(j3, A002), A002);
                    } else {
                        A07.setWindow(0, j3, 600000, A002);
                    }
                }
            }
        }
    }

    public final PendingIntent A00(C624134x r4, long j, long j2) {
        Context context = this.A02.A00;
        Intent A08 = AnonymousClass0x9.A08(context, ScheduledReminderMessageAlarmBroadcastReceiver.class);
        A08.putExtra("reminder_message_id", j);
        A08.putExtra("scheduled_time_in_ms", j2);
        A08.setAction("scheduled_reminder_message_broadcast_action");
        C107395bF.A00(A08, r4.A1J);
        PendingIntent A03 = C624735e.A03(context, A08, (int) j);
        C162457s7.A0D(A03);
        return A03;
    }

    public C52312lH(C50862it r1, C620633i r2, C54292oU r3) {
        C18260x0.A0V(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}

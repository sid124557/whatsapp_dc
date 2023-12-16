package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.3c4  reason: invalid class name and case insensitive filesystem */
public class C71413c4 implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public C71413c4(Object obj, Object obj2, int i, long j, boolean z) {
        this.A04 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = z;
        this.A00 = j;
    }

    public void run() {
        switch (this.A04) {
            case 0:
                if (!this.A03) {
                    long j = this.A00;
                    if (j == 0) {
                        j = System.currentTimeMillis();
                        this.A00 = j;
                    }
                    if (((float) AnonymousClass0x9.A05(j)) / ((float) 0) >= 1.0f) {
                        this.A03 = true;
                    }
                    View view = (View) this.A01;
                    view.invalidate();
                    if (!this.A03) {
                        view.post(this);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AnonymousClass5TQ r2 = (AnonymousClass5TQ) this.A02;
                boolean z = this.A03;
                long j2 = this.A00;
                try {
                    if (r2.A02()) {
                        r2.A0D.close();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    if (!z || j2 < 1000) {
                        C18260x0.A1L(AnonymousClass000.A0l("pttutils/closevisualization/closevisualization "), e.toString());
                        return;
                    } else {
                        Log.e("pttutils/closevisualization/closevisualization ", e);
                        return;
                    }
                }
            default:
                ScheduleCallBroadcastReceiver scheduleCallBroadcastReceiver = (ScheduleCallBroadcastReceiver) this.A01;
                C50392i6 r6 = (C50392i6) this.A02;
                boolean z2 = this.A03;
                long j3 = this.A00;
                C42682Pc r5 = scheduleCallBroadcastReceiver.A03;
                C31311o5 r52 = new C31311o5(AnonymousClass35J.A01(r6.A04, r5.A03), r5.A01.A0H());
                r52.A01 = r6.A02;
                long j4 = r6.A03;
                r52.A00 = j4;
                r52.A02 = r6.A06;
                r52.A1J(r6.A05);
                scheduleCallBroadcastReceiver.A08.A0V(r52);
                if (!z2) {
                    AnonymousClass30F r9 = scheduleCallBroadcastReceiver.A0B;
                    C54292oU r10 = r9.A06;
                    Intent A08 = AnonymousClass0x9.A08(r10.A00, ScheduleCallBroadcastReceiver.class);
                    A08.setAction("action_schedule_call_timeout");
                    A08.putExtra("extra_message_row_id", j3);
                    r9.A03.A02(C624735e.A03(r10.A00, A08, (int) j3), 1, j4 + 900000);
                    C29281iZ r1 = scheduleCallBroadcastReceiver.A0C;
                    if (r6.A09) {
                        Iterator A032 = C61102zi.A03(r1);
                        while (A032.hasNext()) {
                            ((C84904Ee) A032.next()).Bao(r6);
                        }
                    }
                    scheduleCallBroadcastReceiver.A04.A00(r6, false);
                    return;
                }
                return;
        }
    }

    public C71413c4(View view, C109255eK r3) {
        this.A04 = 0;
        this.A01 = view;
        this.A02 = r3;
    }
}

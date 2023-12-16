package com.whatsapp.schedulecall;

import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass2A1;
import X.AnonymousClass2I3;
import X.AnonymousClass30F;
import X.AnonymousClass49P;
import X.AnonymousClass4FS;
import X.C107145am;
import X.C112515jr;
import X.C24381Xe;
import X.C29281iZ;
import X.C42682Pc;
import X.C46912cP;
import X.C55422qK;
import X.C55682qk;
import X.C56612sH;
import X.C620733j;
import X.C66543Lv;
import X.C69263Wi;
import X.C70083Zv;
import X.C71383c1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ScheduleCallBroadcastReceiver extends BroadcastReceiver {
    public C55682qk A00;
    public C69263Wi A01;
    public AnonymousClass49P A02;
    public C42682Pc A03;
    public C46912cP A04;
    public C112515jr A05;
    public C56612sH A06;
    public C620733j A07;
    public C66543Lv A08;
    public C55422qK A09;
    public AnonymousClass1VX A0A;
    public AnonymousClass30F A0B;
    public C29281iZ A0C;
    public AnonymousClass2I3 A0D;
    public AnonymousClass4FS A0E;
    public final Object A0F;
    public volatile boolean A0G;

    public void onReceive(Context context, Intent intent) {
        boolean z;
        C55682qk r1;
        String str;
        if (!this.A0G) {
            synchronized (this.A0F) {
                if (!this.A0G) {
                    AnonymousClass2A1.A00(context).ARo(this);
                    this.A0G = true;
                }
            }
        }
        Intent intent2 = intent;
        String action = intent2.getAction();
        long longExtra = intent2.getLongExtra("extra_message_row_id", -1);
        boolean z2 = false;
        if (longExtra == -1) {
            r1 = this.A00;
            str = "scheduled-call-broadcast-receiver-no-row-id";
        } else if (action == null) {
            r1 = this.A00;
            str = "scheduled-call-broadcast-receiver-null-action";
        } else {
            switch (action.hashCode()) {
                case 181260125:
                    z = action.equals("action_schedule_call_advance_alert");
                    break;
                case 348840125:
                    z = action.equals("action_schedule_call");
                    break;
                case 1085261791:
                    if (action.equals("action_schedule_call_timeout")) {
                        this.A0E.BkP(new C70083Zv(this, longExtra, 21));
                        return;
                    }
                    return;
                default:
                    return;
            }
            if (z) {
                long longExtra2 = intent2.getLongExtra("extra_scheduled_call_timestamp_ms", -1);
                if (longExtra2 == -1) {
                    r1 = this.A00;
                    str = "scheduled-call-broadcast-receiver-no-scheduled-timestamp";
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = currentTimeMillis - longExtra2;
                    C107145am.A00(this.A07, currentTimeMillis);
                    C107145am.A00(this.A07, longExtra2);
                    if (j > 900000) {
                        z2 = true;
                    }
                    boolean equals = "action_schedule_call".equals(action);
                    AnonymousClass4FS r0 = this.A0E;
                    if (equals) {
                        r0.BkP(new C71383c1(this, 3, longExtra, z2));
                        AnonymousClass2I3 r2 = this.A0D;
                        C24381Xe r12 = new C24381Xe();
                        r12.A01 = Long.valueOf(j);
                        r2.A00.BhD(r12);
                        return;
                    }
                    r0.BkP(new C71383c1(this, 4, longExtra, z2));
                    return;
                }
            } else {
                return;
            }
        }
        r1.A0A(str, false, (String) null);
    }

    public ScheduleCallBroadcastReceiver(int i) {
        this.A0G = false;
        this.A0F = AnonymousClass002.A0D();
    }

    public ScheduleCallBroadcastReceiver() {
        this(0);
    }
}

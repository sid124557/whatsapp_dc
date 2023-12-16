package com.whatsapp.conversation.conversationrow.nativeflow.reminder;

import X.AnonymousClass002;
import X.AnonymousClass2A1;
import X.AnonymousClass2W4;
import X.AnonymousClass2z0;
import X.AnonymousClass33T;
import X.AnonymousClass4FS;
import X.C107395bF;
import X.C162457s7;
import X.C18270x1;
import X.C44362Vt;
import X.C50222hp;
import X.C55832qz;
import X.C56612sH;
import X.C56832sd;
import X.C620733j;
import X.C64773Ex;
import X.C66543Lv;
import X.C70713aw;
import X.C95814uZ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class ScheduledReminderMessageAlarmBroadcastReceiver extends BroadcastReceiver {
    public C64773Ex A00;
    public C44362Vt A01;
    public C56612sH A02;
    public AnonymousClass33T A03;
    public C620733j A04;
    public C66543Lv A05;
    public C66543Lv A06;
    public AnonymousClass2W4 A07;
    public C56832sd A08;
    public C50222hp A09;
    public C55832qz A0A;
    public AnonymousClass4FS A0B;
    public final Object A0C;
    public volatile boolean A0D;

    public void onReceive(Context context, Intent intent) {
        String str;
        Bundle extras;
        Context context2 = context;
        if (!this.A0D) {
            synchronized (this.A0C) {
                if (!this.A0D) {
                    AnonymousClass2A1.A00(context).ARI(this);
                    this.A0D = true;
                }
            }
        }
        C162457s7.A0J(context, 0);
        C95814uZ r6 = null;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (C162457s7.A0P(str, "scheduled_reminder_message_broadcast_action") && (extras = intent.getExtras()) != null) {
            long j = extras.getLong("scheduled_time_in_ms", -1);
            if (j >= 0) {
                AnonymousClass2z0 A022 = C107395bF.A02(intent);
                if (A022 != null) {
                    r6 = A022.A00;
                }
                if (this.A02 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    AnonymousClass4FS r0 = this.A0B;
                    if (r0 != null) {
                        r0.BkM(new C70713aw(context2, this, r6, A022, currentTimeMillis, j));
                        return;
                    }
                    throw C18270x1.A0S("waWorkers");
                }
                throw C18270x1.A0S("time");
            }
        }
    }

    public ScheduledReminderMessageAlarmBroadcastReceiver(int i) {
        this.A0D = false;
        this.A0C = AnonymousClass002.A0D();
    }

    public ScheduledReminderMessageAlarmBroadcastReceiver() {
        this(0);
    }
}

package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderMessageAlarmBroadcastReceiver;

/* renamed from: X.3aw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70713aw implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ ScheduledReminderMessageAlarmBroadcastReceiver A03;
    public final /* synthetic */ C95814uZ A04;
    public final /* synthetic */ AnonymousClass2z0 A05;

    public final void run() {
        String str;
        PendingIntent A002;
        ScheduledReminderMessageAlarmBroadcastReceiver scheduledReminderMessageAlarmBroadcastReceiver = this.A03;
        AnonymousClass2z0 r3 = this.A05;
        Context context = this.A02;
        C95814uZ r10 = this.A04;
        long j = this.A00;
        long j2 = this.A01;
        C55832qz r2 = scheduledReminderMessageAlarmBroadcastReceiver.A0A;
        if (r2 != null) {
            C624134x A052 = r2.A05(r3);
            if (A052 != null) {
                C44362Vt r9 = scheduledReminderMessageAlarmBroadcastReceiver.A01;
                if (r9 != null) {
                    r9.A00(A052, "cta_cancel_reminder", "cta_reminder");
                    C50222hp r32 = scheduledReminderMessageAlarmBroadcastReceiver.A09;
                    if (r32 != null) {
                        AnonymousClass315 A012 = r32.A01((AnonymousClass4DV) A052);
                        if (A012 != null) {
                            str = A012.A09(context);
                        } else {
                            str = null;
                        }
                        String A0X = AnonymousClass0x2.A0X(context, str, 1, R.string.f11nameremoved);
                        C162457s7.A0D(A0X);
                        AnonymousClass4FS r22 = scheduledReminderMessageAlarmBroadcastReceiver.A0B;
                        if (r22 != null) {
                            r22.BkM(new C71603cN(r10, scheduledReminderMessageAlarmBroadcastReceiver, A052, A0X, 18));
                            AnonymousClass2W4 r92 = scheduledReminderMessageAlarmBroadcastReceiver.A07;
                            if (r92 != null) {
                                r92.A00(A052.A1L);
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("ScheduledReminderMessageAlarmBroadcastReceiver/onReceive current time is ");
                                C620733j r23 = scheduledReminderMessageAlarmBroadcastReceiver.A04;
                                if (r23 != null) {
                                    A0o.append(C107145am.A00(r23, j));
                                    A0o.append(", scheduled time is ");
                                    C620733j r24 = scheduledReminderMessageAlarmBroadcastReceiver.A04;
                                    if (r24 != null) {
                                        A0o.append(C107145am.A00(r24, j2));
                                        A0o.append(" time diff ms is ");
                                        C18260x0.A1I(A0o, j - j2);
                                        C64773Ex r0 = scheduledReminderMessageAlarmBroadcastReceiver.A00;
                                        if (r0 != null) {
                                            AnonymousClass33T r25 = scheduledReminderMessageAlarmBroadcastReceiver.A03;
                                            if (r25 != null) {
                                                if (r10 == null) {
                                                    A002 = C624735e.A00(context, 1, C627736r.A02(context), 0);
                                                } else {
                                                    A002 = C624735e.A00(context, 2, C627736r.A0H(context, AnonymousClass326.A00(r0.A0A(r10)), 0).putExtra("fromNotification", true), 0);
                                                }
                                                C162457s7.A0D(A002);
                                                new C05610Ue(context, "critical_app_alerts@1");
                                                C05610Ue r33 = new C05610Ue(context, "critical_app_alerts@1");
                                                C18300x5.A14(context, r33, R.string.f11nameremoved);
                                                C18320x8.A0z(context, r33, R.string.f11nameremoved);
                                                r33.A03 = 1;
                                                r33.A07.icon = R.drawable.notifybar;
                                                r33.A09 = A002;
                                                Notification A013 = r33.A01();
                                                C162457s7.A0D(A013);
                                                r25.A04(77, A013);
                                                return;
                                            }
                                            throw C18270x1.A0S("waNotificationManager");
                                        }
                                        throw C18270x1.A0S("contactManager");
                                    }
                                    throw C18270x1.A0S("whatsAppLocale");
                                }
                                throw C18270x1.A0S("whatsAppLocale");
                            }
                            throw C18270x1.A0S("scheduledReminderMessageStore");
                        }
                        throw C18270x1.A0S("waWorkers");
                    }
                    throw C18270x1.A0S("interactiveMessageCustomizerFactory");
                }
                throw C18270x1.A0S("reminderUtils");
            }
            return;
        }
        throw C18270x1.A0S("fMessageDatabase");
    }

    public /* synthetic */ C70713aw(Context context, ScheduledReminderMessageAlarmBroadcastReceiver scheduledReminderMessageAlarmBroadcastReceiver, C95814uZ r3, AnonymousClass2z0 r4, long j, long j2) {
        this.A03 = scheduledReminderMessageAlarmBroadcastReceiver;
        this.A05 = r4;
        this.A02 = context;
        this.A04 = r3;
        this.A00 = j;
        this.A01 = j2;
    }
}

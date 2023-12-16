package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.2qc  reason: invalid class name and case insensitive filesystem */
public class C55602qc {
    public C22821Qf A00;
    public final Handler A01;
    public final C29411im A02;
    public final C40262Fd A03;
    public final C50862it A04;
    public final C620633i A05;
    public final C56612sH A06;
    public final C54292oU A07;
    public final AnonymousClass1VX A08;
    public final C48202eW A09;
    public final C50032hW A0A;
    public final C29321id A0B;
    public final AnonymousClass4FS A0C;
    public final C183538qC A0D;

    public final synchronized C22821Qf A00() {
        C22821Qf r0;
        synchronized (this) {
            r0 = this.A00;
            if (r0 == null) {
                C56612sH r4 = this.A06;
                C50862it r2 = this.A04;
                C54292oU r5 = this.A07;
                r0 = new C22821Qf(this.A03, r2, this.A05, r4, r5, this, this.A09, this.A0A);
                this.A00 = r0;
            }
        }
        return r0;
    }

    public void A02() {
        C48202eW r6 = this.A09;
        if (r6.A00 == 1) {
            r6.A00 = 2;
            if (this.A08.A0Y(C58422vE.A02, 6494)) {
                this.A01.sendEmptyMessageDelayed(2, 15000);
            } else {
                C22821Qf A002 = A00();
                PendingIntent A012 = C624735e.A01(A002.A04.A00, 0, C18280x3.A0B("com.whatsapp.alarm.AVAILABLE_TIMEOUT"), 134217728);
                if (!A002.A01.A02(A012, 2, SystemClock.elapsedRealtime() + 15000)) {
                    Log.w("AvailabilityTimeoutAlarmBroadcastReceiver/startAvailableTimeoutAlarm AlarmManager is null");
                }
            }
        }
        C18260x0.A1R(AnonymousClass001.A0o(), "presencestatemanager/startTransitionToUnavailable/new-state ", r6);
    }

    public final void A03() {
        if (this.A08.A0Y(C58422vE.A02, 6494)) {
            Log.d("presencestatemanager/availabletimeout/cancel");
            this.A01.removeMessages(2);
            return;
        }
        C22821Qf A002 = A00();
        PendingIntent A012 = C624735e.A01(A002.A04.A00, 0, C18280x3.A0B("com.whatsapp.alarm.AVAILABLE_TIMEOUT"), 536870912);
        if (A012 != null) {
            C620633i r1 = A002.A02;
            C620633i.A0P = true;
            AlarmManager A072 = r1.A07();
            C620633i.A0P = false;
            if (A072 != null) {
                A072.cancel(A012);
            } else {
                Log.w("AvailabilityTimeoutAlarmBroadcastReceiver/cancelAvailableTimeoutAlarm AlarmManager is null");
            }
            A012.cancel();
        }
    }

    public final void A04(boolean z) {
        Context context = this.A07.A00;
        C29321id r3 = this.A0B;
        C620633i r1 = this.A05;
        C626936e.A01();
        if (r3.A09()) {
            boolean A002 = C18520xo.A00(r1);
            C18260x0.A1E("ScreenLockReceiver manual check; locked=", AnonymousClass001.A0o(), A002);
            r3.A08(A002);
        }
        C48202eW r4 = this.A09;
        int i = r4.A00;
        if (i != 1) {
            if (i == 2) {
                A03();
                r4.A00 = 1;
            } else if (z) {
                r4.A00 = 1;
                C29411im r32 = this.A02;
                if (r32.A04 != 1) {
                    this.A0A.A00();
                }
                if (!AnonymousClass000.A1U(r32.A04, 2)) {
                    C18270x1.A0w(new C33431sz(context, r32, AnonymousClass0x9.A0S(this.A0D)), this.A0C);
                }
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("presencestatemanager/setAvailable/new-state: ");
        A0o.append(r4);
        C18260x0.A1E(" setIfUnavailable:", A0o, z);
    }

    public C55602qc(C29411im r4, C40262Fd r5, C50862it r6, C620633i r7, C56612sH r8, C54292oU r9, AnonymousClass1VX r10, C48202eW r11, C50032hW r12, C29321id r13, AnonymousClass4FS r14, C183538qC r15) {
        this.A06 = r8;
        this.A08 = r10;
        this.A04 = r6;
        this.A07 = r9;
        this.A0C = r14;
        this.A05 = r7;
        this.A09 = r11;
        this.A02 = r4;
        this.A0A = r12;
        this.A0D = r15;
        this.A0B = r13;
        this.A03 = r5;
        this.A01 = new Handler(Looper.getMainLooper(), new C628637a(this, r13));
    }

    public void A01() {
        A03();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("presencestatemanager/setUnavailable previous-state: ");
        C48202eW r1 = this.A09;
        C18260x0.A0o(r1, A0o);
        r1.A00 = 3;
    }
}

package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.2sT  reason: invalid class name and case insensitive filesystem */
public class C56732sT {
    public int A00;
    public C22801Qd A01;
    public C22811Qe A02;
    public AnonymousClass4EW A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final C66663Mh A08;
    public final C29411im A09;
    public final C50862it A0A;
    public final C620633i A0B;
    public final C56612sH A0C;
    public final C54292oU A0D;
    public final AnonymousClass1VX A0E;
    public final AnonymousClass31C A0F;
    public volatile long A0G;

    public long A00() {
        return Math.min(32000, Math.max(8000, (long) (this.A08.A03(C66663Mh.A1n) * 1000)));
    }

    public final void A03() {
        Log.i("ClientPingManager/on-disconnected");
        Handler handler = this.A07;
        C626936e.A02(handler);
        if (!this.A05) {
            Log.w("ClientPingManager/on-disconnected; not connected, ignoring...");
            return;
        }
        if (this.A0G > 0) {
            A02();
        }
        Log.d("ClientPingManager/timeout/unregister-receiver");
        C626936e.A02(handler);
        C22811Qe r1 = this.A02;
        if (r1 != null) {
            this.A0D.A00.unregisterReceiver(r1);
            this.A02 = null;
        }
        A01();
        Log.d("ClientPingManager/periodic/unregister-receiver");
        C626936e.A02(handler);
        C22801Qd r12 = this.A01;
        if (r12 != null) {
            this.A0D.A00.unregisterReceiver(r12);
            this.A01 = null;
        }
        this.A03 = null;
        this.A05 = false;
    }

    public final void A04() {
        String str;
        Log.i("ClientPingManager/ping-timeout");
        C626936e.A02(this.A07);
        if (!this.A05 || this.A03 == null) {
            str = "ClientPingManager/ping-timeout; not connected, ignoring.";
        } else if (!this.A09.A06) {
            str = "ClientPingManager/ping-timeout; xmpp connection is not ready, ignoring.";
        } else if (this.A06) {
            str = "ClientPingManager/ping-timeout; already notified about timeout, ignoring.";
        } else {
            Log.d("ConnectionThread/MessageServiceHandler/sendPingTimeout");
            ((Handler) this.A03).obtainMessage(8).sendToTarget();
            this.A06 = true;
            A02();
            return;
        }
        Log.w(str);
    }

    public final void A05() {
        Log.i("ClientPingManager/send-ping");
        Handler handler = this.A07;
        C626936e.A02(handler);
        if (!this.A05 || this.A03 == null) {
            Log.w("ClientPingManager/send-ping; not connected, ignoring.");
        } else if (this.A0G > 0) {
            Log.w("ClientPingManager/send-ping; skipping ping request, pending ping already exists.");
            if (this.A0G > 0 && SystemClock.elapsedRealtime() > this.A0G + A00()) {
                A04();
            }
        } else {
            A01();
            this.A0G = SystemClock.elapsedRealtime();
            this.A06 = false;
            if (A0A()) {
                Log.i("ClientPingManager/timeout/schedule-handler");
                handler.removeMessages(2);
                handler.sendEmptyMessageDelayed(2, A00());
            } else {
                Log.i("ClientPingManager/timeout/schedule-alarm");
                if (!this.A0A.A02(C624735e.A03(this.A0D.A00, C18280x3.A0B("com.whatsapp.alarm.CLIENT_PING_TIMEOUT"), 0), 2, SystemClock.elapsedRealtime() + A00())) {
                    Log.w("ClientPingManager/timeout/schedule-alarm; failed to schedule alarm");
                }
            }
            A09((Runnable) null);
            this.A00++;
        }
    }

    public void A07(Intent intent) {
        PendingIntent A012 = C624735e.A01(this.A0D.A00, 0, intent, 536870912);
        if (A012 != null) {
            AlarmManager A072 = this.A0B.A07();
            if (A072 == null) {
                Log.w("ClientPingManager/cancel-alarm; service is null");
                return;
            }
            A072.cancel(A012);
            A012.cancel();
        }
    }

    public void A08(AnonymousClass4EZ r10, long j) {
        AnonymousClass31C r2 = this.A0F;
        String A032 = r2.A03();
        r2.A0D(r10, new C35711xJ(new C35361wk(4), A032).A00, A032, 22, j);
    }

    public void A09(Runnable runnable) {
        AnonymousClass31C r2 = this.A0F;
        String A032 = r2.A03();
        C35711xJ r0 = new C35711xJ(new C35361wk(4), A032);
        r2.A0D(new C68253Sl(this, r0, runnable), r0.A00, A032, 22, 32000);
    }

    public final boolean A0A() {
        if (!this.A04 || !this.A0E.A0Y(C58422vE.A01, 6493)) {
            return false;
        }
        return true;
    }

    public C56732sT(C66663Mh r4, C29411im r5, C50862it r6, C620633i r7, C56612sH r8, C54292oU r9, AnonymousClass1VX r10, AnonymousClass31C r11) {
        Looper mainLooper = Looper.getMainLooper();
        this.A0C = r8;
        this.A0E = r10;
        this.A0A = r6;
        this.A0D = r9;
        this.A08 = r4;
        this.A0F = r11;
        this.A0B = r7;
        this.A07 = new Handler(mainLooper, new AnonymousClass37X(this));
        this.A09 = r5;
    }

    public final void A01() {
        if (A0A()) {
            Log.i("ClientPingManager/periodic/cancel-handler");
            this.A07.removeMessages(1);
            return;
        }
        Log.i("ClientPingManager/periodic/cancel-alarm");
        A07(C18280x3.A0B("com.whatsapp.alarm.CLIENT_PING_PERIODIC"));
    }

    public final void A02() {
        if (A0A()) {
            Log.i("ClientPingManager/timeout/cancel-handler");
            this.A07.removeMessages(2);
            return;
        }
        Log.i("ClientPingManager/timeout/cancel-alarm");
        A07(C18280x3.A0B("com.whatsapp.alarm.CLIENT_PING_TIMEOUT"));
    }

    public final void A06() {
        long j;
        long j2;
        if (A0A()) {
            Log.i("ClientPingManager/periodic/schedule-handler");
            Handler handler = this.A07;
            if (this.A00 == 0) {
                j2 = 15000;
            } else {
                j2 = 240000;
            }
            handler.sendEmptyMessageDelayed(1, j2);
            return;
        }
        Log.i("ClientPingManager/periodic/schedule-alarm");
        Context context = this.A0D.A00;
        AlarmManager A072 = this.A0B.A07();
        if (A072 == null) {
            Log.w("ClientPingManager/periodic/schedule-alarm; alarm manager is null");
            return;
        }
        PendingIntent A032 = C624735e.A03(context, C18280x3.A0B("com.whatsapp.alarm.CLIENT_PING_PERIODIC"), 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.A00 == 0) {
            j = 15000;
        } else {
            j = 240000;
        }
        long j3 = elapsedRealtime + j;
        int i = 2;
        if (this.A04) {
            i = 3;
        }
        A072.set(i, j3, A032);
    }
}

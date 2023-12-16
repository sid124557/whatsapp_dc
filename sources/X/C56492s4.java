package X;

import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.Statistics$Data;
import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.2s4  reason: invalid class name and case insensitive filesystem */
public class C56492s4 {
    public C18910yS A00;
    public final C29441ip A01;
    public final C56612sH A02;
    public final C54292oU A03;
    public final C48092eK A04;
    public final C49242gD A05;

    public Statistics$Data A00() {
        Statistics$Data statistics$Data;
        C18910yS r1 = this.A00;
        C626936e.A0C(AnonymousClass000.A1W(r1));
        try {
            r1.A03.await();
        } catch (InterruptedException e) {
            Log.e("statistics/waitForStatsInit exception waiting", e);
        }
        C18910yS r2 = this.A00;
        synchronized (r2) {
            try {
                statistics$Data = new Statistics$Data(AnonymousClass0x9.A1H(r2.A00.A00()));
            } catch (JSONException e2) {
                throw C18330xA.A09(e2);
            }
        }
        return statistics$Data;
    }

    public final void A02() {
        this.A00.removeMessages(1);
        this.A00.sendEmptyMessageDelayed(1, 1000);
    }

    public void A03(int i, int i2) {
        C18890yQ r1;
        C49242gD r5 = this.A05;
        if (((long) i) >= 0 && (r1 = r5.A00) != null) {
            C626936e.A0C(true);
            Message.obtain(r1, 3, i2, i).sendToTarget();
            r5.A00();
        }
    }

    public void A04(long j, int i) {
        C18910yS r4 = this.A00;
        C626936e.A0C(AnonymousClass000.A1W(r4));
        if (j >= 0) {
            Message obtain = Message.obtain(r4, 5, i, 0);
            obtain.getData().putLong("bytes", j);
            obtain.sendToTarget();
            A02();
        }
    }

    public void A05(long j, int i) {
        C18890yQ r2;
        C49242gD r3 = this.A05;
        if (j >= 0 && (r2 = r3.A00) != null) {
            C626936e.A0C(true);
            Message obtain = Message.obtain(r2, 5, i, -1);
            obtain.getData().putLong("long_value", j);
            obtain.sendToTarget();
            r3.A00();
        }
    }

    public void A06(long j, int i) {
        C18910yS r4 = this.A00;
        C626936e.A0C(AnonymousClass000.A1W(r4));
        if (j >= 0) {
            Message obtain = Message.obtain(r4, 4, i, 0);
            obtain.getData().putLong("bytes", j);
            obtain.sendToTarget();
            A02();
        }
    }

    public void A07(long j, int i, boolean z) {
        C18910yS r1 = this.A00;
        C626936e.A0C(AnonymousClass000.A1W(r1));
        Message obtain = Message.obtain(r1, 7);
        Bundle data = obtain.getData();
        data.putInt("messageType", i);
        data.putLong("timestamp", j);
        data.putBoolean("isPayment", z);
        obtain.sendToTarget();
        A02();
    }

    public void A08(boolean z) {
        C18910yS r2 = this.A00;
        C626936e.A0C(AnonymousClass000.A1W(r2));
        Message.obtain(r2, 8, z ? 1 : 0, 0).sendToTarget();
        A02();
    }

    public C56492s4(C29441ip r1, C56612sH r2, C54292oU r3, C48092eK r4, C49242gD r5) {
        this.A03 = r3;
        this.A02 = r2;
        this.A05 = r5;
        this.A01 = r1;
        this.A04 = r4;
    }

    public void A01() {
        Log.i("statistics/init");
        C626936e.A0C(AnonymousClass000.A1X(this.A00));
        HandlerThread handlerThread = new HandlerThread("stat-save", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        C18910yS r1 = new C18910yS(looper, this, this.A01);
        this.A00 = r1;
        r1.sendEmptyMessage(0);
        C49242gD r3 = this.A05;
        r3.A00 = new C18890yQ(looper, r3.A01, r3.A02);
    }
}

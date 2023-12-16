package X;

import android.os.Handler;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.2zy  reason: invalid class name and case insensitive filesystem */
public class C61262zy {
    public boolean A00;
    public final long A01;
    public final C117095rN A02;
    public final C55682qk A03;
    public final AnonymousClass0N6 A04;
    public final C56612sH A05;
    public final C72303dV A06;
    public final AnonymousClass1VX A07;
    public final AnonymousClass4FS A08;
    public final Runnable A09;
    public final List A0A;
    public final Map A0B;
    public final Map A0C;
    public final Map A0D;

    public void A00() {
        synchronized (this) {
            if (!this.A0A.isEmpty() || !this.A0B.isEmpty()) {
                this.A00 = false;
                Iterator A0q = AnonymousClass000.A0q(this.A0B);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    Handler handler = (Handler) A0w.getKey();
                    this.A0C.put(handler, Boolean.TRUE);
                    handler.postAtFrontOfQueue((Runnable) A0w.getValue());
                }
                this.A08.Bkn(this.A02, "StuckDbHandlerThreadDetector/monitor", this.A01);
                return;
            }
            Log.d("StuckDbHandlerThreadDetector/startMonitoring nothing to monitor");
        }
    }

    public void A01(Handler handler) {
        synchronized (this) {
            this.A0B.put(handler, new C71573cK(handler, 48, this));
        }
    }

    public void A03(String str, ThreadPoolExecutor threadPoolExecutor) {
        synchronized (this) {
            this.A0A.add(new C42942Qd(str, threadPoolExecutor));
        }
    }

    public final void A02(String str) {
        Runnable runnable;
        AnonymousClass0N6 r1 = this.A04;
        boolean z = false;
        if (r1 != null) {
            boolean A0Z = AnonymousClass0x7.A0N(r1).A0Z();
            long j = this.A01;
            if (System.currentTimeMillis() - AnonymousClass0x7.A0N(r1).A0D() < j * 2) {
                z = true;
            }
            if (A0Z || z) {
                this.A08.Bkn(this.A02, "StuckDbHandlerThreadDetector/heartbeat", j);
                return;
            }
        }
        int A0O = this.A07.A0O(C58422vE.A01, 757) * 1000;
        if (A0O > 0 && (runnable = this.A09) != null) {
            Log.d("StuckDbHandlerThreadDetector/onStuckThread recovery enabled");
            long uptimeMillis = SystemClock.uptimeMillis();
            Map map = this.A0D;
            if (!map.containsKey(str)) {
                AnonymousClass0x2.A1K(str, map, uptimeMillis);
                this.A08.Bkn(this.A02, "StuckDbHandlerThreadDetector/recovery", (long) A0O);
            } else if (uptimeMillis - C18290x4.A0C(str, map) >= ((long) A0O)) {
                Log.d("StuckDbHandlerThreadDetector/onStuckThread recovery deadline reached");
                runnable.run();
            }
        }
        if (!this.A00) {
            C72303dV r2 = this.A06;
            if (r2 != null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("StuckDbHandlerThreadDetector/not responsive, debugName:");
                A0o.append(str);
                A0o.append(" msgStoreReadLock:");
                C18260x0.A1M(A0o, r2.A00.toString());
            }
            C615631i.A01();
            this.A03.A0A("db-thread-stuck", false, str);
            this.A00 = true;
            return;
        }
        Log.d("StuckDbHandlerThreadDetector/onStuckThread already reported");
    }

    public C61262zy(C55682qk r3, AnonymousClass0N6 r4, C56612sH r5, C72303dV r6, AnonymousClass1VX r7, AnonymousClass4FS r8, Runnable runnable, long j) {
        this.A02 = new C117095rN(this, 31);
        this.A00 = false;
        this.A0B = AnonymousClass001.A0t();
        this.A0C = AnonymousClass001.A0t();
        this.A0A = AnonymousClass001.A0s();
        this.A0D = AnonymousClass001.A0t();
        this.A05 = r5;
        this.A07 = r7;
        this.A03 = r3;
        this.A08 = r8;
        this.A04 = r4;
        this.A06 = r6;
        this.A09 = runnable;
        this.A01 = j;
    }

    public C61262zy(C55682qk r11, AnonymousClass0N6 r12, C56612sH r13, C72303dV r14, AnonymousClass1VX r15, AnonymousClass4FS r16) {
        this(r11, r12, r13, r14, r15, r16, new C172578Lw(29), 120000);
    }
}

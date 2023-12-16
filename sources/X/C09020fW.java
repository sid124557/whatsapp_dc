package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0fW  reason: invalid class name and case insensitive filesystem */
public class C09020fW implements C16140sX, C15380rF {
    public static final String A0C = C06240Wu.A01("Processor");
    public Context A00;
    public PowerManager.WakeLock A01;
    public C04320Nt A02;
    public WorkDatabase A03;
    public C16180sb A04;
    public List A05;
    public Map A06 = AnonymousClass001.A0t();
    public Map A07 = AnonymousClass001.A0t();
    public Map A08;
    public Set A09;
    public final Object A0A;
    public final List A0B;

    public static boolean A00(C13340n1 r3, String str) {
        if (r3 != null) {
            r3.A02();
            C06240Wu A002 = C06240Wu.A00();
            String str2 = A0C;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WorkerWrapper interrupted for ");
            C06240Wu.A03(A002, str, str2, A0o);
            return true;
        }
        C06240Wu A003 = C06240Wu.A00();
        String str3 = A0C;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("WorkerWrapper could not be found for ");
        C06240Wu.A03(A003, str, str3, A0o2);
        return false;
    }

    public final void A01() {
        synchronized (this.A0A) {
            if (!(!this.A07.isEmpty())) {
                Context context = this.A00;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    context.startService(intent);
                } catch (Throwable th) {
                    C06240Wu.A00();
                    Log.e(A0C, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.A01;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.A01 = null;
                }
            }
        }
    }

    public void A02(C16140sX r3) {
        synchronized (this.A0A) {
            this.A0B.add(r3);
        }
    }

    public void A03(C16140sX r3) {
        synchronized (this.A0A) {
            this.A0B.remove(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C03790Lo r14, X.C03440Kd r15) {
        /*
            r13 = this;
            X.0PL r4 = r15.A00
            java.lang.String r3 = r4.A01
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()
            r9 = r13
            androidx.work.impl.WorkDatabase r8 = r13.A03
            X.0nR r0 = new X.0nR
            r0.<init>(r13, r3, r12)
            java.lang.Object r10 = r8.A02(r0)
            X.0Wv r10 = (X.C06250Wv) r10
            r6 = 0
            if (r10 != 0) goto L_0x003a
            X.C06240Wu.A00()
            java.lang.String r2 = A0C
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Didn't find WorkSpec for id "
            java.lang.String r0 = X.AnonymousClass000.A0P(r4, r0, r1)
            android.util.Log.w(r2, r0)
            X.0sb r0 = r13.A04
            X.0fk r0 = (X.C09160fk) r0
            java.util.concurrent.Executor r1 = r0.A02
            X.0kp r0 = new X.0kp
            r0.<init>(r13, r4)
            r1.execute(r0)
            return r6
        L_0x003a:
            java.lang.Object r2 = r13.A0A
            monitor-enter(r2)
            boolean r0 = r13.A05(r3)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x0079
            java.util.Map r0 = r13.A08     // Catch:{ all -> 0x00e3 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x00e3 }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x00e3 }
            java.util.Iterator r0 = r3.iterator()     // Catch:{ all -> 0x00e3 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x00e3 }
            X.0Kd r0 = (X.C03440Kd) r0     // Catch:{ all -> 0x00e3 }
            X.0PL r0 = r0.A00     // Catch:{ all -> 0x00e3 }
            int r1 = r0.A00     // Catch:{ all -> 0x00e3 }
            int r0 = r4.A00     // Catch:{ all -> 0x00e3 }
            if (r1 != r0) goto L_0x008f
            r3.add(r15)     // Catch:{ all -> 0x00e3 }
            X.0Wu r5 = X.C06240Wu.A00()     // Catch:{ all -> 0x00e3 }
            java.lang.String r3 = A0C     // Catch:{ all -> 0x00e3 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = "Work "
            r1.append(r0)     // Catch:{ all -> 0x00e3 }
            r1.append(r4)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = " is already enqueued for processing"
            X.C06240Wu.A03(r5, r0, r3, r1)     // Catch:{ all -> 0x00e3 }
        L_0x0077:
            monitor-exit(r2)     // Catch:{ all -> 0x00e3 }
            goto L_0x009e
        L_0x0079:
            int r1 = r10.A0I     // Catch:{ all -> 0x00e3 }
            int r0 = r4.A00     // Catch:{ all -> 0x00e3 }
            if (r1 != r0) goto L_0x008f
            android.content.Context r6 = r13.A00     // Catch:{ all -> 0x00e3 }
            X.0Nt r7 = r13.A02     // Catch:{ all -> 0x00e3 }
            X.0sb r11 = r13.A04     // Catch:{ all -> 0x00e3 }
            X.0Mh r5 = new X.0Mh     // Catch:{ all -> 0x00e3 }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00e3 }
            java.util.List r0 = r13.A05     // Catch:{ all -> 0x00e3 }
            r5.A07 = r0     // Catch:{ all -> 0x00e3 }
            goto L_0x009f
        L_0x008f:
            X.0sb r0 = r13.A04     // Catch:{ all -> 0x00e3 }
            X.0fk r0 = (X.C09160fk) r0     // Catch:{ all -> 0x00e3 }
            java.util.concurrent.Executor r1 = r0.A02     // Catch:{ all -> 0x00e3 }
            X.0kp r0 = new X.0kp     // Catch:{ all -> 0x00e3 }
            r0.<init>(r13, r4)     // Catch:{ all -> 0x00e3 }
            r1.execute(r0)     // Catch:{ all -> 0x00e3 }
            goto L_0x0077
        L_0x009e:
            return r6
        L_0x009f:
            if (r14 == 0) goto L_0x00a3
            r5.A02 = r14     // Catch:{ all -> 0x00e3 }
        L_0x00a3:
            X.0n1 r6 = new X.0n1     // Catch:{ all -> 0x00e3 }
            r6.<init>(r5)     // Catch:{ all -> 0x00e3 }
            X.8yc r5 = r6.A01()     // Catch:{ all -> 0x00e3 }
            X.0ly r1 = new X.0ly     // Catch:{ all -> 0x00e3 }
            r1.<init>(r13, r4, r5)     // Catch:{ all -> 0x00e3 }
            X.0fk r11 = (X.C09160fk) r11     // Catch:{ all -> 0x00e3 }
            java.util.concurrent.Executor r0 = r11.A02     // Catch:{ all -> 0x00e3 }
            r5.AwV(r1, r0)     // Catch:{ all -> 0x00e3 }
            java.util.Map r0 = r13.A06     // Catch:{ all -> 0x00e3 }
            r0.put(r3, r6)     // Catch:{ all -> 0x00e3 }
            java.util.HashSet r1 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x00e3 }
            r1.add(r15)     // Catch:{ all -> 0x00e3 }
            java.util.Map r0 = r13.A08     // Catch:{ all -> 0x00e3 }
            r0.put(r3, r1)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r2)     // Catch:{ all -> 0x00e3 }
            X.0nb r0 = r11.A01
            r0.execute(r6)
            X.0Wu r3 = X.C06240Wu.A00()
            java.lang.String r2 = A0C
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            X.AnonymousClass000.A1A(r13, r1)
            java.lang.String r0 = ": processing "
            X.C06240Wu.A02(r3, r4, r0, r2, r1)
            r0 = 1
            return r0
        L_0x00e3:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09020fW.A04(X.0Lo, X.0Kd):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r3.A07.containsKey(r4) != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A0A
            monitor-enter(r2)
            java.util.Map r0 = r3.A06     // Catch:{ all -> 0x0017 }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0014
            java.util.Map r0 = r3.A07     // Catch:{ all -> 0x0017 }
            boolean r1 = r0.containsKey(r4)     // Catch:{ all -> 0x0017 }
            r0 = 0
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09020fW.A05(java.lang.String):boolean");
    }

    public void BSX(AnonymousClass0PL r7, boolean z) {
        synchronized (this.A0A) {
            Map map = this.A06;
            String str = r7.A01;
            C13340n1 r0 = (C13340n1) map.get(str);
            if (r0 != null && r7.equals(AnonymousClass0J0.A00(r0.A08))) {
                map.remove(str);
            }
            C06240Wu A002 = C06240Wu.A00();
            String str2 = A0C;
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1A(this, A0o);
            AnonymousClass001.A1L(A0o);
            A0o.append(str);
            A002.A04(str2, AnonymousClass000.A0b(" executed; reschedule = ", A0o, z));
            for (C16140sX BSX : this.A0B) {
                BSX.BSX(r7, z);
            }
        }
    }

    public C09020fW(Context context, C04320Nt r3, WorkDatabase workDatabase, C16180sb r5, List list) {
        this.A00 = context;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = workDatabase;
        this.A05 = list;
        this.A09 = AnonymousClass002.A0K();
        this.A0B = AnonymousClass001.A0s();
        this.A01 = null;
        this.A0A = AnonymousClass002.A0D();
        this.A08 = AnonymousClass001.A0t();
    }
}

package X;

import android.os.SystemClock;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8Mo  reason: invalid class name and case insensitive filesystem */
public abstract class C172748Mo implements Runnable, Delayed {
    public long A00;
    public long A01;
    public String A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C172748Mo)) {
            return false;
        }
        C172748Mo r7 = (C172748Mo) obj;
        if (this.A00 == r7.A00) {
            String str = this.A02;
            String str2 = r7.A02;
            if (str != null ? str.equals(str2) : str2 == null) {
                if (this.A01 == r7.A01) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        Delayed delayed = (Delayed) obj;
        if (delayed instanceof C172748Mo) {
            C172748Mo r10 = (C172748Mo) delayed;
            long j = this.A01;
            long j2 = r10.A01;
            if (j != j2 ? j - j2 < 0 : this.A00 - r10.A00 > 0) {
                return -1;
            }
            if (i != 0) {
                return 1;
            }
            return 0;
        }
        throw AnonymousClass001.A0c("Comparing a Dispatchable to a non-Dispatchable.");
    }

    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.A01 - SystemClock.uptimeMillis(), TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        if (r2 != null) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C125946Kc
            if (r0 == 0) goto L_0x0018
            r0 = r7
            X.6Kc r0 = (X.C125946Kc) r0
            X.7o9 r1 = r0.A00
            r0 = 0
            r1.A0B = r0
            X.7o9 r0 = r1.A07
            if (r0 != 0) goto L_0x0017
            X.7o9 r0 = r1.A08
            if (r0 != 0) goto L_0x0017
            r1.A02()
        L_0x0017:
            return
        L_0x0018:
            boolean r0 = r7 instanceof X.AnonymousClass6KZ
            if (r0 == 0) goto L_0x0021
            java.util.Vector r3 = X.C158417jw.A02
            monitor-enter(r3)
            goto L_0x0102
        L_0x0021:
            boolean r0 = r7 instanceof X.AnonymousClass6KY
            if (r0 == 0) goto L_0x0049
            java.util.List r0 = X.C161247pI.A09
            java.util.ListIterator r1 = r0.listIterator()
        L_0x002b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r1.next()
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.8gI r0 = (X.C177698gI) r0
            if (r0 == 0) goto L_0x0045
            android.view.View r0 = (android.view.View) r0
            r0.invalidate()
            goto L_0x002b
        L_0x0045:
            r1.remove()
            goto L_0x002b
        L_0x0049:
            boolean r0 = r7 instanceof X.C125936Kb
            if (r0 == 0) goto L_0x0064
            r0 = r7
            X.6Kb r0 = (X.C125936Kb) r0
            X.5Ld r1 = r0.A00
            r0 = 0
            r1.A0Q = r0
            X.8gH r2 = r1.A0L
            X.4PH r2 = (X.AnonymousClass4PH) r2
            X.8wD r1 = r2.A0T
            java.lang.String r0 = "gesture_single_long_tap"
            r1.BlT(r0)
            r2.A06()
            return
        L_0x0064:
            boolean r0 = r7 instanceof X.C125976Kf
            if (r0 == 0) goto L_0x00a7
            r6 = r7
            X.6Kf r6 = (X.C125976Kf) r6
            X.6KV r0 = r6.A04
            int r5 = r6.A01
            int r4 = r6.A02
            int r3 = r6.A03
            X.7o9 r2 = r0.A0C(r5, r4, r3)
            X.7o9 r0 = X.C186598vd.A00
            if (r2 == r0) goto L_0x008f
            r0 = 0
            if (r2 == 0) goto L_0x0084
        L_0x007e:
            r2.A02 = r5
            r2.A03 = r4
            r2.A04 = r3
        L_0x0084:
            X.6Ke r1 = new X.6Ke
            r1.<init>(r6, r2, r0)
            android.os.Handler r0 = X.C161847qe.A02
            r0.post(r1)
            return
        L_0x008f:
            int r1 = r2.A01
            int r0 = r2.A00
            X.7o9 r2 = new X.7o9
            r2.<init>(r1, r0)
            android.graphics.Bitmap r1 = X.C160697o9.A0F
            monitor-enter(r2)
            android.graphics.Bitmap r0 = r2.A05     // Catch:{ all -> 0x011a }
            if (r0 == r1) goto L_0x00a2
            r2.A04()     // Catch:{ all -> 0x011a }
        L_0x00a2:
            r2.A05 = r1     // Catch:{ all -> 0x011a }
            monitor-exit(r2)
            r0 = 1
            goto L_0x007e
        L_0x00a7:
            boolean r0 = r7 instanceof X.C125966Ke
            if (r0 == 0) goto L_0x00e9
            r3 = r7
            X.6Ke r3 = (X.C125966Ke) r3
            X.6Kf r6 = r3.A00
            X.6KV r5 = r6.A04
            X.5hC r0 = r5.A09
            X.4PH r0 = r0.A0R
            int r2 = r0.A0G
            X.7o9 r1 = r3.A01
            if (r1 == 0) goto L_0x0121
            X.7b0 r0 = r5.A0A
            r0.A02(r1)
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0017
            int r1 = r6.A03
            int r0 = r2 + 1
            if (r1 > r0) goto L_0x0017
            r5.A02()
            java.util.ArrayList r3 = X.AnonymousClass6KV.A0C
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0017
            int r2 = r3.size()
            r1 = 0
        L_0x00db:
            if (r1 >= r2) goto L_0x011d
            java.lang.Object r0 = r3.get(r1)
            X.5h5 r0 = (X.C110815h5) r0
            r0.A02()
            int r1 = r1 + 1
            goto L_0x00db
        L_0x00e9:
            r0 = r7
            X.6Ka r0 = (X.C125926Ka) r0
            X.4PH r2 = r0.A00
            java.util.Queue r0 = r2.A0U
            if (r0 == 0) goto L_0x0017
        L_0x00f2:
            java.util.Queue r0 = r2.A0U
            java.lang.Object r1 = r0.poll()
            X.8ko r1 = (X.C180298ko) r1
            if (r1 == 0) goto L_0x013c
            X.5hC r0 = r2.A0M
            r1.BW1(r0)
            goto L_0x00f2
        L_0x0102:
            int r2 = r3.size()     // Catch:{ all -> 0x0117 }
            r1 = 0
        L_0x0107:
            if (r1 >= r2) goto L_0x0115
            java.lang.Object r0 = r3.get(r1)     // Catch:{ all -> 0x0117 }
            X.7jw r0 = (X.C158417jw) r0     // Catch:{ all -> 0x0117 }
            r0.A01()     // Catch:{ all -> 0x0117 }
            int r1 = r1 + 1
            goto L_0x0107
        L_0x0115:
            monitor-exit(r3)     // Catch:{ all -> 0x0117 }
            return
        L_0x0117:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0117 }
            throw r0
        L_0x011a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x011d:
            r3.clear()
            return
        L_0x0121:
            int r4 = r6.A00
            if (r4 <= 0) goto L_0x0136
            int r3 = r6.A03
            r0 = -1
            if (r3 == r0) goto L_0x012c
            if (r3 != r2) goto L_0x0136
        L_0x012c:
            int r2 = r6.A01
            int r1 = r6.A02
            int r0 = r4 + -1
            r5.A0E(r2, r1, r3, r0)
            return
        L_0x0136:
            X.7o9 r0 = r6.A05
            r0.A03()
            return
        L_0x013c:
            r0 = 0
            r2.A0U = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172748Mo.run():void");
    }
}

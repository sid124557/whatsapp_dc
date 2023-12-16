package X;

import com.whatsapp.util.Log;
import java.io.EOFException;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2sU  reason: invalid class name and case insensitive filesystem */
public class C56742sU {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C56712sR A07;
    public File A08;
    public Long A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E;
    public final AnonymousClass7TB A0F = new AnonymousClass7TB();
    public final List A0G = new CopyOnWriteArrayList();
    public volatile File A0H;

    public synchronized int A00() {
        return this.A01;
    }

    public synchronized long A01() {
        long j;
        j = this.A04;
        if (j == 0) {
            j = this.A03;
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        if (r3 == -1) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long A02(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r1 = r5.A01     // Catch:{ all -> 0x004d }
            r0 = 3
            if (r1 != r0) goto L_0x0009
            long r3 = r5.A04     // Catch:{ all -> 0x004d }
            goto L_0x0044
        L_0x0009:
            boolean r0 = r5.A0B(r6)     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0013
            monitor-exit(r5)
            r0 = 0
            return r0
        L_0x0013:
            long r1 = r5.A01()     // Catch:{ all -> 0x004d }
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0047
            X.2sR r3 = r5.A07     // Catch:{ all -> 0x004d }
            long r1 = r3.A01     // Catch:{ all -> 0x004d }
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
            int r2 = r3.A02(r6)     // Catch:{ all -> 0x004d }
        L_0x0027:
            int r1 = r3.A00     // Catch:{ all -> 0x004d }
            if (r2 >= r1) goto L_0x0034
            boolean r0 = r3.A09(r2)     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0034
            int r2 = r2 + 1
            goto L_0x0027
        L_0x0034:
            if (r2 == r1) goto L_0x0040
            long r3 = r3.A04(r2)     // Catch:{ all -> 0x004d }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0044
        L_0x0040:
            long r3 = r5.A01()     // Catch:{ all -> 0x004d }
        L_0x0044:
            long r3 = r3 - r6
            monitor-exit(r5)
            return r3
        L_0x0047:
            java.io.EOFException r0 = new java.io.EOFException     // Catch:{ all -> 0x004d }
            r0.<init>()     // Catch:{ all -> 0x004d }
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56742sU.A02(long):long");
    }

    public synchronized File A03() {
        return this.A0H;
    }

    public synchronized void A04() {
        File file = this.A08;
        if (file != null) {
            if (!file.delete()) {
                Log.w("DownloadContext/unable to delete chunkstore file");
            }
            this.A08 = null;
        }
    }

    public synchronized void A05(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            for (C185938uU BRZ : this.A0G) {
                BRZ.BRZ(i);
            }
        }
    }

    public synchronized void A06(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            for (C185938uU BRa : this.A0G) {
                BRa.BRa(this);
            }
        }
    }

    public synchronized void A07(long j, long j2) {
        this.A06 = j;
        for (C185938uU BNz : this.A0G) {
            BNz.BNz(this, j2);
        }
    }

    public synchronized void A08(C185938uU r2) {
        this.A0G.add(r2);
    }

    public synchronized void A09(File file) {
        this.A0H = file;
        for (C185938uU BTP : this.A0G) {
            BTP.BTP(this);
        }
    }

    public synchronized boolean A0A() {
        return this.A0C;
    }

    public synchronized boolean A0B(long j) {
        if (this.A01 == 3) {
            return true;
        }
        if (this.A07 == null) {
            return false;
        }
        if (j <= A01()) {
            return this.A07.A09(this.A07.A02(j));
        }
        throw new EOFException();
    }
}

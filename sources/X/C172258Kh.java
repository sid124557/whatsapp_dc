package X;

import android.graphics.Bitmap;
import java.io.Closeable;

/* renamed from: X.8Kh  reason: invalid class name and case insensitive filesystem */
public class C172258Kh implements Closeable, Cloneable {
    public static final C180358ku A04 = new AnonymousClass82M();
    public static final C180368kv A05 = new AnonymousClass93M(0);
    public boolean A00 = false;
    public final C180358ku A01;
    public final C158097jQ A02;
    public final Throwable A03;

    public synchronized C172258Kh A02() {
        Throwable th;
        if (!A04()) {
            return null;
        }
        C153877cA.A01(A04());
        C158097jQ r3 = this.A02;
        C180358ku r2 = this.A01;
        if (this.A03 != null) {
            th = new Throwable();
        } else {
            th = null;
        }
        return new C172258Kh(r2, r3, th);
    }

    public synchronized Object A03() {
        Object A002;
        C153877cA.A01(AnonymousClass000.A1T(this.A00 ? 1 : 0));
        A002 = this.A02.A00();
        A002.getClass();
        return A002;
    }

    public synchronized boolean A04() {
        return !this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r3.A01();
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        if (r1 > 0) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0017, code lost:
        r0 = java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        if (r0.booleanValue() != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        throw X.AnonymousClass6CA.A0N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0028, code lost:
        r1 = r1 - 1;
        r3.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
        if (r1 != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1 = r3.A01;
        r3.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0034, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0035, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0037, code lost:
        r3.A02.Bim(r1);
        r5 = X.C158097jQ.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003e, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r0 = (java.lang.Integer) r5.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0045, code lost:
        if (r0 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0047, code lost:
        r2 = new java.lang.Object[]{r1.getClass()};
        r1 = X.C161577py.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005b, code lost:
        if (r1.BI0(6) == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005d, code lost:
        r1.Bsm("SharedReference", X.AnonymousClass6CA.A0T("No entry in sLiveObjects for value of type %s", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0064, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0066, code lost:
        r0 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006a, code lost:
        if (r0 != 1) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006c, code lost:
        r5.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0070, code lost:
        X.C18280x3.A1D(r1, r5, r0 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0075, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r3 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        monitor-enter(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.A00     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r6)     // Catch:{ all -> 0x0080 }
            return
        L_0x0007:
            r0 = 1
            r6.A00 = r0     // Catch:{ all -> 0x0080 }
            monitor-exit(r6)     // Catch:{ all -> 0x0080 }
            X.7jQ r3 = r6.A02
            monitor-enter(r3)
            r3.A01()     // Catch:{ all -> 0x007d }
            int r1 = r3.A00     // Catch:{ all -> 0x007d }
            r2 = 1
            if (r1 > 0) goto L_0x0017
            r0 = 0
        L_0x0017:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0028
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()     // Catch:{ all -> 0x007d }
            throw r0     // Catch:{ all -> 0x007d }
        L_0x0028:
            int r1 = r1 - r2
            r3.A00 = r1     // Catch:{ all -> 0x007d }
            monitor-exit(r3)
            if (r1 != 0) goto L_0x007c
            monitor-enter(r3)
            java.lang.Object r1 = r3.A01     // Catch:{ all -> 0x0079 }
            r0 = 0
            r3.A01 = r0     // Catch:{ all -> 0x0079 }
            monitor-exit(r3)     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x007c
            X.8kv r0 = r3.A02
            r0.Bim(r1)
            java.util.Map r5 = X.C158097jQ.A03
            monitor-enter(r5)
            java.lang.Object r0 = r5.get(r1)     // Catch:{ all -> 0x0076 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x0066
            java.lang.String r4 = "SharedReference"
            java.lang.String r3 = "No entry in sLiveObjects for value of type %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0076 }
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0076 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0076 }
            X.8vJ r1 = X.C161577py.A00     // Catch:{ all -> 0x0076 }
            r0 = 6
            boolean r0 = r1.BI0(r0)     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = X.AnonymousClass6CA.A0T(r3, r2)     // Catch:{ all -> 0x0076 }
            r1.Bsm(r4, r0)     // Catch:{ all -> 0x0076 }
        L_0x0064:
            monitor-exit(r5)     // Catch:{ all -> 0x0076 }
            goto L_0x0075
        L_0x0066:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0076 }
            if (r0 != r2) goto L_0x0070
            r5.remove(r1)     // Catch:{ all -> 0x0076 }
            goto L_0x0064
        L_0x0070:
            int r0 = r0 - r2
            X.C18280x3.A1D(r1, r5, r0)     // Catch:{ all -> 0x0076 }
            goto L_0x0064
        L_0x0075:
            return
        L_0x0076:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0076 }
            throw r0
        L_0x0079:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0079 }
            throw r0
        L_0x007c:
            return
        L_0x007d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0080:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0080 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172258Kh.close():void");
    }

    public void finalize() {
        String str;
        try {
            synchronized (this) {
                if (!this.A00) {
                    C158097jQ r5 = this.A02;
                    Object A002 = r5.A00();
                    Object[] A1X = AnonymousClass0x9.A1X();
                    AnonymousClass000.A1L(A1X, System.identityHashCode(this));
                    AnonymousClass000.A1M(A1X, System.identityHashCode(r5));
                    if (A002 == null) {
                        str = null;
                    } else {
                        str = AnonymousClass000.A0O(A002);
                    }
                    A1X[2] = str;
                    C161577py.A04("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", A1X);
                    C180358ku r1 = this.A01;
                    if (r1 != null) {
                        r1.Bjg(r5, this.A03);
                    }
                    close();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public static boolean A01(C172258Kh r1) {
        if (r1 == null || !r1.A04()) {
            return false;
        }
        return true;
    }

    public C172258Kh(C180358ku r2, C158097jQ r3, Throwable th) {
        this.A02 = r3;
        synchronized (r3) {
            r3.A01();
            r3.A00++;
        }
        this.A01 = r2;
        this.A03 = th;
    }

    public static Bitmap A00(C172258Kh r0) {
        return (Bitmap) r0.A03();
    }

    public /* bridge */ /* synthetic */ Object clone() {
        Throwable th;
        C153877cA.A01(A04());
        C158097jQ r3 = this.A02;
        C180358ku r2 = this.A01;
        if (this.A03 != null) {
            th = new Throwable();
        } else {
            th = null;
        }
        return new C172258Kh(r2, r3, th);
    }

    public C172258Kh(C180358ku r3, C180368kv r4, Object obj) {
        this.A02 = new C158097jQ(r4, obj);
        this.A01 = r3;
        this.A03 = null;
    }
}

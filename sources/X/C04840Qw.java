package X;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.0Qw  reason: invalid class name and case insensitive filesystem */
public class C04840Qw {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final LinkedHashMap A06;

    public final synchronized int A00() {
        return this.A02;
    }

    public final synchronized int A01() {
        return this.A05;
    }

    public final synchronized Map A06() {
        return new LinkedHashMap(this.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r2 = r4.A05     // Catch:{ all -> 0x0054 }
            if (r2 < 0) goto L_0x0042
            java.util.LinkedHashMap r1 = r4.A06     // Catch:{ all -> 0x0054 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x000f
            if (r2 != 0) goto L_0x0042
        L_0x000f:
            if (r2 <= r5) goto L_0x0040
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x0040
            java.util.Iterator r0 = X.AnonymousClass001.A0u(r1)     // Catch:{ all -> 0x0054 }
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r0)     // Catch:{ all -> 0x0054 }
            java.lang.Object r3 = r0.getKey()     // Catch:{ all -> 0x0054 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0054 }
            r1.remove(r3)     // Catch:{ all -> 0x0054 }
            int r1 = r4.A05     // Catch:{ all -> 0x0054 }
            int r0 = r4.A03(r3, r2)     // Catch:{ all -> 0x0054 }
            int r1 = r1 - r0
            r4.A05 = r1     // Catch:{ all -> 0x0054 }
            int r0 = r4.A00     // Catch:{ all -> 0x0054 }
            r1 = 1
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            r0 = 0
            r4.A09(r1, r3, r2, r0)
            goto L_0x0000
        L_0x0040:
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            return
        L_0x0042:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = X.AnonymousClass000.A0O(r4)     // Catch:{ all -> 0x0054 }
            r1.append(r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r1)     // Catch:{ all -> 0x0054 }
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04840Qw.A07(int):void");
    }

    public final synchronized String toString() {
        Locale locale;
        Object[] objArr;
        int i = this.A01;
        int i2 = this.A03;
        int i3 = i2 + i;
        int i4 = 0;
        if (i3 != 0) {
            i4 = (i * 100) / i3;
        }
        locale = Locale.US;
        objArr = new Object[4];
        AnonymousClass000.A1P(objArr, this.A02, 0);
        AnonymousClass000.A1M(objArr, i);
        AnonymousClass000.A1N(objArr, i2);
        AnonymousClass000.A1O(objArr, i4);
        return String.format(locale, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", objArr);
    }

    public final Object A04(Object obj) {
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.A06.get(obj);
                if (obj2 != null) {
                    this.A01++;
                    return obj2;
                }
                this.A03++;
                return null;
            }
        }
        throw AnonymousClass001.A0g("key == null");
    }

    public final Object A05(Object obj) {
        Object remove;
        if (obj != null) {
            synchronized (this) {
                remove = this.A06.remove(obj);
                if (remove != null) {
                    this.A05 -= A03(obj, remove);
                }
            }
            if (remove != null) {
                A09(false, obj, remove, (Object) null);
            }
            return remove;
        }
        throw AnonymousClass001.A0g("key == null");
    }

    public final void A08(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw AnonymousClass001.A0g("key == null || value == null");
        }
        synchronized (this) {
            this.A04++;
            this.A05 += A03(obj, obj2);
            put = this.A06.put(obj, obj2);
            if (put != null) {
                this.A05 -= A03(obj, put);
            }
        }
        if (put != null) {
            A09(false, obj, put, obj2);
        }
        A07(this.A02);
    }

    public C04840Qw(int i) {
        if (i > 0) {
            this.A02 = i;
            this.A06 = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw AnonymousClass001.A0c("maxSize <= 0");
    }

    public int A02(Object obj, Object obj2) {
        return 1;
    }

    public final int A03(Object obj, Object obj2) {
        int A022 = A02(obj, obj2);
        if (A022 >= 0) {
            return A022;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Negative size: ");
        A0o.append(obj);
        throw AnonymousClass000.A0H(obj2, "=", A0o);
    }

    public void A09(boolean z, Object obj, Object obj2, Object obj3) {
    }
}

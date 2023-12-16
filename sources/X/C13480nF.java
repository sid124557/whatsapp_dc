package X;

import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: X.0nF  reason: invalid class name and case insensitive filesystem */
public class C13480nF implements Comparator, C187468xG {
    public long A00;
    public long A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final Map A07 = AnonymousClass001.A0t();
    public final Map A08 = AnonymousClass001.A0t();
    public final SortedSet A09;
    public final TreeSet A0A;

    public static int A00(C172488Li r9, C172488Li r10) {
        long j = r9.A03;
        long j2 = r10.A03;
        if (j - j2 == 0) {
            return r9.compareTo(r10);
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|(6:21|22|23|(2:27|(3:29|44|41))|30|(3:32|45|41)(1:42))(1:43)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0051 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051 A[EDGE_INSN: B:46:0x0051->B:18:0x0051 ?: BREAK  , LOOP:1: B:18:0x0051->B:41:0x0051, LOOP_START, SYNTHETIC, Splitter:B:18:0x0051] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C186458vL r8, java.lang.String r9, long r10) {
        /*
            r7 = this;
            java.lang.String r0 = "preVideoLruProtectPrefetchEvict"
            X.C153827c5.A01(r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = X.AnonymousClass0JJ.A00(r9)     // Catch:{ all -> 0x0096 }
            if (r4 == 0) goto L_0x0051
            java.util.Map r0 = r7.A08     // Catch:{ all -> 0x0096 }
            java.lang.Object r3 = r0.get(r4)     // Catch:{ all -> 0x0096 }
            java.util.TreeSet r3 = (java.util.TreeSet) r3     // Catch:{ all -> 0x0096 }
            if (r3 == 0) goto L_0x0051
        L_0x0015:
            java.util.Map r0 = r7.A07     // Catch:{ all -> 0x0096 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0096 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0051
            long r0 = r0.longValue()     // Catch:{ all -> 0x0096 }
            float r5 = (float) r0     // Catch:{ all -> 0x0096 }
            long r0 = r7.A06     // Catch:{ all -> 0x0096 }
            float r2 = (float) r0     // Catch:{ all -> 0x0096 }
            float r5 = r5 / r2
            float r0 = r7.A03     // Catch:{ all -> 0x0096 }
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0051
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x0051
            boolean r0 = r8 instanceof X.C126346Nm     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0047
            r2 = r8
            X.6Nm r2 = (X.C126346Nm) r2     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r3.first()     // Catch:{ all -> 0x0096 }
            X.8Li r1 = (X.C172488Li) r1     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "lru_policy"
            r2.BjP(r1, r0)     // Catch:{ all -> 0x0096 }
            goto L_0x0015
        L_0x0047:
            java.lang.Object r0 = r3.first()     // Catch:{ 6te -> 0x0015 }
            X.8Li r0 = (X.C172488Li) r0     // Catch:{ 6te -> 0x0015 }
            r8.BjO(r0)     // Catch:{ 6te -> 0x0015 }
            goto L_0x0015
        L_0x0051:
            long r5 = r7.A00     // Catch:{ all -> 0x0096 }
            long r0 = r7.A01     // Catch:{ all -> 0x0096 }
            long r5 = r5 + r0
            long r5 = r5 + r10
            long r3 = r7.A06     // Catch:{ all -> 0x0096 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0092
            float r2 = (float) r0     // Catch:{ all -> 0x0096 }
            float r1 = (float) r3     // Catch:{ all -> 0x0096 }
            float r0 = r7.A02     // Catch:{ 6te -> 0x0051 }
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x006e
            java.util.SortedSet r0 = r7.A09     // Catch:{ 6te -> 0x0051 }
            boolean r0 = r0.isEmpty()     // Catch:{ 6te -> 0x0051 }
            if (r0 == 0) goto L_0x0080
        L_0x006e:
            java.util.TreeSet r1 = r7.A0A     // Catch:{ 6te -> 0x0051 }
            boolean r0 = r1.isEmpty()     // Catch:{ 6te -> 0x0051 }
            if (r0 != 0) goto L_0x0080
            java.lang.Object r0 = r1.first()     // Catch:{ 6te -> 0x0051 }
            X.8Li r0 = (X.C172488Li) r0     // Catch:{ 6te -> 0x0051 }
            r8.BjO(r0)     // Catch:{ 6te -> 0x0051 }
            goto L_0x0051
        L_0x0080:
            java.util.SortedSet r1 = r7.A09     // Catch:{ 6te -> 0x0051 }
            boolean r0 = r1.isEmpty()     // Catch:{ 6te -> 0x0051 }
            if (r0 != 0) goto L_0x0092
            java.lang.Object r0 = r1.first()     // Catch:{ 6te -> 0x0051 }
            X.8Li r0 = (X.C172488Li) r0     // Catch:{ 6te -> 0x0051 }
            r8.BjO(r0)     // Catch:{ 6te -> 0x0051 }
            goto L_0x0051
        L_0x0092:
            X.C153827c5.A00()
            return
        L_0x0096:
            r0 = move-exception
            X.C153827c5.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13480nF.A01(X.8vL, java.lang.String, long):void");
    }

    public final boolean A02(C172488Li r7) {
        if (r7.A05 <= ((long) this.A05)) {
            return true;
        }
        return false;
    }

    public void Bbs(C186458vL r9, C172488Li r10) {
        String A002 = AnonymousClass0JJ.A00(r10.A07);
        Map map = this.A07;
        Number number = (Number) map.get(A002);
        if (number != null) {
            long longValue = number.longValue() - r10.A04;
            Long valueOf = Long.valueOf(longValue);
            if (longValue <= 0) {
                map.remove(A002);
            } else {
                map.put(A002, valueOf);
            }
        }
        Map map2 = this.A08;
        AbstractCollection abstractCollection = (AbstractCollection) map2.get(A002);
        if (abstractCollection != null) {
            abstractCollection.remove(r10);
            if (abstractCollection.isEmpty()) {
                map2.remove(A002);
            }
        }
        if (A02(r10)) {
            this.A0A.remove(r10);
            this.A01 -= r10.A04;
            return;
        }
        this.A09.remove(r10);
        this.A00 -= r10.A04;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return A00((C172488Li) obj, (C172488Li) obj2);
    }

    public C13480nF(double d, double d2, int i, int i2, long j, boolean z) {
        SortedSet concurrentSkipListSet;
        j = j <= 0 ? 104857600 : j;
        d = d <= 0.0d ? 0.10000000149011612d : d;
        d2 = d2 <= 0.0d ? 0.30000001192092896d : d2;
        this.A06 = j;
        this.A04 = i;
        this.A03 = (float) d;
        this.A05 = i2;
        this.A02 = (float) d2;
        this.A01 = 0;
        this.A00 = 0;
        this.A0A = new TreeSet(this);
        if (!z) {
            concurrentSkipListSet = new TreeSet(this);
        } else {
            concurrentSkipListSet = new ConcurrentSkipListSet(this);
        }
        this.A09 = concurrentSkipListSet;
    }

    public void Bbr(C186458vL r8, C172488Li r9) {
        long j;
        long j2;
        if (A02(r9)) {
            this.A0A.add(r9);
            long j3 = this.A01;
            j = r9.A04;
            this.A01 = j3 + j;
        } else {
            this.A09.add(r9);
            long j4 = this.A00;
            j = r9.A04;
            this.A00 = j4 + j;
        }
        String str = r9.A07;
        String A002 = AnonymousClass0JJ.A00(str);
        Map map = this.A07;
        Number number = (Number) map.get(A002);
        if (number != null) {
            j2 = number.longValue() + j;
        } else {
            j2 = j;
        }
        map.put(A002, Long.valueOf(j2));
        if (r9.A05 > ((long) this.A04)) {
            Map map2 = this.A08;
            AbstractCollection abstractCollection = (AbstractCollection) map2.get(A002);
            if (abstractCollection != null) {
                abstractCollection.add(r9);
            } else {
                TreeSet treeSet = new TreeSet(this);
                treeSet.add(r9);
                map2.put(A002, treeSet);
            }
        }
        A01(r8, str, 0);
    }

    public void Bbt(C140846uc r1, C186458vL r2, C172488Li r3, C172488Li r4) {
        Bbs(r2, r3);
        Bbr(r2, r4);
    }

    public void BSI(String str, String str2, int i, int i2) {
    }

    public void BcC(C186458vL r1, String str, long j, long j2) {
        A01(r1, str, j2);
    }
}

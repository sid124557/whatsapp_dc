package X;

import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.0nE  reason: invalid class name and case insensitive filesystem */
public class C13470nE implements Comparator, C187468xG {
    public float A00;
    public int A01;
    public long A02;
    public final long A03;
    public final Map A04 = AnonymousClass001.A0t();
    public final Map A05 = AnonymousClass001.A0t();
    public final TreeSet A06;

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

    /* JADX WARNING: Can't wrap try/catch for region: R(6:21|22|33|31|19|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0051 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a A[SYNTHETIC, Splitter:B:21:0x005a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C186458vL r7, java.lang.String r8, long r9) {
        /*
            r6 = this;
            java.lang.String r0 = "perVideoLRUEvict"
            X.C153827c5.A01(r0)     // Catch:{ all -> 0x006a }
            java.lang.String r4 = X.AnonymousClass0JJ.A00(r8)     // Catch:{ all -> 0x006a }
            if (r4 == 0) goto L_0x0051
            java.util.Map r0 = r6.A05     // Catch:{ all -> 0x006a }
            java.lang.Object r3 = r0.get(r4)     // Catch:{ all -> 0x006a }
            java.util.TreeSet r3 = (java.util.TreeSet) r3     // Catch:{ all -> 0x006a }
            if (r3 == 0) goto L_0x0051
        L_0x0015:
            java.util.Map r0 = r6.A04     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x006a }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0051
            long r0 = r0.longValue()     // Catch:{ all -> 0x006a }
            float r5 = (float) r0     // Catch:{ all -> 0x006a }
            long r0 = r6.A03     // Catch:{ all -> 0x006a }
            float r2 = (float) r0     // Catch:{ all -> 0x006a }
            float r5 = r5 / r2
            float r0 = r6.A00     // Catch:{ all -> 0x006a }
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0051
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0051
            boolean r0 = r7 instanceof X.C126346Nm     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0047
            r2 = r7
            X.6Nm r2 = (X.C126346Nm) r2     // Catch:{ all -> 0x006a }
            java.lang.Object r1 = r3.first()     // Catch:{ all -> 0x006a }
            X.8Li r1 = (X.C172488Li) r1     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "lru_policy"
            r2.BjP(r1, r0)     // Catch:{ all -> 0x006a }
            goto L_0x0015
        L_0x0047:
            java.lang.Object r0 = r3.first()     // Catch:{ 6te -> 0x0015 }
            X.8Li r0 = (X.C172488Li) r0     // Catch:{ 6te -> 0x0015 }
            r7.BjO(r0)     // Catch:{ 6te -> 0x0015 }
            goto L_0x0015
        L_0x0051:
            long r3 = r6.A02     // Catch:{ all -> 0x006a }
            long r3 = r3 + r9
            long r1 = r6.A03     // Catch:{ all -> 0x006a }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
            java.util.TreeSet r0 = r6.A06     // Catch:{ 6te -> 0x0051 }
            java.lang.Object r0 = r0.first()     // Catch:{ 6te -> 0x0051 }
            X.8Li r0 = (X.C172488Li) r0     // Catch:{ 6te -> 0x0051 }
            r7.BjO(r0)     // Catch:{ 6te -> 0x0051 }
            goto L_0x0051
        L_0x0066:
            X.C153827c5.A00()
            return
        L_0x006a:
            r0 = move-exception
            X.C153827c5.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13470nE.A01(X.8vL, java.lang.String, long):void");
    }

    public void Bbr(C186458vL r8, C172488Li r9) {
        long j;
        this.A06.add(r9);
        long j2 = this.A02;
        long j3 = r9.A04;
        this.A02 = j2 + j3;
        String str = r9.A07;
        String A002 = AnonymousClass0JJ.A00(str);
        Map map = this.A04;
        Number number = (Number) map.get(A002);
        if (number != null) {
            j = number.longValue() + j3;
        } else {
            j = j3;
        }
        map.put(A002, Long.valueOf(j));
        if (r9.A05 > ((long) this.A01)) {
            Map map2 = this.A05;
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

    public void Bbs(C186458vL r9, C172488Li r10) {
        String A002 = AnonymousClass0JJ.A00(r10.A07);
        Map map = this.A04;
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
        Map map2 = this.A05;
        AbstractCollection abstractCollection = (AbstractCollection) map2.get(A002);
        if (abstractCollection != null) {
            abstractCollection.remove(r10);
            if (abstractCollection.isEmpty()) {
                map2.remove(A002);
            }
        }
        this.A06.remove(r10);
        this.A02 -= r10.A04;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return A00((C172488Li) obj, (C172488Li) obj2);
    }

    public C13470nE(double d, int i, long j) {
        j = j <= 0 ? 104857600 : j;
        d = d <= 0.0d ? 0.10000000149011612d : d;
        this.A03 = j;
        this.A01 = i;
        this.A00 = (float) d;
        this.A06 = new TreeSet(this);
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

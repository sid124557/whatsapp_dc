package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.7iv  reason: invalid class name and case insensitive filesystem */
public abstract class C157817iv {
    public static C157817iv A00(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C126116Kt(context);
        }
        C126126Ku r1 = new C126126Ku();
        if (r1.A02(new long[8])) {
            return r1;
        }
        return new C126136Kv(context);
    }

    public boolean A01() {
        if (this instanceof C126136Kv) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c6, code lost:
        if (X.C126126Ku.A04.compareTo(r3) != 0) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b7 A[Catch:{ 8RC -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ce A[Catch:{ 8RC -> 0x0132 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(long[] r12) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.C126136Kv
            if (r0 == 0) goto L_0x001d
            r3 = r11
            X.6Kv r3 = (X.C126136Kv) r3
            monitor-enter(r3)
            boolean r0 = r3.A02     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r0 != 0) goto L_0x000f
            goto L_0x012f
        L_0x000f:
            r3.A03()     // Catch:{ all -> 0x001a }
            long[] r1 = r3.A04     // Catch:{ all -> 0x001a }
            int r0 = r12.length     // Catch:{ all -> 0x001a }
            java.lang.System.arraycopy(r1, r2, r12, r2, r0)     // Catch:{ all -> 0x001a }
            goto L_0x012c
        L_0x001a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x001d:
            r8 = r11
            X.6Ku r8 = (X.C126126Ku) r8
            X.7bg r1 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            if (r1 != 0) goto L_0x002d
            java.lang.String r0 = "/proc/net/xt_qtaguid/stats"
            X.7bg r1 = new X.7bg     // Catch:{ 8RC -> 0x0132 }
            r1.<init>(r0)     // Catch:{ 8RC -> 0x0132 }
            r8.A00 = r1     // Catch:{ 8RC -> 0x0132 }
        L_0x002d:
            r1.A02()     // Catch:{ 8RC -> 0x0132 }
            X.7bg r1 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            boolean r0 = r1.A05     // Catch:{ 8RC -> 0x0132 }
            if (r0 == 0) goto L_0x0130
            boolean r0 = r1.A07()     // Catch:{ 8RC -> 0x0132 }
            if (r0 == 0) goto L_0x0130
            r1 = 0
            java.util.Arrays.fill(r12, r1)     // Catch:{ 8RC -> 0x0132 }
            X.7bg r0 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            r0.A03()     // Catch:{ 8RC -> 0x0132 }
        L_0x0046:
            X.7bg r0 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            boolean r0 = r0.A07()     // Catch:{ 8RC -> 0x0132 }
            r7 = 1
            if (r0 == 0) goto L_0x012d
            X.7bg r0 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            r0.A04()     // Catch:{ 8RC -> 0x0132 }
            X.7bg r5 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            java.nio.CharBuffer r3 = r8.A01     // Catch:{ 8RC -> 0x0132 }
            r4 = r3
            r3.clear()     // Catch:{ 8RC -> 0x0132 }
            r6 = 1
        L_0x005d:
            boolean r0 = r5.A07()     // Catch:{ 8RC -> 0x0132 }
            if (r0 == 0) goto L_0x008f
            r5.A05()     // Catch:{ 8RC -> 0x0132 }
            char r0 = r5.A00     // Catch:{ 8RC -> 0x0132 }
            boolean r0 = java.lang.Character.isWhitespace(r0)     // Catch:{ 8RC -> 0x0132 }
            if (r0 != 0) goto L_0x008c
            boolean r0 = r4.hasRemaining()     // Catch:{ 8RC -> 0x0132 }
            if (r0 != 0) goto L_0x0085
            int r0 = r4.capacity()     // Catch:{ 8RC -> 0x0132 }
            int r0 = r0 * 2
            java.nio.CharBuffer r0 = java.nio.CharBuffer.allocate(r0)     // Catch:{ 8RC -> 0x0132 }
            r4.flip()     // Catch:{ 8RC -> 0x0132 }
            r0.put(r4)     // Catch:{ 8RC -> 0x0132 }
            r4 = r0
        L_0x0085:
            char r0 = r5.A00     // Catch:{ 8RC -> 0x0132 }
            r4.put(r0)     // Catch:{ 8RC -> 0x0132 }
            r6 = 0
            goto L_0x005d
        L_0x008c:
            if (r6 != 0) goto L_0x0124
            goto L_0x0093
        L_0x008f:
            if (r6 == 0) goto L_0x0096
            goto L_0x011c
        L_0x0093:
            r5.A06()     // Catch:{ 8RC -> 0x0132 }
        L_0x0096:
            r4.flip()     // Catch:{ 8RC -> 0x0132 }
            X.7bg r0 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            r0.A04()     // Catch:{ 8RC -> 0x0132 }
            X.7bg r0 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            r0.A04()     // Catch:{ 8RC -> 0x0132 }
            X.7bg r0 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            long r9 = r0.A00()     // Catch:{ 8RC -> 0x0132 }
            X.7bg r0 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            r0.A04()     // Catch:{ 8RC -> 0x0132 }
            java.nio.CharBuffer r0 = X.C126126Ku.A05     // Catch:{ 8RC -> 0x0132 }
            int r0 = r0.compareTo(r3)     // Catch:{ 8RC -> 0x0132 }
            r6 = 1
            if (r0 == 0) goto L_0x00cf
            r6 = 0
            java.nio.CharBuffer r0 = X.C126126Ku.A03     // Catch:{ 8RC -> 0x0132 }
            int r0 = r0.compareTo(r3)     // Catch:{ 8RC -> 0x0132 }
            if (r0 == 0) goto L_0x00cf
            java.nio.CharBuffer r0 = X.C126126Ku.A04     // Catch:{ 8RC -> 0x0132 }
            int r0 = r0.compareTo(r3)     // Catch:{ 8RC -> 0x0132 }
            if (r0 == 0) goto L_0x00cf
        L_0x00c8:
            long r3 = X.C126126Ku.A02     // Catch:{ 8RC -> 0x0132 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0115
            goto L_0x00d1
        L_0x00cf:
            r7 = 0
            goto L_0x00c8
        L_0x00d1:
            if (r6 != 0) goto L_0x00d6
            if (r7 != 0) goto L_0x00d6
            goto L_0x0115
        L_0x00d6:
            X.7bg r0 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            long r4 = r0.A00()     // Catch:{ 8RC -> 0x0132 }
            X.7bg r0 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            r0.A04()     // Catch:{ 8RC -> 0x0132 }
            r7 = 2
            if (r6 == 0) goto L_0x00e5
            r7 = 0
        L_0x00e5:
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r0 = 0
            if (r3 != 0) goto L_0x00eb
            r0 = 4
        L_0x00eb:
            r7 = r7 | r0
            r5 = r12[r7]     // Catch:{ 8RC -> 0x0132 }
            X.7bg r0 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            long r3 = r0.A00()     // Catch:{ 8RC -> 0x0132 }
            long r5 = r5 + r3
            r12[r7] = r5     // Catch:{ 8RC -> 0x0132 }
            X.7bg r0 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            r0.A04()     // Catch:{ 8RC -> 0x0132 }
            X.7bg r0 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            r0.A04()     // Catch:{ 8RC -> 0x0132 }
            r7 = r7 | 1
            r5 = r12[r7]     // Catch:{ 8RC -> 0x0132 }
            X.7bg r0 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            long r3 = r0.A00()     // Catch:{ 8RC -> 0x0132 }
            long r5 = r5 + r3
            r12[r7] = r5     // Catch:{ 8RC -> 0x0132 }
            X.7bg r0 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            r0.A03()     // Catch:{ 8RC -> 0x0132 }
            goto L_0x0046
        L_0x0115:
            X.7bg r0 = r8.A00     // Catch:{ 8RC -> 0x0132 }
            r0.A03()     // Catch:{ 8RC -> 0x0132 }
            goto L_0x0046
        L_0x011c:
            java.lang.String r0 = "Couldn't read string because file ended!"
            X.8RC r1 = new X.8RC     // Catch:{ 8RC -> 0x0132 }
            r1.<init>(r0)     // Catch:{ 8RC -> 0x0132 }
            goto L_0x012b
        L_0x0124:
            java.lang.String r0 = "Couldn't read string!"
            X.8RC r1 = new X.8RC     // Catch:{ 8RC -> 0x0132 }
            r1.<init>(r0)     // Catch:{ 8RC -> 0x0132 }
        L_0x012b:
            throw r1     // Catch:{ 8RC -> 0x0132 }
        L_0x012c:
            monitor-exit(r3)
        L_0x012d:
            r0 = 1
            return r0
        L_0x012f:
            monitor-exit(r3)
        L_0x0130:
            r0 = 0
            return r0
        L_0x0132:
            r2 = move-exception
            java.lang.String r1 = "QTagUidNetworkBytesCollector"
            java.lang.String r0 = "Unable to parse file"
            android.util.Log.e(r1, r0, r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157817iv.A02(long[]):boolean");
    }
}

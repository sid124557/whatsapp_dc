package X;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7kY  reason: invalid class name and case insensitive filesystem */
public class C158787kY {
    public static final C158787kY A04 = new C158787kY();
    public int A00 = 0;
    public final AnonymousClass7W4 A01 = new AnonymousClass7W4(this);
    public volatile long A02 = -1;
    public volatile Map A03 = AnonymousClass001.A0t();

    public C186508vT A00(C180188kd r6, AnonymousClass7QT r7, String str, boolean z) {
        Set set;
        if (r7.A0I) {
            AnonymousClass7W4 r4 = this.A01;
            C158787kY r3 = r4.A02;
            if (r3.A03(r7, z) && r3.A02(r7, str)) {
                synchronized (r3.A03) {
                    set = (Set) r3.A03.get(str);
                }
                if (set != null) {
                    synchronized (set) {
                        if (!set.isEmpty()) {
                            r3.A00--;
                            Iterator it = set.iterator();
                            C186508vT r1 = (C186508vT) it.next();
                            it.remove();
                            return r1;
                        }
                    }
                }
            }
            try {
                if (r7.A09) {
                    return r6.B0N(str, z);
                }
                return r4.A00(str, z);
            } catch (Exception e) {
                throw new C143436ys(str, e);
            }
        } else {
            if (A03(r7, z) && A02(r7, str)) {
                synchronized (this) {
                    Set set2 = (Set) this.A03.get(str);
                    if (set2 != null && !set2.isEmpty()) {
                        this.A00--;
                        Iterator it2 = set2.iterator();
                        C186508vT r12 = (C186508vT) it2.next();
                        it2.remove();
                        return r12;
                    }
                }
            }
            try {
                if (r7.A09) {
                    return r6.B0N(str, z);
                }
                return this.A01.A00(str, z);
            } catch (Exception e2) {
                throw new C143436ys(str, e2);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:102|(1:104)|105|(1:(2:114|(1:116)))|117|118|119|120|121|(1:125)|126|127) */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x015e, code lost:
        r5.A02 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0161, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0162, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        r5.A02 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0165, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0180, code lost:
        if (r8.A0O != false) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (r8.A0K != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r4.size() < r8.A02) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00bf, code lost:
        if (r1 != false) goto L_0x00c7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:120:0x0145 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00ba */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x016d A[ADDED_TO_REGION, Catch:{ all -> 0x0189 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ba A[SYNTHETIC, Splitter:B:65:0x00ba] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C186508vT r20, X.C141246vG r21, X.AnonymousClass7QT r22, java.lang.String r23, boolean r24) {
        /*
            r19 = this;
            r8 = r22
            boolean r0 = r8.A0I
            r5 = r19
            r6 = r20
            r9 = r23
            r10 = r24
            if (r0 == 0) goto L_0x00f0
            X.7W4 r0 = r5.A01
            X.7kY r7 = r0.A02
            boolean r1 = r7.A03(r8, r10)
            if (r1 == 0) goto L_0x00d4
            boolean r1 = r7.A02(r8, r9)
            if (r1 == 0) goto L_0x00d4
            boolean r1 = r8.A0J
            r11 = 1
            if (r1 == 0) goto L_0x0047
            boolean r2 = r0.A00
            if (r2 != 0) goto L_0x0047
            r0.A00 = r11
            java.util.concurrent.ScheduledExecutorService r12 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            r2 = 4
            X.8MF r13 = new X.8MF
            r3 = r21
            r13.<init>(r0, r2, r3)
            r14 = 5
            r3 = 1000(0x3e8, float:1.401E-42)
            int r2 = r8.A04
            int r2 = java.lang.Math.max(r3, r2)
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r18 = java.util.concurrent.TimeUnit.MILLISECONDS
            r16 = r2
            r12.scheduleAtFixedRate(r13, r14, r16, r18)
        L_0x0047:
            int r3 = r7.A00
            int r2 = r8.A03
            r5 = 0
            if (r3 >= r2) goto L_0x00d4
            java.util.Map r3 = r7.A03
            monitor-enter(r3)
            java.util.Map r2 = r7.A03     // Catch:{ all -> 0x00cb }
            java.lang.Object r4 = r2.get(r9)     // Catch:{ all -> 0x00cb }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ all -> 0x00cb }
            if (r4 != 0) goto L_0x0064
            java.util.HashSet r4 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x00cb }
            java.util.Map r2 = r7.A03     // Catch:{ all -> 0x00cb }
            r2.put(r9, r4)     // Catch:{ all -> 0x00cb }
        L_0x0064:
            monitor-exit(r3)     // Catch:{ all -> 0x00cb }
            monitor-enter(r4)
            boolean r2 = r4.contains(r6)     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x006e
            r11 = 0
            goto L_0x0081
        L_0x006e:
            if (r24 == 0) goto L_0x0075
            boolean r2 = r8.A0L     // Catch:{ all -> 0x00c8 }
            if (r2 != 0) goto L_0x0079
            goto L_0x0083
        L_0x0075:
            boolean r2 = r8.A0K     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x0083
        L_0x0079:
            int r3 = r4.size()     // Catch:{ all -> 0x00c8 }
            int r2 = r8.A02     // Catch:{ all -> 0x00c8 }
            if (r3 >= r2) goto L_0x0083
        L_0x0081:
            monitor-exit(r4)     // Catch:{ all -> 0x00c8 }
            goto L_0x0086
        L_0x0083:
            r11 = 0
            r5 = 1
            goto L_0x0081
        L_0x0086:
            if (r5 != 0) goto L_0x00d4
            if (r1 != 0) goto L_0x00a9
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x00ba, all -> 0x00c2 }
            r7.A02 = r2     // Catch:{ IllegalStateException -> 0x00ba, all -> 0x00c2 }
            r6.reset()     // Catch:{ IllegalStateException -> 0x00ba, all -> 0x00c2 }
            if (r11 == 0) goto L_0x00a4
            monitor-enter(r4)     // Catch:{ IllegalStateException -> 0x00ba, all -> 0x00c2 }
            r4.add(r6)     // Catch:{ all -> 0x00a1 }
            int r2 = r7.A00     // Catch:{ all -> 0x00a1 }
            int r2 = r2 + 1
            r7.A00 = r2     // Catch:{ all -> 0x00a1 }
            monitor-exit(r4)     // Catch:{ all -> 0x00a1 }
            goto L_0x00a4
        L_0x00a1:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a1 }
            throw r2     // Catch:{ IllegalStateException -> 0x00ba, all -> 0x00c2 }
        L_0x00a4:
            r0 = -1
            r7.A02 = r0
            return
        L_0x00a9:
            r12 = 1
            X.7Os r5 = new X.7Os     // Catch:{ IllegalStateException -> 0x00ba }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IllegalStateException -> 0x00ba }
            java.util.concurrent.ConcurrentLinkedQueue r3 = r0.A01     // Catch:{ IllegalStateException -> 0x00ba }
            monitor-enter(r3)     // Catch:{ IllegalStateException -> 0x00ba }
            r3.add(r5)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r3)     // Catch:{ all -> 0x00b7 }
            return
        L_0x00b7:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b7 }
            throw r2     // Catch:{ IllegalStateException -> 0x00ba }
        L_0x00ba:
            r0.A01(r6, r9)     // Catch:{ all -> 0x00be }
            goto L_0x00ce
        L_0x00be:
            r2 = move-exception
            if (r1 != 0) goto L_0x00c7
            goto L_0x00c3
        L_0x00c2:
            r2 = move-exception
        L_0x00c3:
            r0 = -1
            r7.A02 = r0
        L_0x00c7:
            throw r2
        L_0x00c8:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00c8 }
            throw r2
        L_0x00cb:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00cb }
            throw r2
        L_0x00ce:
            if (r1 != 0) goto L_0x00d4
            r1 = -1
            r7.A02 = r1
        L_0x00d4:
            boolean r1 = r8.A0J
            if (r1 != 0) goto L_0x00de
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            goto L_0x0174
        L_0x00de:
            r11 = 0
            X.7Os r5 = new X.7Os
            r12 = r11
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.A01
            monitor-enter(r0)
            r0.add(r5)     // Catch:{ all -> 0x00ed }
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            return
        L_0x00ed:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            throw r2
        L_0x00f0:
            boolean r0 = r5.A03(r8, r10)
            if (r0 == 0) goto L_0x0169
            boolean r0 = r5.A02(r8, r9)
            if (r0 == 0) goto L_0x0169
            monitor-enter(r5)
            int r1 = r5.A00     // Catch:{ all -> 0x0166 }
            int r0 = r8.A03     // Catch:{ all -> 0x0166 }
            if (r1 >= r0) goto L_0x0122
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x0166 }
            java.lang.Object r2 = r0.get(r9)     // Catch:{ all -> 0x0166 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x0166 }
            if (r2 != 0) goto L_0x0116
            java.util.HashSet r2 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0166 }
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x0166 }
            r0.put(r9, r2)     // Catch:{ all -> 0x0166 }
        L_0x0116:
            boolean r0 = r2.contains(r6)     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x0139
            if (r24 == 0) goto L_0x0124
            boolean r0 = r8.A0L     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x0128
        L_0x0122:
            monitor-exit(r5)     // Catch:{ all -> 0x0166 }
            goto L_0x0169
        L_0x0124:
            boolean r0 = r8.A0K     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x0122
        L_0x0128:
            int r1 = r2.size()     // Catch:{ all -> 0x0166 }
            int r0 = r8.A02     // Catch:{ all -> 0x0166 }
            if (r1 >= r0) goto L_0x0122
            r2.add(r6)     // Catch:{ all -> 0x0166 }
            int r0 = r5.A00     // Catch:{ all -> 0x0166 }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x0166 }
        L_0x0139:
            r1 = -1
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0145 }
            r5.A02 = r3     // Catch:{ IllegalStateException -> 0x0145 }
            r6.reset()     // Catch:{ IllegalStateException -> 0x0145 }
            goto L_0x015e
        L_0x0145:
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x0162 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0162 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x015b
            boolean r0 = r0.remove(r6)     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x015b
            int r0 = r5.A00     // Catch:{ all -> 0x0162 }
            int r0 = r0 + -1
            r5.A00 = r0     // Catch:{ all -> 0x0162 }
        L_0x015b:
            r5.A02 = r1     // Catch:{ all -> 0x0166 }
            goto L_0x0122
        L_0x015e:
            r5.A02 = r1     // Catch:{ all -> 0x0166 }
            monitor-exit(r5)     // Catch:{ all -> 0x0166 }
            return
        L_0x0162:
            r0 = move-exception
            r5.A02 = r1     // Catch:{ all -> 0x0166 }
            throw r0     // Catch:{ all -> 0x0166 }
        L_0x0166:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0166 }
            throw r0
        L_0x0169:
            boolean r0 = r8.A0P     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x0182
            if (r24 != 0) goto L_0x0185
            boolean r0 = r8.A0O     // Catch:{ all -> 0x0189 }
            if (r0 != 0) goto L_0x0185
            goto L_0x0182
        L_0x0174:
            boolean r0 = r8.A0P     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x0182
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0189 }
            if (r0 != 0) goto L_0x0185
            boolean r0 = r8.A0O     // Catch:{ all -> 0x0189 }
            if (r0 != 0) goto L_0x0185
        L_0x0182:
            r6.stop()     // Catch:{ all -> 0x0189 }
        L_0x0185:
            r6.release()
            return
        L_0x0189:
            r0 = move-exception
            r6.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158787kY.A01(X.8vT, X.6vG, X.7QT, java.lang.String, boolean):void");
    }

    public final boolean A02(AnonymousClass7QT r3, String str) {
        if (str.equals("meta.dav1d.av1.decoder") && r3.A08) {
            return false;
        }
        String str2 = r3.A07;
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        return str2.equals(str);
    }

    public final boolean A03(AnonymousClass7QT r6, boolean z) {
        if (r6.A0B && this.A02 != -1 && SystemClock.elapsedRealtime() - this.A02 > 5000) {
            return false;
        }
        if (z) {
            if (!r6.A0L) {
                return false;
            }
            return true;
        } else if (r6.A0K) {
            return true;
        } else {
            return false;
        }
    }
}

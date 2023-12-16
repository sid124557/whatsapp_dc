package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3UD  reason: invalid class name */
public class AnonymousClass3UD implements C186568vZ {
    public final C56612sH A00;
    public final AnonymousClass337 A01;
    public final AnonymousClass4FX A02;
    public final AnonymousClass32C A03;
    public final C60282yI A04;
    public final C60282yI A05;
    public final C45492a6 A06;
    public final C85144Fc A07;
    public final AnonymousClass3DI A08;
    public final C72173dI A09;
    public final AnonymousClass4FS A0A;
    public final C183538qC A0B;
    public final ConcurrentHashMap A0C = AnonymousClass0x9.A1D();
    public final ConcurrentLinkedQueue A0D = new ConcurrentLinkedQueue();
    public final ConcurrentNavigableMap A0E = new ConcurrentSkipListMap();
    public final CopyOnWriteArrayList A0F = new CopyOnWriteArrayList();
    public final AtomicInteger A0G = new AtomicInteger(0);

    public static long A00(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static AnonymousClass30Y A01(AnonymousClass3UD r1, int i) {
        return r1.A06((Integer) null, i);
    }

    public void BKg(String str, int i, short s) {
        AnonymousClass30Y A072 = A07((Integer) null, i, System.nanoTime(), s);
        if (A072 != null) {
            if (!A072.A04(str)) {
                this.A02.Bgx(i, str);
            }
            A09(A072);
        }
    }

    public void BKn(int i, boolean z) {
        A08((Integer) null, 551497305, System.nanoTime(), false);
    }

    public void endAllMarkers(short s, boolean z) {
        if (this.A01.A03()) {
            long nanoTime = System.nanoTime();
            short s2 = s;
            boolean z2 = z;
            A0B(this.A0E, nanoTime, s2, z2);
            A0B(this.A0C, nanoTime, s2, z2);
        }
    }

    public void markerStart(int i, String str, String str2) {
        A03(A08((Integer) null, i, System.nanoTime(), true), str2, str);
    }

    public static void A03(AnonymousClass30Y r1, String str, String str2) {
        if (r1 != null) {
            r1.A00(str.length(), str2, str);
        }
    }

    public static void A04(AnonymousClass3UD r1, Object obj, long j, short s) {
        AnonymousClass30Y r2 = (AnonymousClass30Y) obj;
        if (r2 != null) {
            r2.A02(j, s);
            r1.A0D.add(r2);
            r1.A0G.decrementAndGet();
        }
    }

    public AnonymousClass30Y A06(Integer num, int i) {
        Object A0W;
        if (num == null) {
            A0W = C18290x4.A0j(this.A0C, i);
        } else {
            A0W = C18280x3.A0W(this.A0E, A00(i, num.intValue()));
        }
        return (AnonymousClass30Y) A0W;
    }

    public AnonymousClass30Y A07(Integer num, int i, long j, short s) {
        Object remove;
        if (num == null) {
            remove = this.A0C.remove(Integer.valueOf(i));
        } else {
            remove = this.A0E.remove(Long.valueOf(A00(i, num.intValue())));
        }
        AnonymousClass30Y r1 = (AnonymousClass30Y) remove;
        if (r1 != null) {
            r1.A02(j, s);
            this.A0G.decrementAndGet();
        }
        return r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass30Y A08(java.lang.Integer r25, int r26, long r27, boolean r29) {
        /*
            r24 = this;
            r2 = r24
            X.337 r0 = r2.A01
            boolean r0 = r0.A03()
            r5 = 0
            if (r0 == 0) goto L_0x0026
            X.4Fc r4 = r2.A07
            r3 = r26
            boolean r0 = r4.BIn(r3)
            if (r0 == 0) goto L_0x0026
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0G
            r23 = r0
            int r1 = r23.get()
            r0 = 50
            if (r1 < r0) goto L_0x0027
            X.4FX r0 = r2.A02
            r0.BKu(r3)
        L_0x0026:
            return r5
        L_0x0027:
            X.3UC r4 = (X.AnonymousClass3UC) r4
            X.337 r4 = r4.A01
            X.2QV r0 = r4.A01(r3)
            boolean r0 = r0.A03
            r22 = r0
            X.2QV r0 = r4.A01(r3)
            long r0 = r0.A01
            r20 = r0
            X.2QV r0 = r4.A01(r3)
            boolean r0 = r0.A02
            r19 = r0
            X.2yI r6 = r2.A04
            X.337 r1 = r6.A01
            r1.A02()
            java.lang.Boolean r0 = r1.A03
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "QplListenersManager/collectListenersForMarker: QPL listeners disabled"
        L_0x0054:
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0057:
            X.2vQ r4 = X.C58542vQ.A02
        L_0x0059:
            X.4FX r0 = r2.A02
            X.30Y r5 = new X.30Y
            r11 = r25
            r15 = r27
            r18 = r29
            r7 = r5
            r8 = r0
            r9 = r4
            r10 = r6
            r12 = r3
            r13 = r20
            r17 = r22
            r7.<init>(r8, r9, r10, r11, r12, r13, r15, r17, r18)
            r23.incrementAndGet()
            r4 = 1
            r6.A01(r5, r4)
            if (r19 == 0) goto L_0x0081
            java.lang.String r1 = "is_overwritten_sampling_rate_by_experiment"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r5.A00(r4, r1, r0)
        L_0x0081:
            if (r25 != 0) goto L_0x00a5
            java.util.concurrent.ConcurrentHashMap r1 = r2.A0C
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r1.put(r0, r5)
        L_0x008d:
            X.30Y r4 = (X.AnonymousClass30Y) r4
            if (r4 == 0) goto L_0x0026
            r3 = 4
            long r0 = java.lang.System.nanoTime()
            r4.A02(r0, r3)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r2.A0D
            r0.add(r4)
            r23.decrementAndGet()
            r2.Bsf()
            return r5
        L_0x00a5:
            java.util.concurrent.ConcurrentNavigableMap r4 = r2.A0E
            int r0 = r11.intValue()
            long r0 = A00(r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r4 = r4.put(r0, r5)
            goto L_0x008d
        L_0x00b8:
            r0 = 916783105(0x36a50001, float:4.9173836E-6)
            if (r3 != r0) goto L_0x00c0
            java.lang.String r0 = "QplListenersManager/QPL listeners"
            goto L_0x0054
        L_0x00c0:
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()
            X.2QV r0 = r1.A01(r3)
            long r4 = r0.A00
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0057
            int[] r13 = X.AnonymousClass2BD.A00
            int r12 = r13.length
            r11 = 0
        L_0x00dc:
            if (r11 >= r12) goto L_0x0158
            r1 = r13[r11]
            r0 = 1
            int r0 = r1 - r0
            r9 = 1
            long r9 = r9 << r0
            long r15 = r4 & r9
            r9 = 0
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0155
            X.4Fc r9 = r6.A03
            X.3UC r9 = (X.AnonymousClass3UC) r9
            X.337 r0 = r9.A01
            r0.A02()
            java.lang.Long r0 = r0.A04
            long r17 = r0.longValue()
            r15 = 1
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0115
            r15 = 0
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0155
            java.util.Random r0 = r9.A03
            long r9 = r0.nextLong()
            long r9 = r9 % r17
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0155
        L_0x0115:
            X.2TS r15 = r6.A04
            java.util.concurrent.ConcurrentHashMap r10 = r15.A07
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r10.get(r9)
            if (r0 != 0) goto L_0x0152
            monitor-enter(r10)
            java.lang.Object r0 = r10.get(r9)     // Catch:{ all -> 0x0193 }
            X.4GE r0 = (X.AnonymousClass4GE) r0     // Catch:{ all -> 0x0193 }
            if (r0 == 0) goto L_0x012e
            monitor-exit(r10)     // Catch:{ all -> 0x0193 }
            goto L_0x0152
        L_0x012e:
            r0 = 5
            if (r1 == r0) goto L_0x013b
            r0 = 9
            if (r1 == r0) goto L_0x0145
            X.3U9 r0 = new X.3U9     // Catch:{ all -> 0x0193 }
            r0.<init>()     // Catch:{ all -> 0x0193 }
            goto L_0x014e
        L_0x013b:
            X.33i r1 = r15.A01     // Catch:{ all -> 0x0193 }
            X.2Hz r15 = r15.A06     // Catch:{ all -> 0x0193 }
            X.3UB r0 = new X.3UB     // Catch:{ all -> 0x0193 }
            r0.<init>(r1, r15)     // Catch:{ all -> 0x0193 }
            goto L_0x014e
        L_0x0145:
            X.2sH r1 = r15.A02     // Catch:{ all -> 0x0193 }
            X.28f r15 = r15.A05     // Catch:{ all -> 0x0193 }
            X.3UA r0 = new X.3UA     // Catch:{ all -> 0x0193 }
            r0.<init>(r1, r15)     // Catch:{ all -> 0x0193 }
        L_0x014e:
            r10.put(r9, r0)     // Catch:{ all -> 0x0193 }
            monitor-exit(r10)     // Catch:{ all -> 0x0193 }
        L_0x0152:
            r14.add(r0)
        L_0x0155:
            int r11 = r11 + 1
            goto L_0x00dc
        L_0x0158:
            java.util.Iterator r4 = r14.iterator()
        L_0x015c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0170
            java.lang.Object r1 = r4.next()
            X.4GE r1 = (X.AnonymousClass4GE) r1
            boolean r0 = r1.BIm()
            X.C18300x5.A1M(r1, r7, r8, r0)
            goto L_0x015c
        L_0x0170:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x017e
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x017e
            goto L_0x0057
        L_0x017e:
            X.4Ec[] r0 = X.C58542vQ.A03
            java.lang.Object[] r1 = r8.toArray(r0)
            X.4Ec[] r1 = (X.C84884Ec[]) r1
            java.lang.Object[] r0 = r7.toArray(r0)
            X.4Ec[] r0 = (X.C84884Ec[]) r0
            X.2vQ r4 = new X.2vQ
            r4.<init>(r1, r0)
            goto L_0x0059
        L_0x0193:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0193 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UD.A08(java.lang.Integer, int, long, boolean):X.30Y");
    }

    public void A09(AnonymousClass30Y r2) {
        if (r2 != null) {
            this.A0D.add(r2);
            Bsf();
        }
    }

    public final void A0A(ConcurrentMap concurrentMap, long j) {
        if (!concurrentMap.isEmpty()) {
            Iterator A0q = AnonymousClass000.A0q(concurrentMap);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                AnonymousClass30Y r6 = (AnonymousClass30Y) A0w.getValue();
                if (r6 != null) {
                    if (r6.A03 + TimeUnit.MILLISECONDS.toNanos((long) 300000) < j) {
                        A04(this, concurrentMap.remove(A0w.getKey()), j, 113);
                    }
                }
            }
            Bsf();
        }
    }

    public void B2S(int i, short s) {
        if (this.A01.A03()) {
            long nanoTime = System.nanoTime();
            A0A(this.A0C, nanoTime);
            A0A(this.A0E, nanoTime);
        }
    }

    public Collection B4R() {
        HashSet A15 = AnonymousClass0x9.A15(this.A0C.keySet());
        Iterator it = this.A0E.keySet().iterator();
        while (it.hasNext()) {
            C18270x1.A1K(A15, (int) (C18270x1.A02(it) >> 32));
        }
        return A15;
    }

    public boolean BFG() {
        return AnonymousClass0x7.A1S(this.A0D);
    }

    public boolean BKi(int i) {
        AnonymousClass3UC r3 = (AnonymousClass3UC) this.A07;
        AnonymousClass337 r1 = r3.A01;
        if (!r1.A03()) {
            return false;
        }
        if (r1.A01(689639794).A03) {
            return r3.A00(689639794);
        }
        return true;
    }

    public Long Bgb() {
        AnonymousClass30Y r0 = (AnonymousClass30Y) this.A0D.peek();
        if (r0 == null) {
            return null;
        }
        long j = r0.A0F.get();
        if (j != -1) {
            return Long.valueOf(j);
        }
        return null;
    }

    public Integer Bgc() {
        AnonymousClass30Y r0 = (AnonymousClass30Y) this.A0D.peek();
        if (r0 != null) {
            return Integer.valueOf(r0.A01);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02cc, code lost:
        r7.A01.BJT(r6.A00, r0.getMessage());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String Bgy() {
        /*
            r19 = this;
            r0 = r19
            X.32C r7 = r0.A03
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.A0D
            java.lang.Object r6 = r0.poll()
            X.30Y r6 = (X.AnonymousClass30Y) r6
            r8 = 0
            if (r6 == 0) goto L_0x02d7
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x02cb }
            java.lang.String r0 = "marker_id"
            int r4 = r6.A00     // Catch:{ JSONException -> 0x02cb }
            r5.put(r0, r4)     // Catch:{ JSONException -> 0x02cb }
            java.util.concurrent.ConcurrentHashMap r3 = r6.A09     // Catch:{ JSONException -> 0x02cb }
            java.lang.String r2 = "subType"
            java.lang.Object r0 = r3.get(r2)     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x002e
            java.lang.String r1 = "da_type"
            java.lang.Object r0 = r3.get(r2)     // Catch:{ JSONException -> 0x02cb }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x02cb }
        L_0x002e:
            java.lang.Integer r1 = r6.A07     // Catch:{ JSONException -> 0x02cb }
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = "instance_id"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x02cb }
        L_0x0037:
            java.lang.String r1 = "action_id"
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0D     // Catch:{ JSONException -> 0x02cb }
            int r0 = r0.get()     // Catch:{ JSONException -> 0x02cb }
            short r0 = (short) r0     // Catch:{ JSONException -> 0x02cb }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x02cb }
            java.lang.String r1 = "method"
            boolean r0 = r6.A0H     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = "per_user"
        L_0x004d:
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x02cb }
            java.lang.String r2 = "sample_rate"
            long r0 = r6.A02     // Catch:{ JSONException -> 0x02cb }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x02cb }
            java.lang.String r9 = "duration_ns"
            java.util.concurrent.atomic.AtomicLong r0 = r6.A0F     // Catch:{ JSONException -> 0x02cb }
            long r0 = r0.get()     // Catch:{ JSONException -> 0x02cb }
            long r2 = r6.A03     // Catch:{ JSONException -> 0x02cb }
            long r0 = r0 - r2
            r5.put(r9, r0)     // Catch:{ JSONException -> 0x02cb }
            java.lang.String r10 = "wa_ab_key2"
            X.2SW r0 = r7.A00     // Catch:{ JSONException -> 0x02cb }
            X.2rU r9 = r0.A02     // Catch:{ JSONException -> 0x02cb }
            monitor-enter(r9)     // Catch:{ JSONException -> 0x02cb }
            goto L_0x0073
        L_0x006f:
            java.lang.String r0 = "random_sampling"
            goto L_0x004d
        L_0x0073:
            android.content.SharedPreferences r1 = r9.A00     // Catch:{ all -> 0x02c8 }
            java.lang.String r0 = "ab_props:sys:config_key"
            java.lang.String r0 = r1.getString(r0, r8)     // Catch:{ all -> 0x02c8 }
            monitor-exit(r9)     // Catch:{ JSONException -> 0x02cb }
            r5.put(r10, r0)     // Catch:{ JSONException -> 0x02cb }
            java.lang.String r1 = "wa_ab_expo_key"
            java.lang.String r0 = r9.A01()     // Catch:{ JSONException -> 0x02cb }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x02cb }
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ JSONException -> 0x02cb }
            java.util.concurrent.ConcurrentHashMap r0 = r6.A0B     // Catch:{ JSONException -> 0x02cb }
            java.util.Iterator r1 = X.C18290x4.A10(r0)     // Catch:{ JSONException -> 0x02cb }
        L_0x0093:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x0093
            r9.add(r0)     // Catch:{ JSONException -> 0x02cb }
            goto L_0x0093
        L_0x00a3:
            java.util.Collections.sort(r9)     // Catch:{ JSONException -> 0x02cb }
            boolean r0 = r9.isEmpty()     // Catch:{ JSONException -> 0x02cb }
            if (r0 != 0) goto L_0x00e8
            org.json.JSONArray r10 = X.AnonymousClass0x9.A1F()     // Catch:{ JSONException -> 0x02cb }
            java.util.Iterator r13 = r9.iterator()     // Catch:{ JSONException -> 0x02cb }
        L_0x00b4:
            boolean r0 = r13.hasNext()     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r12 = r13.next()     // Catch:{ JSONException -> 0x02cb }
            X.3ZI r12 = (X.AnonymousClass3ZI) r12     // Catch:{ JSONException -> 0x02cb }
            org.json.JSONObject r11 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x02cb }
            java.lang.String r1 = r12.A02     // Catch:{ JSONException -> 0x02cb }
            java.lang.String r0 = "name"
            r11.put(r0, r1)     // Catch:{ JSONException -> 0x02cb }
            long r0 = r12.A00     // Catch:{ JSONException -> 0x02cb }
            long r0 = r0 - r2
            java.lang.String r9 = "time_since_start_ns"
            r11.put(r9, r0)     // Catch:{ JSONException -> 0x02cb }
            java.lang.String r1 = r12.A01     // Catch:{ JSONException -> 0x02cb }
            if (r1 == 0) goto L_0x00de
            java.lang.String r0 = "data"
            r11.put(r0, r1)     // Catch:{ JSONException -> 0x02cb }
        L_0x00de:
            r10.put(r11)     // Catch:{ JSONException -> 0x02cb }
            goto L_0x00b4
        L_0x00e2:
            java.lang.String r0 = "points"
            r5.put(r0, r10)     // Catch:{ JSONException -> 0x02cb }
        L_0x00e8:
            java.util.HashMap r9 = X.AnonymousClass001.A0t()     // Catch:{ JSONException -> 0x02cb }
            java.util.concurrent.ConcurrentHashMap r3 = r6.A08     // Catch:{ JSONException -> 0x02cb }
            java.util.Iterator r2 = X.C18290x4.A11(r3)     // Catch:{ JSONException -> 0x02cb }
        L_0x00f2:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x0106
            java.lang.Object r1 = r2.next()     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r0 = r3.get(r1)     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x00f2
            r9.put(r1, r0)     // Catch:{ JSONException -> 0x02cb }
            goto L_0x00f2
        L_0x0106:
            boolean r0 = r9.isEmpty()     // Catch:{ JSONException -> 0x02cb }
            if (r0 != 0) goto L_0x01dc
            java.util.HashMap r3 = X.AnonymousClass001.A0t()     // Catch:{ JSONException -> 0x02cb }
            java.util.Iterator r2 = X.AnonymousClass001.A0u(r9)     // Catch:{ JSONException -> 0x02cb }
        L_0x0114:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x012e
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r2)     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r0 = r1.getValue()     // Catch:{ JSONException -> 0x02cb }
            java.lang.Class r0 = r0.getClass()     // Catch:{ JSONException -> 0x02cb }
            java.util.List r0 = X.C18280x3.A0k(r0, r3)     // Catch:{ JSONException -> 0x02cb }
            r0.add(r1)     // Catch:{ JSONException -> 0x02cb }
            goto L_0x0114
        L_0x012e:
            java.util.Iterator r12 = X.AnonymousClass001.A0u(r3)     // Catch:{ JSONException -> 0x02cb }
        L_0x0132:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x01dc
            java.util.Map$Entry r11 = X.AnonymousClass001.A0w(r12)     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r2 = r11.getKey()     // Catch:{ JSONException -> 0x02cb }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r2 != r0) goto L_0x019e
            java.lang.String r9 = "annotations"
        L_0x0146:
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r0 = r11.getKey()     // Catch:{ JSONException -> 0x02cb }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ JSONException -> 0x02cb }
            boolean r1 = r0.isArray()     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r0 = r11.getValue()     // Catch:{ JSONException -> 0x02cb }
            java.util.Iterator r10 = X.C18320x8.A0q(r0)     // Catch:{ JSONException -> 0x02cb }
            if (r1 == 0) goto L_0x017e
        L_0x015e:
            boolean r0 = r10.hasNext()     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x019a
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r10)     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r1 = r11.getKey()     // Catch:{ JSONException -> 0x02cb }
            java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r0 = r2.getValue()     // Catch:{ JSONException -> 0x02cb }
            org.json.JSONArray r1 = X.AnonymousClass32C.A00(r1, r0)     // Catch:{ JSONException -> 0x02cb }
            java.lang.String r0 = X.C18310x6.A0q(r2)     // Catch:{ JSONException -> 0x02cb }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x02cb }
            goto L_0x015e
        L_0x017e:
            boolean r0 = r10.hasNext()     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x019a
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r10)     // Catch:{ JSONException -> 0x02cb }
            java.lang.String r2 = X.C18310x6.A0q(r0)     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r1 = r0.getValue()     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r0 = r11.getKey()     // Catch:{ JSONException -> 0x02cb }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ JSONException -> 0x02cb }
            X.AnonymousClass32C.A01(r0, r1, r2, r3)     // Catch:{ JSONException -> 0x02cb }
            goto L_0x017e
        L_0x019a:
            r5.put(r9, r3)     // Catch:{ JSONException -> 0x02cb }
            goto L_0x0132
        L_0x019e:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r2 != r0) goto L_0x01a5
            java.lang.String r9 = "annotations_double"
            goto L_0x0146
        L_0x01a5:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r2 != r0) goto L_0x01ac
            java.lang.String r9 = "annotations_bool"
            goto L_0x0146
        L_0x01ac:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r2 != r0) goto L_0x01b3
            java.lang.String r9 = "annotations_int"
            goto L_0x0146
        L_0x01b3:
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            if (r2 != r0) goto L_0x01ba
            java.lang.String r9 = "annotations_string_array"
            goto L_0x0146
        L_0x01ba:
            java.lang.Class<double[]> r0 = double[].class
            if (r2 != r0) goto L_0x01c1
            java.lang.String r9 = "annotations_double_array"
            goto L_0x0146
        L_0x01c1:
            java.lang.Class<boolean[]> r0 = boolean[].class
            if (r2 != r0) goto L_0x01c9
            java.lang.String r9 = "annotations_bool_array"
            goto L_0x0146
        L_0x01c9:
            java.lang.Class<long[]> r0 = long[].class
            if (r2 != r0) goto L_0x01d1
            java.lang.String r9 = "annotations_int_array"
            goto L_0x0146
        L_0x01d1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x02cb }
            java.lang.String r0 = "Unknown class: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r2, r0, r1)     // Catch:{ JSONException -> 0x02cb }
            throw r0     // Catch:{ JSONException -> 0x02cb }
        L_0x01dc:
            java.util.HashMap r11 = X.AnonymousClass001.A0t()     // Catch:{ JSONException -> 0x02cb }
            java.util.concurrent.ConcurrentHashMap r10 = r6.A0A     // Catch:{ JSONException -> 0x02cb }
            java.util.Iterator r9 = X.C18290x4.A11(r10)     // Catch:{ JSONException -> 0x02cb }
        L_0x01e6:
            boolean r0 = r9.hasNext()     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x020d
            android.util.Pair r0 = X.AnonymousClass0x9.A0D(r9)     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r3 = r10.get(r0)     // Catch:{ JSONException -> 0x02cb }
            if (r3 == 0) goto L_0x01e6
            java.lang.Object r2 = r0.first     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r1 = r0.second     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r0 = r11.get(r2)     // Catch:{ JSONException -> 0x02cb }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ JSONException -> 0x02cb }
            if (r0 != 0) goto L_0x0209
            java.util.HashMap r0 = X.AnonymousClass001.A0t()     // Catch:{ JSONException -> 0x02cb }
            r11.put(r2, r0)     // Catch:{ JSONException -> 0x02cb }
        L_0x0209:
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x02cb }
            goto L_0x01e6
        L_0x020d:
            boolean r0 = r11.isEmpty()     // Catch:{ JSONException -> 0x02cb }
            if (r0 != 0) goto L_0x02c3
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x02cb }
            java.util.Iterator r18 = X.AnonymousClass001.A0u(r11)     // Catch:{ JSONException -> 0x02cb }
        L_0x021b:
            boolean r0 = r18.hasNext()     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x02bd
            java.util.Map$Entry r17 = X.AnonymousClass001.A0w(r18)     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r0 = r17.getValue()     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x021b
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r0 = r17.getValue()     // Catch:{ JSONException -> 0x02cb }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ JSONException -> 0x02cb }
            java.util.Iterator r16 = X.AnonymousClass000.A0q(r0)     // Catch:{ JSONException -> 0x02cb }
        L_0x0239:
            boolean r0 = r16.hasNext()     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x02b4
            java.util.Map$Entry r15 = X.AnonymousClass001.A0w(r16)     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r0 = r15.getValue()     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x0239
            java.lang.Object r0 = r15.getValue()     // Catch:{ JSONException -> 0x02cb }
            java.lang.Class r9 = r0.getClass()     // Catch:{ JSONException -> 0x02cb }
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r9 != r0) goto L_0x026c
            X.4FX r11 = r7.A01     // Catch:{ JSONException -> 0x02cb }
            java.lang.String r10 = X.C18310x6.A0q(r15)     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r0 = r15.getValue()     // Catch:{ JSONException -> 0x02cb }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ JSONException -> 0x02cb }
            double r0 = r0.doubleValue()     // Catch:{ JSONException -> 0x02cb }
            boolean r0 = A05(r11, r10, r0, r4)     // Catch:{ JSONException -> 0x02cb }
            if (r0 != 0) goto L_0x026c
            goto L_0x0239
        L_0x026c:
            java.lang.Class<double[]> r0 = double[].class
            if (r9 != r0) goto L_0x0292
            X.4FX r14 = r7.A01     // Catch:{ JSONException -> 0x02cb }
            java.lang.String r13 = X.C18310x6.A0q(r15)     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r12 = r15.getValue()     // Catch:{ JSONException -> 0x02cb }
            double[] r12 = (double[]) r12     // Catch:{ JSONException -> 0x02cb }
            int r11 = r12.length     // Catch:{ JSONException -> 0x02cb }
            r10 = 0
        L_0x027e:
            if (r10 >= r11) goto L_0x028e
            r0 = r12[r10]     // Catch:{ JSONException -> 0x02cb }
            boolean r0 = A05(r14, r13, r0, r4)     // Catch:{ JSONException -> 0x02cb }
            if (r0 != 0) goto L_0x0289
            goto L_0x028c
        L_0x0289:
            int r10 = r10 + 1
            goto L_0x027e
        L_0x028c:
            r0 = 0
            goto L_0x028f
        L_0x028e:
            r0 = 1
        L_0x028f:
            if (r0 != 0) goto L_0x0292
            goto L_0x0239
        L_0x0292:
            boolean r0 = r9.isArray()     // Catch:{ JSONException -> 0x02cb }
            if (r0 == 0) goto L_0x02a8
            java.lang.Object r0 = r15.getValue()     // Catch:{ JSONException -> 0x02cb }
            org.json.JSONArray r1 = X.AnonymousClass32C.A00(r9, r0)     // Catch:{ JSONException -> 0x02cb }
            java.lang.String r0 = X.C18310x6.A0q(r15)     // Catch:{ JSONException -> 0x02cb }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x02cb }
            goto L_0x0239
        L_0x02a8:
            java.lang.String r1 = X.C18310x6.A0q(r15)     // Catch:{ JSONException -> 0x02cb }
            java.lang.Object r0 = r15.getValue()     // Catch:{ JSONException -> 0x02cb }
            X.AnonymousClass32C.A01(r9, r0, r1, r3)     // Catch:{ JSONException -> 0x02cb }
            goto L_0x0239
        L_0x02b4:
            java.lang.String r0 = X.C18310x6.A0q(r17)     // Catch:{ JSONException -> 0x02cb }
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x02cb }
            goto L_0x021b
        L_0x02bd:
            java.lang.String r0 = "metadata"
            r5.put(r0, r2)     // Catch:{ JSONException -> 0x02cb }
        L_0x02c3:
            java.lang.String r8 = r5.toString()     // Catch:{ JSONException -> 0x02cb }
            return r8
        L_0x02c8:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ JSONException -> 0x02cb }
            throw r0     // Catch:{ JSONException -> 0x02cb }
        L_0x02cb:
            r0 = move-exception
            X.4FX r2 = r7.A01
            int r1 = r6.A00
            java.lang.String r0 = r0.getMessage()
            r2.BJT(r1, r0)
        L_0x02d7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UD.Bgy():java.lang.String");
    }

    public void Bko() {
        this.A0A.BkM(new C70033Zp(this, 17));
    }

    public void Bsf() {
        C72173dI r1 = this.A09;
        r1.A02();
        r1.execute((Runnable) this.A0B.get());
    }

    public void endAllInstancesOfMarker(int i, short s) {
        if (this.A01.A03()) {
            long nanoTime = System.nanoTime();
            ConcurrentHashMap concurrentHashMap = this.A0C;
            Integer valueOf = Integer.valueOf(i);
            if (concurrentHashMap.get(valueOf) != null) {
                A04(this, concurrentHashMap.remove(valueOf), nanoTime, s);
            }
            ArrayList A0s = AnonymousClass001.A0s();
            long A002 = A00(i, 0);
            long A003 = A002 + A00(1, 0);
            ConcurrentNavigableMap concurrentNavigableMap = this.A0E;
            Iterator A0q = AnonymousClass000.A0q(concurrentNavigableMap.subMap(Long.valueOf(A002), Long.valueOf(A003)));
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                if (A0w.getValue() != null) {
                    AnonymousClass0x7.A1J(A0s, A0w);
                }
            }
            for (int i2 = 0; i2 < A0s.size(); i2++) {
                A04(this, concurrentNavigableMap.remove(A0s.get(i2)), nanoTime, s);
            }
            Bsf();
        }
    }

    public void markerDrop(int i) {
        AnonymousClass30Y r1 = (AnonymousClass30Y) this.A0C.remove(Integer.valueOf(i));
        this.A0G.decrementAndGet();
        if (r1 != null) {
            C60282yI r0 = this.A04;
            AnonymousClass0x7.A1K(r0.A08, r1.A01);
        }
    }

    public AnonymousClass3UD(C56612sH r3, AnonymousClass337 r4, AnonymousClass4FX r5, AnonymousClass32C r6, C60282yI r7, C45492a6 r8, C85144Fc r9, AnonymousClass3DI r10, AnonymousClass4FS r11, C183538qC r12) {
        this.A00 = r3;
        this.A0A = r11;
        this.A06 = r8;
        this.A02 = r5;
        this.A01 = r4;
        this.A08 = r10;
        this.A07 = r9;
        this.A04 = r7;
        this.A0B = r12;
        this.A03 = r6;
        this.A05 = r7;
        this.A09 = new C72173dI(r11, false);
    }

    public static AnonymousClass30Y A02(AnonymousClass3UD r1, int i, int i2) {
        return r1.A06(Integer.valueOf(i), i2);
    }

    public static boolean A05(AnonymousClass4FX r1, String str, double d, int i) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return true;
        }
        r1.BFj(i, str, d);
        return false;
    }

    public final void A0B(ConcurrentMap concurrentMap, long j, short s, boolean z) {
        if (!concurrentMap.isEmpty()) {
            Iterator it = C18310x6.A0s(concurrentMap).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AnonymousClass30Y r0 = (AnonymousClass30Y) concurrentMap.get(next);
                if (r0 != null && (!z || r0.A0G)) {
                    A04(this, concurrentMap.remove(next), j, s);
                }
            }
            Bsf();
        }
    }

    public boolean BI5(int i) {
        AnonymousClass30Y A012 = A01(this, i);
        if (A012 == null) {
            return false;
        }
        if (A012.A0D.get() == -1 || A012.A0F.get() == -1) {
            return true;
        }
        return false;
    }

    public void BKd(AnonymousClass66C r6, int i) {
        AnonymousClass30Y A012 = A01(this, i);
        if (A012 != null) {
            C60282yI r3 = this.A05;
            r3.A00(A012.A01);
            r3.A05.BkM(new C70363aN(r3, r6, A012, 3));
        }
    }

    public void BKf(int i, int i2, short s, String str) {
        AnonymousClass30Y A072 = A07(Integer.valueOf(i2), i, System.nanoTime(), s);
        if (A072 != null) {
            if (!A072.A04(str)) {
                this.A02.Bgx(i, str);
            }
            A09(A072);
        }
    }

    public void BKl(int i, int i2, boolean z) {
        A08(Integer.valueOf(i2), i, System.nanoTime(), z);
    }

    public void BKm(int i, String str, String str2, long j, TimeUnit timeUnit) {
        A03(A08((Integer) null, i, timeUnit.toNanos(j), true), str2, "perf_origin");
    }

    public void BKo(String str, String str2, int i, int i2, boolean z) {
        A03(A08(Integer.valueOf(i2), i, System.nanoTime(), z), str2, "perf_origin");
    }

    public void BnT(int i, int i2, String str) {
        AnonymousClass30Y A022 = A02(this, i2, i);
        if (A022 != null) {
            A022.A09.put("subType", str);
        }
    }

    public void BnU(int i, String str) {
        AnonymousClass30Y A012 = A01(this, i);
        if (A012 != null) {
            A012.A09.put("subType", str);
        }
    }

    public long currentMonotonicTimestampNanos() {
        return System.nanoTime();
    }

    public boolean isMarkerOn(int i, int i2) {
        AnonymousClass30Y A022 = A02(this, i2, i);
        if (A022 == null) {
            return false;
        }
        if (A022.A0D.get() == -1 || A022.A0F.get() == -1) {
            return true;
        }
        return false;
    }

    public void markerEnd(int i, int i2, short s) {
        A09(A07(Integer.valueOf(i2), i, System.nanoTime(), s));
    }

    public void markerPoint(int i, int i2, String str) {
        AnonymousClass30Y A022 = A02(this, i2, i);
        if (A022 != null) {
            A022.A01(System.nanoTime(), str, (String) null);
        }
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        A08(Integer.valueOf(i2), i, timeUnit.toNanos(j), z);
    }

    public void markerAnnotate(int i, int i2, String str, double d) {
        AnonymousClass30Y A022;
        if (A05(this.A02, str, d, i) && (A022 = A02(this, i2, i)) != null) {
            A022.A00(1, str, Double.valueOf(d));
        }
    }

    public void markerAnnotate(int i, int i2, String str, int i3) {
        AnonymousClass30Y A022 = A02(this, i2, i);
        if (A022 != null) {
            A022.A00(1, str, AnonymousClass0x9.A0m(i3));
        }
    }

    public void markerAnnotate(int i, int i2, String str, long j) {
        AnonymousClass30Y A022 = A02(this, i2, i);
        if (A022 != null) {
            A022.A00(1, str, Long.valueOf(j));
        }
    }

    public void markerAnnotate(int i, int i2, String str, String str2) {
        A03(A02(this, i2, i), str2, str);
    }

    public void markerAnnotate(int i, int i2, String str, boolean z) {
        AnonymousClass30Y A022 = A02(this, i2, i);
        if (A022 != null) {
            A022.A00(1, str, Boolean.valueOf(z));
        }
    }

    public void markerAnnotate(int i, int i2, String str, double[] dArr) {
        AnonymousClass4FX r4 = this.A02;
        int length = dArr.length;
        int i3 = 0;
        while (i3 < length) {
            if (A05(r4, str, dArr[i3], i)) {
                i3++;
            } else {
                return;
            }
        }
        AnonymousClass30Y A022 = A02(this, i2, i);
        if (A022 != null) {
            A022.A00(length, str, dArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int[] iArr) {
        AnonymousClass30Y A022 = A02(this, i2, i);
        if (A022 != null) {
            int length = iArr.length;
            long[] jArr = new long[length];
            for (int i3 = 0; i3 < length; i3++) {
                jArr[i3] = (long) iArr[i3];
            }
            A022.A00(length, str, jArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long[] jArr) {
        AnonymousClass30Y A022 = A02(this, i2, i);
        if (A022 != null) {
            A022.A00(jArr.length, str, jArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String[] strArr) {
        AnonymousClass30Y A022 = A02(this, i2, i);
        if (A022 != null) {
            int i3 = 0;
            for (String str2 : strArr) {
                if (str2 == null) {
                    i3++;
                } else {
                    i3 += str2.length();
                }
            }
            A022.A00(i3, str, strArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        AnonymousClass30Y A022 = A02(this, i2, i);
        if (A022 != null) {
            A022.A00(zArr.length, str, zArr);
        }
    }

    public void markerAnnotate(int i, String str, double d) {
        AnonymousClass30Y A012;
        if (A05(this.A02, str, d, i) && (A012 = A01(this, i)) != null) {
            A012.A00(1, str, Double.valueOf(d));
        }
    }

    public void markerAnnotate(int i, String str, int i2) {
        AnonymousClass30Y A012 = A01(this, i);
        if (A012 != null) {
            A012.A00(1, str, AnonymousClass0x9.A0m(i2));
        }
    }

    public void markerAnnotate(int i, String str, long j) {
        AnonymousClass30Y A012 = A01(this, i);
        if (A012 != null) {
            A012.A00(1, str, Long.valueOf(j));
        }
    }

    public void markerAnnotate(int i, String str, String str2) {
        A03(A01(this, i), str2, str);
    }

    public void markerAnnotate(int i, String str, boolean z) {
        AnonymousClass30Y A012 = A01(this, i);
        if (A012 != null) {
            A012.A00(1, str, Boolean.valueOf(z));
        }
    }

    public void markerAnnotate(int i, String str, double[] dArr) {
        AnonymousClass4FX r4 = this.A02;
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (A05(r4, str, dArr[i2], i)) {
                i2++;
            } else {
                return;
            }
        }
        AnonymousClass30Y A012 = A01(this, i);
        if (A012 != null) {
            A012.A00(length, str, dArr);
        }
    }

    public void markerAnnotate(int i, String str, int[] iArr) {
        AnonymousClass30Y A012 = A01(this, i);
        if (A012 != null) {
            int length = iArr.length;
            long[] jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            A012.A00(length, str, jArr);
        }
    }

    public void markerAnnotate(int i, String str, long[] jArr) {
        AnonymousClass30Y A012 = A01(this, i);
        if (A012 != null) {
            A012.A00(jArr.length, str, jArr);
        }
    }

    public void markerAnnotate(int i, String str, String[] strArr) {
        AnonymousClass30Y A012 = A01(this, i);
        if (A012 != null) {
            int i2 = 0;
            for (String str2 : strArr) {
                if (str2 == null) {
                    i2++;
                } else {
                    i2 += str2.length();
                }
            }
            A012.A00(i2, str, strArr);
        }
    }

    public void markerAnnotate(int i, String str, boolean[] zArr) {
        AnonymousClass30Y A012 = A01(this, i);
        if (A012 != null) {
            A012.A00(zArr.length, str, zArr);
        }
    }

    public void markerDrop(int i, int i2) {
        Object remove;
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf == null) {
            remove = this.A0C.remove(Integer.valueOf(i));
        } else {
            remove = this.A0E.remove(Long.valueOf(A00(i, valueOf.intValue())));
        }
        AnonymousClass30Y r1 = (AnonymousClass30Y) remove;
        this.A0G.decrementAndGet();
        if (r1 != null) {
            C60282yI r0 = this.A04;
            AnonymousClass0x7.A1K(r0.A08, r1.A01);
        }
    }

    public void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        A09(A07(Integer.valueOf(i2), i, timeUnit.toNanos(j), s));
    }

    public void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        AnonymousClass30Y A022 = A02(this, i2, i);
        if (A022 != null) {
            A022.A01(timeUnit.toNanos(j), str, (String) null);
        }
    }

    public void markerStart(int i, int i2) {
        A08(Integer.valueOf(i2), i, System.nanoTime(), true);
    }

    public void markerEnd(int i, short s) {
        A09(A07((Integer) null, i, System.nanoTime(), s));
    }

    public void markerPoint(int i, String str) {
        AnonymousClass30Y r2 = (AnonymousClass30Y) C18290x4.A0j(this.A0C, i);
        if (r2 != null) {
            r2.A01(System.nanoTime(), str, (String) null);
        }
    }

    public void markerStart(int i) {
        A08((Integer) null, i, System.nanoTime(), true);
    }

    public void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        A09(A07((Integer) null, i, timeUnit.toNanos(j), s));
    }

    public void markerPoint(int i, int i2, String str, String str2) {
        AnonymousClass30Y A022 = A02(this, i2, i);
        if (A022 != null) {
            A022.A01(System.nanoTime(), str, str2);
        }
    }

    public void markerStart(int i, int i2, String str, String str2) {
        A03(A08(Integer.valueOf(i2), i, System.nanoTime(), true), str2, str);
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        AnonymousClass30Y A022 = A02(this, i2, i);
        if (A022 != null) {
            A022.A01(timeUnit.toNanos(j), str, str2);
        }
    }

    public void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        A03(A08(Integer.valueOf(i2), i, timeUnit.toNanos(j), true), str2, str);
    }

    public void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        AnonymousClass30Y A012 = A01(this, i);
        if (A012 != null) {
            A012.A01(timeUnit.toNanos(j), str, str2);
        }
    }

    public void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        AnonymousClass30Y r2 = (AnonymousClass30Y) C18290x4.A0j(this.A0C, i);
        if (r2 != null) {
            r2.A01(timeUnit.toNanos(j), str, (String) null);
        }
    }

    public void markerPoint(int i, String str, String str2) {
        AnonymousClass30Y A012 = A01(this, i);
        if (A012 != null) {
            A012.A01(System.nanoTime(), str, str2);
        }
    }
}

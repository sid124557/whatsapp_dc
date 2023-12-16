package X;

import android.util.LruCache;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.7kH  reason: invalid class name and case insensitive filesystem */
public final class C158617kH {
    public static final String[] A09 = {"weak", "medium", "high"};
    public AnonymousClass7Z9 A00;
    public String A01;
    public String A02;
    public Set A03;
    public ConcurrentLinkedQueue A04;
    public boolean A05;
    public final LruCache A06 = new LruCache(50);
    public final AnonymousClass5KS A07;
    public volatile C152627Zp A08;

    public C158617kH(AnonymousClass5KS r3) {
        C162457s7.A0J(r3, 1);
        this.A07 = r3;
        r3.A01 = this;
        this.A03 = AnonymousClass0x9.A17();
        this.A04 = new ConcurrentLinkedQueue();
        this.A02 = "";
        this.A01 = "";
    }

    public final AnonymousClass7Zt A00(C152227Yb r4) {
        Object obj;
        List list = r4.A01;
        if (list.isEmpty()) {
            obj = null;
        } else {
            obj = list.get(C158997kv.A01.A02(list.size()));
        }
        AnonymousClass7Zt r1 = (AnonymousClass7Zt) obj;
        if (!this.A05) {
            return r1;
        }
        if (r4.A00 >= list.size()) {
            r4.A00 = 0;
        }
        AnonymousClass7Zt r12 = (AnonymousClass7Zt) C73723fy.A06(list, r4.A00);
        r4.A00++;
        return r12;
    }

    public final void A01() {
        AnonymousClass7Z9 r0;
        if (this.A08 != null && (r0 = this.A00) != null) {
            String str = r0.A03;
            String str2 = r0.A00;
            String str3 = r0.A02;
            String str4 = r0.A01;
            C152627Zp r02 = this.A08;
            if (r02 != null) {
                Map map = r02.A06;
                C152237Yc r03 = (C152237Yc) map.get(str);
                if (r03 == null) {
                    r03 = (C152237Yc) C57272tN.A00(map.values());
                }
                Map map2 = r03.A01;
                AnonymousClass7Y2 r04 = (AnonymousClass7Y2) map2.get(str2);
                if (r04 == null) {
                    r04 = (AnonymousClass7Y2) C57272tN.A00(map2.values());
                }
                Map map3 = r04.A01;
                AnonymousClass5S4 r05 = (AnonymousClass5S4) map3.get(str3);
                if (r05 == null) {
                    r05 = (AnonymousClass5S4) C57272tN.A00(map3.values());
                }
                Map map4 = r05.A01;
                C152227Yb r06 = (C152227Yb) map4.get(str4);
                if (r06 == null) {
                    r06 = (C152227Yb) C57272tN.A00(map4.values());
                }
                AnonymousClass7Zt A002 = A00(r06);
                if (A002 != null) {
                    AnonymousClass5KS r12 = this.A07;
                    String str5 = A002.A06;
                    String str6 = A002.A04;
                    String str7 = A002.A03;
                    String str8 = A002.A05;
                    AnonymousClass7Lv r1 = new AnonymousClass7Lv(str5, str6, str7, str8);
                    C106075Xn r9 = r12.A06;
                    C152777a6 A003 = C154247cr.A00(new AnonymousClass82g(r9), r1);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("CompositeHeroPlayer - setVideo() - ");
                    C18260x0.A1J(A0o, A003.A0F.A0H);
                    if (r9.A08) {
                        r9.A03(C142256wt.APPEND_TO_BACK, A003);
                    }
                    AnonymousClass5TM r07 = r9.A0G[r9.A00 % 2];
                    r07.A02(A003, false);
                    r07.A00();
                    r07.A0A.setAlpha(1.0f);
                    r9.A08 = true;
                    C152747a3 r92 = new C152747a3("", "", "", "", "", "", "", "", str, str2, str3, str4, 6);
                    this.A06.put(str8, r92);
                    C142356x4 r2 = C142356x4.APPEND_TO_BACK;
                    Set set = this.A03;
                    new C152257Ye(r2, A002, r92);
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    return;
                }
                return;
            }
            throw AnonymousClass001.A0e("Required value was null.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01b3, code lost:
        if (r12.keySet().contains(r4) != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01cc, code lost:
        if (r4 != null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a2, code lost:
        if (r12.keySet().contains(r15) != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0130, code lost:
        if (r12.keySet().contains(r1) == false) goto L_0x0132;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.String r34, java.lang.String r35, java.lang.String r36, int r37) {
        /*
            r33 = this;
            r9 = r36
            r15 = r35
            r19 = r34
            r8 = r33
            X.7Zp r0 = r8.A08
            java.lang.String r18 = "Required value was null."
            if (r0 == 0) goto L_0x02c7
            X.7Z9 r7 = r8.A00
            if (r7 == 0) goto L_0x02c2
            java.util.Map r2 = r0.A06
            java.lang.String r0 = r7.A03
            java.lang.Object r0 = r2.get(r0)
            X.7Yc r0 = (X.C152237Yc) r0
            if (r0 == 0) goto L_0x02bd
            java.util.Map r1 = r0.A02
            r31 = r37
            r0 = r31
            java.lang.Object r10 = X.AnonymousClass001.A0i(r1, r0)
            X.7Yd r10 = (X.C152247Yd) r10
            if (r10 != 0) goto L_0x002d
            return
        L_0x002d:
            java.lang.String r6 = r10.A02
            r32 = r6
            java.util.Set r0 = r2.keySet()
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x003d
            java.lang.String r6 = r7.A03
        L_0x003d:
            java.lang.Object r0 = r2.get(r6)
            X.7Yc r0 = (X.C152237Yc) r0
            if (r0 == 0) goto L_0x02b8
            java.util.Map r2 = r0.A01
            java.util.Set r0 = r2.keySet()
            java.lang.Object r4 = X.C57272tN.A00(r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = r8.A02
            java.lang.String r1 = r8.A01
            r30 = 0
            if (r34 == 0) goto L_0x01c8
            int r0 = r19.length()
            if (r0 <= 0) goto L_0x01c8
            if (r35 == 0) goto L_0x01c8
            int r0 = r15.length()
            if (r0 <= 0) goto L_0x01c8
            if (r36 == 0) goto L_0x01c8
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x01c8
            r8.A02 = r15
            r8.A01 = r9
        L_0x0073:
            int r0 = r19.length()
            if (r0 == 0) goto L_0x01d0
            java.util.Set r1 = r2.keySet()
            r0 = r19
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x01d0
            r5 = r19
        L_0x0087:
            java.lang.Object r1 = r2.get(r5)
            X.7Y2 r1 = (X.AnonymousClass7Y2) r1
            if (r1 == 0) goto L_0x02b3
            r4 = r15
            if (r15 == 0) goto L_0x019d
            int r0 = r15.length()
            if (r0 == 0) goto L_0x019d
            java.util.Map r12 = r1.A01
            java.util.Set r0 = r12.keySet()
            boolean r0 = r0.contains(r15)
            if (r0 == 0) goto L_0x019d
        L_0x00a4:
            java.lang.Object r14 = r12.get(r4)
            X.5S4 r14 = (X.AnonymousClass5S4) r14
            if (r14 == 0) goto L_0x02ae
            r17 = 1
            if (r9 == 0) goto L_0x0141
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0141
            java.util.Map r2 = r14.A01
            java.util.Set r0 = r2.keySet()
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0141
            r3 = r9
        L_0x00c3:
            java.lang.Object r0 = r2.get(r3)
            X.7Yb r0 = (X.C152227Yb) r0
            if (r0 == 0) goto L_0x02a1
            X.7Zt r2 = r8.A00(r0)
            r0 = r32
            boolean r0 = X.C162457s7.A0P(r6, r0)
            if (r0 != 0) goto L_0x0109
            r30 = 28002(0x6d62, float:3.9239E-41)
        L_0x00d9:
            java.util.Set r0 = r8.A03
            r14 = r0
            java.util.Iterator r13 = r0.iterator()
        L_0x00e0:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01dc
            r13.next()
            java.lang.String r12 = r7.A03
            java.lang.String r11 = r7.A00
            java.lang.String r1 = r7.A02
            java.lang.String r0 = r7.A01
            X.7a1 r20 = new X.7a1
            r22 = r32
            r23 = r6
            r24 = r11
            r25 = r5
            r26 = r1
            r27 = r4
            r28 = r0
            r29 = r3
            r21 = r12
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x00e0
        L_0x0109:
            r0 = r19
            boolean r0 = X.C162457s7.A0P(r5, r0)
            if (r0 != 0) goto L_0x0114
            r30 = 28003(0x6d63, float:3.924E-41)
            goto L_0x00d9
        L_0x0114:
            boolean r0 = X.C162457s7.A0P(r4, r15)
            if (r0 != 0) goto L_0x0138
            X.7Zp r0 = r8.A08
            if (r0 == 0) goto L_0x0135
            java.lang.String r1 = r0.A02
        L_0x0120:
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0132
            java.util.Set r0 = r12.keySet()
            boolean r0 = r0.contains(r1)
            r30 = 28004(0x6d64, float:3.9242E-41)
            if (r0 != 0) goto L_0x00d9
        L_0x0132:
            r30 = 28006(0x6d66, float:3.9245E-41)
            goto L_0x00d9
        L_0x0135:
            java.lang.String r1 = ""
            goto L_0x0120
        L_0x0138:
            boolean r0 = X.C162457s7.A0P(r3, r9)
            if (r0 != 0) goto L_0x00d9
            r30 = 28005(0x6d65, float:3.9243E-41)
            goto L_0x00d9
        L_0x0141:
            java.lang.String[] r13 = A09
            int r11 = X.C73703fw.A00(r9, r13)
            r0 = -1
            if (r11 == r0) goto L_0x0185
            r3 = 1
        L_0x014b:
            int r0 = r13.length
            r16 = r0
            if (r3 >= r0) goto L_0x0185
            int r0 = r11 - r3
            if (r0 < 0) goto L_0x0168
            java.util.Map r2 = r14.A01
            java.util.Set r1 = r2.keySet()
            r0 = r13[r0]
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0168
            int r11 = r11 - r17
            r3 = r13[r11]
            goto L_0x00c3
        L_0x0168:
            int r1 = r11 + r3
            r0 = r16
            if (r1 >= r0) goto L_0x0182
            java.util.Map r2 = r14.A01
            java.util.Set r0 = r2.keySet()
            int r16 = r11 + 1
            r1 = r13[r16]
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0182
            r3 = r13[r16]
            goto L_0x00c3
        L_0x0182:
            int r3 = r3 + 1
            goto L_0x014b
        L_0x0185:
            java.util.Map r2 = r14.A01
            java.util.Iterator r1 = X.AnonymousClass000.A0q(r2)
        L_0x018b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02a6
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r1)
            if (r0 == 0) goto L_0x018b
            java.lang.String r3 = X.C18310x6.A0q(r0)
            goto L_0x00c3
        L_0x019d:
            X.7Zp r0 = r8.A08
            if (r0 == 0) goto L_0x01b7
            java.lang.String r4 = r0.A02
        L_0x01a3:
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x01ba
            java.util.Map r12 = r1.A01
            java.util.Set r0 = r12.keySet()
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x01ba
            goto L_0x00a4
        L_0x01b7:
            java.lang.String r4 = ""
            goto L_0x01a3
        L_0x01ba:
            java.util.Map r12 = r1.A01
            java.util.Set r0 = r12.keySet()
            java.lang.Object r4 = X.C57272tN.A00(r0)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x00a4
        L_0x01c8:
            r19 = r4
            r15 = r3
            r9 = r1
            if (r4 == 0) goto L_0x01d0
            goto L_0x0073
        L_0x01d0:
            java.util.Set r0 = r2.keySet()
            java.lang.Object r5 = X.C57272tN.A00(r0)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0087
        L_0x01dc:
            if (r2 == 0) goto L_0x0299
            int r1 = r10.A01
            if (r1 == 0) goto L_0x0296
            r0 = r17
            if (r1 == r0) goto L_0x0293
            X.5KS r0 = r8.A07
            X.5Xn r13 = r0.A06
            int r0 = r13.A00
            int r0 = r0 % 2
            X.5TM[] r12 = r13.A0G
            r0 = r12[r0]
            X.7t6 r0 = r0.A02
            if (r0 == 0) goto L_0x028f
            long r0 = r0.A03()
        L_0x01fa:
            int r11 = r13.A00
            int r11 = r11 % 2
            r11 = r12[r11]
            X.7t6 r11 = r11.A02
            if (r11 == 0) goto L_0x028b
            long r11 = r11.A02()
        L_0x0208:
            long r0 = r0 - r11
            java.util.concurrent.ConcurrentLinkedQueue r11 = r13.A0E
            int r12 = r11.size()
            X.7YT r11 = new X.7YT
            r11.<init>(r0, r12)
            long r11 = r11.A01
            int r0 = r10.A00
            long r0 = (long) r0
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x0293
            X.6x4 r10 = X.C142356x4.STOP_CURRENT_AND_REMOVE_ALL_AND_APPEND_TO_BACK
        L_0x021f:
            java.lang.String r13 = r7.A03
            java.lang.String r12 = r7.A00
            java.lang.String r1 = r7.A02
            java.lang.String r0 = r7.A01
            X.7a3 r11 = new X.7a3
            r21 = r1
            r22 = r0
            r23 = r32
            r24 = r19
            r25 = r15
            r26 = r9
            r27 = r6
            r28 = r5
            r29 = r4
            r30 = r3
            r18 = r11
            r19 = r13
            r20 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            android.util.LruCache r0 = r8.A06
            java.lang.String r13 = r2.A05
            r0.put(r13, r11)
            X.5KS r12 = r8.A07
            java.lang.String r9 = r2.A06
            java.lang.String r7 = r2.A04
            java.lang.String r0 = r2.A03
            X.7Lv r1 = new X.7Lv
            r1.<init>(r9, r7, r0, r13)
            r0 = r17
            X.C162457s7.A0J(r10, r0)
            X.5Xn r9 = r12.A06
            X.82g r0 = new X.82g
            r0.<init>(r9)
            X.7a6 r7 = X.C154247cr.A00(r0, r1)
            int r1 = r10.value
            X.6wt[] r0 = X.C142256wt.values()
            r0 = r0[r1]
            X.C162457s7.A0D(r0)
            r9.A03(r0, r7)
            X.7Ye r0 = new X.7Ye
            r0.<init>(r10, r2, r11)
            java.util.Iterator r1 = r14.iterator()
        L_0x0281:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0299
            r1.next()
            goto L_0x0281
        L_0x028b:
            r11 = 0
            goto L_0x0208
        L_0x028f:
            r0 = 0
            goto L_0x01fa
        L_0x0293:
            X.6x4 r10 = X.C142356x4.CONTINUE_CURRENT_AND_REMOVE_QUEUED_AND_APPEND_TO_BACK
            goto L_0x021f
        L_0x0296:
            X.6x4 r10 = X.C142356x4.APPEND_TO_BACK
            goto L_0x021f
        L_0x0299:
            X.7Z9 r0 = new X.7Z9
            r0.<init>(r6, r5, r4, r3)
            r8.A00 = r0
            return
        L_0x02a1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r18)
            throw r0
        L_0x02a6:
            java.lang.String r1 = "No element of the map was transformed to a non-null value."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x02ae:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r18)
            throw r0
        L_0x02b3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r18)
            throw r0
        L_0x02b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r18)
            throw r0
        L_0x02bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r18)
            throw r0
        L_0x02c2:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r18)
            throw r0
        L_0x02c7:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158617kH.A02(java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}

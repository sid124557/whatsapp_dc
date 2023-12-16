package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.7sD  reason: invalid class name and case insensitive filesystem */
public final class C162487sD {
    public static final AnonymousClass72V A00;
    public static final AnonymousClass72V A01;
    public static final AnonymousClass72V A02 = new AnonymousClass72V();
    public static final Class A03;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026 A[Catch:{ all -> 0x003d }] */
    static {
        /*
            java.lang.String r0 = "com.google.protobuf.GeneratedMessage"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0007 }
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            A03 = r0
            r5 = 0
            java.lang.String r0 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = X.AnonymousClass6C8.A0c(r0)     // Catch:{ all -> 0x001a }
            X.72V r0 = (X.AnonymousClass72V) r0     // Catch:{ all -> 0x001a }
            goto L_0x001b
        L_0x001a:
            r0 = r5
        L_0x001b:
            A00 = r0
            r4 = 1
            java.lang.String r0 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x003d }
            if (r3 == 0) goto L_0x003d
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x003d }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x003d }
            r2 = 0
            r1[r2] = r0     // Catch:{ all -> 0x003d }
            java.lang.reflect.Constructor r1 = r3.getConstructor(r1)     // Catch:{ all -> 0x003d }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x003d }
            X.AnonymousClass6C7.A1V(r0, r2, r4)     // Catch:{ all -> 0x003d }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x003d }
            X.72V r0 = (X.AnonymousClass72V) r0     // Catch:{ all -> 0x003d }
            r5 = r0
        L_0x003d:
            A01 = r5
            X.72V r0 = new X.72V
            r0.<init>()
            A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162487sD.<clinit>():void");
    }

    public static int A00(C186258v0 r2, Object obj, int i) {
        int A022;
        int A002;
        if (obj instanceof C158707kQ) {
            C158707kQ r3 = (C158707kQ) obj;
            A022 = C150347Qg.A02(i);
            if (r3.A00 != null) {
                A002 = r3.A00.A02();
            } else if (r3.A01 != null) {
                A002 = r3.A01.BtV();
            } else {
                A002 = 0;
            }
        } else {
            A022 = C150347Qg.A02(i);
            A002 = C128166Va.A00(r2, (C187818xr) obj);
        }
        return C150347Qg.A04(A002, A022);
    }

    public static void A0A(C186258v0 r3, C181018m0 r4, List list, int i) {
        if (list != null && !list.isEmpty()) {
            C169658Ad r42 = (C169658Ad) r4;
            for (int i2 = 0; i2 < list.size(); i2++) {
                r42.A00.A0C((C187818xr) list.get(i2), r3, i);
            }
        }
    }

    public static void A0B(C181018m0 r5, List list, int i) {
        if (list != null && !list.isEmpty()) {
            C169658Ad r52 = (C169658Ad) r5;
            int i2 = 0;
            if (list instanceof C188188yU) {
                C188188yU r3 = (C188188yU) list;
                while (i2 < list.size()) {
                    Object BBr = r3.BBr(i2);
                    boolean z = BBr instanceof String;
                    C128346Vs r0 = r52.A00;
                    if (z) {
                        r0.A08(i, (String) BBr);
                    } else {
                        r0.A0B((C172528Lo) BBr, i);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r52.A00.A08(i, AnonymousClass001.A0n(list, i2));
                i2++;
            }
        }
    }

    public static void A0C(C181018m0 r3, List list, int i) {
        if (list != null && !list.isEmpty()) {
            C169658Ad r32 = (C169658Ad) r3;
            for (int i2 = 0; i2 < list.size(); i2++) {
                r32.A00.A0B((C172528Lo) list.get(i2), i);
            }
        }
    }

    public static void A0D(C181018m0 r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C169658Ad r52 = (C169658Ad) r5;
            int i2 = 0;
            if (z) {
                C128346Vs r3 = r52.A00;
                C150347Qg.A05(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                r3.A03(i3);
                while (i2 < list.size()) {
                    r3.A0A(AnonymousClass6C8.A0S(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r52.A00.A07(i, AnonymousClass6C8.A0S(list, i2));
                i2++;
            }
        }
    }

    public static void A0E(C181018m0 r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C169658Ad r52 = (C169658Ad) r5;
            int i2 = 0;
            if (z) {
                C128346Vs r3 = r52.A00;
                C150347Qg.A05(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                r3.A03(i3);
                while (i2 < list.size()) {
                    r3.A04(AnonymousClass6C8.A0E(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r52.A00.A06(i, AnonymousClass6C8.A0E(list, i2));
                i2++;
            }
        }
    }

    public static void A0F(C181018m0 r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C169658Ad r52 = (C169658Ad) r5;
            int i2 = 0;
            if (z) {
                C128346Vs r53 = r52.A00;
                C150347Qg.A05(r53, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C128346Vs.A01(AnonymousClass6C7.A0K(list, i4));
                }
                r53.A03(i3);
                while (i2 < list.size()) {
                    r53.A09(AnonymousClass6C7.A0K(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C150347Qg.A07(r52.A00, i, AnonymousClass6C7.A0K(list, i2));
                i2++;
            }
        }
    }

    public static void A0G(C181018m0 r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C169658Ad r52 = (C169658Ad) r5;
            int i2 = 0;
            if (z) {
                C128346Vs r53 = r52.A00;
                C150347Qg.A05(r53, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C128346Vs.A01(AnonymousClass6C7.A0K(list, i4));
                }
                r53.A03(i3);
                while (i2 < list.size()) {
                    r53.A09(AnonymousClass6C7.A0K(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C150347Qg.A07(r52.A00, i, AnonymousClass6C7.A0K(list, i2));
                i2++;
            }
        }
    }

    public static void A0H(C181018m0 r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C169658Ad r52 = (C169658Ad) r5;
            int i2 = 0;
            if (z) {
                C128346Vs r53 = r52.A00;
                C150347Qg.A05(r53, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C128346Vs.A01(AnonymousClass6C7.A0J(list, i4));
                }
                r53.A03(i3);
                while (i2 < list.size()) {
                    r53.A09(AnonymousClass6C7.A0J(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C150347Qg.A07(r52.A00, i, AnonymousClass6C7.A0J(list, i2));
                i2++;
            }
        }
    }

    public static void A0I(C181018m0 r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C169658Ad r52 = (C169658Ad) r5;
            int i2 = 0;
            if (z) {
                C128346Vs r3 = r52.A00;
                C150347Qg.A05(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                r3.A03(i3);
                while (i2 < list.size()) {
                    r3.A0A(AnonymousClass6C7.A0K(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r52.A00.A07(i, AnonymousClass6C7.A0K(list, i2));
                i2++;
            }
        }
    }

    public static void A0J(C181018m0 r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C169658Ad r52 = (C169658Ad) r5;
            int i2 = 0;
            if (z) {
                C128346Vs r3 = r52.A00;
                C150347Qg.A05(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                r3.A03(i3);
                while (i2 < list.size()) {
                    r3.A0A(AnonymousClass6C7.A0K(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r52.A00.A07(i, AnonymousClass6C7.A0K(list, i2));
                i2++;
            }
        }
    }

    public static void A0K(C181018m0 r4, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            C169658Ad r42 = (C169658Ad) r4;
            int i3 = 0;
            if (z) {
                C128346Vs r43 = r42.A00;
                C150347Qg.A05(r43, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A09 = AnonymousClass000.A09(list, i5);
                    if (A09 >= 0) {
                        i2 = AnonymousClass6C7.A00(A09);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                r43.A03(i4);
                while (i3 < list.size()) {
                    int A092 = AnonymousClass000.A09(list, i3);
                    if (A092 >= 0) {
                        r43.A03(A092);
                    } else {
                        r43.A09((long) A092);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                r42.A00.A05(i, AnonymousClass000.A09(list, i3));
                i3++;
            }
        }
    }

    public static void A0L(C181018m0 r4, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C169658Ad r42 = (C169658Ad) r4;
            int i2 = 0;
            if (z) {
                C128346Vs r43 = r42.A00;
                C150347Qg.A05(r43, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AnonymousClass6C7.A00(AnonymousClass000.A09(list, i4));
                }
                r43.A03(i3);
                while (i2 < list.size()) {
                    r43.A03(AnonymousClass000.A09(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C128346Vs r2 = r42.A00;
                int A09 = AnonymousClass000.A09(list, i2);
                r2.A03(i << 3);
                r2.A03(A09);
                i2++;
            }
        }
    }

    public static void A0M(C181018m0 r4, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C169658Ad r42 = (C169658Ad) r4;
            int i2 = 0;
            if (z) {
                C128346Vs r43 = r42.A00;
                C150347Qg.A05(r43, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 = C150347Qg.A03(AnonymousClass000.A09(list, i4), i3);
                }
                r43.A03(i3);
                while (i2 < list.size()) {
                    int A09 = AnonymousClass000.A09(list, i2);
                    r43.A03((A09 >> 31) ^ (A09 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C150347Qg.A06(r42.A00, AnonymousClass000.A09(list, i2), i);
                i2++;
            }
        }
    }

    public static void A0N(C181018m0 r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C169658Ad r52 = (C169658Ad) r5;
            int i2 = 0;
            if (z) {
                C128346Vs r3 = r52.A00;
                C150347Qg.A05(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                r3.A03(i3);
                while (i2 < list.size()) {
                    r3.A04(AnonymousClass000.A09(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r52.A00.A06(i, AnonymousClass000.A09(list, i2));
                i2++;
            }
        }
    }

    public static void A0O(C181018m0 r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C169658Ad r52 = (C169658Ad) r5;
            int i2 = 0;
            if (z) {
                C128346Vs r3 = r52.A00;
                C150347Qg.A05(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                r3.A03(i3);
                while (i2 < list.size()) {
                    r3.A04(AnonymousClass000.A09(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r52.A00.A06(i, AnonymousClass000.A09(list, i2));
                i2++;
            }
        }
    }

    public static void A0P(C181018m0 r4, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            C169658Ad r42 = (C169658Ad) r4;
            int i3 = 0;
            if (z) {
                C128346Vs r43 = r42.A00;
                C150347Qg.A05(r43, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A09 = AnonymousClass000.A09(list, i5);
                    if (A09 >= 0) {
                        i2 = AnonymousClass6C7.A00(A09);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                r43.A03(i4);
                while (i3 < list.size()) {
                    int A092 = AnonymousClass000.A09(list, i3);
                    if (A092 >= 0) {
                        r43.A03(A092);
                    } else {
                        r43.A09((long) A092);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                r42.A00.A05(i, AnonymousClass000.A09(list, i3));
                i3++;
            }
        }
    }

    public static void A0Q(C181018m0 r4, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C169658Ad r42 = (C169658Ad) r4;
            int i2 = 0;
            if (z) {
                C128346Vs r43 = r42.A00;
                C150347Qg.A05(r43, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3++;
                }
                r43.A03(i3);
                while (i2 < list.size()) {
                    r43.A02(AnonymousClass001.A1Z(list.get(i2)) ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C128346Vs r2 = r42.A00;
                boolean A1Z = AnonymousClass001.A1Z(list.get(i2));
                r2.A03(i << 3);
                r2.A02(A1Z ? (byte) 1 : 0);
                i2++;
            }
        }
    }

    public static void A0R(Object obj, Object obj2) {
        C128166Va r9 = (C128166Va) obj;
        C160647o3 r7 = r9.zzjp;
        C160647o3 r8 = ((C128166Va) obj2).zzjp;
        if (!r8.equals(C160647o3.A05)) {
            int i = r7.A00 + r8.A00;
            int[] copyOf = Arrays.copyOf(r7.A03, i);
            System.arraycopy(r8.A03, 0, copyOf, r7.A00, r8.A00);
            Object[] copyOf2 = Arrays.copyOf(r7.A04, i);
            System.arraycopy(r8.A04, 0, copyOf2, r7.A00, r8.A00);
            r7 = new C160647o3(copyOf, copyOf2, i, true);
        }
        r9.zzjp = r7;
    }

    public static int A01(C186258v0 r5, List list, int i) {
        int A002;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A022 = C150347Qg.A02(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C158707kQ) {
                C158707kQ r1 = (C158707kQ) obj;
                if (r1.A00 != null) {
                    A002 = r1.A00.A02();
                } else if (r1.A01 != null) {
                    A002 = r1.A01.BtV();
                } else {
                    A002 = 0;
                }
            } else {
                A002 = C128166Va.A00(r5, (C187818xr) obj);
            }
            A022 = C150347Qg.A04(A002, A022);
        }
        return A022;
    }

    public static int A02(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C128246Vi) {
            C128246Vi r5 = (C128246Vi) list;
            i = 0;
            while (i2 < size) {
                r5.A03(i2);
                i += C128346Vs.A01(r5.A01[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C128346Vs.A01(AnonymousClass6C7.A0K(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A03(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C128246Vi) {
            C128246Vi r5 = (C128246Vi) list;
            i = 0;
            while (i2 < size) {
                r5.A03(i2);
                i += C128346Vs.A01(r5.A01[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C128346Vs.A01(AnonymousClass6C7.A0K(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A04(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C128246Vi) {
            C128246Vi r5 = (C128246Vi) list;
            i = 0;
            while (i2 < size) {
                r5.A03(i2);
                i += C128346Vs.A01(AnonymousClass6C7.A0F(r5.A01[i2]));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C128346Vs.A01(AnonymousClass6C7.A0J(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A05(List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C128236Vh) {
            C128236Vh r4 = (C128236Vh) list;
            i = 0;
            while (i4 < size) {
                r4.A03(i4);
                int i5 = r4.A01[i4];
                if (i5 >= 0) {
                    i3 = AnonymousClass6C7.A00(i5);
                } else {
                    i3 = 10;
                }
                i += i3;
                i4++;
            }
        } else {
            int i6 = 0;
            while (i4 < size) {
                int A09 = AnonymousClass000.A09(list, i4);
                if (A09 >= 0) {
                    i2 = AnonymousClass6C7.A00(A09);
                } else {
                    i2 = 10;
                }
                i6 = i + i2;
                i4++;
            }
        }
        return i;
    }

    public static int A06(List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C128236Vh) {
            C128236Vh r4 = (C128236Vh) list;
            i = 0;
            while (i4 < size) {
                r4.A03(i4);
                int i5 = r4.A01[i4];
                if (i5 >= 0) {
                    i3 = AnonymousClass6C7.A00(i5);
                } else {
                    i3 = 10;
                }
                i += i3;
                i4++;
            }
        } else {
            int i6 = 0;
            while (i4 < size) {
                int A09 = AnonymousClass000.A09(list, i4);
                if (A09 >= 0) {
                    i2 = AnonymousClass6C7.A00(A09);
                } else {
                    i2 = 10;
                }
                i6 = i + i2;
                i4++;
            }
        }
        return i;
    }

    public static int A07(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C128236Vh) {
            C128236Vh r4 = (C128236Vh) list;
            i = 0;
            while (i2 < size) {
                r4.A03(i2);
                i += AnonymousClass6C7.A00(r4.A01[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + AnonymousClass6C7.A00(AnonymousClass000.A09(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A08(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C128236Vh) {
            C128236Vh r4 = (C128236Vh) list;
            i = 0;
            while (i2 < size) {
                r4.A03(i2);
                i = C150347Qg.A03(r4.A01[i2], i);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = C150347Qg.A03(AnonymousClass000.A09(list, i2), i);
                i2++;
            }
        }
        return i;
    }

    public static int A09(List list, int i) {
        int length;
        int length2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int A022 = C150347Qg.A02(i) * size;
        if (list instanceof C188188yU) {
            C188188yU r5 = (C188188yU) list;
            while (i2 < size) {
                Object BBr = r5.BBr(i2);
                if (BBr instanceof C172528Lo) {
                    length2 = ((C172528Lo) BBr).A02();
                } else {
                    String str = (String) BBr;
                    try {
                        length2 = C161077ox.A00(str);
                    } catch (C143966zm unused) {
                        length2 = str.getBytes(C155587f9.A03).length;
                    }
                }
                A022 = C150347Qg.A04(length2, A022);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof C172528Lo) {
                    length = ((C172528Lo) obj).A02();
                } else {
                    String str2 = (String) obj;
                    try {
                        length = C161077ox.A00(str2);
                    } catch (C143966zm unused2) {
                        length = str2.getBytes(C155587f9.A03).length;
                    }
                }
                A022 = C150347Qg.A04(length, A022);
                i2++;
            }
        }
        return A022;
    }
}

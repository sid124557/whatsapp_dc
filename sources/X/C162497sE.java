package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.7sE  reason: invalid class name and case insensitive filesystem */
public final class C162497sE {
    public static final C1445772c A00;
    public static final C1445772c A01;
    public static final C1445772c A02 = new C1445772c();
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
            X.72c r0 = (X.C1445772c) r0     // Catch:{ all -> 0x001a }
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
            X.72c r0 = (X.C1445772c) r0     // Catch:{ all -> 0x003d }
            r5 = r0
        L_0x003d:
            A01 = r5
            X.72c r0 = new X.72c
            r0.<init>()
            A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162497sE.<clinit>():void");
    }

    public static int A00(C186268v1 r1, Object obj, int i) {
        int A04;
        int A002;
        if (obj instanceof C158717kR) {
            C158717kR r2 = (C158717kR) obj;
            A04 = AnonymousClass72Z.A04(i);
            if (r2.A00 != null) {
                A002 = r2.A00.A01();
            } else if (r2.A01 != null) {
                C128766Xj r12 = (C128766Xj) r2.A01;
                A002 = r12.zzc;
                if (A002 == -1) {
                    A002 = AnonymousClass6C9.A0U(r12).BtX(r12);
                    r12.zzc = A002;
                }
            } else {
                A002 = 0;
            }
        } else {
            A04 = AnonymousClass72Z.A04(i);
            A002 = C128766Xj.A00(r1, (C187848xu) obj);
        }
        return A04 + AnonymousClass6C7.A00(A002) + A002;
    }

    public static void A0D(C186138uo r5, List list, int i) {
        if (list != null && !list.isEmpty()) {
            AnonymousClass8B0 r52 = (AnonymousClass8B0) r5;
            int i2 = 0;
            if (list instanceof C188198yV) {
                C188198yV r3 = (C188198yV) list;
                while (i2 < list.size()) {
                    Object Btc = r3.Btc(i2);
                    boolean z = Btc instanceof String;
                    C128856Xs r0 = r52.A00;
                    if (z) {
                        r0.A08(i, (String) Btc);
                    } else {
                        r0.A0B((C172538Lp) Btc, i);
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

    public static void A0E(C186138uo r3, List list, int i) {
        if (list != null && !list.isEmpty()) {
            AnonymousClass8B0 r32 = (AnonymousClass8B0) r3;
            for (int i2 = 0; i2 < list.size(); i2++) {
                r32.A00.A0B((C172538Lp) list.get(i2), i);
            }
        }
    }

    public static void A0F(C186138uo r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            AnonymousClass8B0 r52 = (AnonymousClass8B0) r5;
            int i2 = 0;
            if (z) {
                C128856Xs r3 = r52.A00;
                AnonymousClass72Z.A07(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                r3.A05(i3);
                while (i2 < list.size()) {
                    r3.A0A(AnonymousClass6C8.A0S(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C128856Xs r32 = r52.A00;
                long A0S = AnonymousClass6C8.A0S(list, i2);
                r32.A05((i << 3) | 1);
                r32.A0A(A0S);
                i2++;
            }
        }
    }

    public static void A0G(C186138uo r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            AnonymousClass8B0 r52 = (AnonymousClass8B0) r5;
            int i2 = 0;
            if (z) {
                C128856Xs r3 = r52.A00;
                AnonymousClass72Z.A07(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                r3.A05(i3);
                while (i2 < list.size()) {
                    r3.A06(AnonymousClass6C8.A0E(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C128856Xs r2 = r52.A00;
                int A0E = AnonymousClass6C8.A0E(list, i2);
                r2.A05((i << 3) | 5);
                r2.A06(A0E);
                i2++;
            }
        }
    }

    public static void A0H(C186138uo r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            AnonymousClass8B0 r52 = (AnonymousClass8B0) r5;
            int i2 = 0;
            if (z) {
                C128856Xs r53 = r52.A00;
                AnonymousClass72Z.A07(r53, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 = AnonymousClass72Z.A06(i3, AnonymousClass6C7.A0K(list, i4));
                }
                r53.A05(i3);
                while (i2 < list.size()) {
                    r53.A09(AnonymousClass6C7.A0K(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C128856Xs r3 = r52.A00;
                long A0K = AnonymousClass6C7.A0K(list, i2);
                r3.A05(i << 3);
                r3.A09(A0K);
                i2++;
            }
        }
    }

    public static void A0I(C186138uo r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            AnonymousClass8B0 r52 = (AnonymousClass8B0) r5;
            int i2 = 0;
            if (z) {
                C128856Xs r53 = r52.A00;
                AnonymousClass72Z.A07(r53, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 = AnonymousClass72Z.A06(i3, AnonymousClass6C7.A0K(list, i4));
                }
                r53.A05(i3);
                while (i2 < list.size()) {
                    r53.A09(AnonymousClass6C7.A0K(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C128856Xs r3 = r52.A00;
                long A0K = AnonymousClass6C7.A0K(list, i2);
                r3.A05(i << 3);
                r3.A09(A0K);
                i2++;
            }
        }
    }

    public static void A0J(C186138uo r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            AnonymousClass8B0 r52 = (AnonymousClass8B0) r5;
            int i2 = 0;
            if (z) {
                C128856Xs r53 = r52.A00;
                AnonymousClass72Z.A07(r53, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 = AnonymousClass72Z.A06(i3, AnonymousClass6C7.A0J(list, i4));
                }
                r53.A05(i3);
                while (i2 < list.size()) {
                    r53.A09(AnonymousClass6C7.A0J(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C128856Xs r3 = r52.A00;
                long A0J = AnonymousClass6C7.A0J(list, i2);
                r3.A05(i << 3);
                r3.A09(A0J);
                i2++;
            }
        }
    }

    public static void A0K(C186138uo r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            AnonymousClass8B0 r52 = (AnonymousClass8B0) r5;
            int i2 = 0;
            if (z) {
                C128856Xs r3 = r52.A00;
                AnonymousClass72Z.A07(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                r3.A05(i3);
                while (i2 < list.size()) {
                    r3.A0A(AnonymousClass6C7.A0K(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C128856Xs r32 = r52.A00;
                long A0K = AnonymousClass6C7.A0K(list, i2);
                r32.A05((i << 3) | 1);
                r32.A0A(A0K);
                i2++;
            }
        }
    }

    public static void A0L(C186138uo r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            AnonymousClass8B0 r52 = (AnonymousClass8B0) r5;
            int i2 = 0;
            if (z) {
                C128856Xs r3 = r52.A00;
                AnonymousClass72Z.A07(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                r3.A05(i3);
                while (i2 < list.size()) {
                    r3.A0A(AnonymousClass6C7.A0K(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C128856Xs r32 = r52.A00;
                long A0K = AnonymousClass6C7.A0K(list, i2);
                r32.A05((i << 3) | 1);
                r32.A0A(A0K);
                i2++;
            }
        }
    }

    public static void A0M(C186138uo r4, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            AnonymousClass8B0 r42 = (AnonymousClass8B0) r4;
            int i3 = 0;
            if (z) {
                C128856Xs r43 = r42.A00;
                AnonymousClass72Z.A07(r43, i);
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
                r43.A05(i4);
                while (i3 < list.size()) {
                    int A092 = AnonymousClass000.A09(list, i3);
                    if (A092 >= 0) {
                        r43.A05(A092);
                    } else {
                        r43.A09((long) A092);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                r42.A00.A07(i, AnonymousClass000.A09(list, i3));
                i3++;
            }
        }
    }

    public static void A0N(C186138uo r4, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            AnonymousClass8B0 r42 = (AnonymousClass8B0) r4;
            int i2 = 0;
            if (z) {
                C128856Xs r43 = r42.A00;
                AnonymousClass72Z.A07(r43, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AnonymousClass6C7.A00(AnonymousClass000.A09(list, i4));
                }
                r43.A05(i3);
                while (i2 < list.size()) {
                    r43.A05(AnonymousClass000.A09(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C128856Xs r2 = r42.A00;
                int A09 = AnonymousClass000.A09(list, i2);
                r2.A05(i << 3);
                r2.A05(A09);
                i2++;
            }
        }
    }

    public static void A0O(C186138uo r4, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            AnonymousClass8B0 r42 = (AnonymousClass8B0) r4;
            int i2 = 0;
            if (z) {
                C128856Xs r43 = r42.A00;
                AnonymousClass72Z.A07(r43, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 = AnonymousClass72Z.A05(AnonymousClass000.A09(list, i4), i3);
                }
                r43.A05(i3);
                while (i2 < list.size()) {
                    int A09 = AnonymousClass000.A09(list, i2);
                    r43.A05((A09 >> 31) ^ (A09 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C128856Xs r2 = r42.A00;
                int A092 = AnonymousClass000.A09(list, i2);
                r2.A05(i << 3);
                r2.A05((A092 >> 31) ^ (A092 << 1));
                i2++;
            }
        }
    }

    public static void A0P(C186138uo r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            AnonymousClass8B0 r52 = (AnonymousClass8B0) r5;
            int i2 = 0;
            if (z) {
                C128856Xs r3 = r52.A00;
                AnonymousClass72Z.A07(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                r3.A05(i3);
                while (i2 < list.size()) {
                    r3.A06(AnonymousClass000.A09(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C128856Xs r2 = r52.A00;
                int A09 = AnonymousClass000.A09(list, i2);
                r2.A05((i << 3) | 5);
                r2.A06(A09);
                i2++;
            }
        }
    }

    public static void A0Q(C186138uo r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            AnonymousClass8B0 r52 = (AnonymousClass8B0) r5;
            int i2 = 0;
            if (z) {
                C128856Xs r3 = r52.A00;
                AnonymousClass72Z.A07(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                r3.A05(i3);
                while (i2 < list.size()) {
                    r3.A06(AnonymousClass000.A09(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C128856Xs r2 = r52.A00;
                int A09 = AnonymousClass000.A09(list, i2);
                r2.A05((i << 3) | 5);
                r2.A06(A09);
                i2++;
            }
        }
    }

    public static void A0R(C186138uo r4, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            AnonymousClass8B0 r42 = (AnonymousClass8B0) r4;
            int i3 = 0;
            if (z) {
                C128856Xs r43 = r42.A00;
                AnonymousClass72Z.A07(r43, i);
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
                r43.A05(i4);
                while (i3 < list.size()) {
                    int A092 = AnonymousClass000.A09(list, i3);
                    if (A092 >= 0) {
                        r43.A05(A092);
                    } else {
                        r43.A09((long) A092);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                r42.A00.A07(i, AnonymousClass000.A09(list, i3));
                i3++;
            }
        }
    }

    public static void A0S(C186138uo r4, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            AnonymousClass8B0 r42 = (AnonymousClass8B0) r4;
            int i2 = 0;
            if (z) {
                C128856Xs r43 = r42.A00;
                AnonymousClass72Z.A07(r43, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3++;
                }
                r43.A05(i3);
                while (i2 < list.size()) {
                    r43.A04(AnonymousClass001.A1Z(list.get(i2)) ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C128856Xs r2 = r42.A00;
                boolean A1Z = AnonymousClass001.A1Z(list.get(i2));
                r2.A05(i << 3);
                r2.A04(A1Z ? (byte) 1 : 0);
                i2++;
            }
        }
    }

    public static void A0T(Object obj, Object obj2) {
        C128766Xj r9 = (C128766Xj) obj;
        C160657o4 r7 = r9.zzb;
        C160657o4 r8 = ((C128766Xj) obj2).zzb;
        if (!r8.equals(C160657o4.A05)) {
            int i = r7.A00 + r8.A00;
            int[] copyOf = Arrays.copyOf(r7.A03, i);
            System.arraycopy(r8.A03, 0, copyOf, r7.A00, r8.A00);
            Object[] copyOf2 = Arrays.copyOf(r7.A04, i);
            System.arraycopy(r8.A04, 0, copyOf2, r7.A00, r8.A00);
            r7 = new C160657o4(copyOf, copyOf2, i, true);
        }
        r9.zzb = r7;
    }

    public static int A01(C186268v1 r6, List list, int i) {
        int A002;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A04 = AnonymousClass72Z.A04(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C158717kR) {
                C158717kR r1 = (C158717kR) obj;
                if (r1.A00 != null) {
                    A002 = r1.A00.A01();
                } else if (r1.A01 != null) {
                    C128766Xj r12 = (C128766Xj) r1.A01;
                    A002 = r12.zzc;
                    if (A002 == -1) {
                        A002 = AnonymousClass6C9.A0U(r12).BtX(r12);
                        r12.zzc = A002;
                    }
                } else {
                    A002 = 0;
                }
            } else {
                A002 = C128766Xj.A00(r6, (C187848xu) obj);
            }
            A04 += AnonymousClass6C7.A00(A002) + A002;
        }
        return A04;
    }

    public static int A02(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C128826Xp) {
            C128826Xp r5 = (C128826Xp) list;
            i = 0;
            while (i2 < size) {
                r5.A02(i2);
                i = AnonymousClass72Z.A06(i, r5.A01[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = AnonymousClass72Z.A06(i, AnonymousClass6C7.A0K(list, i2));
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
        if (list instanceof C128826Xp) {
            C128826Xp r5 = (C128826Xp) list;
            i = 0;
            while (i2 < size) {
                r5.A02(i2);
                i = AnonymousClass72Z.A06(i, r5.A01[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = AnonymousClass72Z.A06(i, AnonymousClass6C7.A0K(list, i2));
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
        if (list instanceof C128826Xp) {
            C128826Xp r5 = (C128826Xp) list;
            i = 0;
            while (i2 < size) {
                r5.A02(i2);
                i = AnonymousClass72Z.A06(i, AnonymousClass6C7.A0F(r5.A01[i2]));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = AnonymousClass72Z.A06(i, AnonymousClass6C7.A0J(list, i2));
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
        if (list instanceof C128816Xo) {
            C128816Xo r4 = (C128816Xo) list;
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
        if (list instanceof C128816Xo) {
            C128816Xo r4 = (C128816Xo) list;
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
        if (list instanceof C128816Xo) {
            C128816Xo r4 = (C128816Xo) list;
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
        if (list instanceof C128816Xo) {
            C128816Xo r4 = (C128816Xo) list;
            i = 0;
            while (i2 < size) {
                r4.A03(i2);
                i = AnonymousClass72Z.A05(r4.A01[i2], i);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = AnonymousClass72Z.A05(AnonymousClass000.A09(list, i2), i);
                i2++;
            }
        }
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A09(java.util.List r5, int r6) {
        /*
            int r3 = r5.size()
            r2 = 0
            if (r3 != 0) goto L_0x0008
            return r2
        L_0x0008:
            int r4 = X.AnonymousClass72Z.A04(r6)
            int r4 = r4 * r3
            boolean r0 = r5 instanceof X.C188198yV
            if (r0 == 0) goto L_0x003b
            X.8yV r5 = (X.C188198yV) r5
        L_0x0013:
            if (r2 >= r3) goto L_0x0063
            java.lang.Object r1 = r5.Btc(r2)
            boolean r0 = r1 instanceof X.C172538Lp
            if (r0 == 0) goto L_0x002c
            X.8Lp r1 = (X.C172538Lp) r1
            int r1 = r1.A01()
        L_0x0023:
            int r0 = X.AnonymousClass6C7.A00(r1)
            int r0 = r0 + r1
            int r4 = r4 + r0
            int r2 = r2 + 1
            goto L_0x0013
        L_0x002c:
            java.lang.String r1 = (java.lang.String) r1
            int r1 = X.C154937dz.A00(r1)     // Catch:{ 6zn -> 0x0033 }
            goto L_0x0023
        L_0x0033:
            java.nio.charset.Charset r0 = X.C155597fA.A02
            byte[] r0 = r1.getBytes(r0)
            int r1 = r0.length
            goto L_0x0023
        L_0x003b:
            if (r2 >= r3) goto L_0x0063
            java.lang.Object r1 = r5.get(r2)
            boolean r0 = r1 instanceof X.C172538Lp
            if (r0 == 0) goto L_0x0054
            X.8Lp r1 = (X.C172538Lp) r1
            int r1 = r1.A01()
        L_0x004b:
            int r0 = X.AnonymousClass6C7.A00(r1)
            int r0 = r0 + r1
            int r4 = r4 + r0
            int r2 = r2 + 1
            goto L_0x003b
        L_0x0054:
            java.lang.String r1 = (java.lang.String) r1
            int r1 = X.C154937dz.A00(r1)     // Catch:{ 6zn -> 0x005b }
            goto L_0x004b
        L_0x005b:
            java.nio.charset.Charset r0 = X.C155597fA.A02
            byte[] r0 = r1.getBytes(r0)
            int r1 = r0.length
            goto L_0x004b
        L_0x0063:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162497sE.A09(java.util.List, int):int");
    }

    public static int A0A(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A04 = size * AnonymousClass72Z.A04(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int A012 = ((C172538Lp) list.get(i2)).A01();
            A04 += AnonymousClass6C7.A00(A012) + A012;
        }
        return A04;
    }

    public static int A0B(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AnonymousClass72Z.A04(i) + 4);
    }

    public static int A0C(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AnonymousClass72Z.A04(i) + 8);
    }
}

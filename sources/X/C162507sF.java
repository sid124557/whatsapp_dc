package X;

import com.google.protobuf.CodedOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.7sF  reason: invalid class name and case insensitive filesystem */
public final class C162507sF {
    public static final C151437Ut A00;
    public static final C151437Ut A01;
    public static final C151437Ut A02 = new C151437Ut();
    public static final Class A03;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026 A[Catch:{ all -> 0x003d }] */
    static {
        /*
            java.lang.String r0 = "com.google.protobuf.GeneratedMessageV3"
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
            X.7Ut r0 = (X.C151437Ut) r0     // Catch:{ all -> 0x001a }
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
            X.7Ut r0 = (X.C151437Ut) r0     // Catch:{ all -> 0x003d }
            r5 = r0
        L_0x003d:
            A01 = r5
            X.7Ut r0 = new X.7Ut
            r0.<init>()
            A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162507sF.<clinit>():void");
    }

    public static int A00(C186358vA r3, Object obj, int i) {
        int A04;
        int A0D;
        if (obj instanceof C158727kS) {
            C158727kS r4 = (C158727kS) obj;
            A04 = AnonymousClass730.A04(i);
            if (r4.A00 != null) {
                A0D = r4.A00.A03();
            } else if (r4.A01 != null) {
                A0D = ((C170198Cg) r4.A01).A0D((C186358vA) null);
            } else {
                A0D = 0;
            }
        } else {
            A04 = AnonymousClass730.A04(i);
            A0D = ((C170198Cg) ((C187928y2) obj)).A0D(r3);
        }
        return A04 + AnonymousClass6C7.A00(A0D) + A0D;
    }

    public static Object A0B(C181368me r7, C151437Ut r8, Object obj, Object obj2, List list, int i) {
        if (r7 != null) {
            if (list instanceof RandomAccess) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int A09 = AnonymousClass000.A09(list, i3);
                    if (r7.BHj(A09)) {
                        if (i3 != i2) {
                            list.set(i2, Integer.valueOf(A09));
                        }
                        i2++;
                    } else {
                        if (obj2 == null) {
                            obj2 = r8.A00(obj);
                        }
                        ((C160677o7) obj2).A02(i << 3, Long.valueOf((long) A09));
                    }
                }
                if (i2 != size) {
                    list.subList(i2, size).clear();
                    return obj2;
                }
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int A05 = C18280x3.A05(it);
                    if (!r7.BHj(A05)) {
                        if (obj2 == null) {
                            obj2 = r8.A00(obj);
                        }
                        ((C160677o7) obj2).A02(i << 3, Long.valueOf((long) A05));
                        it.remove();
                    }
                }
            }
        }
        return obj2;
    }

    public static void A0C(AnonymousClass7VF r3, List list, int i) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                CodedOutputStream codedOutputStream = r3.A00;
                AnonymousClass730.A06(codedOutputStream, i);
                codedOutputStream.A0G((C172548Lq) list.get(i2));
            }
        }
    }

    public static void A0D(AnonymousClass7VF r5, List list, int i) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof C188208yW) {
                C188208yW r3 = (C188208yW) list;
                while (i2 < list.size()) {
                    Object BBr = r3.BBr(i2);
                    boolean z = BBr instanceof String;
                    CodedOutputStream codedOutputStream = r5.A00;
                    if (z) {
                        AnonymousClass730.A06(codedOutputStream, i);
                        codedOutputStream.A0J((String) BBr);
                    } else {
                        AnonymousClass730.A06(codedOutputStream, i);
                        codedOutputStream.A0G((C172548Lq) BBr);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = r5.A00;
                String A0n = AnonymousClass001.A0n(list, i2);
                AnonymousClass730.A06(codedOutputStream2, i);
                codedOutputStream2.A0J(A0n);
                i2++;
            }
        }
    }

    public static void A0E(AnonymousClass7VF r4, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r4.A00;
                AnonymousClass730.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3++;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A05(AnonymousClass001.A1Z(list.get(i2)) ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r4.A00.A0D(i, AnonymousClass001.A1Z(list.get(i2)));
                i2++;
            }
        }
    }

    public static void A0F(AnonymousClass7VF r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                AnonymousClass730.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0E(AnonymousClass6C8.A0S(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A0B(i, AnonymousClass6C8.A0S(list, i2));
                i2++;
            }
        }
    }

    public static void A0G(AnonymousClass7VF r4, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            int i3 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r4.A00;
                AnonymousClass730.A06(codedOutputStream, i);
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
                codedOutputStream.A07(i4);
                while (i3 < list.size()) {
                    int A092 = AnonymousClass000.A09(list, i3);
                    if (A092 >= 0) {
                        codedOutputStream.A07(A092);
                    } else {
                        codedOutputStream.A0F((long) A092);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                r4.A00.A09(i, AnonymousClass000.A09(list, i3));
                i3++;
            }
        }
    }

    public static void A0H(AnonymousClass7VF r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                AnonymousClass730.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A06(AnonymousClass000.A09(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A08(i, AnonymousClass000.A09(list, i2));
                i2++;
            }
        }
    }

    public static void A0I(AnonymousClass7VF r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                AnonymousClass730.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0E(AnonymousClass6C7.A0K(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A0B(i, AnonymousClass6C7.A0K(list, i2));
                i2++;
            }
        }
    }

    public static void A0J(AnonymousClass7VF r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                AnonymousClass730.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A06(AnonymousClass6C8.A0E(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A08(i, AnonymousClass6C8.A0E(list, i2));
                i2++;
            }
        }
    }

    public static void A0K(AnonymousClass7VF r4, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            int i3 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r4.A00;
                AnonymousClass730.A06(codedOutputStream, i);
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
                codedOutputStream.A07(i4);
                while (i3 < list.size()) {
                    int A092 = AnonymousClass000.A09(list, i3);
                    if (A092 >= 0) {
                        codedOutputStream.A07(A092);
                    } else {
                        codedOutputStream.A0F((long) A092);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                r4.A00.A09(i, AnonymousClass000.A09(list, i3));
                i3++;
            }
        }
    }

    public static void A0L(AnonymousClass7VF r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                AnonymousClass730.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A02(AnonymousClass6C7.A0K(list, i4));
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0F(AnonymousClass6C7.A0K(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A0C(i, AnonymousClass6C7.A0K(list, i2));
                i2++;
            }
        }
    }

    public static void A0M(AnonymousClass7VF r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                AnonymousClass730.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A06(AnonymousClass000.A09(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A08(i, AnonymousClass000.A09(list, i2));
                i2++;
            }
        }
    }

    public static void A0N(AnonymousClass7VF r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                AnonymousClass730.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0E(AnonymousClass6C7.A0K(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A0B(i, AnonymousClass6C7.A0K(list, i2));
                i2++;
            }
        }
    }

    public static void A0O(AnonymousClass7VF r4, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r4.A00;
                AnonymousClass730.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AnonymousClass730.A05(AnonymousClass000.A09(list, i4));
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    int A09 = AnonymousClass000.A09(list, i2);
                    codedOutputStream.A07((A09 >> 31) ^ (A09 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = r4.A00;
                int A092 = AnonymousClass000.A09(list, i2);
                codedOutputStream2.A0A(i, (A092 >> 31) ^ (A092 << 1));
                i2++;
            }
        }
    }

    public static void A0P(AnonymousClass7VF r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                AnonymousClass730.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A02(AnonymousClass6C7.A0J(list, i4));
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0F(AnonymousClass6C7.A0J(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A0C(i, AnonymousClass6C7.A0J(list, i2));
                i2++;
            }
        }
    }

    public static void A0Q(AnonymousClass7VF r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                AnonymousClass730.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AnonymousClass6C7.A00(AnonymousClass000.A09(list, i4));
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A07(AnonymousClass000.A09(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A0A(i, AnonymousClass000.A09(list, i2));
                i2++;
            }
        }
    }

    public static void A0R(AnonymousClass7VF r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                AnonymousClass730.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A02(AnonymousClass6C7.A0K(list, i4));
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0F(AnonymousClass6C7.A0K(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A0C(i, AnonymousClass6C7.A0K(list, i2));
                i2++;
            }
        }
    }

    public static void A0S(Object obj, Object obj2) {
        C130786cX r9 = (C130786cX) obj;
        C160677o7 r6 = r9.unknownFields;
        C160677o7 r7 = ((C130786cX) obj2).unknownFields;
        C160677o7 r1 = C160677o7.A04;
        if (!r1.equals(r7)) {
            if (r1.equals(r6)) {
                int i = r6.count + r7.count;
                int[] copyOf = Arrays.copyOf(r6.A02, i);
                System.arraycopy(r7.A02, 0, copyOf, r6.count, r7.count);
                Object[] copyOf2 = Arrays.copyOf(r6.A03, i);
                System.arraycopy(r7.A03, 0, copyOf2, r6.count, r7.count);
                r6 = new C160677o7(copyOf, copyOf2, i, true);
            } else if (!r7.equals(r1)) {
                if (r6.A01) {
                    int i2 = r6.count + r7.count;
                    r6.A01(i2);
                    System.arraycopy(r7.A02, 0, r6.A02, r6.count, r7.count);
                    System.arraycopy(r7.A03, 0, r6.A03, r6.count, r7.count);
                    r6.count = i2;
                } else {
                    throw C18320x8.A0m();
                }
            }
        }
        r9.unknownFields = r6;
    }

    public static int A01(C186358vA r5, List list, int i) {
        int A0D;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A04 = AnonymousClass730.A04(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C158727kS) {
                C158727kS r1 = (C158727kS) obj;
                if (r1.A00 != null) {
                    A0D = r1.A00.A03();
                } else if (r1.A01 != null) {
                    A0D = ((C170198Cg) r1.A01).A0D((C186358vA) null);
                } else {
                    A0D = 0;
                }
            } else {
                A0D = ((C170198Cg) ((C187928y2) obj)).A0D(r5);
            }
            A04 += AnonymousClass6C7.A00(A0D) + A0D;
        }
        return A04;
    }

    public static int A02(List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C130176bX) {
            C130176bX r4 = (C130176bX) list;
            i = 0;
            while (i4 < size) {
                r4.A01(i4);
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

    public static int A03(List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C130176bX) {
            C130176bX r4 = (C130176bX) list;
            i = 0;
            while (i4 < size) {
                r4.A01(i4);
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

    public static int A04(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C130216bb) {
            C130216bb r5 = (C130216bb) list;
            i = 0;
            while (i2 < size) {
                r5.A01(i2);
                i += CodedOutputStream.A02(r5.A01[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.A02(AnonymousClass6C7.A0K(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A05(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C130176bX) {
            C130176bX r4 = (C130176bX) list;
            i = 0;
            while (i2 < size) {
                r4.A01(i2);
                i += AnonymousClass730.A05(r4.A01[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + AnonymousClass730.A05(AnonymousClass000.A09(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A06(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C130216bb) {
            C130216bb r5 = (C130216bb) list;
            i = 0;
            while (i2 < size) {
                r5.A01(i2);
                i += CodedOutputStream.A02(AnonymousClass6C7.A0F(r5.A01[i2]));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.A02(AnonymousClass6C7.A0J(list, i2));
                i2++;
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
        if (list instanceof C130176bX) {
            C130176bX r4 = (C130176bX) list;
            i = 0;
            while (i2 < size) {
                r4.A01(i2);
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
        if (list instanceof C130216bb) {
            C130216bb r5 = (C130216bb) list;
            i = 0;
            while (i2 < size) {
                r5.A01(i2);
                i += CodedOutputStream.A02(r5.A01[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.A02(AnonymousClass6C7.A0K(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A09(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A04 = size * AnonymousClass730.A04(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int A032 = ((C172548Lq) list.get(i2)).A03();
            A04 += AnonymousClass6C7.A00(A032) + A032;
        }
        return A04;
    }

    public static int A0A(List list, int i) {
        int A032;
        int A033;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int A04 = AnonymousClass730.A04(i) * size;
        if (list instanceof C188208yW) {
            C188208yW r5 = (C188208yW) list;
            while (i2 < size) {
                Object BBr = r5.BBr(i2);
                if (BBr instanceof C172548Lq) {
                    int A034 = ((C172548Lq) BBr).A03();
                    A033 = AnonymousClass6C7.A00(A034) + A034;
                } else {
                    A033 = CodedOutputStream.A03((String) BBr);
                }
                A04 += A033;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof C172548Lq) {
                    int A035 = ((C172548Lq) obj).A03();
                    A032 = AnonymousClass6C7.A00(A035) + A035;
                } else {
                    A032 = CodedOutputStream.A03((String) obj);
                }
                A04 += A032;
                i2++;
            }
        }
        return A04;
    }
}

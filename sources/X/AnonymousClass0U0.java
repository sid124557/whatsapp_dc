package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0U0  reason: invalid class name */
public class AnonymousClass0U0 {
    public final int A00;
    public final int A01;
    public final AnonymousClass0QO A02;
    public final List A03;
    public final int[] A04;
    public final int[] A05;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b1, code lost:
        r11 = r14.A02;
        r15 = r15 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f5, code lost:
        r2 = r14.A01;
        r15 = r15 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0U0(X.AnonymousClass0QO r19, java.util.List r20, int[] r21, int[] r22) {
        /*
            r18 = this;
            r7 = 1
            r6 = r18
            r6.<init>()
            r0 = r20
            r6.A03 = r0
            r2 = r21
            r6.A05 = r2
            r1 = r22
            r6.A04 = r1
            r0 = 0
            java.util.Arrays.fill(r2, r0)
            java.util.Arrays.fill(r1, r0)
            r1 = r19
            r6.A02 = r1
            int r0 = r1.A01()
            r6.A01 = r0
            int r0 = r1.A00()
            r6.A00 = r0
            java.util.List r3 = r6.A03
            boolean r0 = r3.isEmpty()
            r2 = 0
            if (r0 != 0) goto L_0x0042
            java.lang.Object r1 = r3.get(r2)
            X.0MN r1 = (X.AnonymousClass0MN) r1
            if (r1 == 0) goto L_0x0042
            int r0 = r1.A01
            if (r0 != 0) goto L_0x0042
            int r0 = r1.A02
            if (r0 == 0) goto L_0x0054
        L_0x0042:
            X.0MN r0 = new X.0MN
            r0.<init>()
            r0.A01 = r2
            r0.A02 = r2
            r0.A03 = r2
            r0.A00 = r2
            r0.A04 = r2
            r3.add(r2, r0)
        L_0x0054:
            int r5 = r6.A01
            int r4 = r6.A00
            java.util.List r10 = r6.A03
            int r9 = X.AnonymousClass002.A04(r10, r7)
        L_0x005e:
            if (r9 < 0) goto L_0x0128
            java.lang.Object r8 = r10.get(r9)
            X.0MN r8 = (X.AnonymousClass0MN) r8
            int r12 = r8.A01
            int r0 = r8.A00
            int r12 = r12 + r0
            int r3 = r8.A02
            int r3 = r3 + r0
        L_0x006e:
            if (r5 <= r12) goto L_0x00b6
            r11 = r4
            r15 = r9
            int[] r1 = r6.A05
            int r2 = r5 + -1
            r0 = r1[r2]
            if (r0 == 0) goto L_0x007e
        L_0x007a:
            r5 = r2
            goto L_0x006e
        L_0x007c:
            if (r15 < 0) goto L_0x007a
        L_0x007e:
            java.lang.Object r14 = r10.get(r15)
            X.0MN r14 = (X.AnonymousClass0MN) r14
            int r0 = r14.A00
            int r13 = r14.A02
            int r13 = r13 + r0
            r17 = 8
            int r11 = r11 - r7
        L_0x008c:
            if (r11 < r13) goto L_0x00b1
            X.0QO r0 = r6.A02
            boolean r16 = r0.A04(r2, r11)
            if (r16 == 0) goto L_0x00ae
            boolean r0 = r0.A03(r2, r11)
            if (r0 != 0) goto L_0x009e
            r17 = 4
        L_0x009e:
            int r5 = r5 - r7
            int r0 = r11 << 5
            r0 = r0 | 16
            r1[r5] = r0
            int[] r1 = r6.A04
            int r0 = r5 << 5
            r0 = r0 | r17
            r1[r11] = r0
            goto L_0x007a
        L_0x00ae:
            int r11 = r11 + -1
            goto L_0x008c
        L_0x00b1:
            int r11 = r14.A02
            int r15 = r15 + -1
            goto L_0x007c
        L_0x00b6:
            if (r4 <= r3) goto L_0x00fa
            r2 = r5
            r15 = r9
            int[] r12 = r6.A04
            int r4 = r4 + -1
            r0 = r12[r4]
            if (r0 == 0) goto L_0x00c5
            goto L_0x00b6
        L_0x00c3:
            if (r15 < 0) goto L_0x00b6
        L_0x00c5:
            java.lang.Object r14 = r10.get(r15)
            X.0MN r14 = (X.AnonymousClass0MN) r14
            int r13 = r14.A01
            int r0 = r14.A00
            int r13 = r13 + r0
            r11 = 8
            int r2 = r2 - r7
        L_0x00d3:
            if (r2 < r13) goto L_0x00f5
            X.0QO r1 = r6.A02
            boolean r0 = r1.A04(r2, r4)
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r1.A03(r2, r4)
            if (r0 != 0) goto L_0x00e4
            r11 = 4
        L_0x00e4:
            int r0 = r2 << 5
            r0 = r0 | 16
            r12[r4] = r0
            int[] r1 = r6.A05
            int r0 = r4 << 5
            r0 = r0 | r11
            r1[r2] = r0
            goto L_0x00b6
        L_0x00f2:
            int r2 = r2 + -1
            goto L_0x00d3
        L_0x00f5:
            int r2 = r14.A01
            int r15 = r15 + -1
            goto L_0x00c3
        L_0x00fa:
            r5 = 0
        L_0x00fb:
            int r0 = r8.A00
            if (r5 >= r0) goto L_0x0120
            int r4 = r8.A01
            int r4 = r4 + r5
            int r3 = r8.A02
            int r3 = r3 + r5
            X.0QO r0 = r6.A02
            boolean r0 = r0.A03(r4, r3)
            r2 = 2
            if (r0 == 0) goto L_0x010f
            r2 = 1
        L_0x010f:
            int[] r1 = r6.A05
            int r0 = r3 << 5
            r0 = r0 | r2
            r1[r4] = r0
            int[] r1 = r6.A04
            int r0 = r4 << 5
            r0 = r0 | r2
            r1[r3] = r0
            int r5 = r5 + 1
            goto L_0x00fb
        L_0x0120:
            int r5 = r8.A01
            int r4 = r8.A02
            int r9 = r9 + -1
            goto L_0x005e
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0U0.<init>(X.0QO, java.util.List, int[], int[]):void");
    }

    public void A01(C16960uJ r19) {
        C08500ea r5;
        C16960uJ r52 = r19;
        if (r52 instanceof C08500ea) {
            r5 = (C08500ea) r52;
        } else {
            r5 = new C08500ea(r52);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        int i = this.A01;
        int i2 = this.A00;
        List list = this.A03;
        for (int size = list.size() - 1; size >= 0; size--) {
            AnonymousClass0MN r8 = (AnonymousClass0MN) list.get(size);
            int i3 = r8.A00;
            int i4 = r8.A01 + i3;
            int i5 = r8.A02 + i3;
            if (i4 < i) {
                for (int i6 = (i - i4) - 1; i6 >= 0; i6--) {
                    int i7 = i4 + i6;
                    int i8 = this.A05[i7];
                    int i9 = i8 & 31;
                    if (i9 == 0) {
                        r5.BZo(i4 + i6, 1);
                        Iterator it = A0s.iterator();
                        while (it.hasNext()) {
                            ((C03720Lh) it.next()).A00--;
                        }
                    } else if (i9 == 4 || i9 == 8) {
                        int i10 = i8 >> 5;
                        C03720Lh A002 = A00(A0s, i10, false);
                        r5.BWn(i4 + i6, A002.A00 - 1);
                        if (i9 == 4) {
                            r5.BOg(this.A02.A02(i7, i10), A002.A00 - 1, 1);
                        }
                    } else if (i9 == 16) {
                        A0s.add(new C03720Lh(i7, i4 + i6, true));
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("unknown flag for pos ");
                        A0o.append(i7);
                        AnonymousClass001.A1L(A0o);
                        throw AnonymousClass000.A0I(Long.toBinaryString((long) i9), A0o);
                    }
                }
            }
            if (i5 < i2) {
                for (int i11 = (i2 - i5) - 1; i11 >= 0; i11--) {
                    int i12 = i5 + i11;
                    int i13 = this.A04[i12];
                    int i14 = i13 & 31;
                    if (i14 == 0) {
                        r5.BUd(i4, 1);
                        Iterator it2 = A0s.iterator();
                        while (it2.hasNext()) {
                            ((C03720Lh) it2.next()).A00++;
                        }
                    } else if (i14 == 4 || i14 == 8) {
                        int i15 = i13 >> 5;
                        r5.BWn(A00(A0s, i15, true).A00, i4);
                        if (i14 == 4) {
                            r5.BOg(this.A02.A02(i15, i12), i4, 1);
                        }
                    } else if (i14 == 16) {
                        A0s.add(new C03720Lh(i12, i4, false));
                    } else {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("unknown flag for pos ");
                        A0o2.append(i12);
                        AnonymousClass001.A1L(A0o2);
                        throw AnonymousClass000.A0I(Long.toBinaryString((long) i14), A0o2);
                    }
                }
            }
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                }
                int[] iArr = this.A05;
                int i16 = r8.A01;
                if ((iArr[i16 + i3] & 31) == 2) {
                    int i17 = i16 + i3;
                    r5.BOg(this.A02.A02(i17, r8.A02 + i3), i17, 1);
                }
            }
            i = r8.A01;
            i2 = r8.A02;
        }
        r5.A00();
    }

    public void A02(AnonymousClass0R6 r2) {
        A01(new C08490eZ(r2));
    }

    public static C03720Lh A00(List list, int i, boolean z) {
        int size = list.size() - 1;
        while (size >= 0) {
            C03720Lh r3 = (C03720Lh) list.get(size);
            if (r3.A01 == i && r3.A02 == z) {
                list.remove(size);
                while (size < list.size()) {
                    C03720Lh r2 = (C03720Lh) list.get(size);
                    int i2 = r2.A00;
                    int i3 = -1;
                    if (z) {
                        i3 = 1;
                    }
                    r2.A00 = i2 + i3;
                    size++;
                }
                return r3;
            }
            size--;
        }
        return null;
    }
}

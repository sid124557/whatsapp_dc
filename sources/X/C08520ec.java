package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0ec  reason: invalid class name and case insensitive filesystem */
public class C08520ec implements C16660tl {
    public int A00 = 0;
    public C16600tf A01 = new C08030dD(30);
    public final C16860u8 A02;
    public final AnonymousClass0KY A03;
    public final ArrayList A04 = AnonymousClass001.A0s();
    public final ArrayList A05 = AnonymousClass001.A0s();

    public void BiV(AnonymousClass0Pd r2) {
        r2.A03 = null;
        this.A01.Bio(r2);
    }

    public int A00(int i, int i2) {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        while (i2 < size) {
            AnonymousClass0Pd r3 = (AnonymousClass0Pd) arrayList.get(i2);
            int i3 = r3.A00;
            if (i3 == 8) {
                int i4 = r3.A02;
                if (i4 == i) {
                    i = r3.A01;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (r3.A01 <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = r3.A02;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = r3.A01;
                    int i7 = i;
                    i -= i6;
                    if (i7 < i5 + i6) {
                        return -1;
                    }
                } else if (i3 == 1) {
                    i += r3.A01;
                }
            }
            i2++;
        }
        return i;
    }

    public final int A01(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList = this.A05;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AnonymousClass0Pd r6 = (AnonymousClass0Pd) arrayList.get(size);
            int i7 = r6.A00;
            int i8 = r6.A02;
            if (i7 == 8) {
                int i9 = r6.A01;
                int i10 = i8;
                int i11 = i9;
                if (i8 < i9) {
                    i11 = i8;
                    i10 = i9;
                }
                if (i < i11 || i > i10) {
                    if (i < i8) {
                        if (i2 == 1) {
                            r6.A02 = i8 + 1;
                            i4 = i9 + 1;
                        } else if (i2 == 2) {
                            r6.A02 = i8 - 1;
                            i4 = i9 - 1;
                        }
                        r6.A01 = i4;
                    }
                } else if (i11 == i8) {
                    if (i2 == 1) {
                        i6 = i9 + 1;
                    } else {
                        if (i2 == 2) {
                            i6 = i9 - 1;
                        }
                        i++;
                    }
                    r6.A01 = i6;
                    i++;
                } else {
                    if (i2 == 1) {
                        i5 = i8 + 1;
                    } else {
                        if (i2 == 2) {
                            i5 = i8 - 1;
                        }
                        i--;
                    }
                    r6.A02 = i5;
                    i--;
                }
            } else if (i8 > i) {
                if (i2 == 1) {
                    i3 = i8 + 1;
                } else if (i2 == 2) {
                    i3 = i8 - 1;
                }
                r6.A02 = i3;
            } else if (i7 == 1) {
                i -= r6.A01;
            } else if (i7 == 2) {
                i += r6.A01;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            AnonymousClass0Pd r2 = (AnonymousClass0Pd) arrayList.get(size2);
            int i12 = r2.A00;
            int i13 = r2.A01;
            if (i12 == 8) {
                if (i13 != r2.A02 && i13 >= 0) {
                }
            } else if (i13 > 0) {
            }
            arrayList.remove(size2);
            BiV(r2);
        }
        return i;
    }

    public void A02() {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C08460eW) this.A02).A00((AnonymousClass0Pd) arrayList.get(i));
        }
        A08(arrayList);
        this.A00 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01e0, code lost:
        if (r12.A0K.A02.contains(r1.A0H) != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0218, code lost:
        if (r3 == 0) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x023d, code lost:
        if (r13.A0K.A02.contains(r1.A0H) != false) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0277, code lost:
        if (r5 == 0) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a2, code lost:
        if (r4.A01 != (r11 - r13)) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fb, code lost:
        if (r4.A01 != (r13 - r11)) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ff, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x012a, code lost:
        if (r1 > r4.A02) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016f, code lost:
        if (r1 >= r4.A02) goto L_0x012c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0004 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r15 = this;
            X.0KY r8 = r15.A03
            java.util.ArrayList r9 = r15.A04
        L_0x0004:
            int r7 = r9.size()
            r0 = 1
            int r7 = r7 - r0
            r2 = 0
        L_0x000b:
            if (r7 < 0) goto L_0x01a0
            java.lang.Object r0 = r9.get(r7)
            X.0Pd r0 = (X.AnonymousClass0Pd) r0
            int r1 = r0.A00
            r0 = 8
            if (r1 != r0) goto L_0x019b
            if (r2 == 0) goto L_0x019c
            int r6 = r7 + 1
            java.lang.Object r5 = r9.get(r7)
            X.0Pd r5 = (X.AnonymousClass0Pd) r5
            java.lang.Object r4 = r9.get(r6)
            X.0Pd r4 = (X.AnonymousClass0Pd) r4
            int r1 = r4.A00
            r0 = 1
            if (r1 == r0) goto L_0x0172
            r10 = 2
            if (r1 == r10) goto L_0x0091
            r3 = 4
            if (r1 != r3) goto L_0x0004
            int r2 = r5.A01
            int r1 = r4.A02
            r11 = 1
            r10 = 0
            if (r2 >= r1) goto L_0x007e
            int r1 = r1 - r0
            r4.A02 = r1
        L_0x003f:
            r11 = r10
        L_0x0040:
            int r1 = r5.A02
            int r12 = r4.A02
            if (r1 > r12) goto L_0x0068
            int r0 = r12 + 1
            r4.A02 = r0
        L_0x004a:
            r9.set(r6, r5)
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x005f
            r9.set(r7, r4)
        L_0x0054:
            if (r11 == 0) goto L_0x0059
            r9.add(r7, r11)
        L_0x0059:
            if (r10 == 0) goto L_0x0004
            r9.add(r7, r10)
            goto L_0x0004
        L_0x005f:
            r9.remove(r7)
            X.0tl r0 = r8.A00
            r0.BiV(r4)
            goto L_0x0054
        L_0x0068:
            int r0 = r4.A01
            int r12 = r12 + r0
            if (r1 >= r12) goto L_0x004a
            int r12 = r12 - r1
            X.0tl r2 = r8.A00
            int r1 = r1 + 1
            java.lang.Object r0 = r4.A03
            X.0Pd r10 = r2.BLo(r0, r3, r1, r12)
            int r0 = r4.A01
            int r0 = r0 - r12
            r4.A01 = r0
            goto L_0x004a
        L_0x007e:
            int r0 = r4.A01
            int r1 = r1 + r0
            if (r2 >= r1) goto L_0x003f
            int r0 = r0 - r11
            r4.A01 = r0
            X.0tl r2 = r8.A00
            int r1 = r5.A02
            java.lang.Object r0 = r4.A03
            X.0Pd r11 = r2.BLo(r0, r3, r1, r11)
            goto L_0x0040
        L_0x0091:
            int r13 = r5.A02
            int r11 = r5.A01
            r2 = 1
            r14 = 0
            int r3 = r4.A02
            if (r13 >= r11) goto L_0x00f3
            if (r3 != r13) goto L_0x00a4
            int r1 = r4.A01
            int r0 = r11 - r13
            r12 = 0
            if (r1 == r0) goto L_0x00ff
        L_0x00a4:
            r12 = 0
        L_0x00a5:
            if (r11 >= r3) goto L_0x00d8
            int r3 = r3 - r2
            r4.A02 = r3
        L_0x00aa:
            int r11 = r5.A02
            r2 = 0
            if (r11 > r3) goto L_0x00c2
            int r0 = r3 + 1
            r4.A02 = r0
        L_0x00b3:
            if (r14 == 0) goto L_0x0101
            r9.set(r7, r4)
            r9.remove(r6)
            X.0tl r0 = r8.A00
            r0.BiV(r5)
            goto L_0x0004
        L_0x00c2:
            int r0 = r4.A01
            int r3 = r3 + r0
            if (r11 >= r3) goto L_0x00b3
            int r3 = r3 - r11
            X.0tl r1 = r8.A00
            int r0 = r11 + 1
            X.0Pd r2 = r1.BLo(r2, r10, r0, r3)
            int r1 = r5.A02
            int r0 = r4.A02
            int r1 = r1 - r0
            r4.A01 = r1
            goto L_0x00b3
        L_0x00d8:
            int r1 = r4.A01
            int r0 = r3 + r1
            if (r11 >= r0) goto L_0x00aa
            int r1 = r1 - r2
            r4.A01 = r1
            r5.A00 = r10
            r5.A01 = r2
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0004
            r9.remove(r6)
            X.0tl r0 = r8.A00
            r0.BiV(r4)
            goto L_0x0004
        L_0x00f3:
            int r0 = r11 + 1
            if (r3 != r0) goto L_0x00fd
            int r0 = r4.A01
            int r13 = r13 - r11
            r12 = 1
            if (r0 == r13) goto L_0x00ff
        L_0x00fd:
            r12 = 1
            goto L_0x00a5
        L_0x00ff:
            r14 = 1
            goto L_0x00a5
        L_0x0101:
            if (r12 == 0) goto L_0x0148
            if (r2 == 0) goto L_0x011b
            int r1 = r5.A02
            int r0 = r2.A02
            if (r1 <= r0) goto L_0x0110
            int r0 = r2.A01
            int r1 = r1 - r0
            r5.A02 = r1
        L_0x0110:
            int r1 = r5.A01
            int r0 = r2.A02
            if (r1 <= r0) goto L_0x011b
            int r0 = r2.A01
            int r1 = r1 - r0
            r5.A01 = r1
        L_0x011b:
            int r1 = r5.A02
            int r0 = r4.A02
            if (r1 <= r0) goto L_0x0126
            int r0 = r4.A01
            int r1 = r1 - r0
            r5.A02 = r1
        L_0x0126:
            int r1 = r5.A01
            int r0 = r4.A02
            if (r1 <= r0) goto L_0x0131
        L_0x012c:
            int r0 = r4.A01
            int r1 = r1 - r0
            r5.A01 = r1
        L_0x0131:
            r9.set(r7, r4)
            int r1 = r5.A02
            int r0 = r5.A01
            if (r1 == r0) goto L_0x0144
            r9.set(r6, r5)
        L_0x013d:
            if (r2 == 0) goto L_0x0004
            r9.add(r7, r2)
            goto L_0x0004
        L_0x0144:
            r9.remove(r6)
            goto L_0x013d
        L_0x0148:
            if (r2 == 0) goto L_0x0160
            int r1 = r5.A02
            int r0 = r2.A02
            if (r1 < r0) goto L_0x0155
            int r0 = r2.A01
            int r1 = r1 - r0
            r5.A02 = r1
        L_0x0155:
            int r1 = r5.A01
            int r0 = r2.A02
            if (r1 < r0) goto L_0x0160
            int r0 = r2.A01
            int r1 = r1 - r0
            r5.A01 = r1
        L_0x0160:
            int r1 = r5.A02
            int r0 = r4.A02
            if (r1 < r0) goto L_0x016b
            int r0 = r4.A01
            int r1 = r1 - r0
            r5.A02 = r1
        L_0x016b:
            int r1 = r5.A01
            int r0 = r4.A02
            if (r1 < r0) goto L_0x0131
            goto L_0x012c
        L_0x0172:
            int r3 = r5.A01
            int r0 = r4.A02
            r2 = 0
            if (r3 >= r0) goto L_0x017a
            r2 = -1
        L_0x017a:
            int r1 = r5.A02
            if (r1 >= r0) goto L_0x0180
            int r2 = r2 + 1
        L_0x0180:
            if (r0 > r1) goto L_0x0187
            int r0 = r4.A01
            int r1 = r1 + r0
            r5.A02 = r1
        L_0x0187:
            int r1 = r4.A02
            if (r1 > r3) goto L_0x0190
            int r0 = r4.A01
            int r3 = r3 + r0
            r5.A01 = r3
        L_0x0190:
            int r1 = r1 + r2
            r4.A02 = r1
            r9.set(r7, r4)
            r9.set(r6, r5)
            goto L_0x0004
        L_0x019b:
            r2 = 1
        L_0x019c:
            int r7 = r7 + -1
            goto L_0x000b
        L_0x01a0:
            int r8 = r9.size()
            r7 = 0
        L_0x01a5:
            if (r7 >= r8) goto L_0x0283
            java.lang.Object r6 = r9.get(r7)
            X.0Pd r6 = (X.AnonymousClass0Pd) r6
            int r1 = r6.A00
            r0 = 1
            if (r1 == r0) goto L_0x027e
            r11 = 2
            if (r1 == r11) goto L_0x021b
            r5 = 4
            if (r1 == r5) goto L_0x01bf
            r0 = 8
            if (r1 == r0) goto L_0x027e
        L_0x01bc:
            int r7 = r7 + 1
            goto L_0x01a5
        L_0x01bf:
            int r11 = r6.A02
            int r10 = r6.A01
            int r10 = r10 + r11
            r4 = r11
            r3 = -1
            r2 = 0
        L_0x01c7:
            if (r11 >= r10) goto L_0x020b
            X.0u8 r0 = r15.A02
            X.0eW r0 = (X.C08460eW) r0
            androidx.recyclerview.widget.RecyclerView r12 = r0.A00
            r0 = 1
            X.0Ua r1 = r12.A0G(r11, r0)
            if (r1 == 0) goto L_0x01e2
            X.0R0 r0 = r12.A0K
            android.view.View r1 = r1.A0H
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x01fc
        L_0x01e2:
            r1 = 1
            boolean r0 = r15.A09(r11)
            if (r0 != 0) goto L_0x01fc
            if (r3 != r1) goto L_0x01f6
            java.lang.Object r0 = r6.A03
            X.0Pd r0 = r15.BLo(r0, r5, r4, r2)
            r15.A06(r0)
            r4 = r11
            r2 = 0
        L_0x01f6:
            r3 = 0
        L_0x01f7:
            int r2 = r2 + 1
            int r11 = r11 + 1
            goto L_0x01c7
        L_0x01fc:
            if (r3 != 0) goto L_0x0209
            java.lang.Object r0 = r6.A03
            X.0Pd r0 = r15.BLo(r0, r5, r4, r2)
            r15.A05(r0)
            r4 = r11
            r2 = 0
        L_0x0209:
            r3 = 1
            goto L_0x01f7
        L_0x020b:
            int r0 = r6.A01
            if (r2 == r0) goto L_0x0218
            java.lang.Object r0 = r6.A03
            r15.BiV(r6)
            X.0Pd r6 = r15.BLo(r0, r5, r4, r2)
        L_0x0218:
            if (r3 != 0) goto L_0x027e
            goto L_0x0279
        L_0x021b:
            int r10 = r6.A02
            int r12 = r6.A01
            int r12 = r12 + r10
            r5 = -1
            r4 = r10
            r3 = 0
        L_0x0223:
            r2 = 0
            if (r4 >= r12) goto L_0x026c
            X.0u8 r0 = r15.A02
            X.0eW r0 = (X.C08460eW) r0
            androidx.recyclerview.widget.RecyclerView r13 = r0.A00
            r0 = 1
            X.0Ua r1 = r13.A0G(r4, r0)
            if (r1 == 0) goto L_0x023f
            X.0R0 r0 = r13.A0K
            android.view.View r1 = r1.A0H
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x025e
        L_0x023f:
            r1 = 1
            boolean r0 = r15.A09(r4)
            if (r0 != 0) goto L_0x025e
            if (r5 != r1) goto L_0x025c
            X.0Pd r0 = r15.BLo(r2, r11, r10, r3)
            r15.A06(r0)
            r0 = 1
        L_0x0250:
            r5 = 0
        L_0x0251:
            if (r0 == 0) goto L_0x0259
            int r4 = r4 - r3
            int r12 = r12 - r3
            r3 = 1
        L_0x0256:
            int r4 = r4 + 1
            goto L_0x0223
        L_0x0259:
            int r3 = r3 + 1
            goto L_0x0256
        L_0x025c:
            r0 = 0
            goto L_0x0250
        L_0x025e:
            if (r5 != 0) goto L_0x026a
            X.0Pd r0 = r15.BLo(r2, r11, r10, r3)
            r15.A05(r0)
            r0 = 1
        L_0x0268:
            r5 = 1
            goto L_0x0251
        L_0x026a:
            r0 = 0
            goto L_0x0268
        L_0x026c:
            int r0 = r6.A01
            if (r3 == r0) goto L_0x0277
            r15.BiV(r6)
            X.0Pd r6 = r15.BLo(r2, r11, r10, r3)
        L_0x0277:
            if (r5 != 0) goto L_0x027e
        L_0x0279:
            r15.A05(r6)
            goto L_0x01bc
        L_0x027e:
            r15.A06(r6)
            goto L_0x01bc
        L_0x0283:
            r9.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08520ec.A04():void");
    }

    public final void A05(AnonymousClass0Pd r11) {
        int i;
        int i2 = r11.A00;
        if (i2 == 1 || i2 == 8) {
            throw AnonymousClass001.A0c("should not dispatch add or move for pre layout");
        }
        int A012 = A01(r11.A02, i2);
        int i3 = r11.A02;
        int i4 = r11.A00;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw AnonymousClass000.A0E(r11, "op should be remove or update.", AnonymousClass001.A0o());
        }
        int i5 = 1;
        for (int i6 = 1; i6 < r11.A01; i6++) {
            int A013 = A01(r11.A02 + (i * i6), i4);
            i4 = r11.A00;
            if (i4 == 2 ? A013 != A012 : !(i4 == 4 && A013 == A012 + 1)) {
                AnonymousClass0Pd BLo = BLo(r11.A03, i4, A012, i5);
                A07(BLo, i3);
                BiV(BLo);
                i4 = r11.A00;
                if (i4 == 4) {
                    i3 += i5;
                }
                A012 = A013;
                i5 = 1;
            } else {
                i5++;
            }
        }
        Object obj = r11.A03;
        BiV(r11);
        if (i5 > 0) {
            AnonymousClass0Pd BLo2 = BLo(obj, r11.A00, A012, i5);
            A07(BLo2, i3);
            BiV(BLo2);
        }
    }

    public final void A06(AnonymousClass0Pd r5) {
        this.A05.add(r5);
        int i = r5.A00;
        if (i == 1) {
            this.A02.BLp(r5.A02, r5.A01);
        } else if (i == 2) {
            C16860u8 r0 = this.A02;
            int i2 = r5.A02;
            int i3 = r5.A01;
            RecyclerView recyclerView = ((C08460eW) r0).A00;
            recyclerView.A0g(i2, i3, false);
            recyclerView.A0k = true;
        } else if (i == 4) {
            this.A02.BKY(r5.A03, r5.A02, r5.A01);
        } else if (i == 8) {
            this.A02.BLq(r5.A02, r5.A01);
        } else {
            throw AnonymousClass000.A0E(r5, "Unknown update op type for ", AnonymousClass001.A0o());
        }
    }

    public void A07(AnonymousClass0Pd r5, int i) {
        C16860u8 r2 = this.A02;
        C08460eW r3 = (C08460eW) r2;
        r3.A00(r5);
        int i2 = r5.A00;
        if (i2 == 2) {
            int i3 = r5.A01;
            RecyclerView recyclerView = r3.A00;
            recyclerView.A0g(i, i3, true);
            recyclerView.A0k = true;
            recyclerView.A0y.A00 += i3;
        } else if (i2 == 4) {
            r2.BKY(r5.A03, i, r5.A01);
        } else {
            throw AnonymousClass001.A0c("only remove and update ops can be dispatched in first pass");
        }
    }

    public final boolean A09(int i) {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            AnonymousClass0Pd r4 = (AnonymousClass0Pd) arrayList.get(i2);
            int i3 = r4.A00;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = r4.A02;
                    int i5 = r4.A01 + i4;
                    while (i4 < i5) {
                        if (A00(i4, i2 + 1) != i) {
                            i4++;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
                i2++;
            } else if (A00(r4.A01, i2 + 1) != i) {
                i2++;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass0Pd BLo(Object obj, int i, int i2, int i3) {
        AnonymousClass0Pd r0 = (AnonymousClass0Pd) this.A01.AwG();
        if (r0 == null) {
            return new AnonymousClass0Pd(obj, i, i2, i3);
        }
        r0.A00 = i;
        r0.A02 = i2;
        r0.A01 = i3;
        r0.A03 = obj;
        return r0;
    }

    public C08520ec(C16860u8 r3) {
        this.A02 = r3;
        this.A03 = new AnonymousClass0KY(this);
    }

    public void A03() {
        A02();
        ArrayList arrayList = this.A04;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass0Pd r8 = (AnonymousClass0Pd) arrayList.get(i);
            int i2 = r8.A00;
            if (i2 == 1) {
                C16860u8 r2 = this.A02;
                ((C08460eW) r2).A00(r8);
                r2.BLp(r8.A02, r8.A01);
            } else if (i2 == 2) {
                C08460eW r0 = (C08460eW) this.A02;
                r0.A00(r8);
                int i3 = r8.A02;
                int i4 = r8.A01;
                RecyclerView recyclerView = r0.A00;
                recyclerView.A0g(i3, i4, true);
                recyclerView.A0k = true;
                recyclerView.A0y.A00 += i4;
            } else if (i2 == 4) {
                C16860u8 r3 = this.A02;
                ((C08460eW) r3).A00(r8);
                r3.BKY(r8.A03, r8.A02, r8.A01);
            } else if (i2 == 8) {
                C16860u8 r22 = this.A02;
                ((C08460eW) r22).A00(r8);
                r22.BLq(r8.A02, r8.A01);
            }
        }
        A08(arrayList);
        this.A00 = 0;
    }

    public void A08(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            BiV((AnonymousClass0Pd) list.get(i));
        }
        list.clear();
    }
}

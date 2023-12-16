package com.facebook.android.exoplayer2;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass6JO;
import X.AnonymousClass6JP;
import X.AnonymousClass6JX;
import X.AnonymousClass6JY;
import X.AnonymousClass6JZ;
import X.AnonymousClass6K6;
import X.C125696Ja;
import X.C125706Jb;
import X.C151817Wk;
import X.C156497gj;
import X.C159197lM;
import X.C1672580j;
import android.util.Pair;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;

public abstract class Timeline {
    public static final Timeline A00 = new AnonymousClass6JX();

    public final int A03(C151817Wk r5, C1672580j r6, int i, int i2, boolean z) {
        int i3 = A08(r5, i, false).A00;
        if (A09(r6, i3, 0).A01 != i) {
            return i + 1;
        }
        int A02 = A02(i3, i2, z);
        if (A02 == -1) {
            return -1;
        }
        return A09(r6, A02, 0).A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r13 = (com.facebook.android.exoplayer2.Timeline) r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r13) {
        /*
            r12 = this;
            r5 = 1
            if (r12 == r13) goto L_0x0080
            boolean r0 = r13 instanceof com.facebook.android.exoplayer2.Timeline
            r4 = 0
            if (r0 == 0) goto L_0x007f
            com.facebook.android.exoplayer2.Timeline r13 = (com.facebook.android.exoplayer2.Timeline) r13
            int r0 = r13.A01()
            int r11 = r12.A01()
            if (r0 != r11) goto L_0x007f
            int r0 = r13.A00()
            int r7 = r12.A00()
            if (r0 != r7) goto L_0x007f
            X.80j r10 = new X.80j
            r10.<init>()
            X.7Wk r6 = new X.7Wk
            r6.<init>()
            X.80j r9 = new X.80j
            r9.<init>()
            X.7Wk r3 = new X.7Wk
            r3.<init>()
            r8 = 0
        L_0x0033:
            if (r8 >= r11) goto L_0x0048
            r0 = 0
            X.80j r2 = r12.A09(r10, r8, r0)
            X.80j r0 = r13.A09(r9, r8, r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x007f
            int r8 = r8 + 1
            goto L_0x0033
        L_0x0048:
            r2 = 0
        L_0x0049:
            if (r2 >= r7) goto L_0x005c
            X.7Wk r1 = r12.A08(r6, r2, r5)
            X.7Wk r0 = r13.A08(r3, r2, r5)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007f
            int r2 = r2 + 1
            goto L_0x0049
        L_0x005c:
            int r3 = r12.A05(r5)
            int r0 = r13.A05(r5)
            if (r3 != r0) goto L_0x007f
            int r2 = r12.A06(r5)
            int r0 = r13.A06(r5)
            if (r2 == r0) goto L_0x0071
            return r4
        L_0x0071:
            if (r3 == r2) goto L_0x0080
            int r1 = r12.A02(r3, r4, r5)
            int r0 = r13.A02(r3, r4, r5)
            if (r1 != r0) goto L_0x007f
            r3 = r1
            goto L_0x0071
        L_0x007f:
            return r4
        L_0x0080:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.Timeline.equals(java.lang.Object):boolean");
    }

    public int A00() {
        if (this instanceof C125706Jb) {
            return 1;
        }
        if (this instanceof AnonymousClass6JZ) {
            return ((AnonymousClass6JZ) this).A00.A00();
        }
        if (this instanceof AnonymousClass6JY) {
            return 1;
        }
        if (this instanceof AnonymousClass6JO) {
            AnonymousClass6JO r0 = (AnonymousClass6JO) this;
            return r0.A00 * r0.A02;
        } else if (this instanceof AnonymousClass6JP) {
            return ((AnonymousClass6JP) this).A00;
        } else {
            return 0;
        }
    }

    public int A01() {
        if (this instanceof C125706Jb) {
            return 1;
        }
        if (this instanceof AnonymousClass6JZ) {
            return ((AnonymousClass6JZ) this).A00.A01();
        }
        if (this instanceof AnonymousClass6JY) {
            return 1;
        }
        if (this instanceof AnonymousClass6JO) {
            AnonymousClass6JO r0 = (AnonymousClass6JO) this;
            return r0.A01 * r0.A02;
        } else if (this instanceof AnonymousClass6JP) {
            return ((AnonymousClass6JP) this).A01;
        } else {
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0099 A[EDGE_INSN: B:63:0x0099->B:41:0x0099 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass6JZ
            if (r0 == 0) goto L_0x0019
            r3 = r7
            X.6JZ r3 = (X.AnonymousClass6JZ) r3
            boolean r2 = r3 instanceof X.AnonymousClass6K5
            com.facebook.android.exoplayer2.Timeline r0 = r3.A00
            int r1 = r0.A02(r8, r9, r10)
            if (r2 == 0) goto L_0x0018
            r0 = -1
            if (r1 != r0) goto L_0x0018
            int r1 = r3.A05(r10)
        L_0x0018:
            return r1
        L_0x0019:
            boolean r0 = r7 instanceof X.C125696Ja
            if (r0 == 0) goto L_0x00a2
            r4 = r7
            X.6Ja r4 = (X.C125696Ja) r4
            r5 = 0
            r3 = 2
            boolean r0 = r4 instanceof X.AnonymousClass6JO
            if (r0 == 0) goto L_0x0073
            r0 = r4
            X.6JO r0 = (X.AnonymousClass6JO) r0
            int r0 = r0.A01
            int r6 = r8 / r0
        L_0x002d:
            int r2 = r4.A0A(r6)
            com.facebook.android.exoplayer2.Timeline r0 = r4.A0B(r6)
            int r8 = r8 - r2
            if (r9 == r3) goto L_0x0039
            r5 = r9
        L_0x0039:
            int r0 = r0.A02(r8, r5, r10)
            r5 = -1
            if (r0 != r5) goto L_0x0097
            if (r10 == 0) goto L_0x006a
            X.8uj r0 = r4.A01
            int r2 = r0.B9z(r6)
        L_0x0048:
            if (r2 == r5) goto L_0x0099
            com.facebook.android.exoplayer2.Timeline r1 = r4.A0B(r2)
            int r0 = r1.A01()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 == 0) goto L_0x008d
            if (r10 == 0) goto L_0x0061
            X.8uj r0 = r4.A01
            int r2 = r0.B9z(r2)
            goto L_0x0048
        L_0x0061:
            int r0 = r4.A00
            int r0 = r0 + -1
            if (r2 >= r0) goto L_0x0099
            int r2 = r2 + 1
            goto L_0x0048
        L_0x006a:
            int r0 = r4.A00
            int r0 = r0 + -1
            if (r6 >= r0) goto L_0x0099
            int r2 = r6 + 1
            goto L_0x0048
        L_0x0073:
            r0 = r4
            X.6JP r0 = (X.AnonymousClass6JP) r0
            int[] r2 = r0.A04
            int r1 = r8 + 1
            int r6 = java.util.Arrays.binarySearch(r2, r1)
            if (r6 >= 0) goto L_0x0084
            int r0 = r6 + 2
            int r6 = -r0
            goto L_0x002d
        L_0x0084:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x002d
            r0 = r2[r6]
            if (r0 != r1) goto L_0x002d
            goto L_0x0084
        L_0x008d:
            if (r2 == r5) goto L_0x0099
            int r2 = r4.A0A(r2)
            int r0 = r1.A05(r10)
        L_0x0097:
            int r2 = r2 + r0
            return r2
        L_0x0099:
            if (r9 != r3) goto L_0x00a0
            int r2 = r4.A05(r10)
            return r2
        L_0x00a0:
            r2 = -1
            return r2
        L_0x00a2:
            r0 = 1
            if (r9 == 0) goto L_0x00ba
            if (r9 == r0) goto L_0x00b4
            r0 = 2
            if (r9 != r0) goto L_0x00b5
            int r0 = r7.A06(r10)
            if (r8 != r0) goto L_0x00c2
            int r8 = r7.A05(r10)
        L_0x00b4:
            return r8
        L_0x00b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()
            throw r0
        L_0x00ba:
            int r0 = r7.A06(r10)
            if (r8 != r0) goto L_0x00c2
            r8 = -1
            return r8
        L_0x00c2:
            int r8 = r8 + 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.Timeline.A02(int, int, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A04(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C125706Jb
            if (r0 == 0) goto L_0x000f
            java.lang.Object r0 = X.C125706Jb.A03
            boolean r1 = r0.equals(r8)
            r0 = -1
            if (r1 == 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            return r0
        L_0x000f:
            boolean r0 = r7 instanceof X.AnonymousClass6JY
            if (r0 == 0) goto L_0x0017
            r0 = -1
            if (r8 != 0) goto L_0x000e
            goto L_0x000d
        L_0x0017:
            boolean r0 = r7 instanceof X.AnonymousClass6JZ
            if (r0 == 0) goto L_0x003c
            r2 = r7
            X.6JZ r2 = (X.AnonymousClass6JZ) r2
            boolean r0 = r2 instanceof X.AnonymousClass6K6
            if (r0 == 0) goto L_0x0035
            X.6K6 r2 = (X.AnonymousClass6K6) r2
            com.facebook.android.exoplayer2.Timeline r1 = r2.A00
            java.lang.Object r0 = X.AnonymousClass6K6.A03
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0030
            java.lang.Object r8 = r2.A00
        L_0x0030:
            int r0 = r1.A04(r8)
            return r0
        L_0x0035:
            com.facebook.android.exoplayer2.Timeline r0 = r2.A00
            int r0 = r0.A04(r8)
            return r0
        L_0x003c:
            boolean r0 = r7 instanceof X.AnonymousClass6JX
            if (r0 == 0) goto L_0x0042
            r0 = -1
            return r0
        L_0x0042:
            r6 = r7
            X.6Ja r6 = (X.C125696Ja) r6
            boolean r0 = r8 instanceof android.util.Pair
            r5 = -1
            if (r0 == 0) goto L_0x0071
            android.util.Pair r8 = (android.util.Pair) r8
            java.lang.Object r2 = r8.first
            java.lang.Object r4 = r8.second
            boolean r3 = r6 instanceof X.AnonymousClass6JO
            if (r3 == 0) goto L_0x0079
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0071
            int r2 = X.AnonymousClass001.A0K(r2)
        L_0x005c:
            if (r2 == r5) goto L_0x0071
            com.facebook.android.exoplayer2.Timeline r0 = r6.A0B(r2)
            int r1 = r0.A04(r4)
            if (r1 == r5) goto L_0x0071
            if (r3 == 0) goto L_0x0072
            X.6JO r6 = (X.AnonymousClass6JO) r6
            int r0 = r6.A00
            int r2 = r2 * r0
        L_0x006f:
            int r5 = r2 + r1
        L_0x0071:
            return r5
        L_0x0072:
            X.6JP r6 = (X.AnonymousClass6JP) r6
            int[] r0 = r6.A03
            r2 = r0[r2]
            goto L_0x006f
        L_0x0079:
            r1 = r6
            X.6JP r1 = (X.AnonymousClass6JP) r1
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0071
            android.util.SparseIntArray r1 = r1.A02
            int r0 = X.AnonymousClass001.A0K(r2)
            int r2 = r1.get(r0, r5)
            if (r2 != r5) goto L_0x005c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.Timeline.A04(java.lang.Object):int");
    }

    public int A05(boolean z) {
        int i;
        if (this instanceof AnonymousClass6JZ) {
            return ((AnonymousClass6JZ) this).A00.A05(z);
        }
        if (this instanceof C125696Ja) {
            C125696Ja r5 = (C125696Ja) this;
            int i2 = r5.A00;
            if (i2 == 0) {
                return -1;
            }
            int i3 = 0;
            if (z) {
                i3 = r5.A01.B7g();
            }
            do {
                Timeline A0B = r5.A0B(i);
                if (!AnonymousClass000.A1T(A0B.A01())) {
                    return r5.A0A(i) + A0B.A05(z);
                }
                if (z) {
                    i = r5.A01.B9z(i);
                    continue;
                } else if (i >= i2 - 1) {
                    return -1;
                } else {
                    i++;
                    continue;
                }
            } while (i != -1);
            return -1;
        } else if (AnonymousClass000.A1T(A01())) {
            return -1;
        } else {
            return 0;
        }
    }

    public int A06(boolean z) {
        int i;
        int i2;
        if (this instanceof AnonymousClass6JZ) {
            return ((AnonymousClass6JZ) this).A00.A06(z);
        }
        if (this instanceof C125696Ja) {
            C125696Ja r4 = (C125696Ja) this;
            int i3 = r4.A00;
            if (i3 != 0) {
                if (z) {
                    i = r4.A01.B91();
                } else {
                    i = i3 - 1;
                }
                do {
                    Timeline A0B = r4.A0B(i);
                    if (AnonymousClass000.A1T(A0B.A01())) {
                        if (!z) {
                            if (i <= 0) {
                                break;
                            }
                            i2 = i - 1;
                            continue;
                        } else {
                            i2 = r4.A01.BBf(i);
                            continue;
                        }
                    } else {
                        return r4.A0A(i) + A0B.A06(z);
                    }
                } while (i != -1);
            }
            return -1;
        } else if (AnonymousClass000.A1T(A01())) {
            return -1;
        } else {
            return A01() - 1;
        }
    }

    public C151817Wk A08(C151817Wk r10, int i, boolean z) {
        int binarySearch;
        int i2;
        Integer valueOf;
        Object create;
        Object obj;
        if (this instanceof C125706Jb) {
            C125706Jb r1 = (C125706Jb) this;
            C159197lM.A00(i, 1);
            if (z) {
                obj = C125706Jb.A03;
            } else {
                obj = null;
            }
            long j = r1.A00;
            C156497gj r0 = C156497gj.A03;
            r10.A04 = obj;
            r10.A00 = 0;
            r10.A01 = j;
            r10.A02 = -0;
            r10.A03 = r0;
        } else if (this instanceof AnonymousClass6JY) {
            C156497gj r12 = C156497gj.A03;
            r10.A04 = null;
            r10.A00 = 0;
            r10.A01 = -9223372036854775807L;
            r10.A02 = 0;
            r10.A03 = r12;
            return r10;
        } else {
            if (this instanceof AnonymousClass6JZ) {
                AnonymousClass6JZ r2 = (AnonymousClass6JZ) this;
                if (!(r2 instanceof AnonymousClass6K6)) {
                    return r2.A00.A08(r10, i, z);
                }
                AnonymousClass6K6 r22 = (AnonymousClass6K6) r2;
                r22.A00.A08(r10, i, z);
                if (Util.A0D(r10.A04, r22.A00)) {
                    create = AnonymousClass6K6.A03;
                }
            } else if (this instanceof AnonymousClass6JX) {
                throw new IndexOutOfBoundsException();
            } else {
                C125696Ja r4 = (C125696Ja) this;
                boolean z2 = r4 instanceof AnonymousClass6JO;
                if (z2) {
                    binarySearch = i / ((AnonymousClass6JO) r4).A00;
                } else {
                    int[] iArr = ((AnonymousClass6JP) r4).A03;
                    int i3 = i + 1;
                    binarySearch = Arrays.binarySearch(iArr, i3);
                    if (binarySearch < 0) {
                        binarySearch = -(binarySearch + 2);
                    } else {
                        do {
                            binarySearch--;
                            if (binarySearch < 0) {
                                break;
                            }
                        } while (iArr[binarySearch] != i3);
                    }
                }
                int A0A = r4.A0A(binarySearch);
                if (z2) {
                    i2 = binarySearch * ((AnonymousClass6JO) r4).A00;
                } else {
                    i2 = ((AnonymousClass6JP) r4).A03[binarySearch];
                }
                r4.A0B(binarySearch).A08(r10, i - i2, z);
                r10.A00 += A0A;
                if (z) {
                    if (z2) {
                        valueOf = Integer.valueOf(binarySearch);
                    } else {
                        valueOf = Integer.valueOf(((AnonymousClass6JP) r4).A05[binarySearch]);
                    }
                    Object obj2 = r10.A04;
                    obj2.getClass();
                    create = Pair.create(valueOf, obj2);
                }
            }
            r10.A04 = create;
            return r10;
        }
        return r10;
    }

    public C1672580j A09(C1672580j r10, int i, long j) {
        int binarySearch;
        int i2;
        Object valueOf;
        if (this instanceof C125706Jb) {
            C125706Jb r1 = (C125706Jb) this;
            C159197lM.A00(i, 1);
            Object obj = C1672580j.A0C;
            boolean z = r1.A02;
            long j2 = r1.A01;
            r10.A08 = obj;
            r10.A07 = C1672580j.A0B;
            r10.A05 = -9223372036854775807L;
            r10.A06 = -9223372036854775807L;
            r10.A04 = -9223372036854775807L;
            r10.A0A = z;
            r10.A09 = false;
            r10.A02 = 0;
            r10.A03 = j2;
            r10.A00 = 0;
            r10.A01 = 0;
            return r10;
        } else if (this instanceof AnonymousClass6JZ) {
            return ((AnonymousClass6JZ) this).A00.A09(r10, i, j);
        } else {
            if (this instanceof AnonymousClass6JY) {
                Object obj2 = C1672580j.A0C;
                long j3 = 0;
                if (j > 0) {
                    j3 = -9223372036854775807L;
                }
                r10.A08 = obj2;
                r10.A07 = C1672580j.A0B;
                r10.A05 = -9223372036854775807L;
                r10.A06 = -9223372036854775807L;
                r10.A04 = -9223372036854775807L;
                r10.A0A = false;
                r10.A09 = true;
                r10.A02 = j3;
                r10.A03 = -9223372036854775807L;
                r10.A00 = 0;
                r10.A01 = 0;
                return r10;
            } else if (this instanceof AnonymousClass6JX) {
                throw new IndexOutOfBoundsException();
            } else {
                C125696Ja r5 = (C125696Ja) this;
                boolean z2 = r5 instanceof AnonymousClass6JO;
                if (z2) {
                    binarySearch = i / ((AnonymousClass6JO) r5).A01;
                } else {
                    int[] iArr = ((AnonymousClass6JP) r5).A04;
                    int i3 = i + 1;
                    binarySearch = Arrays.binarySearch(iArr, i3);
                    if (binarySearch < 0) {
                        binarySearch = -(binarySearch + 2);
                    } else {
                        do {
                            binarySearch--;
                            if (binarySearch < 0) {
                                break;
                            }
                        } while (iArr[binarySearch] != i3);
                    }
                }
                int A0A = r5.A0A(binarySearch);
                if (z2) {
                    i2 = binarySearch * ((AnonymousClass6JO) r5).A00;
                } else {
                    i2 = ((AnonymousClass6JP) r5).A03[binarySearch];
                }
                r5.A0B(binarySearch).A09(r10, i - A0A, j);
                if (z2) {
                    valueOf = Integer.valueOf(binarySearch);
                } else {
                    valueOf = Integer.valueOf(((AnonymousClass6JP) r5).A05[binarySearch]);
                }
                if (!C1672580j.A0C.equals(r10.A08)) {
                    valueOf = Pair.create(valueOf, r10.A08);
                }
                r10.A08 = valueOf;
                r10.A00 += i2;
                r10.A01 += i2;
                return r10;
            }
        }
    }

    public int hashCode() {
        int i;
        C1672580j r4 = new C1672580j();
        C151817Wk r7 = new C151817Wk();
        int A01 = A01();
        int i2 = 217 + A01;
        int i3 = 0;
        while (true) {
            i = i2 * 31;
            if (i3 >= A01) {
                break;
            }
            i2 = AnonymousClass002.A02(A09(r4, i3, 0), i);
            i3++;
        }
        int A002 = A00();
        int i4 = i + A002;
        for (int i5 = 0; i5 < A002; i5++) {
            i4 = AnonymousClass002.A02(A08(r7, i5, true), i4 * 31);
        }
        int A05 = A05(true);
        while (A05 != -1) {
            i4 = (i4 * 31) + A05;
            A05 = A02(A05, 0, true);
        }
        return i4;
    }

    public final Pair A07(C151817Wk r9, C1672580j r10, int i, long j, long j2) {
        C159197lM.A00(i, A01());
        A09(r10, i, j2);
        if (j == -9223372036854775807L) {
            j = r10.A02;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = r10.A00;
        long j3 = 0 + j;
        while (true) {
            long j4 = A08(r9, i2, false).A01;
            if (j4 != -9223372036854775807L && j3 >= j4 && i2 < r10.A01) {
                j3 -= j4;
                i2++;
            }
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(j3));
    }
}

package com.google.android.exoplayer2;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass6C8;
import X.AnonymousClass6OA;
import X.AnonymousClass6OB;
import X.AnonymousClass6OL;
import X.AnonymousClass6OM;
import X.AnonymousClass6ON;
import X.AnonymousClass6OO;
import X.AnonymousClass6OP;
import X.AnonymousClass6PR;
import X.C153417bH;
import X.C158487k3;
import X.C158647kK;
import X.C161487pm;
import X.C162387ry;
import X.C18290x4;
import android.util.Pair;
import java.util.Arrays;

public abstract class Timeline {
    public static final Timeline A00 = new AnonymousClass6OL();

    public final int A03(C153417bH r5, C158647kK r6, int i, int i2, boolean z) {
        int i3 = A09(r5, i, false).A00;
        if (A0B(r6, i3, 0).A01 != i) {
            return i + 1;
        }
        int A02 = A02(i3, i2, z);
        if (A02 == -1) {
            return -1;
        }
        return A0B(r6, A02, 0).A00;
    }

    public abstract C158647kK A0B(C158647kK r1, int i, long j);

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r14 = (com.google.android.exoplayer2.Timeline) r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r14) {
        /*
            r13 = this;
            r8 = 1
            if (r13 == r14) goto L_0x005d
            boolean r0 = r14 instanceof com.google.android.exoplayer2.Timeline
            r12 = 0
            if (r0 == 0) goto L_0x005c
            com.google.android.exoplayer2.Timeline r14 = (com.google.android.exoplayer2.Timeline) r14
            int r0 = r14.A01()
            int r11 = r13.A01()
            if (r0 != r11) goto L_0x005c
            int r0 = r14.A00()
            int r7 = r13.A00()
            if (r0 != r7) goto L_0x005c
            X.7kK r10 = new X.7kK
            r10.<init>()
            X.7bH r6 = new X.7bH
            r6.<init>()
            X.7kK r9 = new X.7kK
            r9.<init>()
            X.7bH r5 = new X.7bH
            r5.<init>()
            r4 = 0
        L_0x0033:
            if (r4 >= r11) goto L_0x0048
            r2 = 0
            X.7kK r1 = r13.A0B(r10, r4, r2)
            X.7kK r0 = r14.A0B(r9, r4, r2)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005c
            int r4 = r4 + 1
            goto L_0x0033
        L_0x0048:
            r2 = 0
        L_0x0049:
            if (r2 >= r7) goto L_0x005d
            X.7bH r1 = r13.A09(r6, r2, r8)
            X.7bH r0 = r14.A09(r5, r2, r8)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005c
            int r2 = r2 + 1
            goto L_0x0049
        L_0x005c:
            return r12
        L_0x005d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Timeline.equals(java.lang.Object):boolean");
    }

    public int A00() {
        if ((this instanceof AnonymousClass6OP) || (this instanceof AnonymousClass6OM)) {
            return 1;
        }
        if (this instanceof AnonymousClass6ON) {
            return ((AnonymousClass6ON) this).A00.A00();
        }
        if (this instanceof AnonymousClass6OL) {
            return 0;
        }
        if (!(this instanceof AnonymousClass6OA)) {
            return ((AnonymousClass6OB) this).A00;
        }
        AnonymousClass6OA r0 = (AnonymousClass6OA) this;
        return r0.A00 * r0.A02;
    }

    public int A01() {
        if ((this instanceof AnonymousClass6OP) || (this instanceof AnonymousClass6OM)) {
            return 1;
        }
        if (this instanceof AnonymousClass6ON) {
            return ((AnonymousClass6ON) this).A00.A01();
        }
        if (this instanceof AnonymousClass6OL) {
            return 0;
        }
        if (!(this instanceof AnonymousClass6OA)) {
            return ((AnonymousClass6OB) this).A01;
        }
        AnonymousClass6OA r0 = (AnonymousClass6OA) this;
        return r0.A01 * r0.A02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0099 A[EDGE_INSN: B:63:0x0099->B:41:0x0099 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass6ON
            if (r0 == 0) goto L_0x0019
            r3 = r7
            X.6ON r3 = (X.AnonymousClass6ON) r3
            boolean r2 = r3 instanceof X.AnonymousClass6PP
            com.google.android.exoplayer2.Timeline r0 = r3.A00
            int r1 = r0.A02(r8, r9, r10)
            if (r2 == 0) goto L_0x0018
            r0 = -1
            if (r1 != r0) goto L_0x0018
            int r1 = r3.A05(r10)
        L_0x0018:
            return r1
        L_0x0019:
            boolean r0 = r7 instanceof X.AnonymousClass6OO
            if (r0 == 0) goto L_0x00a2
            r4 = r7
            X.6OO r4 = (X.AnonymousClass6OO) r4
            r5 = 0
            r3 = 2
            boolean r0 = r4 instanceof X.AnonymousClass6OA
            if (r0 == 0) goto L_0x0073
            r0 = r4
            X.6OA r0 = (X.AnonymousClass6OA) r0
            int r0 = r0.A01
            int r6 = r8 / r0
        L_0x002d:
            int r2 = r4.A0E(r6)
            com.google.android.exoplayer2.Timeline r0 = r4.A0F(r6)
            int r8 = r8 - r2
            if (r9 == r3) goto L_0x0039
            r5 = r9
        L_0x0039:
            int r0 = r0.A02(r8, r5, r10)
            r5 = -1
            if (r0 != r5) goto L_0x0097
            if (r10 == 0) goto L_0x006a
            X.8ul r0 = r4.A01
            int r2 = r0.B9z(r6)
        L_0x0048:
            if (r2 == r5) goto L_0x0099
            com.google.android.exoplayer2.Timeline r1 = r4.A0F(r2)
            int r0 = r1.A01()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 == 0) goto L_0x008d
            if (r10 == 0) goto L_0x0061
            X.8ul r0 = r4.A01
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
            X.6OB r0 = (X.AnonymousClass6OB) r0
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
            int r2 = r4.A0E(r2)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Timeline.A02(int, int, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A04(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass6OP
            if (r0 == 0) goto L_0x000f
            java.lang.Object r0 = X.AnonymousClass6OP.A06
            boolean r1 = r0.equals(r6)
            r0 = -1
            if (r1 == 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            return r0
        L_0x000f:
            boolean r0 = r5 instanceof X.AnonymousClass6OM
            if (r0 == 0) goto L_0x0019
            java.lang.Object r1 = X.AnonymousClass6PR.A02
            r0 = -1
            if (r6 != r1) goto L_0x000e
            goto L_0x000d
        L_0x0019:
            boolean r0 = r5 instanceof X.AnonymousClass6ON
            if (r0 == 0) goto L_0x003a
            r2 = r5
            X.6ON r2 = (X.AnonymousClass6ON) r2
            boolean r0 = r2 instanceof X.AnonymousClass6PR
            if (r0 == 0) goto L_0x007c
            X.6PR r2 = (X.AnonymousClass6PR) r2
            com.google.android.exoplayer2.Timeline r1 = r2.A00
            java.lang.Object r0 = X.AnonymousClass6PR.A02
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r2.A00
            if (r0 == 0) goto L_0x0035
            r6 = r0
        L_0x0035:
            int r0 = r1.A04(r6)
            return r0
        L_0x003a:
            boolean r0 = r5 instanceof X.AnonymousClass6OL
            if (r0 == 0) goto L_0x0040
            r0 = -1
            return r0
        L_0x0040:
            r4 = r5
            X.6OO r4 = (X.AnonymousClass6OO) r4
            boolean r1 = r6 instanceof android.util.Pair
            r0 = -1
            if (r1 == 0) goto L_0x000e
            android.util.Pair r6 = (android.util.Pair) r6
            java.lang.Object r2 = r6.first
            java.lang.Object r3 = r6.second
            boolean r1 = r4 instanceof X.AnonymousClass6OA
            if (r1 == 0) goto L_0x006c
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x000e
            int r2 = X.AnonymousClass001.A0K(r2)
        L_0x005a:
            if (r2 == r0) goto L_0x000e
            com.google.android.exoplayer2.Timeline r1 = r4.A0F(r2)
            int r1 = r1.A04(r3)
            if (r1 == r0) goto L_0x000e
            int r0 = r4.A0D(r2)
            int r0 = r0 + r1
            return r0
        L_0x006c:
            r1 = r4
            X.6OB r1 = (X.AnonymousClass6OB) r1
            java.util.HashMap r1 = r1.A02
            java.lang.Number r1 = X.AnonymousClass0x9.A0p(r2, r1)
            if (r1 == 0) goto L_0x000e
            int r2 = r1.intValue()
            goto L_0x005a
        L_0x007c:
            com.google.android.exoplayer2.Timeline r0 = r2.A00
            int r0 = r0.A04(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Timeline.A04(java.lang.Object):int");
    }

    public int A05(boolean z) {
        int i;
        if (this instanceof AnonymousClass6ON) {
            return ((AnonymousClass6ON) this).A00.A05(z);
        }
        if (this instanceof AnonymousClass6OO) {
            AnonymousClass6OO r5 = (AnonymousClass6OO) this;
            int i2 = r5.A00;
            if (i2 == 0) {
                return -1;
            }
            int i3 = 0;
            if (z) {
                i3 = r5.A01.B7g();
            }
            do {
                Timeline A0F = r5.A0F(i);
                if (!AnonymousClass000.A1T(A0F.A01())) {
                    return r5.A0E(i) + A0F.A05(z);
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
        if (this instanceof AnonymousClass6ON) {
            return ((AnonymousClass6ON) this).A00.A06(z);
        }
        if (this instanceof AnonymousClass6OO) {
            AnonymousClass6OO r4 = (AnonymousClass6OO) this;
            int i3 = r4.A00;
            if (i3 != 0) {
                if (z) {
                    i = r4.A01.B91();
                } else {
                    i = i3 - 1;
                }
                do {
                    Timeline A0F = r4.A0F(i);
                    if (AnonymousClass000.A1T(A0F.A01())) {
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
                        return r4.A0E(i) + A0F.A06(z);
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

    public final Pair A07(C153417bH r9, C158647kK r10, int i, long j) {
        Pair A08 = A08(r9, r10, i, j, 0);
        A08.getClass();
        return A08;
    }

    public C153417bH A09(C153417bH r11, int i, boolean z) {
        int binarySearch;
        Object obj;
        Object create;
        Integer num;
        Object obj2;
        if (this instanceof AnonymousClass6OP) {
            AnonymousClass6OP r1 = (AnonymousClass6OP) this;
            C161487pm.A00(i, 1);
            if (z) {
                obj2 = AnonymousClass6OP.A06;
            } else {
                obj2 = null;
            }
            long j = r1.A00;
            C158487k3 r0 = C158487k3.A03;
            r11.A04 = null;
            r11.A05 = obj2;
            r11.A00 = 0;
            r11.A01 = j;
            r11.A02 = -0;
            r11.A03 = r0;
        } else if (this instanceof AnonymousClass6OM) {
            Object obj3 = null;
            if (z) {
                num = C18290x4.A0Z();
                obj3 = AnonymousClass6PR.A02;
            } else {
                num = null;
            }
            C158487k3 r12 = C158487k3.A03;
            r11.A04 = num;
            r11.A05 = obj3;
            r11.A00 = 0;
            r11.A01 = -9223372036854775807L;
            r11.A02 = 0;
            r11.A03 = r12;
            return r11;
        } else {
            if (this instanceof AnonymousClass6ON) {
                AnonymousClass6ON r2 = (AnonymousClass6ON) this;
                if (!(r2 instanceof AnonymousClass6PR)) {
                    return r2.A00.A09(r11, i, z);
                }
                AnonymousClass6PR r22 = (AnonymousClass6PR) r2;
                r22.A00.A09(r11, i, z);
                if (C162387ry.A0D(r11.A05, r22.A00) && z) {
                    create = AnonymousClass6PR.A02;
                }
            } else if (this instanceof AnonymousClass6OL) {
                throw new IndexOutOfBoundsException();
            } else {
                AnonymousClass6OO r5 = (AnonymousClass6OO) this;
                boolean z2 = r5 instanceof AnonymousClass6OA;
                if (z2) {
                    binarySearch = i / ((AnonymousClass6OA) r5).A00;
                } else {
                    int[] iArr = ((AnonymousClass6OB) r5).A03;
                    int i2 = i + 1;
                    binarySearch = Arrays.binarySearch(iArr, i2);
                    if (binarySearch < 0) {
                        binarySearch = -(binarySearch + 2);
                    } else {
                        do {
                            binarySearch--;
                            if (binarySearch < 0) {
                                break;
                            }
                        } while (iArr[binarySearch] != i2);
                    }
                }
                int A0E = r5.A0E(binarySearch);
                r5.A0F(binarySearch).A09(r11, i - r5.A0D(binarySearch), z);
                r11.A00 += A0E;
                if (z) {
                    if (z2) {
                        obj = Integer.valueOf(binarySearch);
                    } else {
                        obj = ((AnonymousClass6OB) r5).A06[binarySearch];
                    }
                    Object obj4 = r11.A05;
                    obj4.getClass();
                    create = Pair.create(obj, obj4);
                }
            }
            r11.A05 = create;
            return r11;
        }
        return r11;
    }

    public C153417bH A0A(C153417bH r5, Object obj) {
        int i;
        if (!(this instanceof AnonymousClass6OO)) {
            return A09(r5, A04(obj), true);
        }
        AnonymousClass6OO r3 = (AnonymousClass6OO) this;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        if (r3 instanceof AnonymousClass6OA) {
            if (obj2 instanceof Integer) {
                i = AnonymousClass001.A0K(obj2);
            }
            i = -1;
        } else {
            Number A0p = AnonymousClass0x9.A0p(obj2, ((AnonymousClass6OB) r3).A02);
            if (A0p != null) {
                i = A0p.intValue();
            }
            i = -1;
        }
        int A0E = r3.A0E(i);
        r3.A0F(i).A0A(r5, obj3);
        r5.A00 += A0E;
        r5.A05 = obj;
        return r5;
    }

    public Object A0C(int i) {
        int binarySearch;
        Object obj;
        if (this instanceof AnonymousClass6OP) {
            C161487pm.A00(i, 1);
            return AnonymousClass6OP.A06;
        } else if (this instanceof AnonymousClass6OM) {
            return AnonymousClass6PR.A02;
        } else {
            if (this instanceof AnonymousClass6ON) {
                AnonymousClass6ON r2 = (AnonymousClass6ON) this;
                if (!(r2 instanceof AnonymousClass6PR)) {
                    return r2.A00.A0C(i);
                }
                AnonymousClass6PR r22 = (AnonymousClass6PR) r2;
                Object A0C = r22.A00.A0C(i);
                if (C162387ry.A0D(A0C, r22.A00)) {
                    return AnonymousClass6PR.A02;
                }
                return A0C;
            } else if (this instanceof AnonymousClass6OL) {
                throw new IndexOutOfBoundsException();
            } else {
                AnonymousClass6OO r5 = (AnonymousClass6OO) this;
                boolean z = r5 instanceof AnonymousClass6OA;
                if (z) {
                    binarySearch = i / ((AnonymousClass6OA) r5).A00;
                } else {
                    int[] iArr = ((AnonymousClass6OB) r5).A03;
                    int i2 = i + 1;
                    binarySearch = Arrays.binarySearch(iArr, i2);
                    if (binarySearch < 0) {
                        binarySearch = -(binarySearch + 2);
                    } else {
                        do {
                            binarySearch--;
                            if (binarySearch < 0) {
                                break;
                            }
                        } while (iArr[binarySearch] != i2);
                    }
                }
                Object A0C2 = r5.A0F(binarySearch).A0C(i - r5.A0D(binarySearch));
                if (z) {
                    obj = Integer.valueOf(binarySearch);
                } else {
                    obj = ((AnonymousClass6OB) r5).A06[binarySearch];
                }
                return Pair.create(obj, A0C2);
            }
        }
    }

    public int hashCode() {
        int i;
        C158647kK r6 = new C158647kK();
        C153417bH r5 = new C153417bH();
        int A01 = A01();
        int i2 = 217 + A01;
        int i3 = 0;
        while (true) {
            i = i2 * 31;
            if (i3 >= A01) {
                break;
            }
            i2 = AnonymousClass002.A02(AnonymousClass6C8.A0X(r6, this, i3), i);
            i3++;
        }
        int A002 = A00();
        int i4 = i + A002;
        for (int i5 = 0; i5 < A002; i5++) {
            i4 = AnonymousClass002.A02(A09(r5, i5, true), i4 * 31);
        }
        return i4;
    }

    public final Pair A08(C153417bH r10, C158647kK r11, int i, long j, long j2) {
        C161487pm.A00(i, A01());
        A0B(r11, i, j2);
        if (j == -9223372036854775807L) {
            j = 0;
        }
        int i2 = r11.A00;
        long j3 = 0 + j;
        while (true) {
            long j4 = A09(r10, i2, true).A01;
            if (j4 == -9223372036854775807L || j3 < j4 || i2 >= r11.A01) {
                Object obj = r10.A05;
                obj.getClass();
            } else {
                j3 -= j4;
                i2++;
            }
        }
        Object obj2 = r10.A05;
        obj2.getClass();
        return Pair.create(obj2, Long.valueOf(j3));
    }
}

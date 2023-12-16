package X;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.8du  reason: invalid class name and case insensitive filesystem */
public abstract class C176998du extends C177088e3 implements C188118yL {
    public final boolean A00;
    public final C183618qL[] A01;

    public static void A0C(C183618qL[] r12) {
        int length = r12.length;
        int i = 2;
        if (length >= 2) {
            C183618qL r11 = r12[0];
            C183618qL r9 = r12[1];
            try {
                byte[] A09 = AnonymousClass8Q0.A09(r11);
                try {
                    byte[] A092 = AnonymousClass8Q0.A09(r9);
                    byte[] bArr = A092;
                    if (A0D(A092, A09)) {
                        C183618qL r0 = r9;
                        r9 = r11;
                        r11 = r0;
                        bArr = A09;
                        A09 = A092;
                    }
                    while (i < length) {
                        C183618qL r4 = r12[i];
                        try {
                            byte[] A093 = AnonymousClass8Q0.A09(r4);
                            if (A0D(bArr, A093)) {
                                r12[i - 2] = r11;
                                r11 = r9;
                                A09 = bArr;
                                r9 = r4;
                                bArr = A093;
                            } else if (A0D(A09, A093)) {
                                r12[i - 2] = r11;
                                r11 = r4;
                                A09 = A093;
                            } else {
                                int i2 = i - 1;
                                while (true) {
                                    i2--;
                                    if (i2 <= 0) {
                                        break;
                                    }
                                    C183618qL r1 = r12[i2 - 1];
                                    try {
                                        if (A0D(AnonymousClass8Q0.A09(r1), A093)) {
                                            break;
                                        }
                                        r12[i2] = r1;
                                    } catch (IOException unused) {
                                        throw AnonymousClass001.A0c("cannot encode object added to SET");
                                    }
                                }
                                r12[i2] = r4;
                            }
                            i++;
                        } catch (IOException unused2) {
                            throw AnonymousClass001.A0c("cannot encode object added to SET");
                        }
                    }
                    r12[length - 2] = r11;
                    r12[length - 1] = r9;
                } catch (IOException unused3) {
                    throw AnonymousClass001.A0c("cannot encode object added to SET");
                }
            } catch (IOException unused4) {
                throw AnonymousClass001.A0c("cannot encode object added to SET");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0D(byte[] r5, byte[] r6) {
        /*
            r4 = 0
            byte r0 = r5[r4]
            r1 = r0 & -33
            byte r0 = r6[r4]
            r0 = r0 & -33
            r3 = 1
            if (r1 != r0) goto L_0x001f
            int r1 = r5.length
            int r0 = r6.length
            int r2 = java.lang.Math.min(r1, r0)
            int r2 = r2 - r3
        L_0x0013:
            if (r3 >= r2) goto L_0x0026
            byte r1 = r5[r3]
            byte r0 = r6[r3]
            if (r1 == r0) goto L_0x0023
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 & 255(0xff, float:3.57E-43)
        L_0x001f:
            if (r1 >= r0) goto L_0x0022
        L_0x0021:
            r4 = 1
        L_0x0022:
            return r4
        L_0x0023:
            int r3 = r3 + 1
            goto L_0x0013
        L_0x0026:
            byte r0 = r5[r2]
            r1 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = r6[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L_0x0022
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176998du.A0D(byte[], byte[]):boolean");
    }

    public static C176998du A0A(Object obj) {
        if (obj == null || (obj instanceof C176998du)) {
            return (C176998du) obj;
        }
        if (obj instanceof C188578z9) {
            return A0A(((C183618qL) obj).Bqk());
        }
        if (obj instanceof byte[]) {
            try {
                return A0A(C177088e3.A0I((byte[]) obj));
            } catch (IOException e) {
                throw AnonymousClass001.A0c(AnonymousClass000.A0a("failed to construct set from byte[]: ", AnonymousClass001.A0o(), e));
            }
        } else {
            if (obj instanceof C183618qL) {
                C177088e3 Bqk = ((C183618qL) obj).Bqk();
                if (Bqk instanceof C176998du) {
                    return (C176998du) Bqk;
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "unknown object in getInstance: ", obj);
            throw C18310x6.A0d(A0o);
        }
    }

    public C177088e3 A0O() {
        boolean z = this.A00;
        C183618qL[] r0 = this.A01;
        if (!z) {
            r0 = (C183618qL[]) r0.clone();
            A0C(r0);
        }
        return new C176988dt(r0, true);
    }

    public void A0Q(C159057l2 r11, boolean z) {
        C176678dO r7;
        C159057l2 r72;
        if (this instanceof C176978ds) {
            C176978ds r9 = (C176978ds) this;
            if (z) {
                r11.A00.write(49);
            }
            if ((r11 instanceof C176668dN) || (r11 instanceof C176678dO)) {
                r72 = r11;
            } else {
                r72 = new C176668dN(r11.A00);
            }
            C183618qL[] r8 = r9.A01;
            int length = r8.length;
            int i = r9.A00;
            int i2 = 0;
            if (i < 0) {
                if (length > 16) {
                    int i3 = 0;
                    i = 0;
                    do {
                        i = AnonymousClass8Q0.A00(r8, i3, i);
                        i3++;
                    } while (i3 < length);
                    r9.A00 = i;
                } else {
                    C177088e3[] r3 = new C177088e3[length];
                    int i4 = 0;
                    for (int i5 = 0; i5 < length; i5++) {
                        C177088e3 A0P = r8[i5].Bqk().A0P();
                        r3[i5] = A0P;
                        i4 += A0P.A0N();
                    }
                    r9.A00 = i4;
                    r11.A00(i4);
                    while (i2 < length) {
                        r72.A02(r3[i2], true);
                        i2++;
                    }
                    return;
                }
            }
            r11.A00(i);
            while (i2 < length) {
                r72.A02(r8[i2].Bqk(), true);
                i2++;
            }
        } else if (this instanceof C176988dt) {
            C176988dt r82 = (C176988dt) this;
            if (z) {
                r11.A00.write(49);
            }
            if (r11 instanceof C176678dO) {
                r7 = (C176678dO) r11;
            } else {
                r7 = new C176678dO(r11.A00);
            }
            C183618qL[] r92 = r82.A01;
            int length2 = r92.length;
            int i6 = r82.A00;
            int i7 = 0;
            if (i6 < 0) {
                if (length2 > 16) {
                    int i8 = 0;
                    i6 = 0;
                    do {
                        i6 += AnonymousClass8Q0.A04(r92, i8).A0N();
                        i8++;
                    } while (i8 < length2);
                    r82.A00 = i6;
                } else {
                    C177088e3[] r32 = new C177088e3[length2];
                    int i9 = 0;
                    for (int i10 = 0; i10 < length2; i10++) {
                        C177088e3 A04 = AnonymousClass8Q0.A04(r92, i10);
                        r32[i10] = A04;
                        i9 += A04.A0N();
                    }
                    r82.A00 = i9;
                    r11.A00(i9);
                    while (i7 < length2) {
                        r32[i7].A0Q(r7, true);
                        i7++;
                    }
                    return;
                }
            }
            r11.A00(i6);
            while (i7 < length2) {
                AnonymousClass8Q0.A04(r92, i7).A0Q(r7, true);
                i7++;
            }
        } else {
            r11.A04(this.A01, 49, z);
        }
    }

    public int hashCode() {
        C183618qL[] r3 = this.A01;
        int length = r3.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = AnonymousClass002.A02(r3[length].Bqk(), i);
        }
    }

    public Iterator iterator() {
        return new C172948Np(C161377pW.A01(this.A01));
    }

    public String toString() {
        C183618qL[] r4 = this.A01;
        int length = r4.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer A0X = AnonymousClass6CA.A0X();
        A0X.append('[');
        int i = 0;
        while (true) {
            A0X.append(r4[i]);
            i++;
            if (i >= length) {
                A0X.append(']');
                return A0X.toString();
            }
            A0X.append(", ");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r2.length < 2) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C176998du(X.C161377pW r6, boolean r7) {
        /*
            r5 = this;
            r5.<init>()
            r4 = 2
            if (r7 == 0) goto L_0x0021
            int r3 = r6.A00
            if (r3 < r4) goto L_0x0021
            X.8qL[] r2 = new X.C183618qL[r3]
            X.8qL[] r1 = r6.A02
            r0 = 0
            java.lang.System.arraycopy(r1, r0, r2, r0, r3)
            A0C(r2)
        L_0x0015:
            r5.A01 = r2
            if (r7 != 0) goto L_0x001d
            int r1 = r2.length
            r0 = 0
            if (r1 >= r4) goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            r5.A00 = r0
            return
        L_0x0021:
            X.8qL[] r2 = r6.A04()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176998du.<init>(X.7pW, boolean):void");
    }

    public static C176998du A0B(C176908dl r3) {
        C177088e3 A03 = AnonymousClass8Q0.A03(r3);
        if (r3.A02) {
            if (r3 instanceof C177008dv) {
                return new C176968dr((C183618qL) A03);
            }
            return new C176978ds((C183618qL) A03);
        } else if (A03 instanceof C176998du) {
            C176998du r2 = (C176998du) A03;
            if (r3 instanceof C177008dv) {
                return r2;
            }
            return (C176998du) r2.A0P();
        } else if (A03 instanceof C176958dq) {
            C176958dq r22 = (C176958dq) A03;
            boolean z = r22 instanceof C176918dm;
            C176918dm r23 = r22;
            if (z) {
                C176918dm r24 = (C176918dm) r22;
                r24.A0X();
                r23 = r24;
            }
            C183618qL[] r25 = r23.A00;
            if (r3 instanceof C177008dv) {
                return new C176968dr(r25);
            }
            return new C176978ds(r25, false);
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "unknown object in getInstance: ", r3);
            throw C18310x6.A0d(A0o);
        }
    }

    public C176998du() {
        this.A01 = C161377pW.A03;
        this.A00 = true;
    }

    public C176998du(C183618qL[] r4) {
        for (C183618qL r0 : r4) {
            if (r0 == null) {
                throw AnonymousClass001.A0g("'elements' cannot be null, or contain null");
            }
        }
        C183618qL[] A012 = C161377pW.A01(r4);
        if (A012.length >= 2) {
            A0C(A012);
        }
        this.A01 = A012;
        this.A00 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r4.length < 2) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C176998du(X.C183618qL[] r4, boolean r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.A01 = r4
            if (r5 != 0) goto L_0x000c
            int r2 = r4.length
            r1 = 2
            r0 = 0
            if (r2 >= r1) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            r3.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176998du.<init>(X.8qL[], boolean):void");
    }

    public C176998du(C183618qL r4) {
        if (r4 != null) {
            this.A01 = new C183618qL[]{r4};
            this.A00 = true;
            return;
        }
        throw AnonymousClass001.A0g("'element' cannot be null");
    }
}

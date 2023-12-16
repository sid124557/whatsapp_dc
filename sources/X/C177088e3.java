package X;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Enumeration;

/* renamed from: X.8e3  reason: invalid class name and case insensitive filesystem */
public abstract class C177088e3 extends AnonymousClass8Q0 {
    public static int A0H(byte[] bArr) {
        int length = bArr.length;
        return C161127p3.A00(length) + 1 + length;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C183618qL) && A0S(((C183618qL) obj).Bqk()));
    }

    public abstract int hashCode();

    public static C177088e3 A0I(byte[] bArr) {
        C140356tb r0 = new C140356tb(bArr);
        try {
            C177088e3 A06 = r0.A06();
            if (r0.available() == 0) {
                return A06;
            }
            throw AnonymousClass002.A0C("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw AnonymousClass002.A0C("cannot recognise object in stream");
        }
    }

    public static void A0J(OutputStream outputStream, String str, AnonymousClass8Q0 r3) {
        if (r3 != null) {
            outputStream.write(r3.A0M(str));
        }
    }

    public int A0N() {
        int i;
        int i2;
        C176908dl r1;
        C177088e3 A03;
        int A01;
        if (this instanceof C176848df) {
            return A0H(((C176848df) this).A00);
        }
        if (this instanceof C176798da) {
            return A0H(((C176798da) this).A00);
        }
        if (this instanceof C176878di) {
            return A0H(((C176878di) this).A00);
        }
        if (this instanceof C176868dh) {
            return A0H(((C176868dh) this).A00);
        }
        if (this instanceof C176838de) {
            return A0H(((C176838de) this).A00);
        }
        if (this instanceof C176858dg) {
            return A0H(((C176858dg) this).A00);
        }
        if (this instanceof C176828dd) {
            return A0H(((C176828dd) this).A00);
        }
        if (this instanceof C176108cT) {
            return 2;
        }
        if (this instanceof C176898dk) {
            return A0H(((C176898dk) this).A00);
        }
        if (this instanceof C176788dZ) {
            return A0H(((C176788dZ) this).A00);
        }
        if (this instanceof C176818dc) {
            return A0H(((C176818dc) this).A00);
        }
        if ((this instanceof C176078cQ) || (this instanceof C176088cR)) {
            return A0L().length;
        }
        if ((this instanceof C176058cO) || (this instanceof C176068cP)) {
            int length = ((C176888dj) this).A01.length;
            return C161127p3.A00(length + 1) + 1 + length + 1;
        } else if (this instanceof C176808db) {
            int length2 = ((C176808db) this).A00.length * 2;
            return C161127p3.A00(length2) + 1 + length2;
        } else {
            if (this instanceof C177018dw) {
                r1 = (C176908dl) this;
                A03 = AnonymousClass8Q0.A03(r1).A0P();
            } else if (this instanceof C177028dx) {
                r1 = (C176908dl) this;
                A03 = AnonymousClass8Q0.A03(r1).A0O();
            } else if (this instanceof C177008dv) {
                r1 = (C176908dl) this;
                A03 = AnonymousClass8Q0.A03(r1);
            } else if (this instanceof C176978ds) {
                C176978ds r4 = (C176978ds) this;
                int i3 = r4.A00;
                if (i3 < 0) {
                    C183618qL[] r2 = r4.A01;
                    int length3 = r2.length;
                    i3 = 0;
                    for (int i4 = 0; i4 < length3; i4++) {
                        i3 = AnonymousClass8Q0.A00(r2, i4, i3);
                    }
                    r4.A00 = i3;
                }
                return A0G(i3);
            } else if (this instanceof C176988dt) {
                C176988dt r5 = (C176988dt) this;
                int i5 = r5.A00;
                if (i5 < 0) {
                    C183618qL[] r3 = r5.A01;
                    int length4 = r3.length;
                    i5 = 0;
                    for (int i6 = 0; i6 < length4; i6++) {
                        i5 += AnonymousClass8Q0.A04(r3, i6).A0N();
                    }
                    r5.A00 = i5;
                }
                return A0G(i5);
            } else {
                if (this instanceof C176968dr) {
                    i = 0;
                    for (C183618qL Bqk : ((C176998du) this).A01) {
                        i += Bqk.Bqk().A0N();
                    }
                } else if (this instanceof C176918dm) {
                    C176918dm r22 = (C176918dm) this;
                    synchronized (r22) {
                        byte[] bArr = r22.A00;
                        if (bArr != null) {
                            i2 = A0G(bArr.length);
                        } else {
                            i2 = new C176938do(r22.A00).A0N();
                        }
                    }
                    return i2;
                } else if (this instanceof C176938do) {
                    C176938do r42 = (C176938do) this;
                    int i7 = r42.A00;
                    if (i7 < 0) {
                        int length5 = r42.A00.length;
                        i7 = 0;
                        for (int i8 = 0; i8 < length5; i8++) {
                            i7 = AnonymousClass8Q0.A00(r42.A00, i8, i7);
                        }
                        r42.A00 = i7;
                    }
                    return A0G(i7);
                } else if (this instanceof C176948dp) {
                    C176948dp r43 = (C176948dp) this;
                    int i9 = r43.A00;
                    if (i9 < 0) {
                        int length6 = r43.A00.length;
                        i9 = 0;
                        for (int i10 = 0; i10 < length6; i10++) {
                            i9 += AnonymousClass8Q0.A04(r43.A00, i10).A0N();
                        }
                        r43.A00 = i9;
                    }
                    return A0G(i9);
                } else if (this instanceof C176928dn) {
                    C176958dq r32 = (C176958dq) this;
                    int i11 = 0;
                    for (C183618qL Bqk2 : r32.A00) {
                        i11 = i + Bqk2.Bqk().A0N();
                    }
                } else if (this instanceof C176648dL) {
                    return A0H(((C176778dY) this).A00);
                } else {
                    if (this instanceof C176658dM) {
                        Enumeration A0U = ((C176658dM) this).A0U();
                        int i12 = 0;
                        while (A0U.hasMoreElements()) {
                            i12 = i + ((C183618qL) A0U.nextElement()).Bqk().A0N();
                        }
                    } else if (this instanceof C176708dR) {
                        return A0G(((C176708dR) this).A00.length);
                    } else {
                        if (this instanceof C176768dX) {
                            return A0G(((C176768dX) this).A0U().length);
                        }
                        if (this instanceof C176748dV) {
                            return A0H(((C176748dV) this).A01);
                        }
                        if (this instanceof C176758dW) {
                            C176758dW r12 = (C176758dW) this;
                            if (r12 instanceof C176098cS) {
                                return A0G(((C176098cS) r12).A0b().length);
                            }
                            return A0G(r12.A00.length);
                        } else if (this instanceof C176728dT) {
                            return A0H(((C176728dT) this).A01);
                        } else {
                            if (this instanceof C176738dU) {
                                return 3;
                            }
                            C176698dQ r13 = (C176698dQ) this;
                            int A012 = C161127p3.A01(r13.A00);
                            int length7 = r13.A02.length;
                            return A012 + C161127p3.A00(length7) + length7;
                        }
                    }
                }
                return i + 2 + 2;
            }
            int A0N = A03.A0N();
            if (r1.A02) {
                A01 = C161127p3.A01(r1.A00) + C161127p3.A00(A0N);
            } else {
                A0N--;
                A01 = C161127p3.A01(r1.A00);
            }
            return A01 + A0N;
        }
    }

    public C177088e3 A0O() {
        return this;
    }

    public C177088e3 A0P() {
        C176938do r1;
        if (this instanceof C176908dl) {
            C176908dl r3 = (C176908dl) this;
            if ((r3 instanceof C177018dw) || (r3 instanceof C177028dx)) {
                return r3;
            }
            boolean z = r3.A02;
            return new C177018dw(r3.A01, r3.A00, z);
        } else if (this instanceof C176998du) {
            C176998du r2 = (C176998du) this;
            if ((r2 instanceof C176978ds) || (r2 instanceof C176988dt)) {
                return r2;
            }
            return new C176978ds(r2.A01, r2.A00);
        } else if (this instanceof C176958dq) {
            C176958dq r22 = (C176958dq) this;
            if (r22 instanceof C176918dm) {
                C176918dm r23 = (C176918dm) r22;
                synchronized (r23) {
                    r23.A0X();
                    r1 = new C176938do(r23.A00);
                }
                return r1;
            } else if ((r22 instanceof C176938do) || (r22 instanceof C176948dp)) {
                return r22;
            } else {
                return new C176938do(r22.A00);
            }
        } else if (this instanceof C176778dY) {
            C176778dY r12 = (C176778dY) this;
            if (!(r12 instanceof C176648dL)) {
                return new C176648dL(r12.A00);
            }
            return r12;
        } else if (!(this instanceof C176758dW)) {
            return this;
        } else {
            C176758dW r13 = (C176758dW) this;
            if (!(r13 instanceof C176098cS)) {
                return new C176098cS(r13.A00);
            }
            return r13;
        }
    }

    public void A0Q(C159057l2 r14, boolean z) {
        int i;
        byte[] bArr;
        int i2;
        int i3;
        byte[] bArr2;
        ByteArrayOutputStream A0e;
        String str;
        AnonymousClass8Q0 r3;
        if (this instanceof C176848df) {
            i = 26;
            bArr = ((C176848df) this).A00;
        } else if (this instanceof C176798da) {
            i = 21;
            bArr = ((C176798da) this).A00;
        } else if (this instanceof C176878di) {
            i = 28;
            bArr = ((C176878di) this).A00;
        } else if (this instanceof C176868dh) {
            i = 12;
            bArr = ((C176868dh) this).A00;
        } else if (this instanceof C176838de) {
            i = 20;
            bArr = ((C176838de) this).A00;
        } else if (this instanceof C176858dg) {
            i = 19;
            bArr = ((C176858dg) this).A00;
        } else if (this instanceof C176828dd) {
            i = 18;
            bArr = ((C176828dd) this).A00;
        } else if (this instanceof C176898dk) {
            i = 22;
            bArr = ((C176898dk) this).A00;
        } else if (this instanceof C176788dZ) {
            i = 25;
            bArr = ((C176788dZ) this).A00;
        } else if (this instanceof C176818dc) {
            i = 27;
            bArr = ((C176818dc) this).A00;
        } else {
            if (this instanceof C176078cQ) {
                C176718dS r1 = (C176718dS) this;
                A0e = AnonymousClass0x9.A0e();
                str = "DL";
                A0J(A0e, str, r1.A02);
                A0J(A0e, str, r1.A01);
                A0J(A0e, str, r1.A03);
                r3 = new C177018dw(r1.A04, r1.A00, true);
            } else if (this instanceof C176088cR) {
                C176718dS r12 = (C176718dS) this;
                A0e = AnonymousClass0x9.A0e();
                str = "DER";
                A0J(A0e, str, r12.A02);
                A0J(A0e, str, r12.A01);
                A0J(A0e, str, r12.A03);
                r3 = new C177028dx(r12.A04, r12.A00, true);
            } else if (this instanceof C176808db) {
                char[] cArr = ((C176808db) this).A00;
                int length = cArr.length;
                if (z) {
                    r14.A00.write(30);
                }
                r14.A00(length * 2);
                byte[] bArr3 = new byte[8];
                int i4 = length & -4;
                int i5 = 0;
                while (i5 < i4) {
                    char c = cArr[i5];
                    char c2 = cArr[i5 + 1];
                    char c3 = cArr[i5 + 2];
                    char c4 = cArr[i5 + 3];
                    i5 += 4;
                    bArr3[0] = (byte) (c >> 8);
                    bArr3[1] = (byte) c;
                    bArr3[2] = (byte) (c2 >> 8);
                    bArr3[3] = (byte) c2;
                    bArr3[4] = (byte) (c3 >> 8);
                    bArr3[5] = (byte) c3;
                    bArr3[6] = (byte) (c4 >> 8);
                    bArr3[7] = (byte) c4;
                    r14.A00.write(bArr3, 0, 8);
                }
                if (i5 < length) {
                    int i6 = 0;
                    do {
                        char c5 = cArr[i5];
                        i5++;
                        int i7 = i6 + 1;
                        i6 = AnonymousClass6CA.A0D(bArr3, c5 >> 8, i6, i7);
                        bArr3[i7] = (byte) c5;
                    } while (i5 < length);
                    r14.A00.write(bArr3, 0, i6);
                    return;
                }
                return;
            } else if (this instanceof C176048cN) {
                C176698dQ r13 = (C176698dQ) this;
                i2 = 64;
                if (r13.A01) {
                    i2 = 96;
                }
                i3 = r13.A00;
                bArr2 = r13.A02;
                r14.A01(i2, i3, z);
                int length2 = bArr2.length;
                r14.A00(length2);
                r14.A00.write(bArr2, 0, length2);
                return;
            } else if (this instanceof C176038cM) {
                C176698dQ r2 = (C176698dQ) this;
                int i8 = 64;
                if (r2.A01) {
                    i8 = 96;
                }
                int i9 = r2.A00;
                byte[] bArr4 = r2.A02;
                r14.A01(i8, i9, z);
                OutputStream outputStream = r14.A00;
                outputStream.write(128);
                outputStream.write(bArr4, 0, bArr4.length);
                outputStream.write(0);
                outputStream.write(0);
                return;
            } else if (this instanceof C176708dR) {
                i = 23;
                bArr = ((C176708dR) this).A00;
            } else if (this instanceof C176768dX) {
                i = 6;
                bArr = ((C176768dX) this).A0U();
            } else if (this instanceof C176748dV) {
                i = 2;
                bArr = ((C176748dV) this).A01;
            } else if (this instanceof C176758dW) {
                C176758dW r15 = (C176758dW) this;
                if (r15 instanceof C176098cS) {
                    i = 24;
                    bArr = ((C176098cS) r15).A0b();
                } else {
                    i = 24;
                    bArr = r15.A00;
                }
            } else if (this instanceof C176728dT) {
                i = 10;
                bArr = ((C176728dT) this).A01;
            } else {
                byte b = ((C176738dU) this).A00;
                if (z) {
                    r14.A00.write(1);
                }
                OutputStream outputStream2 = r14.A00;
                outputStream2.write((byte) 1);
                outputStream2.write(b);
                return;
            }
            A0e.write(r3.A0M(str));
            bArr2 = A0e.toByteArray();
            i2 = 32;
            i3 = 8;
            r14.A01(i2, i3, z);
            int length22 = bArr2.length;
            r14.A00(length22);
            r14.A00.write(bArr2, 0, length22);
            return;
        }
        r14.A03(bArr, i, z);
    }

    public boolean A0R() {
        C177088e3 A03;
        if ((this instanceof C176848df) || (this instanceof C176798da) || (this instanceof C176878di) || (this instanceof C176868dh) || (this instanceof C176838de) || (this instanceof C176858dg) || (this instanceof C176828dd) || (this instanceof C176108cT) || (this instanceof C176898dk) || (this instanceof C176788dZ) || (this instanceof C176818dc) || (this instanceof C176058cO) || (this instanceof C176068cP) || (this instanceof C176808db)) {
            return false;
        }
        if (this instanceof C177018dw) {
            C176908dl r1 = (C176908dl) this;
            if (!r1.A02) {
                A03 = AnonymousClass8Q0.A03(r1).A0P();
            }
            return true;
        } else if (this instanceof C177028dx) {
            C176908dl r12 = (C176908dl) this;
            if (!r12.A02) {
                A03 = AnonymousClass8Q0.A03(r12).A0O();
            }
            return true;
        } else {
            if (this instanceof C177008dv) {
                C176908dl r13 = (C176908dl) this;
                if (!r13.A02) {
                    A03 = AnonymousClass8Q0.A03(r13);
                }
            } else if (this instanceof C176648dL) {
                return false;
            } else {
                if (!(this instanceof C176658dM)) {
                    if (this instanceof C176708dR) {
                        return false;
                    }
                    if (!(this instanceof C176998du) && !(this instanceof C176958dq)) {
                        if ((this instanceof C176768dX) || (this instanceof C176748dV) || (this instanceof C176758dW)) {
                            return false;
                        }
                        if (!(this instanceof C176718dS)) {
                            if ((this instanceof C176728dT) || (this instanceof C176738dU)) {
                                return false;
                            }
                            return ((C176698dQ) this).A01;
                        }
                    }
                }
            }
            return true;
        }
        if (A03.A0R()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x010e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0S(X.C177088e3 r9) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C176848df
            if (r0 == 0) goto L_0x0016
            r1 = r8
            X.8df r1 = (X.C176848df) r1
            boolean r0 = r9 instanceof X.C176848df
            if (r0 == 0) goto L_0x014c
            byte[] r1 = r1.A00
            X.8df r9 = (X.C176848df) r9
            byte[] r0 = r9.A00
        L_0x0011:
            boolean r0 = java.util.Arrays.equals(r1, r0)
            return r0
        L_0x0016:
            boolean r0 = r8 instanceof X.C176798da
            if (r0 == 0) goto L_0x0028
            r1 = r8
            X.8da r1 = (X.C176798da) r1
            boolean r0 = r9 instanceof X.C176798da
            if (r0 == 0) goto L_0x014c
            X.8da r9 = (X.C176798da) r9
            byte[] r1 = r1.A00
            byte[] r0 = r9.A00
            goto L_0x0011
        L_0x0028:
            boolean r0 = r8 instanceof X.C176878di
            if (r0 == 0) goto L_0x003a
            r1 = r8
            X.8di r1 = (X.C176878di) r1
            boolean r0 = r9 instanceof X.C176878di
            if (r0 == 0) goto L_0x014c
            byte[] r1 = r1.A00
            X.8di r9 = (X.C176878di) r9
            byte[] r0 = r9.A00
            goto L_0x0011
        L_0x003a:
            boolean r0 = r8 instanceof X.C176868dh
            if (r0 == 0) goto L_0x004c
            r1 = r8
            X.8dh r1 = (X.C176868dh) r1
            boolean r0 = r9 instanceof X.C176868dh
            if (r0 == 0) goto L_0x014c
            X.8dh r9 = (X.C176868dh) r9
            byte[] r1 = r1.A00
            byte[] r0 = r9.A00
            goto L_0x0011
        L_0x004c:
            boolean r0 = r8 instanceof X.C176838de
            if (r0 == 0) goto L_0x005e
            r1 = r8
            X.8de r1 = (X.C176838de) r1
            boolean r0 = r9 instanceof X.C176838de
            if (r0 == 0) goto L_0x014c
            byte[] r1 = r1.A00
            X.8de r9 = (X.C176838de) r9
            byte[] r0 = r9.A00
            goto L_0x0011
        L_0x005e:
            boolean r0 = r8 instanceof X.C176858dg
            if (r0 == 0) goto L_0x0070
            r1 = r8
            X.8dg r1 = (X.C176858dg) r1
            boolean r0 = r9 instanceof X.C176858dg
            if (r0 == 0) goto L_0x014c
            X.8dg r9 = (X.C176858dg) r9
            byte[] r1 = r1.A00
            byte[] r0 = r9.A00
            goto L_0x0011
        L_0x0070:
            boolean r0 = r8 instanceof X.C176828dd
            if (r0 == 0) goto L_0x0082
            r1 = r8
            X.8dd r1 = (X.C176828dd) r1
            boolean r0 = r9 instanceof X.C176828dd
            if (r0 == 0) goto L_0x014c
            X.8dd r9 = (X.C176828dd) r9
            byte[] r1 = r1.A00
            byte[] r0 = r9.A00
            goto L_0x0011
        L_0x0082:
            boolean r0 = r8 instanceof X.C176898dk
            if (r0 == 0) goto L_0x0095
            r1 = r8
            X.8dk r1 = (X.C176898dk) r1
            boolean r0 = r9 instanceof X.C176898dk
            if (r0 == 0) goto L_0x014c
            X.8dk r9 = (X.C176898dk) r9
            byte[] r1 = r1.A00
            byte[] r0 = r9.A00
            goto L_0x0011
        L_0x0095:
            boolean r0 = r8 instanceof X.C176788dZ
            if (r0 == 0) goto L_0x00a8
            r1 = r8
            X.8dZ r1 = (X.C176788dZ) r1
            boolean r0 = r9 instanceof X.C176788dZ
            if (r0 == 0) goto L_0x014c
            X.8dZ r9 = (X.C176788dZ) r9
            byte[] r1 = r1.A00
            byte[] r0 = r9.A00
            goto L_0x0011
        L_0x00a8:
            boolean r0 = r8 instanceof X.C176818dc
            if (r0 == 0) goto L_0x00bb
            r1 = r8
            X.8dc r1 = (X.C176818dc) r1
            boolean r0 = r9 instanceof X.C176818dc
            if (r0 == 0) goto L_0x014c
            X.8dc r9 = (X.C176818dc) r9
            byte[] r1 = r1.A00
            byte[] r0 = r9.A00
            goto L_0x0011
        L_0x00bb:
            boolean r0 = r8 instanceof X.C176808db
            if (r0 == 0) goto L_0x00d1
            r1 = r8
            X.8db r1 = (X.C176808db) r1
            boolean r0 = r9 instanceof X.C176808db
            if (r0 == 0) goto L_0x014c
            X.8db r9 = (X.C176808db) r9
            char[] r1 = r1.A00
            char[] r0 = r9.A00
            boolean r0 = java.util.Arrays.equals(r1, r0)
            return r0
        L_0x00d1:
            boolean r0 = r8 instanceof X.C176708dR
            if (r0 == 0) goto L_0x00e4
            r1 = r8
            X.8dR r1 = (X.C176708dR) r1
            boolean r0 = r9 instanceof X.C176708dR
            if (r0 == 0) goto L_0x014c
            byte[] r1 = r1.A00
            X.8dR r9 = (X.C176708dR) r9
            byte[] r0 = r9.A00
            goto L_0x0011
        L_0x00e4:
            boolean r0 = r8 instanceof X.C176908dl
            if (r0 == 0) goto L_0x0110
            r2 = r8
            X.8dl r2 = (X.C176908dl) r2
            boolean r0 = r9 instanceof X.C176908dl
            r3 = 0
            if (r0 == 0) goto L_0x010f
            X.8dl r9 = (X.C176908dl) r9
            int r1 = r2.A00
            int r0 = r9.A00
            if (r1 != r0) goto L_0x010f
            boolean r1 = r2.A02
            boolean r0 = r9.A02
            if (r1 != r0) goto L_0x010f
            X.8e3 r1 = X.AnonymousClass8Q0.A03(r2)
            X.8e3 r0 = X.AnonymousClass8Q0.A03(r9)
            if (r1 == r0) goto L_0x010e
            boolean r0 = r1.A0S(r0)
        L_0x010c:
            if (r0 == 0) goto L_0x010f
        L_0x010e:
            r3 = 1
        L_0x010f:
            return r3
        L_0x0110:
            boolean r0 = r8 instanceof X.C176998du
            if (r0 == 0) goto L_0x0151
            r1 = r8
            X.8du r1 = (X.C176998du) r1
            boolean r0 = r9 instanceof X.C176998du
            if (r0 == 0) goto L_0x014c
            X.8du r9 = (X.C176998du) r9
            X.8qL[] r0 = r1.A01
            int r5 = r0.length
            X.8qL[] r0 = r9.A01
            int r0 = r0.length
            if (r0 != r5) goto L_0x014c
            X.8e3 r4 = r1.A0O()
            X.8du r4 = (X.C176998du) r4
            X.8e3 r3 = r9.A0O()
            X.8du r3 = (X.C176998du) r3
            r2 = 0
        L_0x0132:
            if (r2 >= r5) goto L_0x02a8
            X.8qL[] r0 = r4.A01
            r0 = r0[r2]
            X.8e3 r1 = r0.Bqk()
            X.8qL[] r0 = r3.A01
            r0 = r0[r2]
            X.8e3 r0 = r0.Bqk()
            if (r1 == r0) goto L_0x014e
            boolean r0 = r1.A0S(r0)
            if (r0 != 0) goto L_0x014e
        L_0x014c:
            r0 = 0
            return r0
        L_0x014e:
            int r2 = r2 + 1
            goto L_0x0132
        L_0x0151:
            boolean r0 = r8 instanceof X.C176958dq
            if (r0 == 0) goto L_0x0187
            r4 = r8
            X.8dq r4 = (X.C176958dq) r4
            boolean r0 = r9 instanceof X.C176958dq
            if (r0 == 0) goto L_0x014c
            X.8dq r9 = (X.C176958dq) r9
            int r3 = r4.A0U()
            int r0 = r9.A0U()
            if (r0 != r3) goto L_0x014c
            r2 = 0
        L_0x0169:
            if (r2 >= r3) goto L_0x02a8
            X.8qL[] r0 = r4.A00
            r0 = r0[r2]
            X.8e3 r1 = r0.Bqk()
            X.8qL[] r0 = r9.A00
            r0 = r0[r2]
            X.8e3 r0 = r0.Bqk()
            if (r1 == r0) goto L_0x0184
            boolean r0 = r1.A0S(r0)
            if (r0 != 0) goto L_0x0184
            goto L_0x014c
        L_0x0184:
            int r2 = r2 + 1
            goto L_0x0169
        L_0x0187:
            boolean r0 = r8 instanceof X.C176778dY
            if (r0 == 0) goto L_0x019a
            r1 = r8
            X.8dY r1 = (X.C176778dY) r1
            boolean r0 = r9 instanceof X.C176778dY
            if (r0 == 0) goto L_0x014c
            X.8dY r9 = (X.C176778dY) r9
            byte[] r1 = r1.A00
            byte[] r0 = r9.A00
            goto L_0x0011
        L_0x019a:
            boolean r0 = r8 instanceof X.C176768dX
            if (r0 == 0) goto L_0x01b2
            r1 = r8
            X.8dX r1 = (X.C176768dX) r1
            if (r9 == r1) goto L_0x02a8
            boolean r0 = r9 instanceof X.C176768dX
            if (r0 == 0) goto L_0x014c
            java.lang.String r1 = r1.A01
            X.8dX r9 = (X.C176768dX) r9
            java.lang.String r0 = r9.A01
            boolean r0 = r1.equals(r0)
            return r0
        L_0x01b2:
            boolean r0 = r8 instanceof X.C176688dP
            if (r0 == 0) goto L_0x01bd
            boolean r0 = r9 instanceof X.C176688dP
            boolean r0 = X.AnonymousClass6C9.A1L(r0)
            return r0
        L_0x01bd:
            boolean r0 = r8 instanceof X.C176748dV
            if (r0 == 0) goto L_0x01d0
            r1 = r8
            X.8dV r1 = (X.C176748dV) r1
            boolean r0 = r9 instanceof X.C176748dV
            if (r0 == 0) goto L_0x014c
            X.8dV r9 = (X.C176748dV) r9
            byte[] r1 = r1.A01
            byte[] r0 = r9.A01
            goto L_0x0011
        L_0x01d0:
            boolean r0 = r8 instanceof X.C176758dW
            if (r0 == 0) goto L_0x01e3
            r1 = r8
            X.8dW r1 = (X.C176758dW) r1
            boolean r0 = r9 instanceof X.C176758dW
            if (r0 == 0) goto L_0x014c
            byte[] r1 = r1.A00
            X.8dW r9 = (X.C176758dW) r9
            byte[] r0 = r9.A00
            goto L_0x0011
        L_0x01e3:
            boolean r0 = r8 instanceof X.C176718dS
            if (r0 == 0) goto L_0x0222
            r2 = r8
            X.8dS r2 = (X.C176718dS) r2
            boolean r0 = r9 instanceof X.C176718dS
            if (r0 == 0) goto L_0x014c
            if (r2 == r9) goto L_0x02a8
            X.8dS r9 = (X.C176718dS) r9
            X.8dX r1 = r2.A02
            if (r1 == 0) goto L_0x0202
            X.8dX r0 = r9.A02
            if (r0 == 0) goto L_0x014c
            boolean r0 = r0.A0T(r1)
            if (r0 != 0) goto L_0x0202
            goto L_0x014c
        L_0x0202:
            X.8dV r1 = r2.A01
            if (r1 == 0) goto L_0x0212
            X.8dV r0 = r9.A01
            if (r0 == 0) goto L_0x014c
            boolean r0 = r0.A0T(r1)
            if (r0 != 0) goto L_0x0212
            goto L_0x014c
        L_0x0212:
            X.8e3 r1 = r2.A03
            if (r1 == 0) goto L_0x029f
            X.8e3 r0 = r9.A03
            if (r0 == 0) goto L_0x014c
            boolean r0 = r0.A0T(r1)
            if (r0 != 0) goto L_0x029f
            goto L_0x014c
        L_0x0222:
            boolean r0 = r8 instanceof X.C176728dT
            if (r0 == 0) goto L_0x0235
            r1 = r8
            X.8dT r1 = (X.C176728dT) r1
            boolean r0 = r9 instanceof X.C176728dT
            if (r0 == 0) goto L_0x014c
            X.8dT r9 = (X.C176728dT) r9
            byte[] r1 = r1.A01
            byte[] r0 = r9.A01
            goto L_0x0011
        L_0x0235:
            boolean r0 = r8 instanceof X.C176738dU
            if (r0 == 0) goto L_0x0253
            r1 = r8
            X.8dU r1 = (X.C176738dU) r1
            boolean r0 = r9 instanceof X.C176738dU
            r3 = 0
            if (r0 == 0) goto L_0x010f
            X.8dU r9 = (X.C176738dU) r9
            byte r0 = r1.A00
            boolean r1 = X.AnonymousClass000.A1S(r0)
            byte r0 = r9.A00
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r1 != r0) goto L_0x010f
            goto L_0x010e
        L_0x0253:
            boolean r0 = r8 instanceof X.C176888dj
            if (r0 == 0) goto L_0x027f
            r1 = r8
            X.8dj r1 = (X.C176888dj) r1
            boolean r0 = r9 instanceof X.C176888dj
            r7 = 0
            if (r0 == 0) goto L_0x02b8
            X.8dj r9 = (X.C176888dj) r9
            int r6 = r1.A00
            int r0 = r9.A00
            if (r6 != r0) goto L_0x02b8
            byte[] r5 = r1.A01
            byte[] r4 = r9.A01
            int r1 = r5.length
            int r0 = r4.length
            if (r1 != r0) goto L_0x02b8
            int r3 = r1 + -1
            if (r3 < 0) goto L_0x02b7
            r2 = 0
        L_0x0274:
            if (r2 >= r3) goto L_0x02aa
            byte r1 = r5[r2]
            byte r0 = r4[r2]
            if (r1 != r0) goto L_0x02b8
            int r2 = r2 + 1
            goto L_0x0274
        L_0x027f:
            r2 = r8
            X.8dQ r2 = (X.C176698dQ) r2
            boolean r0 = r9 instanceof X.C176698dQ
            r3 = 0
            if (r0 == 0) goto L_0x010f
            X.8dQ r9 = (X.C176698dQ) r9
            boolean r1 = r2.A01
            boolean r0 = r9.A01
            if (r1 != r0) goto L_0x010f
            int r1 = r2.A00
            int r0 = r9.A00
            if (r1 != r0) goto L_0x010f
            byte[] r1 = r2.A02
            byte[] r0 = r9.A02
            boolean r0 = java.util.Arrays.equals(r1, r0)
            goto L_0x010c
        L_0x029f:
            X.8e3 r1 = r2.A04
            X.8e3 r0 = r9.A04
            boolean r0 = r1.A0T(r0)
            return r0
        L_0x02a8:
            r0 = 1
            return r0
        L_0x02aa:
            byte r0 = r5[r3]
            r2 = 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r0 = r0 & r2
            byte r1 = (byte) r0
            byte r0 = r4[r3]
            r0 = r0 & r2
            byte r0 = (byte) r0
            if (r1 != r0) goto L_0x02b8
        L_0x02b7:
            r7 = 1
        L_0x02b8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177088e3.A0S(X.8e3):boolean");
    }

    public final boolean A0T(C177088e3 r3) {
        if (this == r3 || A0S(r3)) {
            return true;
        }
        return false;
    }

    public static int A0G(int i) {
        return C161127p3.A00(i) + 1 + i;
    }
}

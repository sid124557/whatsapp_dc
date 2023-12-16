package X;

import android.util.SparseArray;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.86Q  reason: invalid class name */
public final class AnonymousClass86Q implements C185328tT {
    public long A00;
    public C187028wK A01;
    public C126546Oj A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final SparseArray A07 = AnonymousClass6CA.A0I();
    public final C156937hS A08 = new C156937hS();
    public final C161467pi A09 = C161467pi.A05(ZipDecompressor.UNZIP_BUFFER_SIZE);
    public final C153267ax A0A = new C153267ax(0);

    public void BFs(C187028wK r1) {
        this.A01 = r1;
    }

    public int BiD(C187648xa r24, AnonymousClass7BG r25) {
        long j;
        int A042;
        int A0F;
        long j2;
        C185608tx r12;
        C184868sg A002;
        long j3;
        long j4;
        long j5;
        C187028wK r13 = this.A01;
        C161487pm.A01(r13);
        C187648xa r4 = r24;
        long length = r4.getLength();
        int i = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        AnonymousClass7BG r10 = r25;
        if (i != 0) {
            C156937hS r5 = this.A08;
            if (!r5.A03) {
                if (!r5.A05) {
                    int A022 = AnonymousClass6CA.A02(20000, length);
                    j3 = length - ((long) A022);
                    if (r4.BBW() == j3) {
                        C161467pi r7 = r5.A06;
                        r7.A0Q(A022);
                        r4.Bjy();
                        C161467pi.A06(r4, r7, A022);
                        int i2 = r7.A01;
                        int i3 = r7.A00 - 4;
                        while (true) {
                            if (i3 < i2) {
                                j5 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = r7.A02;
                            if (C18290x4.A07(bArr, bArr[i3], i3) == 442) {
                                r7.A0S(i3 + 4);
                                j5 = C156937hS.A00(r7);
                                if (j5 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i3--;
                        }
                        r5.A02 = j5;
                        r5.A05 = true;
                        return 0;
                    }
                } else {
                    if (r5.A02 != -9223372036854775807L) {
                        if (!r5.A04) {
                            int A023 = AnonymousClass6CA.A02(20000, length);
                            j3 = (long) 0;
                            if (r4.BBW() == j3) {
                                C161467pi r6 = r5.A06;
                                r6.A0Q(A023);
                                r4.Bjy();
                                C161467pi.A06(r4, r6, A023);
                                int i4 = r6.A01;
                                int i5 = r6.A00;
                                while (true) {
                                    if (i4 >= i5 - 3) {
                                        j4 = -9223372036854775807L;
                                        break;
                                    }
                                    byte[] bArr2 = r6.A02;
                                    if (C18290x4.A07(bArr2, bArr2[i4], i4) == 442) {
                                        r6.A0S(i4 + 4);
                                        j4 = C156937hS.A00(r6);
                                        if (j4 != -9223372036854775807L) {
                                            break;
                                        }
                                    }
                                    i4++;
                                }
                                r5.A01 = j4;
                                r5.A04 = true;
                                return 0;
                            }
                        } else {
                            long j6 = r5.A01;
                            if (j6 != -9223372036854775807L) {
                                C153267ax r62 = r5.A07;
                                r5.A00 = r62.A02(r5.A02) - r62.A02(j6);
                            }
                        }
                    }
                    C161467pi r2 = r5.A06;
                    byte[] bArr3 = C162387ry.A0A;
                    r2.A0U(bArr3, bArr3.length);
                    r5.A03 = true;
                    r4.Bjy();
                    return 0;
                }
                r10.A00 = j3;
                return 1;
            }
        }
        if (!this.A06) {
            this.A06 = true;
            C156937hS r72 = this.A08;
            long j7 = r72.A00;
            if (j7 != -9223372036854775807L) {
                C126546Oj r17 = new C126546Oj(r72.A07, j7, length);
                this.A02 = r17;
                A002 = r17.A02;
            } else {
                A002 = C1686986k.A00(j7);
            }
            r13.Bl0(A002);
        }
        C126546Oj r3 = this.A02;
        if (r3 != null && r3.A00 != null) {
            return r3.A00(r4, r10);
        }
        r4.Bjy();
        if (i != 0) {
            j = length - r4.BBF();
        } else {
            j = -1;
        }
        if (j == -1 || j >= 4) {
            C161467pi r52 = this.A09;
            if (r4.Bge(r52.A02, 0, 4, true) && (A042 = C161467pi.A04(r52, 0)) != 441) {
                if (A042 == 442) {
                    r4.Bgd(r52.A02, 0, 10);
                    r52.A0S(9);
                    A0F = (r52.A0C() & 7) + 14;
                } else if (A042 == 443) {
                    C161467pi.A06(r4, r52, 2);
                    r52.A0S(0);
                    A0F = r52.A0F() + 6;
                } else if (((A042 & -256) >> 8) != 1) {
                    r4.BpP(1);
                    return 0;
                } else {
                    int i6 = A042 & 255;
                    SparseArray sparseArray = this.A07;
                    AnonymousClass7OR r73 = (AnonymousClass7OR) sparseArray.get(i6);
                    if (!this.A03) {
                        if (r73 == null) {
                            if (i6 == 189) {
                                r12 = new AnonymousClass87A((String) null);
                            } else if ((i6 & 224) == 192) {
                                r12 = new AnonymousClass87C((String) null);
                            } else if ((i6 & 240) == 224) {
                                r12 = new AnonymousClass87F((C151507Vb) null);
                                this.A05 = true;
                                this.A00 = r4.BBW();
                                r12.B19(this.A01, new C151897Ws(Integer.MIN_VALUE, i6, 256));
                                r73 = new AnonymousClass7OR(r12, this.A0A);
                                sparseArray.put(i6, r73);
                            }
                            this.A04 = true;
                            this.A00 = r4.BBW();
                            r12.B19(this.A01, new C151897Ws(Integer.MIN_VALUE, i6, 256));
                            r73 = new AnonymousClass7OR(r12, this.A0A);
                            sparseArray.put(i6, r73);
                        }
                        if (!this.A04 || !this.A05) {
                            j2 = 1048576;
                        } else {
                            j2 = this.A00 + 8192;
                        }
                        if (r4.BBW() > j2) {
                            this.A03 = true;
                            this.A01.B2W();
                        }
                    }
                    C161467pi.A06(r4, r52, 2);
                    r52.A0S(0);
                    A0F = r52.A0F() + 6;
                    if (r73 != null) {
                        r52.A0Q(A0F);
                        r4.readFully(r52.A02, 0, A0F);
                        r52.A0S(6);
                        C160807oL r9 = r73.A04;
                        r52.A0V(r9.A03, 0, 3);
                        r9.A08(0);
                        r9.A09(8);
                        r73.A01 = r9.A0D();
                        r73.A00 = r9.A0D();
                        r52.A0V(r9.A03, 0, C160807oL.A01(r9, 6, 8));
                        r9.A08(0);
                        long j8 = 0;
                        if (r73.A01) {
                            r9.A09(4);
                            r9.A09(1);
                            long A024 = C160807oL.A02(r9, ((long) r9.A04(3)) << 30);
                            if (!r73.A02 && r73.A00) {
                                r9.A09(1);
                                r73.A05.A02(C160807oL.A02(r9, ((long) C160807oL.A01(r9, 4, 3)) << 30));
                                r73.A02 = true;
                            }
                            j8 = r73.A05.A02(A024);
                        }
                        C185608tx r1 = r73.A03;
                        r1.BgQ(j8, 4);
                        r1.AzY(r52);
                        r1.BgP();
                        r52.A0R(r52.A02.length);
                        return 0;
                    }
                }
                r4.BpP(A0F);
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1 != r10) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0040 A[LOOP:0: B:24:0x0038->B:26:0x0040, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bkz(long r8, long r10) {
        /*
            r7 = this;
            X.7ax r6 = r7.A0A
            long r4 = r6.A00()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0022
            monitor-enter(r6)
            long r4 = r6.A00     // Catch:{ all -> 0x002d }
            monitor-exit(r6)
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            monitor-enter(r6)
            long r1 = r6.A00     // Catch:{ all -> 0x002d }
            monitor-exit(r6)
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
        L_0x0022:
            monitor-enter(r6)
            r6.A00 = r10     // Catch:{ all -> 0x002d }
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.A01 = r0     // Catch:{ all -> 0x002d }
            goto L_0x0030
        L_0x002d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0030:
            monitor-exit(r6)
        L_0x0031:
            X.6Oj r0 = r7.A02
            if (r0 == 0) goto L_0x0038
            r0.A01(r10)
        L_0x0038:
            android.util.SparseArray r1 = r7.A07
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x0051
            java.lang.Object r1 = r1.valueAt(r3)
            X.7OR r1 = (X.AnonymousClass7OR) r1
            r0 = 0
            r1.A02 = r0
            X.8tx r0 = r1.A03
            r0.Bky()
            int r3 = r3 + 1
            goto L_0x0038
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86Q.Bkz(long, long):void");
    }

    public boolean BpS(C187648xa r10) {
        byte[] bArr = new byte[14];
        r10.Bgd(bArr, 0, 14);
        if (442 != AnonymousClass6CA.A0C(bArr, 3, AnonymousClass6C9.A0G(bArr, 1, (bArr[0] & 255) << 24) | ((bArr[2] & 255) << 8)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        r10.Awu(bArr[13] & 7);
        r10.Bgd(bArr, 0, 3);
        if (1 == AnonymousClass6CA.A0C(bArr, 2, ((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8))) {
            return true;
        }
        return false;
    }
}

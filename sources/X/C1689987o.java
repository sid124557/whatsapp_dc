package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* renamed from: X.87o  reason: invalid class name and case insensitive filesystem */
public final class C1689987o implements C187628xY, C187618xX {
    public C187618xX A00;
    public C185348tV A01;
    public C166387yb A02;
    public C187628xY[] A03;
    public final C178118h0 A04;
    public final ArrayList A05 = AnonymousClass001.A0s();
    public final IdentityHashMap A06;
    public final C187628xY[] A07;

    public boolean Azd(long j) {
        ArrayList arrayList = this.A05;
        if (arrayList.isEmpty()) {
            return this.A01.Azd(j);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C187628xY) arrayList.get(i)).Azd(j);
        }
        return false;
    }

    public void B1k(long j, boolean z) {
        for (C187628xY B1k : this.A03) {
            B1k.B1k(j, z);
        }
    }

    public long B4G(C158027jJ r4, long j) {
        C187628xY[] r2 = this.A03;
        if (r2.length <= 0) {
            r2 = this.A07;
        }
        return r2[0].B4G(r4, j);
    }

    public long B4y() {
        return this.A01.B4y();
    }

    public long BA0() {
        return this.A01.BA0();
    }

    public C166387yb BDt() {
        C166387yb r0 = this.A02;
        r0.getClass();
        return r0;
    }

    public boolean BHy() {
        return this.A01.BHy();
    }

    public void BL2() {
        for (C187628xY BL2 : this.A07) {
            BL2.BL2();
        }
    }

    public /* bridge */ /* synthetic */ void BQ8(C185348tV r2) {
        C187618xX r0 = this.A00;
        r0.getClass();
        r0.BQ8(this);
    }

    public void BYn(C187628xY r11) {
        ArrayList arrayList = this.A05;
        arrayList.remove(r11);
        if (arrayList.isEmpty()) {
            C187628xY[] r9 = this.A07;
            int i = 0;
            for (C187628xY BDt : r9) {
                i += BDt.BDt().A01;
            }
            C166377ya[] r7 = new C166377ya[i];
            int i2 = 0;
            for (C187628xY BDt2 : r9) {
                C166387yb BDt3 = BDt2.BDt();
                int i3 = BDt3.A01;
                int i4 = 0;
                while (i4 < i3) {
                    r7[i2] = BDt3.A02[i4];
                    i4++;
                    i2++;
                }
            }
            this.A02 = new C166387yb(r7);
            C187618xX r0 = this.A00;
            r0.getClass();
            r0.BYn(this);
        }
    }

    public void BhI(C187618xX r5, long j) {
        this.A00 = r5;
        ArrayList arrayList = this.A05;
        C187628xY[] r3 = this.A07;
        Collections.addAll(arrayList, r3);
        for (C187628xY BhI : r3) {
            BhI.BhI(this, j);
        }
    }

    public long BiL() {
        long j = -9223372036854775807L;
        for (C187628xY r11 : this.A03) {
            long BiL = r11.BiL();
            int i = (j > -9223372036854775807L ? 1 : (j == -9223372036854775807L ? 0 : -1));
            if (BiL != -9223372036854775807L) {
                if (i == 0) {
                    C187628xY[] r10 = this.A03;
                    int length = r10.length;
                    int i2 = 0;
                    while (i2 < length) {
                        C187628xY r0 = r10[i2];
                        if (r0 == r11) {
                            break;
                        } else if (r0.Bl5(BiL) == BiL) {
                            i2++;
                        } else {
                            throw AnonymousClass001.A0e("Unexpected child seekToUs result.");
                        }
                    }
                    j = BiL;
                } else if (BiL != j) {
                    throw AnonymousClass001.A0e("Conflicting discontinuities.");
                }
            } else if (!(i == 0 || r11.Bl5(j) == j)) {
                throw AnonymousClass001.A0e("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    public long Bl5(long j) {
        long Bl5 = this.A03[0].Bl5(j);
        int i = 1;
        while (true) {
            C187628xY[] r1 = this.A03;
            if (i >= r1.length) {
                return Bl5;
            }
            if (r1[i].Bl5(Bl5) == Bl5) {
                i++;
            } else {
                throw AnonymousClass001.A0e("Unexpected child seekToUs result.");
            }
        }
    }

    public long BlC(C185338tU[] r24, C187638xZ[] r25, boolean[] zArr, boolean[] zArr2, long j) {
        C185338tU[] r12;
        C185338tU r0;
        C187638xZ r02;
        Number A0p;
        int intValue;
        long j2 = j;
        int length = r25.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i = 0;
        while (true) {
            r12 = r24;
            if (i >= length) {
                break;
            }
            C185338tU r1 = r24[i];
            if (r1 == null) {
                A0p = null;
            } else {
                A0p = AnonymousClass0x9.A0p(r1, this.A06);
            }
            if (A0p == null) {
                intValue = -1;
            } else {
                intValue = A0p.intValue();
            }
            iArr[i] = intValue;
            iArr2[i] = -1;
            AnonymousClass88R r03 = r25[i];
            if (r03 != null) {
                C166377ya r5 = r03.A02;
                int i2 = 0;
                while (true) {
                    C187628xY[] r13 = this.A07;
                    if (i2 >= r13.length) {
                        break;
                    }
                    C166387yb BDt = r13[i2].BDt();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= BDt.A01) {
                            break;
                        } else if (BDt.A02[i3] != r5) {
                            i3++;
                        } else if (i3 != -1) {
                            iArr2[i] = i2;
                            break;
                        }
                    }
                    i2++;
                }
            }
            i++;
        }
        IdentityHashMap identityHashMap = this.A06;
        identityHashMap.clear();
        C185338tU[] r6 = new C185338tU[length];
        C185338tU[] r52 = new C185338tU[length];
        C187638xZ[] r14 = new C187638xZ[length];
        C187628xY[] r4 = this.A07;
        int length2 = r4.length;
        ArrayList A0I = AnonymousClass002.A0I(length2);
        for (int i4 = 0; i4 < length2; i4++) {
            for (int i5 = 0; i5 < length; i5++) {
                if (iArr[i5] == i4) {
                    r0 = r24[i5];
                } else {
                    r0 = null;
                }
                r52[i5] = r0;
                if (iArr2[i5] == i4) {
                    r02 = r25[i5];
                } else {
                    r02 = null;
                }
                r14[i5] = r02;
            }
            long BlC = r4[i4].BlC(r52, r14, zArr, zArr2, j2);
            if (i4 == 0) {
                j2 = BlC;
            } else if (BlC != j2) {
                throw AnonymousClass001.A0e("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < length; i6++) {
                boolean z2 = true;
                if (iArr2[i6] == i4) {
                    C185338tU r04 = r52[i6];
                    r04.getClass();
                    r6[i6] = r52[i6];
                    AnonymousClass0x2.A1I(r04, identityHashMap, i4);
                    z = true;
                } else if (iArr[i6] == i4) {
                    if (r52[i6] != null) {
                        z2 = false;
                    }
                    C161487pm.A04(z2);
                }
            }
            if (z) {
                A0I.add(r4[i4]);
            }
        }
        System.arraycopy(r6, 0, r12, 0, length);
        C187628xY[] r15 = (C187628xY[]) A0I.toArray(new C187628xY[0]);
        this.A03 = r15;
        this.A01 = new AnonymousClass887(r15);
        return j2;
    }

    public C1689987o(C178118h0 r7, long[] jArr, C187628xY... r9) {
        this.A04 = r7;
        this.A07 = r9;
        this.A01 = new AnonymousClass887(new C185348tV[0]);
        this.A06 = new IdentityHashMap();
        this.A03 = new C187628xY[0];
        for (int i = 0; i < r9.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.A07[i] = new C1689887n(r9[i], j);
            }
        }
    }
}

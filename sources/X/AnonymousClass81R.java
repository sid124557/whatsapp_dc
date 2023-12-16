package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* renamed from: X.81R  reason: invalid class name */
public final class AnonymousClass81R implements C187418xB, C187408xA {
    public C187408xA A00;
    public C185998ua A01 = new C1674481c(new C185998ua[0]);
    public C166607yy A02;
    public C187418xB[] A03;
    public final AnonymousClass712 A04;
    public final ArrayList A05 = AnonymousClass001.A0s();
    public final IdentityHashMap A06 = new IdentityHashMap();
    public final C187418xB[] A07;

    public void Aye(long j) {
        ArrayList arrayList = this.A05;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C185998ua) arrayList.get(i)).Aye(j);
            }
            return;
        }
        this.A01.Aye(j);
    }

    public boolean Aze(long j, long j2) {
        ArrayList arrayList = this.A05;
        if (arrayList.isEmpty()) {
            return this.A01.Aze(j, j2);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C187418xB) arrayList.get(i)).Aze(j, j2);
        }
        return false;
    }

    public void B1k(long j, boolean z) {
        for (C187418xB B1k : this.A03) {
            B1k.B1k(j, z);
        }
    }

    public long B4F(C158037jK r3, long j) {
        return this.A03[0].B4F(r3, j);
    }

    public long B4w(long j) {
        return this.A01.B4w(j);
    }

    public long B4y() {
        return this.A01.B4y();
    }

    public long BA0() {
        return this.A01.BA0();
    }

    public C166607yy BDs() {
        return this.A02;
    }

    public void BL2() {
        for (C187418xB BL2 : this.A07) {
            BL2.BL2();
        }
    }

    public /* bridge */ /* synthetic */ void BQ7(C185998ua r2) {
        this.A00.BQ7(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.7yz[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BYl(X.C187418xB r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = r10.A05
            r0.remove(r11)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x004c
            X.8xB[] r9 = r10.A07
            int r8 = r9.length
            r2 = 0
            r1 = 0
        L_0x0010:
            if (r2 >= r8) goto L_0x001e
            r0 = r9[r2]
            X.7yy r0 = r0.BDs()
            int r0 = r0.A01
            int r1 = r1 + r0
            int r2 = r2 + 1
            goto L_0x0010
        L_0x001e:
            X.7yz[] r7 = new X.C166617yz[r1]
            r6 = 0
            r5 = 0
        L_0x0022:
            if (r6 >= r8) goto L_0x0040
            r0 = r9[r6]
            X.7yy r4 = r0.BDs()
            int r3 = r4.A01
            r2 = 0
        L_0x002d:
            if (r2 >= r3) goto L_0x003d
            int r1 = r5 + 1
            X.6aY r0 = r4.A02
            java.lang.Object r0 = r0.get(r2)
            r7[r5] = r0
            int r2 = r2 + 1
            r5 = r1
            goto L_0x002d
        L_0x003d:
            int r6 = r6 + 1
            goto L_0x0022
        L_0x0040:
            X.7yy r0 = new X.7yy
            r0.<init>(r7)
            r10.A02 = r0
            X.8xA r0 = r10.A00
            r0.BYl(r10)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass81R.BYl(X.8xB):void");
    }

    public void BhH(C187408xA r5, long j) {
        this.A00 = r5;
        ArrayList arrayList = this.A05;
        C187418xB[] r3 = this.A07;
        Collections.addAll(arrayList, r3);
        for (C187418xB BhH : r3) {
            BhH.BhH(this, j);
        }
    }

    public long BiL() {
        C187418xB[] r9 = this.A07;
        long BiL = r9[0].BiL();
        int i = 1;
        while (i < r9.length) {
            if (r9[i].BiL() == -9223372036854775807L) {
                i++;
            } else {
                throw AnonymousClass001.A0e("Child reported discontinuity.");
            }
        }
        if (BiL != -9223372036854775807L) {
            C187418xB[] r7 = this.A03;
            int length = r7.length;
            int i2 = 0;
            while (i2 < length) {
                C187418xB r1 = r7[i2];
                if (r1 == r9[0] || r1.Bl6(BiL, false) == BiL) {
                    i2++;
                } else {
                    throw AnonymousClass001.A0e("Unexpected child seekToUs result.");
                }
            }
        }
        return BiL;
    }

    public long Bl6(long j, boolean z) {
        long Bl6 = this.A03[0].Bl6(j, z);
        int i = 1;
        while (true) {
            C187418xB[] r1 = this.A03;
            if (i >= r1.length) {
                return Bl6;
            }
            if (r1[i].Bl6(Bl6, z) == Bl6) {
                i++;
            } else {
                throw AnonymousClass001.A0e("Unexpected child seekToUs result.");
            }
        }
    }

    public long BlB(C185238tJ[] r24, C187428xC[] r25, boolean[] zArr, boolean[] zArr2, long j) {
        C185238tJ[] r12;
        C185238tJ r0;
        int A0D;
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
            C185238tJ r3 = r24[i];
            if (r3 == null) {
                A0D = -1;
            } else {
                A0D = AnonymousClass6C8.A0D(r3, this.A06);
            }
            iArr[i] = A0D;
            iArr2[i] = -1;
            C1674881g r02 = r25[i];
            if (r02 != null) {
                C166617yz r4 = r02.A02;
                int i2 = 0;
                while (true) {
                    C187418xB[] r1 = this.A07;
                    if (i2 >= r1.length) {
                        break;
                    } else if (r1[i2].BDs().A02.indexOf(r4) >= 0) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i++;
        }
        IdentityHashMap identityHashMap = this.A06;
        identityHashMap.clear();
        C185238tJ[] r6 = new C185238tJ[length];
        C185238tJ[] r5 = new C185238tJ[length];
        C187428xC[] r14 = new C187428xC[length];
        C187418xB[] r42 = this.A07;
        int length2 = r42.length;
        ArrayList A0I = AnonymousClass002.A0I(length2);
        for (int i3 = 0; i3 < length2; i3++) {
            for (int i4 = 0; i4 < length; i4++) {
                C187428xC r16 = null;
                if (iArr[i4] == i3) {
                    r0 = r24[i4];
                } else {
                    r0 = null;
                }
                r5[i4] = r0;
                if (iArr2[i4] == i3) {
                    r16 = r25[i4];
                }
                r14[i4] = r16;
            }
            long BlB = r42[i3].BlB(r5, r14, zArr, zArr2, j2);
            if (i3 == 0) {
                j2 = BlB;
            } else if (BlB != j2) {
                throw AnonymousClass001.A0e("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < length; i5++) {
                boolean z2 = true;
                if (iArr2[i5] == i3) {
                    C159197lM.A02(AnonymousClass000.A1W(r5[i5]));
                    r6[i5] = r5[i5];
                    AnonymousClass0x2.A1I(r5[i5], identityHashMap, i3);
                    z = true;
                } else if (iArr[i5] == i3) {
                    if (r5[i5] != null) {
                        z2 = false;
                    }
                    C159197lM.A02(z2);
                }
            }
            if (z) {
                A0I.add(r42[i3]);
            }
        }
        System.arraycopy(r6, 0, r12, 0, length);
        C187418xB[] r03 = new C187418xB[A0I.size()];
        this.A03 = r03;
        A0I.toArray(r03);
        this.A01 = new C1674481c(this.A03);
        return j2;
    }

    public void Bmw(boolean z) {
        ArrayList arrayList = this.A05;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C185998ua) arrayList.get(i)).Bmw(z);
            }
            return;
        }
        this.A01.Bmw(z);
    }

    public void Brk(byte b, boolean z) {
        ArrayList arrayList = this.A05;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C185998ua) arrayList.get(i)).Brk(b, z);
            }
            return;
        }
        this.A01.Brk(b, z);
    }

    public AnonymousClass81R(AnonymousClass712 r3, C187418xB... r4) {
        this.A04 = r3;
        this.A07 = r4;
    }
}

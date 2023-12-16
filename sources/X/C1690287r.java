package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.87r  reason: invalid class name and case insensitive filesystem */
public final class C1690287r implements C187628xY, C184918sl {
    public int A00;
    public boolean A01;
    public byte[] A02;
    public final C166527yp A03;
    public final C159017kx A04;
    public final C166387yb A05;
    public final C180778lc A06;
    public final C157677ih A07;
    public final C180788ld A08;
    public final C157447iJ A09 = new C157447iJ("Loader:SingleSampleMediaPeriod");
    public final C178288hI A0A;
    public final ArrayList A0B = AnonymousClass001.A0s();

    public C1690287r(C166527yp r5, C159017kx r6, C180778lc r7, C157677ih r8, C180788ld r9, C178288hI r10) {
        this.A07 = r8;
        this.A06 = r7;
        this.A0A = r10;
        this.A03 = r5;
        this.A08 = r9;
        this.A04 = r6;
        this.A05 = new C166387yb(new C166377ya(r5));
    }

    public long Bl5(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0B;
            if (i >= arrayList.size()) {
                return j;
            }
            AnonymousClass886 r2 = (AnonymousClass886) arrayList.get(i);
            if (r2.A00 == 2) {
                r2.A00 = 1;
            }
            i++;
        }
    }

    public long BlC(C185338tU[] r5, C187638xZ[] r6, boolean[] zArr, boolean[] zArr2, long j) {
        for (int i = 0; i < r6.length; i++) {
            C185338tU r3 = r5[i];
            if (r3 != null && (r6[i] == null || !zArr[i])) {
                this.A0B.remove(r3);
                r5[i] = null;
            }
            if (r5[i] == null && r6[i] != null) {
                AnonymousClass886 r1 = new AnonymousClass886(this);
                this.A0B.add(r1);
                r5[i] = r1;
                zArr2[i] = true;
            }
        }
        return j;
    }

    public boolean Azd(long j) {
        if (this.A01) {
            return false;
        }
        C157447iJ r2 = this.A09;
        if (r2.A00 != null || r2.A01 != null) {
            return false;
        }
        C187668xc B0Y = this.A06.B0Y();
        C178288hI r0 = this.A0A;
        if (r0 != null) {
            B0Y.Awr(r0);
        }
        C157677ih r6 = this.A07;
        r2.A00(this, new C1691888i(B0Y, r6));
        C159017kx r5 = this.A04;
        r5.A04(new C156527gm(r6.A04, r6, Collections.emptyMap()), new AnonymousClass7P1(this.A03, (Object) null, 1, -1, 0, r5.A00(0), r5.A00(-9223372036854775807L)));
        return true;
    }

    public long B4y() {
        if (this.A01) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public long BA0() {
        if (this.A01 || this.A09.A00 != null) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public C166387yb BDt() {
        return this.A05;
    }

    public boolean BHy() {
        return AnonymousClass000.A1W(this.A09.A00);
    }

    public void BL2() {
    }

    public /* bridge */ /* synthetic */ void BVH(C183898qq r17, long j, long j2, boolean z) {
        C1691888i r1 = (C1691888i) r17;
        C1691188b r0 = r1.A03;
        C156527gm r5 = new C156527gm(r0.A01, r1.A02, r0.A02);
        C159017kx r4 = this.A04;
        r4.A02(r5, new AnonymousClass7P1((C166527yp) null, (Object) null, 1, -1, 0, r4.A00(0), r4.A00(-9223372036854775807L)));
    }

    public /* bridge */ /* synthetic */ void BVL(C183898qq r17, long j, long j2) {
        C1691888i r5 = (C1691888i) r17;
        C1691188b r4 = r5.A03;
        this.A00 = (int) r4.A00;
        byte[] bArr = r5.A00;
        bArr.getClass();
        this.A02 = bArr;
        this.A01 = true;
        C156527gm r52 = new C156527gm(r4.A01, r5.A02, r4.A02);
        C159017kx r42 = this.A04;
        r42.A03(r52, new AnonymousClass7P1(this.A03, (Object) null, 1, -1, 0, r42.A00(0), r42.A00(-9223372036854775807L)));
    }

    public /* bridge */ /* synthetic */ AnonymousClass7GE BVT(C183898qq r16, IOException iOException, int i, long j, long j2) {
        AnonymousClass7GE r2;
        C1691888i r1 = (C1691888i) r16;
        C1691188b r0 = r1.A03;
        C156527gm r3 = new C156527gm(r0.A01, r1.A02, r0.A02);
        C166527yp r6 = this.A03;
        IOException iOException2 = iOException;
        int i2 = i;
        long BCJ = this.A08.BCJ(new AnonymousClass7MF(r3, new AnonymousClass7P1(r6, (Object) null, 1, -1, 0, 0, -9223372036854775807L), iOException2, i2));
        if (BCJ == -9223372036854775807L || i2 >= 3) {
            C159307lc.A01("Loading failed, treating as end-of-stream.", "SingleSampleMediaPeriod", iOException2);
            this.A01 = true;
            r2 = C157447iJ.A03;
        } else {
            r2 = new AnonymousClass7GE(0, BCJ);
        }
        int i3 = r2.A00;
        boolean z = true;
        if (!(i3 == 0 || i3 == 1)) {
            z = false;
        }
        boolean z2 = !z;
        C159017kx r02 = this.A04;
        r02.A05(r3, new AnonymousClass7P1(r6, (Object) null, 1, -1, 0, r02.A00(0), r02.A00(-9223372036854775807L)), iOException2, z2);
        return r2;
    }

    public void B1k(long j, boolean z) {
    }

    public long B4G(C158027jJ r1, long j) {
        return j;
    }

    public void BhI(C187618xX r1, long j) {
        r1.BYn(this);
    }

    public long BiL() {
        return -9223372036854775807L;
    }
}

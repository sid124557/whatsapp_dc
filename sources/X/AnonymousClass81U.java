package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.81U  reason: invalid class name */
public final class AnonymousClass81U implements C187418xB, C184758sT {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public byte[] A04;
    public final long A05;
    public final C166637z1 A06;
    public final C160767oH A07;
    public final C166607yy A08;
    public final C180218kg A09;
    public final C161387pX A0A;
    public final C157457iK A0B = new C157457iK("Loader:SingleSampleMediaPeriod");
    public final ArrayList A0C = AnonymousClass001.A0s();

    public long Bl6(long j, boolean z) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0C;
            if (i >= arrayList.size()) {
                return j;
            }
            C1674381b r2 = (C1674381b) arrayList.get(i);
            if (r2.A00 == 2) {
                r2.A00 = 1;
            }
            i++;
        }
    }

    public long BlB(C185238tJ[] r5, C187428xC[] r6, boolean[] zArr, boolean[] zArr2, long j) {
        for (int i = 0; i < r6.length; i++) {
            C185238tJ r3 = r5[i];
            if (r3 != null && (r6[i] == null || !zArr[i])) {
                this.A0C.remove(r3);
                r5[i] = null;
            }
            if (r5[i] == null && r6[i] != null) {
                C1674381b r1 = new C1674381b(this);
                this.A0C.add(r1);
                r5[i] = r1;
                zArr2[i] = true;
            }
        }
        return j;
    }

    public void Aye(long j) {
    }

    public boolean Aze(long j, long j2) {
        if (this.A01) {
            return false;
        }
        C157457iK r2 = this.A0B;
        if (r2.A00 != null) {
            return false;
        }
        C161387pX r6 = this.A0A;
        r2.A00(this, new C1676181u(this.A09.B0X(), r6), 3);
        C160767oH r5 = this.A07;
        r5.A07(new AnonymousClass7A4(r6), new C150007Ot(this.A06, (Object) null, 1, -1, 0, r5.A01(0), r5.A01(this.A05)));
        return true;
    }

    public long B4w(long j) {
        if (this.A01) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public long B4y() {
        if (this.A01) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public long BA0() {
        if (this.A01 || this.A0B.A00 != null) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public C166607yy BDs() {
        return this.A08;
    }

    public void BL2() {
    }

    public /* bridge */ /* synthetic */ void BVG(C183688qS r18, long j, long j2, boolean z) {
        C160767oH r6 = this.A07;
        r6.A06(new AnonymousClass7A4(((C1676181u) r18).A03), new C150007Ot((C166637z1) null, (Object) null, 1, -1, 0, r6.A01(0), r6.A01(this.A05)));
    }

    public /* bridge */ /* synthetic */ void BVK(C183688qS r19, long j, long j2) {
        C1676181u r4 = (C1676181u) r19;
        C160767oH r2 = this.A07;
        r2.A09(new AnonymousClass7A4(r4.A03), new C150007Ot(this.A06, (Object) null, 1, -1, 0, r2.A01(0), r2.A01(this.A05)), r4);
        this.A00 = r4.A00;
        this.A04 = r4.A01;
        this.A01 = true;
        this.A02 = true;
    }

    public /* bridge */ /* synthetic */ AnonymousClass7A8 BVR(C183688qS r17, IOException iOException, int i, long j, long j2) {
        C160767oH r5 = this.A07;
        r5.A08(new AnonymousClass7A4(((C1676181u) r17).A03), new C150007Ot(this.A06, (Object) null, 1, -1, 0, r5.A01(0), r5.A01(this.A05)), iOException, false);
        return C157457iK.A05;
    }

    public long BiL() {
        if (this.A03) {
            return -9223372036854775807L;
        }
        this.A07.A04();
        this.A03 = true;
        return -9223372036854775807L;
    }

    public void Bmw(boolean z) {
    }

    public AnonymousClass81U(C166637z1 r5, C160767oH r6, C180218kg r7, C161387pX r8, long j) {
        this.A0A = r8;
        this.A09 = r7;
        this.A06 = r5;
        this.A05 = j;
        this.A07 = r6;
        this.A08 = new C166607yy(new C166617yz(r5));
        r6.A02();
    }

    public void B1k(long j, boolean z) {
    }

    public long B4F(C158037jK r1, long j) {
        return j;
    }

    public void BhH(C187408xA r1, long j) {
        r1.BYl(this);
    }

    public void Brk(byte b, boolean z) {
    }
}

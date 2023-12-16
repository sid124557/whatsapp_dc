package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.87M  reason: invalid class name */
public final class AnonymousClass87M implements C184908sk {
    public int A00;
    public long A01;
    public long A02;
    public final int A03;
    public final C166527yp A04;
    public final C187028wK A05;
    public final C185598tw A06;
    public final AnonymousClass7OS A07;

    public void BFp(int i, long j) {
        this.A05.Bl0(new C1687286n(this.A07, 1, (long) i, j));
        this.A06.B3T(this.A04);
    }

    public void Bju(long j) {
        this.A02 = j;
        this.A00 = 0;
        this.A01 = 0;
    }

    public boolean Bke(C187648xa r21, long j) {
        int i;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i <= 0 || (i2 = this.A00) >= (i3 = this.A03)) {
                AnonymousClass7OS r0 = this.A07;
                int i4 = r0.A01;
                int i5 = this.A00;
                int i6 = i5 / i4;
            } else {
                int Bkf = this.A06.Bkf(r21, AnonymousClass6CA.A02((long) (i3 - i2), j2), 0, true);
                if (Bkf == -1) {
                    j2 = 0;
                } else {
                    this.A00 += Bkf;
                    j2 -= (long) Bkf;
                }
            }
        }
        AnonymousClass7OS r02 = this.A07;
        int i42 = r02.A01;
        int i52 = this.A00;
        int i62 = i52 / i42;
        if (i62 > 0) {
            int i7 = i62 * i42;
            int i8 = i52 - i7;
            this.A06.Bkh((AnonymousClass7WZ) null, 1, i7, i8, this.A02 + C162387ry.A05(this.A01, SearchActionVerificationClientService.MS_TO_NS, (long) r02.A03));
            this.A01 += (long) i62;
            this.A00 = i8;
        }
        if (i > 0) {
            return false;
        }
        return true;
    }

    public AnonymousClass87M(C187028wK r7, C185598tw r8, AnonymousClass7OS r9, String str, int i) {
        this.A05 = r7;
        this.A06 = r8;
        this.A07 = r9;
        int i2 = r9.A04;
        int i3 = (r9.A00 * i2) / 8;
        int i4 = r9.A01;
        if (i4 == i3) {
            int i5 = r9.A03;
            int i6 = i5 * i3;
            int i7 = i6 * 8;
            int max = Math.max(i3, i6 / 10);
            this.A03 = max;
            C157057he A002 = C157057he.A00();
            A002.A0R = str;
            A002.A03 = i7;
            A002.A0A = i7;
            A002.A08 = max;
            A002.A04 = i2;
            A002.A0D = i5;
            A002.A09 = i;
            this.A04 = C166527yp.A00(A002);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Expected block size: ");
        A0o.append(i3);
        throw AnonymousClass6u7.A02("; got: ", A0o, i4);
    }
}

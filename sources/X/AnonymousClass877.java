package X;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.877  reason: invalid class name */
public final class AnonymousClass877 implements C185608tx {
    public long A00;
    public long A01;
    public C185598tw A02;
    public AnonymousClass7Q3 A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass7ZY A07 = new AnonymousClass7ZY(8);
    public final AnonymousClass7ZY A08 = new AnonymousClass7ZY(6);
    public final AnonymousClass7ZY A09 = new AnonymousClass7ZY(7);
    public final AnonymousClass7S5 A0A;
    public final C161467pi A0B = new C161467pi();
    public final boolean[] A0C = new boolean[3];

    public void AzY(C161467pi r26) {
        C185598tw r10 = this.A02;
        C161487pm.A01(r10);
        C161467pi r11 = r26;
        int i = r11.A01;
        int i2 = i;
        int i3 = r11.A00;
        byte[] bArr = r11.A02;
        int i4 = i3 - i;
        this.A01 += (long) i4;
        r10.Bkc(r11, i4);
        while (true) {
            int A012 = C161627q8.A01(bArr, this.A0C, i, i3);
            if (A012 == i3) {
                break;
            }
            i = A012 + 3;
            byte b = bArr[i] & 31;
            int i5 = A012 - i2;
            if (i5 > 0) {
                if (!this.A05) {
                    this.A09.A01(bArr, i2, A012);
                    this.A07.A01(bArr, i2, A012);
                }
                this.A08.A01(bArr, i2, A012);
            }
            int i6 = i3 - A012;
            long j = this.A01 - ((long) i6);
            int i7 = 0;
            if (i5 < 0) {
                i7 = -i5;
            }
            long j2 = this.A00;
            if (!this.A05) {
                AnonymousClass7ZY r12 = this.A09;
                r12.A02(i7);
                AnonymousClass7ZY r112 = this.A07;
                r112.A02(i7);
                if (r12.A01 && r112.A01) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    A0s.add(Arrays.copyOf(r12.A03, r12.A00));
                    A0s.add(Arrays.copyOf(r112.A03, r112.A00));
                    AnonymousClass7P3 A022 = C161627q8.A02(r12.A03, 3, r12.A00);
                    C153587bb r4 = new C153587bb(r112.A03, 3, r112.A00);
                    r4.A04(8);
                    int A002 = r4.A00();
                    r4.A00();
                    r4.A02();
                    r4.A02();
                    AnonymousClass7BL r42 = new AnonymousClass7BL(A002);
                    int i8 = A022.A04;
                    int i9 = A022.A01;
                    int i10 = A022.A03;
                    Object[] objArr = new Object[3];
                    AnonymousClass000.A1P(objArr, i8, 0);
                    AnonymousClass6C7.A1U(objArr, i9, i10);
                    String format = String.format("avc1.%02X%02X%02X", objArr);
                    C185598tw r18 = this.A02;
                    C157057he A003 = C157057he.A00();
                    A003.A0O = this.A04;
                    A003.A0R = "video/avc";
                    A003.A0M = format;
                    A003.A0G = A022.A06;
                    A003.A07 = A022.A02;
                    A003.A01 = A022.A00;
                    A003.A0S = A0s;
                    C166527yp.A01(A003, r18);
                    this.A05 = true;
                    AnonymousClass7Q3 r14 = this.A03;
                    r14.A09.append(A022.A05, A022);
                    r14.A08.append(r42.A00, r42);
                    r12.A02 = false;
                    r12.A01 = false;
                    r112.A02 = false;
                    r112.A01 = false;
                }
            }
            AnonymousClass7ZY r43 = this.A08;
            if (r43.A02(i7)) {
                int A004 = C161627q8.A00(r43.A03, r43.A00);
                C161467pi r102 = this.A0B;
                r102.A0U(r43.A03, A004);
                r102.A0S(4);
                C153987cO.A00(r102, this.A0A.A01, j2);
            }
            AnonymousClass7Q3 r9 = this.A03;
            boolean z = this.A05;
            boolean z2 = this.A06;
            boolean z3 = false;
            if (r9.A00 == 9) {
                if (z && r9.A05) {
                    long j3 = r9.A01;
                    boolean z4 = r9.A06;
                    int i11 = (int) (j3 - r9.A03);
                    r9.A0A.Bkh((AnonymousClass7WZ) null, z4 ? 1 : 0, i11, i6 + ((int) (j - j3)), r9.A04);
                }
                r9.A03 = r9.A01;
                r9.A04 = r9.A02;
                r9.A06 = false;
                r9.A05 = true;
            }
            boolean z5 = r9.A06;
            int i12 = r9.A00;
            if (i12 == 5 || (z2 && i12 == 1)) {
                z3 = true;
            }
            boolean z6 = z5 | z3;
            r9.A06 = z6;
            if (z6) {
                this.A06 = false;
            }
            long j4 = this.A00;
            if (!this.A05) {
                byte b2 = b;
                this.A09.A00(b2);
                this.A07.A00(b2);
            }
            r43.A00(b);
            AnonymousClass7Q3 r92 = this.A03;
            r92.A00 = b;
            r92.A02 = j4;
            r92.A01 = j;
            i2 = i;
        }
        if (!this.A05) {
            this.A09.A01(bArr, i, i3);
            this.A07.A01(bArr, i, i3);
        }
        this.A08.A01(bArr, i, i3);
    }

    public void BgP() {
    }

    public void BgQ(long j, int i) {
        this.A00 = j;
        this.A06 |= AnonymousClass000.A1S(i & 2);
    }

    public void Bky() {
        this.A01 = 0;
        this.A06 = false;
        boolean A1T = AnonymousClass6C9.A1T(this.A0C);
        AnonymousClass7ZY r0 = this.A09;
        r0.A02 = A1T;
        r0.A01 = A1T;
        AnonymousClass7ZY r02 = this.A07;
        r02.A02 = A1T;
        r02.A01 = A1T;
        AnonymousClass7ZY r03 = this.A08;
        r03.A02 = A1T;
        r03.A01 = A1T;
        AnonymousClass7Q3 r04 = this.A03;
        if (r04 != null) {
            r04.A05 = A1T;
        }
    }

    public AnonymousClass877(AnonymousClass7S5 r3) {
        this.A0A = r3;
    }

    public void B19(C187028wK r3, C151897Ws r4) {
        this.A04 = C151897Ws.A01(r4);
        r4.A03();
        C185598tw Br0 = r3.Br0(r4.A00, 2);
        this.A02 = Br0;
        this.A03 = new AnonymousClass7Q3(Br0);
        this.A0A.A00(r3, r4);
    }
}

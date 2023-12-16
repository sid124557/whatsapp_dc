package X;

import java.util.List;

/* renamed from: X.5Qw  reason: invalid class name and case insensitive filesystem */
public class C104415Qw {
    public List A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final AnonymousClass5MU A07;
    public final C42242Ni A08;
    public final C624134x A09;
    public final boolean A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C104415Qw r7 = (C104415Qw) obj;
            if (!(this.A0A == r7.A0A && this.A02 == r7.A02 && this.A05 == r7.A05 && this.A06 == r7.A06 && this.A04 == r7.A04 && this.A03 == r7.A03 && this.A09.equals(r7.A09) && AnonymousClass75J.A00(this.A08, r7.A08) && this.A00.equals(r7.A00) && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[11];
        objArr[0] = Boolean.valueOf(this.A0A);
        AnonymousClass000.A1M(objArr, this.A02);
        AnonymousClass000.A1N(objArr, this.A05);
        objArr[3] = this.A09;
        C18280x3.A1P(objArr, 100);
        objArr[5] = Long.valueOf(this.A06);
        C18290x4.A1U(objArr, this.A04);
        C18310x6.A1V(objArr, this.A03);
        objArr[8] = this.A08;
        objArr[9] = this.A00;
        return C18310x6.A08(Boolean.valueOf(this.A01), objArr, 10);
    }

    public C104415Qw(AnonymousClass5MU r1, C42242Ni r2, C624134x r3, List list, int i, int i2, int i3, int i4, long j, boolean z, boolean z2) {
        this.A0A = z;
        this.A02 = i;
        this.A05 = i2;
        this.A09 = r3;
        this.A06 = j;
        this.A04 = i3;
        this.A03 = i4;
        this.A08 = r2;
        this.A00 = list;
        this.A01 = z2;
        this.A07 = r1;
    }
}

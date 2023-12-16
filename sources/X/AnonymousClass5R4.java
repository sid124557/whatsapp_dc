package X;

import java.util.List;

/* renamed from: X.5R4  reason: invalid class name */
public class AnonymousClass5R4 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C150477Qw A04;
    public C150477Qw A05;
    public C150477Qw A06;
    public C150477Qw A07;
    public C150477Qw A08;
    public String A09 = "";
    public List A0A = AnonymousClass001.A0s();
    public List A0B = AnonymousClass001.A0s();
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass5R4 r5 = (AnonymousClass5R4) obj;
            if (this.A00 != r5.A00 || this.A01 != r5.A01 || this.A02 != r5.A02 || this.A0C != r5.A0C || this.A0D != r5.A0D || this.A0E != r5.A0E || !AnonymousClass75J.A00(this.A07, r5.A07) || !AnonymousClass75J.A00(this.A0A, r5.A0A) || !AnonymousClass75J.A00(this.A05, r5.A05) || !AnonymousClass75J.A00(this.A04, r5.A04) || !AnonymousClass75J.A00(this.A0B, r5.A0B) || !AnonymousClass75J.A00(this.A06, r5.A06) || !AnonymousClass75J.A00(this.A08, r5.A08) || !AnonymousClass75J.A00(this.A09, r5.A09) || this.A03 != r5.A03 || this.A0F != r5.A0F) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[16];
        AnonymousClass000.A1L(objArr, this.A00);
        AnonymousClass000.A1M(objArr, this.A01);
        objArr[2] = this.A0A;
        AnonymousClass000.A1O(objArr, this.A02);
        objArr[4] = this.A05;
        objArr[5] = this.A04;
        objArr[6] = Boolean.valueOf(this.A0C);
        objArr[7] = Boolean.valueOf(this.A0D);
        objArr[8] = Boolean.valueOf(this.A0E);
        objArr[9] = this.A07;
        objArr[10] = this.A0B;
        objArr[11] = this.A08;
        objArr[12] = this.A06;
        objArr[13] = this.A09;
        objArr[14] = Integer.valueOf(this.A03);
        return C18310x6.A08(Boolean.valueOf(this.A0F), objArr, 15);
    }
}

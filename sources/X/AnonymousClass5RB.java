package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5RB  reason: invalid class name */
public class AnonymousClass5RB {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public AnonymousClass3ZH A0A;
    public C150477Qw A0B;
    public CharSequence A0C;
    public String A0D = "";
    public List A0E = AnonymousClass001.A0s();
    public List A0F = AnonymousClass001.A0s();
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final ArrayList A0K = AnonymousClass001.A0s();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass5RB)) {
            return false;
        }
        AnonymousClass5RB r7 = (AnonymousClass5RB) obj;
        return r7.A00 == this.A00 && r7.A01 == this.A01 && r7.A02 == this.A02 && r7.A03 == this.A03 && r7.A04 == this.A04 && r7.A05 == this.A05 && r7.A0G == this.A0G && r7.A0I == this.A0I && r7.A0H == this.A0H && r7.A08 == this.A08 && r7.A07 == this.A07 && r7.A06 == this.A06 && r7.A0D.equals(this.A0D) && r7.A09 == this.A09 && AnonymousClass75J.A00(r7.A0C, this.A0C) && r7.A0J == this.A0J && AnonymousClass75J.A00(r7.A0A, this.A0A) && AnonymousClass75J.A00(r7.A0E, this.A0E) && AnonymousClass75J.A00(r7.A0B, this.A0B) && r7.A0F.equals(this.A0F) && r7.A0K.equals(this.A0K);
    }

    public int hashCode() {
        return ((((AnonymousClass0x2.A07(this.A0D, (((((((((((((((((((((((((((((((217 + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A04) * 31) + C18280x3.A04(this.A0A)) * 31) + this.A0E.hashCode()) * 31 * 31) + this.A05) * 31) + AnonymousClass000.A07(this.A0B)) * 31) + (this.A0G ? 1 : 0)) * 31) + (this.A0I ? 1 : 0)) * 31) + this.A0F.hashCode()) * 31) + (this.A0H ? 1 : 0)) * 31) + this.A08) * 31) + this.A07) * 31) + this.A06) * 31) + AnonymousClass000.A07(Long.valueOf(this.A09))) * 31) + AnonymousClass000.A07(this.A0C)) * 31) + AnonymousClass000.A07(Integer.valueOf(this.A0J ? 1 : 0));
    }
}

package X;

/* renamed from: X.9S5  reason: invalid class name */
public class AnonymousClass9S5 {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 0;
    public long A06 = -1;
    public long A07 = -1;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public String A0B;

    public void A00(AnonymousClass9N3 r3, Object obj) {
        switch (r3.A00) {
            case 7:
                this.A00 = AnonymousClass001.A0K(obj);
                return;
            case 8:
                this.A05 = AnonymousClass001.A0K(obj);
                return;
            case 9:
                this.A08 = (Integer) obj;
                return;
            case 10:
                this.A09 = (Integer) obj;
                return;
            case 11:
                this.A0A = (Integer) obj;
                return;
            case 12:
                this.A06 = C18310x6.A0B(obj);
                return;
            default:
                this.A07 = C18310x6.A0B(obj);
                return;
        }
    }

    public AnonymousClass9S5(String str, int i, int i2, int i3, int i4) {
        if (i == 0) {
            throw AnonymousClass001.A0c("Frame width must be greater 0");
        } else if (i2 != 0) {
            this.A0B = str;
            this.A03 = i;
            this.A02 = i2;
            this.A04 = i3;
            this.A01 = i4;
        } else {
            throw AnonymousClass001.A0c("Frame height must be greater 0");
        }
    }
}

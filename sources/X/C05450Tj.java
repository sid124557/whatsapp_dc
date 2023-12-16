package X;

/* renamed from: X.0Tj  reason: invalid class name and case insensitive filesystem */
public class C05450Tj {
    public float A00;
    public int A01;
    public int A02;
    public C02390Fz A03;
    public String A04;
    public String A05;
    public boolean A06;

    public void A00(Object obj) {
        switch (this.A03.ordinal()) {
            case 0:
                this.A02 = AnonymousClass001.A0K(obj);
                return;
            case 1:
            case 6:
                this.A00 = AnonymousClass001.A05(obj);
                return;
            case 2:
            case 3:
                this.A01 = AnonymousClass001.A0K(obj);
                return;
            case 4:
                this.A05 = (String) obj;
                return;
            case 5:
                this.A06 = AnonymousClass001.A1Z(obj);
                return;
            default:
                return;
        }
    }

    public C05450Tj(C02390Fz r1, Object obj, String str) {
        this.A04 = str;
        this.A03 = r1;
        A00(obj);
    }

    public C05450Tj(C05450Tj r2, Object obj) {
        this.A04 = r2.A04;
        this.A03 = r2.A03;
        A00(obj);
    }
}

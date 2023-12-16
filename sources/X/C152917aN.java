package X;

/* renamed from: X.7aN  reason: invalid class name and case insensitive filesystem */
public class C152917aN {
    public C142966y6 A00;
    public C142996y9 A01;
    public Boolean A02;

    public C127686Sx A00() {
        String obj;
        String obj2;
        C142966y6 r0 = this.A00;
        if (r0 == null) {
            obj = null;
        } else {
            obj = r0.toString();
        }
        Boolean bool = this.A02;
        C142996y9 r02 = this.A01;
        if (r02 == null) {
            obj2 = null;
        } else {
            obj2 = r02.toString();
        }
        return new C127686Sx(bool, obj, (String) null, obj2);
    }

    public void A01(C142966y6 r1) {
        this.A00 = r1;
    }

    public void A02(C142996y9 r1) {
        this.A01 = r1;
    }

    public void A03(Boolean bool) {
        this.A02 = bool;
    }
}

package X;

/* renamed from: X.9qI  reason: invalid class name and case insensitive filesystem */
public class C205019qI implements AnonymousClass4B7 {
    public Object A00;
    public final int A01;

    public C205019qI(AnonymousClass36K r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final Object Ax7(AnonymousClass36K r4) {
        AnonymousClass36K r1;
        int i;
        switch (this.A01) {
            case 0:
                r1 = (AnonymousClass36K) this.A00;
                i = 1;
                break;
            case 2:
            case 5:
                return new C192039Hx(r4, (AnonymousClass36K) this.A00);
            case 4:
                return new C139006rM(r4, (AnonymousClass36K) this.A00, 0);
            case 7:
            case 8:
                return new AnonymousClass9Hv(r4, (AnonymousClass36K) this.A00);
            case 9:
            case 10:
            case 11:
                return new C34981w8(r4, (AnonymousClass36K) this.A00, 5);
            default:
                r1 = (AnonymousClass36K) this.A00;
                i = 5;
                break;
        }
        return new C138966rI(r4, r1, i);
    }
}

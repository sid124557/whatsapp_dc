package X;

/* renamed from: X.4J5  reason: invalid class name */
public class AnonymousClass4J5 implements AnonymousClass4C8 {
    public Object A00;
    public final int A01;

    public AnonymousClass4J5(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public Object Az8(C84814Du r4, AnonymousClass4C9 r5) {
        AnonymousClass4C8 r2;
        int i;
        Object Az8;
        switch (this.A01) {
            case 0:
                r2 = (AnonymousClass4C8) this.A00;
                i = 17;
                break;
            case 1:
                Az8 = r5.B2K(this.A00, r4);
                break;
            case 2:
                r2 = (AnonymousClass4C8) this.A00;
                i = 26;
                break;
            case 3:
                r2 = (AnonymousClass4C8) this.A00;
                i = 27;
                break;
            default:
                C74893nz r22 = new C74893nz((C84814Du) null, (AnonymousClass4GS) this.A00, r5);
                AnonymousClass475 r0 = new AnonymousClass475(r4, r4.B5w());
                Az8 = AnonymousClass2AU.A00(r0, r22, r0);
                break;
        }
        Az8 = r2.Az8(r4, new C86054Iq(r5, i));
        return AnonymousClass218.A00(Az8);
    }
}

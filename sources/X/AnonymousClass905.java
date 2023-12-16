package X;

/* renamed from: X.905  reason: invalid class name */
public class AnonymousClass905 extends C151687Vx {
    public Object A00;
    public final int A01;

    public AnonymousClass905(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A01() {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                AnonymousClass4vI r1 = (AnonymousClass4vI) obj;
                r1.A0A = Boolean.valueOf(!r1.A0A.booleanValue());
                break;
            case 1:
                C95934v6 r12 = (C95934v6) obj;
                r12.A01 = Boolean.valueOf(!r12.A01.booleanValue());
                break;
            default:
                AnonymousClass4vJ r13 = (AnonymousClass4vJ) obj;
                r13.A07 = !r13.A07;
                break;
        }
        super.A01();
    }
}

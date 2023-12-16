package X;

/* renamed from: X.9Wx  reason: invalid class name and case insensitive filesystem */
public class C195269Wx implements C203279nQ {
    public Object A00;
    public final int A01;

    public C195269Wx(AnonymousClass9ZG r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public void B2L() {
        AnonymousClass9ZE r3;
        if (this.A01 == 0 && (r3 = ((AnonymousClass9ZG) this.A00).A0G) != null && !r3.A03) {
            AnonymousClass9XL r2 = r3.A05;
            r2.A0D = true;
            r2.A05.post(r2.A09);
            C1680583y r22 = r3.A00;
            if (r22 != null) {
                AnonymousClass9ZF r1 = r3.A01;
                r1.A00(r1.A00, r22);
            }
            r3.A03 = true;
            r3.A04 = false;
        }
    }
}

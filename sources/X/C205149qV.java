package X;

/* renamed from: X.9qV  reason: invalid class name and case insensitive filesystem */
public class C205149qV implements AnonymousClass4B3 {
    public Object A00;
    public final int A01;

    public C205149qV(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BTd(String str) {
        C69263Wi r0;
        switch (this.A01) {
            case 0:
                C195069Vt r3 = (C195069Vt) this.A00;
                r3.A0C.A02(str).A00(new C204149ot(r3, 0), C197979eB.class, r3);
                r0 = r3.A02;
                break;
            case 1:
            case 2:
            case 3:
                ((C89654ea) this.A00).BjL();
                return;
            case 4:
                r0 = ((AnonymousClass9C3) this.A00).A04;
                break;
            default:
                r0 = ((C89654ea) this.A00).A05;
                break;
        }
        r0.A0D();
    }
}

package X;

/* renamed from: X.4If  reason: invalid class name and case insensitive filesystem */
public class C85944If implements AnonymousClass4EI {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C85944If(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A03 = obj;
        this.A00 = obj4;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    public void BQp() {
        switch (this.A04) {
            case 0:
                ((C48362em) this.A03).A01((AnonymousClass49I) this.A01, this.A00);
                return;
            case 1:
                Object obj = this.A00;
                AnonymousClass49I r3 = (AnonymousClass49I) this.A01;
                C69263Wi r2 = ((C58432vF) this.A03).A00;
                if (r2 != null) {
                    r2.BkS(new C117165rU(obj, 6, r3));
                    return;
                }
                throw C18270x1.A0S("globalUI");
            default:
                ((C84724Dl) this.A01).BaN((C46202bF) this.A02);
                return;
        }
    }

    public void BSB(Exception exc) {
        switch (this.A04) {
            case 0:
                ((C48362em) this.A03).A01((AnonymousClass49I) this.A01, this.A00);
                return;
            case 1:
                Object obj = this.A00;
                AnonymousClass49I r3 = (AnonymousClass49I) this.A01;
                C69263Wi r2 = ((C58432vF) this.A03).A00;
                if (r2 != null) {
                    r2.BkS(new C117165rU(obj, 6, r3));
                    return;
                }
                throw C18270x1.A0S("globalUI");
            default:
                ((C84724Dl) this.A01).BaN((C46202bF) this.A02);
                return;
        }
    }

    public void Bd3(C60272yH r6) {
        Object obj;
        Object obj2;
        C69263Wi r2;
        int i;
        int i2 = this.A04;
        Object obj3 = this.A03;
        switch (i2) {
            case 0:
                obj = this.A00;
                obj2 = this.A02;
                r2 = ((C48362em) obj3).A00;
                if (r2 != null) {
                    i = 2;
                    break;
                } else {
                    throw C18270x1.A0S("globalUI");
                }
            case 1:
                obj = this.A00;
                obj2 = this.A02;
                r2 = ((C58432vF) obj3).A00;
                if (r2 != null) {
                    i = 5;
                    break;
                } else {
                    throw C18270x1.A0S("globalUI");
                }
            default:
                AnonymousClass0x9.A1K(obj3);
                return;
        }
        r2.BkS(new C117165rU(obj, i, obj2));
    }
}

package X;

/* renamed from: X.92N  reason: invalid class name */
public class AnonymousClass92N implements C184058rB {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass92N(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void BSm(C151157Tq r3, int i) {
        if (this.A02 != 0) {
            C18260x0.A0x("GetCategoriesGraphQLService.Listener/onFailure errorCode =", AnonymousClass001.A0o(), i);
            if (406 == i || 421 == i) {
                AnonymousClass5Y9.A00((AnonymousClass5Y9) this.A00, r3.A02);
            }
            ((C184028r8) this.A01).BT7(r3, i);
            return;
        }
        ((C184018r7) this.A00).BSs(this.A01, i);
    }

    public void Bd2(C151157Tq r3, C64553Dy r4) {
        if (this.A02 != 0) {
            ((C184028r8) this.A01).BT8(r3, r4);
        } else {
            ((C184018r7) this.A00).BdC(this.A01, r4);
        }
    }
}

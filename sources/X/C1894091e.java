package X;

import com.whatsapp.biz.cart.view.fragment.CartFragment;

/* renamed from: X.91e  reason: invalid class name and case insensitive filesystem */
public class C1894091e implements C182438oP {
    public Object A00;
    public final int A01;

    public C1894091e(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BRp(C106655Zv r3) {
        AnonymousClass4CE r1;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                r1 = ((CartFragment) obj).A19;
                break;
            case 1:
                r1 = ((C102935Kv) obj).A04;
                break;
            case 2:
                r1 = ((AnonymousClass4LD) obj).A0F;
                break;
            default:
                r1 = ((C102855Kn) obj).A02;
                break;
        }
        r1.BRo(r3.A00);
    }
}

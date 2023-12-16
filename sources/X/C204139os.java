package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.9os  reason: invalid class name and case insensitive filesystem */
public class C204139os implements C202749mW {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C204139os(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void BPZ(PaymentBottomSheet paymentBottomSheet) {
        int i = this.A03;
        Object obj = this.A00;
        PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
        if (2 - i != 0) {
            AnonymousClass9Ct r2 = (AnonymousClass9Ct) obj;
            AnonymousClass39L r3 = (AnonymousClass39L) this.A01;
            C166587yw r1 = (C166587yw) this.A02;
            C201259jm r7 = new C201259jm(r1, r3, r2, paymentBottomSheet);
            r2.A8W(r3, new C204139os(r1, r3, r2, 0), new C204819py(paymentBottomSheet, 0, r2), paymentBottomSheet2, r7, new C198369eo());
            return;
        }
        ((AnonymousClass9Cu) obj).A8L((C133696hn) this.A02, (AnonymousClass39L) this.A01, paymentBottomSheet);
    }
}

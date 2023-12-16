package X;

import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;

/* renamed from: X.4KR  reason: invalid class name */
public class AnonymousClass4KR implements AnonymousClass4B3 {
    public Object A00;
    public final int A01;

    public AnonymousClass4KR(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BTd(String str) {
        C69263Wi r0;
        switch (this.A01) {
            case 0:
                r0 = ((AnonymousClass2NB) this.A00).A01.A00;
                break;
            case 1:
                r0 = ((C47062ce) this.A00).A01;
                break;
            default:
                C162457s7.A0J(str, 0);
                P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = (P2mLiteOrderDetailsActivity) this.A00;
                p2mLiteOrderDetailsActivity.BjL();
                C54522or r02 = p2mLiteOrderDetailsActivity.A0Q;
                if (r02 != null) {
                    r02.A03(p2mLiteOrderDetailsActivity);
                }
                p2mLiteOrderDetailsActivity.A0Q = null;
                C60482yd r03 = p2mLiteOrderDetailsActivity.A0R;
                if (r03 != null) {
                    C54522or A02 = r03.A02(str);
                    p2mLiteOrderDetailsActivity.A0Q = A02;
                    A02.A00(new C85744Hl(p2mLiteOrderDetailsActivity, 7), C69363Ws.class, p2mLiteOrderDetailsActivity);
                    C54522or r2 = p2mLiteOrderDetailsActivity.A0Q;
                    if (r2 != null) {
                        r2.A00(new C85744Hl(p2mLiteOrderDetailsActivity, 8), C69353Wr.class, p2mLiteOrderDetailsActivity);
                    }
                    C54522or r22 = p2mLiteOrderDetailsActivity.A0Q;
                    if (r22 != null) {
                        r22.A00(new C85744Hl(p2mLiteOrderDetailsActivity, 9), C69393Wv.class, p2mLiteOrderDetailsActivity);
                        return;
                    }
                    return;
                }
                throw C18270x1.A0S("uiObserversFactory");
        }
        r0.A0D();
    }
}

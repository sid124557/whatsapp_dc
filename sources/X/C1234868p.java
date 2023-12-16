package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.68p  reason: invalid class name and case insensitive filesystem */
public class C1234868p implements C181548mw {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1234868p(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BP1() {
        if (this.A02 != 0) {
            Intent A09 = AnonymousClass0x9.A09("android.intent.action.VIEW");
            A09.setData(((AnonymousClass5Y8) this.A00).A00.A00());
            ((Context) this.A01).startActivity(A09);
            return;
        }
        ((C93314oJ) this.A00).A0x.A01((C003203q) this.A01, "about-disappearing-messages");
    }
}

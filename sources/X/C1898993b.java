package X;

import android.view.View;

/* renamed from: X.93b  reason: invalid class name and case insensitive filesystem */
public class C1898993b implements AnonymousClass4AZ {
    public Object A00;
    public final int A01;

    public C1898993b(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bb0(boolean z) {
        View view;
        C71703cX r2;
        if (this.A01 != 0) {
            AnonymousClass7XM r3 = (AnonymousClass7XM) this.A00;
            view = r3.A05;
            r2 = new C71703cX(42, (Object) r3, z);
        } else {
            view = (View) this.A00;
            r2 = new C71703cX(34, (Object) view, z);
        }
        view.post(r2);
    }
}

package X;

import android.view.View;
import java.lang.ref.Reference;

/* renamed from: X.761  reason: invalid class name */
public class AnonymousClass761 implements C15810ry {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass761(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final Object get() {
        switch (this.A02) {
            case 0:
                C153427bI r1 = (C153427bI) ((Reference) this.A00).get();
                AnonymousClass84O r0 = (AnonymousClass84O) ((Reference) this.A01).get();
                if (r1 == null || r0 == null) {
                    return null;
                }
                return new AnonymousClass7H5(r1, r0);
            case 1:
                AnonymousClass84O r2 = (AnonymousClass84O) this.A00;
                C153427bI r12 = (C153427bI) this.A01;
                if (r2 != null) {
                    return Integer.valueOf(C154127ce.A01(r12, r2, 0));
                }
                return null;
            default:
                View view = (View) this.A00;
                return new C1232567s(view.getContext(), view, this.A01, 0);
        }
    }
}

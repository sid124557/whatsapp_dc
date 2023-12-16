package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0wA  reason: invalid class name and case insensitive filesystem */
public class C17740wA implements View.OnAttachStateChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C17740wA(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onViewAttachedToWindow(View view) {
        if (this.A02 != 0) {
            View view2 = (View) this.A01;
            view2.removeOnAttachStateChangeListener(this);
            AnonymousClass0V0.A02(view2);
            return;
        }
        AnonymousClass0WE r1 = (AnonymousClass0WE) this.A01;
        C08310eF r0 = r1.A02;
        r1.A04();
        AnonymousClass0UN.A01((ViewGroup) r0.A0B.getParent()).A03();
    }

    public void onViewDetachedFromWindow(View view) {
    }
}

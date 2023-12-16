package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.9pK  reason: invalid class name and case insensitive filesystem */
public class C204419pK implements ViewTreeObserver.OnScrollChangedListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C204419pK(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final void onScrollChanged() {
        float f;
        int i = this.A03;
        Object obj = this.A00;
        if (i != 0) {
            Context context = (Context) obj;
            AnonymousClass0R8 r1 = (AnonymousClass0R8) this.A02;
            if (((View) this.A01).canScrollVertically(-1)) {
                AnonymousClass5CP.A00(context);
            } else {
                r1.A08(0.0f);
            }
        } else {
            AnonymousClass0R8 r2 = (AnonymousClass0R8) this.A01;
            Context context2 = (Context) this.A02;
            if (((View) obj).canScrollVertically(-1)) {
                f = AnonymousClass5CP.A00(context2);
            } else {
                f = 0.0f;
            }
            r2.A08(f);
        }
    }
}

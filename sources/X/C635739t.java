package X;

import android.view.View;

/* renamed from: X.39t  reason: invalid class name and case insensitive filesystem */
public class C635739t implements View.OnFocusChangeListener {
    public final /* synthetic */ AnonymousClass1Np A00;

    public C635739t(AnonymousClass1Np r1) {
        this.A00 = r1;
    }

    public void onFocusChange(View view, boolean z) {
        int i;
        if (z) {
            AnonymousClass1Np r1 = this.A00;
            if (view.equals(r1.A08)) {
                i = 1;
            } else if (view.equals(r1.A07)) {
                i = 0;
            } else {
                return;
            }
            r1.A00 = i;
        }
    }
}

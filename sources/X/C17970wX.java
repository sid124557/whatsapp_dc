package X;

import android.widget.PopupWindow;

/* renamed from: X.0wX  reason: invalid class name and case insensitive filesystem */
public class C17970wX implements PopupWindow.OnDismissListener {
    public Object A00;
    public final int A01;

    public C17970wX(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onDismiss() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            C05430Th r1 = (C05430Th) obj;
            C15580rb r0 = r1.A00;
            if (r0 != null) {
                r0.BRK(r1);
                return;
            }
            return;
        }
        ((AnonymousClass0QK) obj).A02();
    }
}

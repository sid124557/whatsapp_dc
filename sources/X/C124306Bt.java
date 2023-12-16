package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.6Bt  reason: invalid class name and case insensitive filesystem */
public class C124306Bt implements C182308oC {
    public Object A00;
    public final int A01;

    public C124306Bt(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BbU(boolean z) {
        Activity A002;
        int i = this.A01;
        View view = (View) this.A00;
        switch (i) {
            case 0:
                View findViewById = C111095hX.A04(view).findViewById(R.id.proximity_overlay);
                if (findViewById != null) {
                    findViewById.setVisibility(C86634Kw.A01(z ? 1 : 0));
                    return;
                }
                return;
            case 1:
                A002 = C621633u.A00(view.getContext());
                if (A002 == null) {
                    return;
                }
                break;
            default:
                A002 = C111095hX.A04(view);
                break;
        }
        View findViewById2 = A002.findViewById(R.id.proximity_overlay);
        if (findViewById2 != null) {
            findViewById2.setVisibility(C86634Kw.A01(z));
        }
    }
}

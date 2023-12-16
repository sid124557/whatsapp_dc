package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;

/* renamed from: X.5ac  reason: invalid class name and case insensitive filesystem */
public class C107055ac implements DialogInterface.OnShowListener {
    public Object A00;
    public final int A01;

    public C107055ac(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        BottomSheetBehavior A012;
        AnonymousClass7XV r2;
        switch (this.A01) {
            case 0:
                BottomSheetBehavior A013 = BottomSheetBehavior.A01(AnonymousClass0HG.A00((Dialog) dialogInterface, R.id.design_bottom_sheet));
                A013.A0S(3);
                A013.A0p = true;
                return;
            case 1:
                Object obj = this.A00;
                A012 = BottomSheetBehavior.A01(((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet));
                A012.A0S(3);
                r2 = new C1232167o(obj, 5);
                break;
            default:
                Object obj2 = this.A00;
                View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
                if (findViewById != null) {
                    A012 = BottomSheetBehavior.A01(findViewById);
                    A012.A0S(3);
                    r2 = new C188898zf(obj2, 3);
                    break;
                } else {
                    return;
                }
        }
        A012.A0a(r2);
    }
}

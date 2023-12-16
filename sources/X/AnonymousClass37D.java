package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;

/* renamed from: X.37D  reason: invalid class name */
public final /* synthetic */ class AnonymousClass37D implements DialogInterface.OnShowListener {
    public final void onShow(DialogInterface dialogInterface) {
        View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
        C626936e.A04(findViewById);
        BottomSheetBehavior A01 = BottomSheetBehavior.A01(findViewById);
        A01.A0S(3);
        A01.A0R(findViewById.getHeight());
    }
}

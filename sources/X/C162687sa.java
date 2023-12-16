package X;

import android.app.Dialog;
import android.content.DialogInterface;
import com.whatsapp.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;

/* renamed from: X.7sa  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C162687sa implements DialogInterface.OnShowListener {
    public final /* synthetic */ Dialog A00;
    public final /* synthetic */ RoundedBottomSheetDialogFragment A01;

    public final void onShow(DialogInterface dialogInterface) {
        this.A01.A1X(AnonymousClass0HG.A00(this.A00, R.id.design_bottom_sheet));
    }

    public /* synthetic */ C162687sa(Dialog dialog, RoundedBottomSheetDialogFragment roundedBottomSheetDialogFragment) {
        this.A01 = roundedBottomSheetDialogFragment;
        this.A00 = dialog;
    }
}

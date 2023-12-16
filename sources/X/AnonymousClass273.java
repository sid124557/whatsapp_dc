package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;

/* renamed from: X.273  reason: invalid class name */
public class AnonymousClass273 implements DialogInterface.OnShowListener {
    public Object A00;
    public final int A01;

    public AnonymousClass273(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        Dialog dialog;
        View findViewById;
        switch (this.A01) {
            case 0:
                VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = (VerifyTwoFactorAuthCodeDialogFragment) this.A00;
                C69263Wi.A00(verifyTwoFactorAuthCodeDialogFragment.A04, verifyTwoFactorAuthCodeDialogFragment, 47);
                return;
            case 1:
                ((AnonymousClass043) dialogInterface).A00.A0G.setOnClickListener(new C989453v(this.A00, 33));
                return;
            default:
                SearchFunStickersBottomSheet searchFunStickersBottomSheet = (SearchFunStickersBottomSheet) this.A00;
                if ((dialogInterface instanceof AnonymousClass4SH) && (dialog = (Dialog) dialogInterface) != null && (findViewById = dialog.findViewById(R.id.design_bottom_sheet)) != null) {
                    BottomSheetBehavior.A01(findViewById).A0Z(searchFunStickersBottomSheet.A0T);
                    return;
                }
                return;
        }
    }
}

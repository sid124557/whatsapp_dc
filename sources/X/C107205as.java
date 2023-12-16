package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;

/* renamed from: X.5as  reason: invalid class name and case insensitive filesystem */
public class C107205as implements DialogInterface.OnShowListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C107205as(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (this.A02 != 0) {
            Object obj = this.A00;
            View findViewById = ((Dialog) this.A01).findViewById(R.id.design_bottom_sheet);
            if (findViewById != null) {
                BottomSheetBehavior A012 = BottomSheetBehavior.A01(findViewById);
                A012.A0p = true;
                A012.A0a(new C188898zf(obj, 2));
                return;
            }
            return;
        }
        FingerprintBottomSheet.A01(dialogInterface, (Bundle) this.A01, (FingerprintBottomSheet) this.A00);
    }
}

package X;

import android.content.DialogInterface;
import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;

/* renamed from: X.36x  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C628336x implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ IndiaUpiDobPickerBottomSheet A01;

    public final void onClick(DialogInterface dialogInterface, int i) {
        IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet = this.A01;
        long j = this.A00;
        C003203q A0R = indiaUpiDobPickerBottomSheet.A0R();
        if (A0R instanceof C84074Ax) {
            ((C84074Ax) A0R).BQf(j, indiaUpiDobPickerBottomSheet.A0H().getString("BUNDLE_KEY_CREDENTIAL", (String) null));
        }
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }

    public /* synthetic */ C628336x(IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet, long j) {
        this.A01 = indiaUpiDobPickerBottomSheet;
        this.A00 = j;
    }
}

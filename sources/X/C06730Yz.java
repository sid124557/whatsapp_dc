package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;

/* renamed from: X.0Yz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C06730Yz implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ SingleChoiceListDialogFragment A02;

    public final void onClick(DialogInterface dialogInterface, int i) {
        SingleChoiceListDialogFragment.A00(dialogInterface, this.A01, this.A02, this.A00, i);
    }

    public /* synthetic */ C06730Yz(Bundle bundle, SingleChoiceListDialogFragment singleChoiceListDialogFragment, int i) {
        this.A02 = singleChoiceListDialogFragment;
        this.A00 = i;
        this.A01 = bundle;
    }
}

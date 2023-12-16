package X;

import android.content.DialogInterface;
import com.whatsapp.settings.MultiSelectionDialogFragment;

/* renamed from: X.7sZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C162677sZ implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ MultiSelectionDialogFragment A00;

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.A00.A04[i] = z;
    }

    public /* synthetic */ C162677sZ(MultiSelectionDialogFragment multiSelectionDialogFragment) {
        this.A00 = multiSelectionDialogFragment;
    }
}

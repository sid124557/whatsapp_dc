package androidx.appcompat.app;

import X.AnonymousClass00Q;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class AppCompatDialogFragment extends DialogFragment {
    public void A1N(int i, Dialog dialog) {
        if (dialog instanceof AnonymousClass00Q) {
            AnonymousClass00Q r3 = (AnonymousClass00Q) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            r3.A01().A0J(1);
            return;
        }
        super.A1N(i, dialog);
    }

    public Dialog A1J(Bundle bundle) {
        return new AnonymousClass00Q(A1D(), A1H());
    }
}

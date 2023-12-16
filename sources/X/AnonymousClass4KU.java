package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;

/* renamed from: X.4KU  reason: invalid class name */
public class AnonymousClass4KU implements AnonymousClass4CH {
    public Object A00;
    public final int A01;

    public AnonymousClass4KU(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onError(int i) {
        if (this.A01 != 0) {
            C50472iE A002 = LegacyMessageDialogFragment.A00(new Object[0], R.string.f11nameremoved);
            A002.A05 = R.string.f11nameremoved;
            A002.A0B = new Object[0];
            DialogFragment A003 = A002.A00();
            C89654ea r0 = (C89654ea) this.A00;
            C18270x1.A0t(A003, r0);
            r0.BjL();
            return;
        }
        C18260x0.A0z("DeviceConfirmationRegAlertDialogFragment/ Error when sending Do Not Allow IQ with error: ", AnonymousClass001.A0o(), i);
    }
}

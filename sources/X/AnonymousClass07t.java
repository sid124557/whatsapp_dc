package X;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.07t  reason: invalid class name */
public class AnonymousClass07t extends AnonymousClass0O3 {
    public final /* synthetic */ DialogFragment A00;
    public final /* synthetic */ AnonymousClass0O3 A01;

    public AnonymousClass07t(DialogFragment dialogFragment, AnonymousClass0O3 r2) {
        this.A00 = dialogFragment;
        this.A01 = r2;
    }

    public View A00(int i) {
        AnonymousClass0O3 r1 = this.A01;
        if (r1.A01()) {
            return r1.A00(i);
        }
        Dialog dialog = this.A00.A03;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public boolean A01() {
        if (this.A01.A01() || this.A00.A0B) {
            return true;
        }
        return false;
    }
}

package X;

import com.whatsapp.status.StatusesFragment;
import com.whatsapp.status.viewmodels.StatusesViewModel;

/* renamed from: X.6Bg  reason: invalid class name and case insensitive filesystem */
public class C124176Bg implements C1226065a {
    public Object A00;
    public final int A01;

    public C124176Bg(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BcT(C95814uZ r3) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            StatusesViewModel.A00(r3, (StatusesViewModel) obj);
        } else {
            ((StatusesFragment) obj).A1L();
        }
    }
}

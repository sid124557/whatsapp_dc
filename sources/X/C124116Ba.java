package X;

import com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel;
import java.util.List;

/* renamed from: X.6Ba  reason: invalid class name and case insensitive filesystem */
public class C124116Ba implements C1226265c {
    public Object A00;
    public final int A01;

    public C124116Ba(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BX0(List list) {
        boolean z;
        if (this.A01 != 0) {
            C103825Oo r2 = (C103825Oo) this.A00;
            if (list.isEmpty()) {
                z = false;
            } else if (!r2.A02.A01) {
                z = true;
            } else {
                return;
            }
            C104715Sb r0 = r2.A02;
            r0.A01 = z;
            r0.A00 = z;
            r2.A00();
            return;
        }
        CrossPostingUpdatesViewModel crossPostingUpdatesViewModel = (CrossPostingUpdatesViewModel) this.A00;
        if (list.isEmpty()) {
            crossPostingUpdatesViewModel.A0E(false, false);
            return;
        }
        C104715Sb r02 = crossPostingUpdatesViewModel.A00;
        if (r02 == null) {
            throw C18270x1.A0S("crossPostingViewModelState");
        } else if (!r02.A01) {
            crossPostingUpdatesViewModel.A0E(true, true);
        }
    }
}

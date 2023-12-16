package X;

import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.util.Collection;
import java.util.TimerTask;

/* renamed from: X.5tb  reason: invalid class name and case insensitive filesystem */
public final class C118475tb extends TimerTask {
    public final /* synthetic */ UpdatesViewModel A00;

    public C118475tb(UpdatesViewModel updatesViewModel) {
        this.A00 = updatesViewModel;
    }

    public void run() {
        UpdatesViewModel updatesViewModel = this.A00;
        Collection A1P = C86664Kz.A1P(updatesViewModel.A0T);
        if (A1P == null || A1P.isEmpty()) {
            updatesViewModel.A0I();
        } else {
            updatesViewModel.A0G();
        }
    }
}

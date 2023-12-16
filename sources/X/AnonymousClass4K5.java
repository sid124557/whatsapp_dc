package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity;
import com.whatsapp.userban.ui.BanAppealActivity;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;
import java.util.ArrayList;

/* renamed from: X.4K5  reason: invalid class name */
public class AnonymousClass4K5 implements C15930sC {
    public int A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4K5(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final void BOf(Object obj) {
        BanAppealViewModel banAppealViewModel;
        boolean z;
        if (this.A02 != 0) {
            BanAppealActivity banAppealActivity = (BanAppealActivity) this.A01;
            int i = this.A00;
            ((DialogInterface) obj).dismiss();
            if (i == -2) {
                banAppealViewModel = banAppealActivity.A00;
                z = true;
            } else if (i == 3) {
                banAppealViewModel = banAppealActivity.A00;
                z = false;
            } else if (i == 4) {
                banAppealActivity.startActivity(banAppealActivity.A00.A03.A00(banAppealActivity, (Bundle) null, (C631938h) null, (Integer) null, "blocked_ban_appeals", (String) null, (ArrayList) null, (ArrayList) null, false));
                return;
            } else {
                return;
            }
            banAppealViewModel.A0G(banAppealActivity, z);
            return;
        }
        IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity = (IndiaUpiFcsPinHandlerActivity) this.A01;
        C621433s.A00(indiaUpiFcsPinHandlerActivity, this.A00);
        indiaUpiFcsPinHandlerActivity.A7l();
    }
}

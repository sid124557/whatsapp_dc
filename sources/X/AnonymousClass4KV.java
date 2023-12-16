package X;

import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

/* renamed from: X.4KV  reason: invalid class name */
public class AnonymousClass4KV implements C84684Dh {
    public Object A00;
    public final int A01;

    public AnonymousClass4KV(BanAppealViewModel banAppealViewModel, int i) {
        this.A01 = i;
        this.A00 = banAppealViewModel;
    }

    public void BSq(Integer num) {
        AnonymousClass08M r0;
        if (this.A01 != 0) {
            BanAppealViewModel banAppealViewModel = (BanAppealViewModel) this.A00;
            C06270Wx.A04(banAppealViewModel.A02, 3);
            r0 = banAppealViewModel.A01;
        } else {
            int intValue = num.intValue();
            if (intValue == 4 || intValue == 3) {
                r0 = ((BanAppealViewModel) this.A00).A01;
            } else {
                return;
            }
        }
        r0.A0G(num);
    }

    public void Bd9(AnonymousClass2P7 r5) {
        AnonymousClass4UC r1;
        Integer valueOf;
        if (this.A01 != 0) {
            BanAppealViewModel banAppealViewModel = (BanAppealViewModel) this.A00;
            int A0D = banAppealViewModel.A0D(r5.A00, true);
            C06270Wx.A04(banAppealViewModel.A02, 2);
            r1 = banAppealViewModel.A0B;
            valueOf = Integer.valueOf(A0D);
        } else {
            BanAppealViewModel banAppealViewModel2 = (BanAppealViewModel) this.A00;
            int A0D2 = banAppealViewModel2.A0D(r5.A00, false);
            r1 = banAppealViewModel2.A0B;
            valueOf = Integer.valueOf(A0D2);
        }
        r1.A0G(valueOf);
    }
}

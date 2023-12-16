package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPixKeySettingActivity;
import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;

/* renamed from: X.8M0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8M0 implements Runnable {
    public final /* synthetic */ BrazilPixKeySettingActivity A00;

    public final void run() {
        BrazilPixKeySettingActivity brazilPixKeySettingActivity = this.A00;
        C19340zH A01 = AnonymousClass5V0.A01(brazilPixKeySettingActivity, R.style.f12nameremoved);
        A01.A0h(AnonymousClass002.A0F(brazilPixKeySettingActivity, brazilPixKeySettingActivity.A06, new Object[1], 0, R.string.f11nameremoved));
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = brazilPixKeySettingActivity.A06;
        BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = brazilPixKeySettingActivity.A03;
        String str = null;
        if (brazilPixKeySettingViewModel == null) {
            throw C18270x1.A0S("brazilPixKeySettingViewModel");
        }
        AnonymousClass5SE r0 = (AnonymousClass5SE) brazilPixKeySettingViewModel.A00.A07();
        if (r0 != null) {
            str = r0.A02;
        }
        A01.A0g(AnonymousClass002.A0F(brazilPixKeySettingActivity, str, A0M, 1, R.string.f11nameremoved));
        A01.A0f(brazilPixKeySettingActivity, new C1897492m(brazilPixKeySettingActivity, 299), brazilPixKeySettingActivity.getString(R.string.f11nameremoved));
        A01.A0e(brazilPixKeySettingActivity, new C1897592n(5), brazilPixKeySettingActivity.getString(R.string.f11nameremoved));
        C18280x3.A0q(A01);
    }

    public /* synthetic */ AnonymousClass8M0(BrazilPixKeySettingActivity brazilPixKeySettingActivity) {
        this.A00 = brazilPixKeySettingActivity;
    }
}

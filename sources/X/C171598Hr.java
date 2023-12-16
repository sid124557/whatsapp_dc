package X;

import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.8Hr  reason: invalid class name and case insensitive filesystem */
public final class C171598Hr implements AnonymousClass4EY {
    public final /* synthetic */ BrazilPixKeySettingViewModel A00;

    public C171598Hr(BrazilPixKeySettingViewModel brazilPixKeySettingViewModel) {
        this.A00 = brazilPixKeySettingViewModel;
    }

    public void Ba4(AnonymousClass34V r3) {
        C06270Wx.A04(this.A00.A01, 2);
        Log.e(C160757oG.A01("BrazilPixKeySettingViewModel", "deleteAccount/onRequestError"));
    }

    public void BaB(AnonymousClass34V r3) {
        Integer num;
        C06270Wx.A04(this.A00.A01, 2);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("deleteAccount/onRequestError");
        if (r3 != null) {
            num = Integer.valueOf(r3.A00);
        } else {
            num = null;
        }
        Log.e(C160757oG.A01("BrazilPixKeySettingViewModel", AnonymousClass000.A0R(num, A0o)));
    }

    public void BaC(AnonymousClass2Oi r3) {
        C06270Wx.A04(this.A00.A01, 3);
    }
}

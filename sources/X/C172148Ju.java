package X;

import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import java.util.List;

/* renamed from: X.8Ju  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C172148Ju implements C84134Bd {
    public final /* synthetic */ BrazilPixKeySettingViewModel A00;
    public final /* synthetic */ String A01;

    public final void AwB(Object obj) {
        BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = this.A00;
        String str = this.A01;
        List list = (List) obj;
        C162457s7.A0J(list, 2);
        if (list.size() > 1 || brazilPixKeySettingViewModel.A05.A05()) {
            brazilPixKeySettingViewModel.A03.A01(new AnonymousClass7I8(brazilPixKeySettingViewModel, str), str);
        } else {
            brazilPixKeySettingViewModel.A03.A00(new C171598Hr(brazilPixKeySettingViewModel));
        }
    }

    public /* synthetic */ C172148Ju(BrazilPixKeySettingViewModel brazilPixKeySettingViewModel, String str) {
        this.A00 = brazilPixKeySettingViewModel;
        this.A01 = str;
    }
}

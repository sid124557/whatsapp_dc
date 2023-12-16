package X;

import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.9qR  reason: invalid class name and case insensitive filesystem */
public class C205109qR implements AnonymousClass4EZ {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C205109qR(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public void BQs(String str) {
        if (this.A03 != 0) {
            C06270Wx.A04(((AnonymousClass7I8) this.A01).A00.A01, 2);
            C1899593h.A1Q("BrazilPixKeySettingViewModel", "removePixKey/handleDeliveryFailure");
            C1899593h.A1Q("BrazilPaymentAccountActions", "removePixKey/onDeliveryFailure triggered");
            return;
        }
        Log.e("Bloks: IQRequestHelper/sendIQRequest onDeliveryFailure");
        ((AnonymousClass9VP) this.A00).A00.BkS(new C198759fR((C52792m3) this.A01));
    }

    public void BSN(AnonymousClass36K r5, String str) {
        if (this.A03 != 0) {
            A00((AnonymousClass7I8) this.A01, r5, (AnonymousClass9IV) this.A02);
            C1899593h.A1Q("BrazilPaymentAccountActions", "removePixKey/onError triggered");
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C18270x1.A1H(A0o, "Bloks: IQRequestHelper/sendIQRequest onError: ", r5);
        C18280x3.A13(A0o);
        ((AnonymousClass9VP) this.A00).A00.BkS(new C201219ji(this, (C52792m3) this.A01, (AnonymousClass9OA) this.A02, r5));
    }

    public void BdM(AnonymousClass36K r4, String str) {
        if (this.A03 != 0) {
            A00((AnonymousClass7I8) this.A01, r4, (AnonymousClass9IV) this.A02);
            return;
        }
        ((AnonymousClass9VP) this.A00).A00.BkS(new AnonymousClass9j6(this, (C52792m3) this.A01, r4));
    }

    public static void A00(AnonymousClass7I8 r6, AnonymousClass36K r7, AnonymousClass9IV r8) {
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            new C192279Iw(r7, r8);
            BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = r6.A00;
            brazilPixKeySettingViewModel.A06.BkM(new C71323bv(48, r6.A01, brazilPixKeySettingViewModel));
        } catch (AnonymousClass24Y e) {
            A0s.add(AnonymousClass000.A0a("RemoveCustomPaymentMethodResponseSuccess: ", AnonymousClass001.A0o(), e));
            try {
                new C192269Iv(r7, r8);
                C06270Wx.A04(r6.A00.A01, 2);
                C1899593h.A1Q("BrazilPixKeySettingViewModel", "removePixKey/handle::RemoveCustomPaymentMethodResponseError");
            } catch (AnonymousClass24Y e2) {
                A0s.add(AnonymousClass000.A0a("RemoveCustomPaymentMethodResponseError: ", AnonymousClass001.A0o(), e2));
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Could not parse stanza into valid response class, encountered the following errors for each possible response:\n");
                throw new AnonymousClass24Y(AnonymousClass000.A0X(C107575bX.A08("\n", A0s), A0o));
            }
        }
    }
}

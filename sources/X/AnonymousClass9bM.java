package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.9bM  reason: invalid class name */
public class AnonymousClass9bM implements AnonymousClass4EY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C89644eZ A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ C191679Fw A03;
    public final /* synthetic */ String A04;

    public AnonymousClass9bM(C89644eZ r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C191679Fw r3, String str, int i) {
        this.A03 = r3;
        this.A00 = i;
        this.A01 = r1;
        this.A02 = pinBottomSheetDialogFragment;
        this.A04 = str;
    }

    public void BaC(AnonymousClass2Oi r7) {
        C191679Fw r4 = this.A03;
        int i = this.A00;
        C89644eZ r1 = this.A01;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A02;
        if (i != 1) {
            r1.BjL();
        } else if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1L();
        }
        if (this.A04.equals("FB") && AnonymousClass9U4.A03(r4.A03).A0A().size() < 1) {
            C1906899l r12 = r4.A01;
            r12.A07(r12.A01("add_card"));
        }
        C06270Wx.A04(r4.A02, 0);
    }

    public void Ba4(AnonymousClass34V r3) {
        C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilPaymentCardDetailsViewModel/createCallbackForRemovePaymentMethod/onRequestError. paymentNetworkError: ", r3);
        C1899593h.A0p(this.A03.A01, C18290x4.A0Z(), r3);
    }

    public void BaB(AnonymousClass34V r6) {
        C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilPaymentCardDetailsViewModel/createCallbackForRemovePaymentMethod/onResponseError. paymentNetworkError: ", r6);
        C191679Fw r4 = this.A03;
        String str = this.A04;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A02;
        if (!r4.A0F(r6, pinBottomSheetDialogFragment, str)) {
            int i = this.A00;
            C89644eZ r1 = this.A01;
            if (i != 1) {
                r1.BjL();
            } else if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A1a();
                pinBottomSheetDialogFragment.A1L();
            }
            C1899593h.A0p(r4.A01, C18290x4.A0Z(), r6);
        }
    }
}

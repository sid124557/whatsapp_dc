package X;

import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment;
import com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment;

/* renamed from: X.9oM  reason: invalid class name and case insensitive filesystem */
public class C203819oM extends C08380eM {
    public Object A00;
    public final int A01;

    public C203819oM(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public C05550Ty Azr(Class cls) {
        switch (this.A01) {
            case 0:
                if (cls.isAssignableFrom(C191679Fw.class)) {
                    BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = (BrazilPaymentCardDetailsActivity) this.A00;
                    C56612sH r2 = brazilPaymentCardDetailsActivity.A06;
                    AnonymousClass4FS r11 = brazilPaymentCardDetailsActivity.A0I;
                    C166587yw r3 = brazilPaymentCardDetailsActivity.A08;
                    AnonymousClass9U4 r6 = brazilPaymentCardDetailsActivity.A0D;
                    AnonymousClass9VB r9 = brazilPaymentCardDetailsActivity.A09;
                    C1906899l r4 = brazilPaymentCardDetailsActivity.A0A;
                    AnonymousClass9TR r10 = brazilPaymentCardDetailsActivity.A0A;
                    return new C191679Fw(r2, r3, r4, brazilPaymentCardDetailsActivity.A05, r6, brazilPaymentCardDetailsActivity.A07, brazilPaymentCardDetailsActivity.A08, r9, r10, r11);
                }
                throw AnonymousClass001.A0c("View Model type mismatch. Expected a BrazilPaymentCardDetailsViewModel");
            case 1:
                if (cls.isAssignableFrom(C1902494w.class)) {
                    IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = (IndiaUpiSendPaymentToVpaFragment) this.A00;
                    AnonymousClass1VX r32 = indiaUpiSendPaymentToVpaFragment.A07;
                    AnonymousClass4FS r7 = indiaUpiSendPaymentToVpaFragment.A0P;
                    return new C1902494w(indiaUpiSendPaymentToVpaFragment.A05, r32, indiaUpiSendPaymentToVpaFragment.A0C, indiaUpiSendPaymentToVpaFragment.A0D, indiaUpiSendPaymentToVpaFragment.A0H, r7);
                }
                throw AnonymousClass001.A0c("Invalid viewModel for IndiaUpiSendToVpaViewModel");
            default:
                if (cls.isAssignableFrom(C1901494e.class)) {
                    return new C1901494e(((IndiaUpiPaymentInviteFragment) this.A00).A07);
                }
                throw AnonymousClass001.A0c("Invalid viewModel");
        }
    }
}

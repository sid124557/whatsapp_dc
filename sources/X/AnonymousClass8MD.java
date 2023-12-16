package X;

import android.content.Context;
import android.text.SpannableString;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;

/* renamed from: X.8MD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8MD implements Runnable {
    public final /* synthetic */ TextEmojiLabel A00;
    public final /* synthetic */ HybridPaymentMethodPickerFragment A01;

    public final void run() {
        C106715a2 r11;
        Context A1D;
        String string;
        String[] strArr;
        String[] strArr2;
        Runnable[] runnableArr;
        SpannableString A04;
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = this.A01;
        TextEmojiLabel textEmojiLabel = this.A00;
        if (hybridPaymentMethodPickerFragment.A0E != null) {
            AnonymousClass1VX r3 = hybridPaymentMethodPickerFragment.A05;
            if (r3 == null) {
                throw C18270x1.A0S("abProps");
            } else if (C195219Wq.A0A(r3, hybridPaymentMethodPickerFragment.A0F)) {
                C195219Wq r4 = hybridPaymentMethodPickerFragment.A0E;
                if (r4 != null) {
                    AnonymousClass39S r32 = hybridPaymentMethodPickerFragment.A0F;
                    C162457s7.A0K(r32, "null cannot be cast to non-null type com.whatsapp.protocol.CheckoutInfoContent");
                    C141946wO A0H = r4.A0H(r32);
                    C162457s7.A0D(A0H);
                    if (A0H == C141946wO.TOS_V1) {
                        C106715a2 r7 = hybridPaymentMethodPickerFragment.A0H;
                        if (r7 != null) {
                            A04 = r7.A04(hybridPaymentMethodPickerFragment.A1D(), C08310eF.A09(hybridPaymentMethodPickerFragment).getString(R.string.f11nameremoved), new Runnable[]{new C172578Lw(20)}, new String[]{"p2m-hybrid-wa-policies"}, new String[]{"https://www.whatsapp.com/legal/privacy-policy"});
                        } else {
                            throw C18270x1.A0S("linkifier");
                        }
                    } else {
                        if (A0H == C141946wO.TOS_V2) {
                            r11 = hybridPaymentMethodPickerFragment.A0H;
                            if (r11 != null) {
                                A1D = hybridPaymentMethodPickerFragment.A1D();
                                string = C08310eF.A09(hybridPaymentMethodPickerFragment).getString(R.string.f11nameremoved);
                                strArr = new String[]{"terms", "payment-provider-terms"};
                                strArr2 = new String[]{"https://www.whatsapp.com/legal/payments/india/terms", "https://www.whatsapp.com/legal/payments/india/psp"};
                                runnableArr = new Runnable[]{new C172578Lw(21), new C172578Lw(22)};
                            } else {
                                throw C18270x1.A0S("linkifier");
                            }
                        } else if (A0H == C141946wO.TOS_ALL) {
                            r11 = hybridPaymentMethodPickerFragment.A0H;
                            if (r11 != null) {
                                A1D = hybridPaymentMethodPickerFragment.A1D();
                                string = C08310eF.A09(hybridPaymentMethodPickerFragment).getString(R.string.f11nameremoved);
                                strArr = new String[]{"terms", "privacy-policy", "payment-provider-terms"};
                                strArr2 = new String[]{"https://www.whatsapp.com/legal/payments/india/terms", "https://www.whatsapp.com/legal/privacy-policy", "https://www.whatsapp.com/legal/payments/india/psp"};
                                runnableArr = new Runnable[]{new C172578Lw(23), new C172578Lw(24), new C172578Lw(25)};
                            } else {
                                throw C18270x1.A0S("linkifier");
                            }
                        } else {
                            textEmojiLabel.setVisibility(8);
                            return;
                        }
                        A04 = r11.A04(A1D, string, runnableArr, strArr, strArr2);
                    }
                    textEmojiLabel.setText(A04);
                    textEmojiLabel.setVisibility(0);
                    return;
                }
                throw C18270x1.A0S("paymentsUtils");
            }
        } else {
            throw C18270x1.A0S("paymentsUtils");
        }
    }

    public /* synthetic */ AnonymousClass8MD(TextEmojiLabel textEmojiLabel, HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment) {
        this.A01 = hybridPaymentMethodPickerFragment;
        this.A00 = textEmojiLabel;
    }
}

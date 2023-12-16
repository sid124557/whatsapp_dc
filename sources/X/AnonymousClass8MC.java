package X;

import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;

/* renamed from: X.8MC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8MC implements Runnable {
    public final /* synthetic */ TextEmojiLabel A00;
    public final /* synthetic */ HybridPaymentMethodPickerFragment A01;

    public final void run() {
        AnonymousClass39W r0;
        AnonymousClass39S r02;
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = this.A01;
        TextEmojiLabel textEmojiLabel = this.A00;
        C162457s7.A0J(textEmojiLabel, 1);
        C66543Lv r2 = hybridPaymentMethodPickerFragment.A03;
        if (r2 != null) {
            AnonymousClass2z0 r1 = hybridPaymentMethodPickerFragment.A0G;
            C162457s7.A0K(r1, "null cannot be cast to non-null type com.whatsapp.protocol.FMessageKey");
            C30791n7 r03 = (C30791n7) r2.A2D.A05(r1);
            if (!(r03 == null || (r0 = r03.A00) == null || (r02 = r0.A01) == null)) {
                hybridPaymentMethodPickerFragment.A0F = r02;
            }
            C69263Wi r12 = hybridPaymentMethodPickerFragment.A00;
            if (r12 != null) {
                r12.A0S(new AnonymousClass8MD(textEmojiLabel, hybridPaymentMethodPickerFragment));
                return;
            }
            throw C18270x1.A0S("globalUI");
        }
        throw C18270x1.A0S("coreMessageStore");
    }

    public /* synthetic */ AnonymousClass8MC(TextEmojiLabel textEmojiLabel, HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment) {
        this.A01 = hybridPaymentMethodPickerFragment;
        this.A00 = textEmojiLabel;
    }
}

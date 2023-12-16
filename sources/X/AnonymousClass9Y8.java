package X;

import android.widget.CompoundButton;
import com.whatsapp.payments.ui.BrazilPaymentDPOActivity;

/* renamed from: X.9Y8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9Y8 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ BrazilPaymentDPOActivity A00;

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C191539Fh r3 = this.A00.A00;
        String charSequence = compoundButton.getText().toString();
        AnonymousClass303 A0K = C1899593h.A0K();
        A0K.A03("product_flow", "p2m");
        A0K.A03("checkbox_text", charSequence);
        C203499no r32 = r3.A07;
        Integer A0f = AnonymousClass001.A0f();
        int i = 123;
        if (z) {
            i = 122;
        }
        r32.BKE(A0K, A0f, Integer.valueOf(i), "restore_payment", (String) null);
    }

    public /* synthetic */ AnonymousClass9Y8(BrazilPaymentDPOActivity brazilPaymentDPOActivity) {
        this.A00 = brazilPaymentDPOActivity;
    }
}

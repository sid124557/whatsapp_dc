package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment;

/* renamed from: X.940  reason: invalid class name */
public class AnonymousClass940 extends ClickableSpan {
    public final /* synthetic */ IndiaUpiEditTransactionDescriptionFragment A00;

    public AnonymousClass940(IndiaUpiEditTransactionDescriptionFragment indiaUpiEditTransactionDescriptionFragment) {
        this.A00 = indiaUpiEditTransactionDescriptionFragment;
    }

    public void onClick(View view) {
        IndiaUpiEditTransactionDescriptionFragment indiaUpiEditTransactionDescriptionFragment = this.A00;
        indiaUpiEditTransactionDescriptionFragment.A07.BKE((AnonymousClass303) null, AnonymousClass001.A0f(), C18300x5.A0Y(), "payment_description", (String) null);
        indiaUpiEditTransactionDescriptionFragment.A0m(C18300x5.A08("https://faq.whatsapp.com/general/payments/about-the-security-of-your-payment-descriptions"));
    }

    public void updateDrawState(TextPaint textPaint) {
        C86624Kv.A0k(C08310eF.A09(this.A00), textPaint, R.color.f5nameremoved);
        textPaint.setUnderlineText(false);
    }
}

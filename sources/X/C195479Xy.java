package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.9Xy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C195479Xy implements View.OnFocusChangeListener {
    public final /* synthetic */ MentionableEntry A00;
    public final /* synthetic */ PaymentView A01;

    public final void onFocusChange(View view, boolean z) {
        PaymentView paymentView = this.A01;
        MentionableEntry mentionableEntry = this.A00;
        if (z) {
            mentionableEntry.setHint("");
            if (paymentView.A0H()) {
                paymentView.A0n.A07();
                return;
            }
            return;
        }
        mentionableEntry.setHint(paymentView.getContext().getString(R.string.f11nameremoved));
    }

    public /* synthetic */ C195479Xy(MentionableEntry mentionableEntry, PaymentView paymentView) {
        this.A01 = paymentView;
        this.A00 = mentionableEntry;
    }
}

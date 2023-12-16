package X;

import android.content.Context;
import android.text.Editable;
import android.widget.EditText;
import com.whatsapp.R;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.9oa  reason: invalid class name and case insensitive filesystem */
public class C203959oa extends C166677z5 {
    public Object A00;
    public final int A01;

    public C203959oa(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        C103645Nu r1;
        Editable editable2 = editable;
        switch (this.A01) {
            case 1:
                IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = (IndiaUpiSendPaymentToVpaFragment) this.A00;
                indiaUpiSendPaymentToVpaFragment.A02.setVisibility(4);
                indiaUpiSendPaymentToVpaFragment.A0R.setEnabled(AnonymousClass001.A1W(editable.toString().length()));
                EditText editText = indiaUpiSendPaymentToVpaFragment.A00;
                C06560Yg.A0C(AnonymousClass0Y8.A07(editText.getContext(), AnonymousClass5Yj.A02(indiaUpiSendPaymentToVpaFragment.A00.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)), editText);
                return;
            case 2:
                C196409an r12 = (C196409an) this.A00;
                Context context = r12.A0H;
                AnonymousClass5Y0 r6 = r12.A0M;
                C620633i r5 = r12.A0J;
                C60152y5 r7 = r12.A0O;
                MentionableEntry mentionableEntry = r12.A0B;
                C626936e.A04(mentionableEntry);
                C107635bd.A0F(context, editable2, mentionableEntry.getPaint(), r5, r6, r7, R.color.f5nameremoved, r12.A0G);
                return;
            case 3:
                PaymentView paymentView = (PaymentView) this.A00;
                if (paymentView.A19.A01() && (r1 = paymentView.A1B) != null && paymentView.A0l.A02) {
                    r1.A00(editable.toString());
                    return;
                }
                return;
            default:
                super.afterTextChanged(editable);
                return;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.A01 != 0) {
            super.onTextChanged(charSequence, i, i2, i3);
            return;
        }
        AnonymousClass94s r1 = ((C1905197d) this.A00).A07;
        int length = charSequence.length();
        AnonymousClass08M r2 = r1.A01;
        int i4 = 1;
        if (length > 0) {
            i4 = 3;
        }
        r2.A0H(new AnonymousClass9OU(i4));
    }
}

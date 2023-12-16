package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.9aj  reason: invalid class name and case insensitive filesystem */
public final class C196369aj implements C185418tc {
    public TextView A00;

    public void BfU(View view) {
        C162457s7.A0J(view, 0);
        TextView textView = (TextView) C18280x3.A0E(view, R.id.send_payment_amount_description);
        C162457s7.A0J(textView, 0);
        this.A00 = textView;
    }

    /* renamed from: A00 */
    public void Axq(AnonymousClass7HR r4) {
        if (r4 != null) {
            String str = null;
            if (r4.A00 == 1) {
                TextView textView = this.A00;
                if (textView != null) {
                    textView.setVisibility(4);
                } else {
                    throw C18270x1.A0S("amountConversion");
                }
            }
            Object obj = r4.A01;
            if (obj != null) {
                TextView textView2 = this.A00;
                if (textView2 != null) {
                    C194469Sz r1 = (C194469Sz) obj;
                    if (r1 != null) {
                        str = r1.A00;
                    }
                    textView2.setText(str);
                    return;
                }
                throw C18270x1.A0S("amountConversion");
            }
        }
    }

    public int B94() {
        return R.layout.f8nameremoved;
    }

    public /* synthetic */ void BFl(ViewStub viewStub) {
        AnonymousClass9LS.A00(viewStub, this);
    }
}

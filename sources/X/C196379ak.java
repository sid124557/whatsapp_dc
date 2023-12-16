package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.9ak  reason: invalid class name and case insensitive filesystem */
public class C196379ak implements C185418tc {
    public View.OnClickListener A00;
    public ImageView A01;

    public void A00(Integer num) {
        ImageView imageView;
        int i;
        if (!(this instanceof AnonymousClass9G8)) {
            if (num == null || 2 != num.intValue()) {
                imageView = this.A01;
                i = R.drawable.ic_action_arrow_next;
            } else {
                imageView = this.A01;
                i = R.drawable.input_send;
            }
            imageView.setImageResource(i);
        }
    }

    public /* bridge */ /* synthetic */ void Axq(Object obj) {
        if (!(this instanceof AnonymousClass9G8)) {
            A00((Integer) obj);
        }
    }

    public int B94() {
        if (!(this instanceof AnonymousClass9G8) || (((AnonymousClass9G8) this) instanceof AnonymousClass9G7)) {
            return R.layout.f8nameremoved;
        }
        return R.layout.f8nameremoved;
    }

    public void BfU(View view) {
        if (this instanceof AnonymousClass9G8) {
            AnonymousClass9G8 r2 = (AnonymousClass9G8) this;
            r2.A00 = view;
            C204249p3.A02(view, r2, 152);
            r2.A00.setEnabled(false);
            r2.A00.setClickable(false);
            return;
        }
        ImageView A0E = AnonymousClass0x9.A0E(view, R.id.send_payment_send);
        this.A01 = A0E;
        C204249p3.A02(A0E, this, 151);
    }

    public /* synthetic */ void BFl(ViewStub viewStub) {
        AnonymousClass9LS.A00(viewStub, this);
    }
}

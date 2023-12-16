package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import java.util.List;

/* renamed from: X.9TV  reason: invalid class name */
public class AnonymousClass9TV {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public final int A03;
    public final AnonymousClass9C3 A04;

    public void A01() {
        ViewStub viewStub = (ViewStub) C06560Yg.A02(this.A04.A00, R.id.default_payment_method_stub);
        viewStub.setLayoutResource(R.layout.f8nameremoved);
        View inflate = viewStub.inflate();
        this.A00 = C06560Yg.A02(inflate, R.id.default_payment_method_row);
        this.A01 = AnonymousClass0x9.A0E(inflate, R.id.default_payment_method_icon);
        this.A02 = C18300x5.A0G(inflate, R.id.default_payment_method_text);
    }

    public void A02(C166587yw r5, boolean z) {
        AnonymousClass9C3 r0;
        C133786hw r02;
        C133786hw r1;
        C107335b8.A0E(this.A01, this.A03);
        boolean A1U = AnonymousClass000.A1U(r5.A01, 2);
        ImageView imageView = this.A01;
        int i = R.drawable.ic_settings_unstarred;
        if (A1U) {
            i = R.drawable.ic_settings_starred;
        }
        imageView.setImageResource(i);
        TextView textView = this.A02;
        int i2 = R.string.f11nameremoved;
        if (A1U) {
            i2 = R.string.f11nameremoved;
        }
        textView.setText(i2);
        View view = this.A00;
        if (!A1U) {
            r0 = this.A04;
        } else {
            r0 = null;
        }
        view.setOnClickListener(r0);
        if (C195169Wk.A08(r5) && (r02 = (C133786hw) r5.A08) != null && !r02.A0X) {
            if (this instanceof AnonymousClass9BI) {
                AnonymousClass9BI r3 = (AnonymousClass9BI) this;
                C166587yw r12 = r3.A04.A08;
                if (C195169Wk.A08(r12) && (r1 = (C133786hw) r12.A08) != null) {
                    if (!r1.A0X) {
                        r3.A02.setVisibility(8);
                    }
                    if (!r1.A0T) {
                        r3.A01.setVisibility(8);
                    }
                }
                r3.A00.setVisibility(8);
                return;
            }
            this.A00.setVisibility(8);
        }
    }

    public void A03(List list) {
        this.A01.setImageResource(R.drawable.ic_settings_starred);
        this.A02.setText(R.string.f11nameremoved);
        this.A00.setOnClickListener((View.OnClickListener) null);
    }

    public AnonymousClass9TV(AnonymousClass9C3 r2) {
        int i;
        this.A04 = r2;
        if (r2 instanceof BrazilPaymentCardDetailsActivity) {
            i = R.color.f5nameremoved;
        } else {
            i = R.color.f5nameremoved;
        }
        this.A03 = AnonymousClass0Y8.A04(r2, i);
    }
}

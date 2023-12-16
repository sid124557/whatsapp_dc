package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.9F1  reason: invalid class name */
public class AnonymousClass9F1 extends AnonymousClass95V {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final AnonymousClass1VX A04;
    public final C194589Tn A05;

    public AnonymousClass9F1(View view, AnonymousClass1VX r3, C194589Tn r4) {
        super(view);
        this.A04 = r3;
        this.A05 = r4;
        this.A03 = C18300x5.A0G(view, R.id.display_payment_amount);
        this.A02 = C18300x5.A0G(view, R.id.payment_amount_subtext);
        this.A00 = C06560Yg.A02(view, R.id.payment_expressive_background_container);
        this.A01 = AnonymousClass0x9.A0E(view, R.id.payment_expressive_background);
    }
}

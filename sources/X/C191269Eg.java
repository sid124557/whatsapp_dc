package X;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.9Eg  reason: invalid class name and case insensitive filesystem */
public class C191269Eg extends AnonymousClass95U {
    public Button A00;
    public ImageView A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;

    public C191269Eg(View view) {
        super(view);
        this.A01 = AnonymousClass0x9.A0E(view, R.id.payout_bank_icon);
        this.A04 = C18300x5.A0G(view, R.id.payout_bank_name);
        this.A03 = C18300x5.A0G(view, R.id.payout_bank_status);
        this.A02 = C86654Ky.A0N(view, R.id.warning_container);
        this.A00 = (Button) C06560Yg.A02(view, R.id.cta_button);
    }
}

package X;

import android.view.View;
import android.widget.Button;
import com.whatsapp.R;

/* renamed from: X.9Ez  reason: invalid class name and case insensitive filesystem */
public class C191459Ez extends AnonymousClass95V {
    public final View A00;
    public final Button A01;
    public final Button A02;
    public final Button A03;
    public final C194599Tr A04;

    public C191459Ez(View view, C194599Tr r3) {
        super(view);
        this.A04 = r3;
        this.A02 = (Button) C06560Yg.A02(view, R.id.request_cancel_button);
        this.A03 = (Button) C06560Yg.A02(view, R.id.retry_withdrawal_button);
        this.A01 = (Button) C06560Yg.A02(view, R.id.accept_payment_button);
        this.A00 = C06560Yg.A02(view, R.id.button_group_view);
    }
}

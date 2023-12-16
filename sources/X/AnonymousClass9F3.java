package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.9F3  reason: invalid class name */
public class AnonymousClass9F3 extends AnonymousClass95V {
    public final Context A00;
    public final View A01;
    public final Button A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextEmojiLabel A06;

    public AnonymousClass9F3(View view) {
        super(view);
        this.A00 = view.getContext();
        this.A02 = (Button) C06560Yg.A02(view, R.id.complaint_button);
        this.A01 = C06560Yg.A02(view, R.id.transaction_complaint_status);
        this.A03 = AnonymousClass0x9.A0E(view, R.id.transaction_complaint_status_icon);
        this.A05 = C18300x5.A0G(view, R.id.transaction_complaint_status_title);
        this.A04 = C18300x5.A0G(view, R.id.transaction_complaint_status_subtitle);
        this.A06 = AnonymousClass0x7.A0K(view, R.id.transaction_complaint_status_time);
    }
}

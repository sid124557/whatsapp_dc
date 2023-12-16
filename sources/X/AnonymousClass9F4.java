package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

/* renamed from: X.9F4  reason: invalid class name */
public class AnonymousClass9F4 extends AnonymousClass95V {
    public final Context A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final C620633i A07;
    public final AnonymousClass1VX A08;

    public AnonymousClass9F4(View view, C620633i r3, AnonymousClass1VX r4) {
        super(view);
        this.A08 = r4;
        this.A07 = r3;
        this.A00 = view.getContext();
        this.A05 = AnonymousClass0x7.A0L(view, R.id.status_icon);
        this.A06 = AnonymousClass0x7.A0L(view, R.id.transaction_status);
        this.A03 = C18300x5.A0G(view, R.id.transaction_time);
        this.A04 = AnonymousClass0x7.A0K(view, R.id.status_error_text);
        this.A02 = C18300x5.A0G(view, R.id.status_tertiary_text);
        this.A01 = C18300x5.A0G(view, R.id.status_action_button);
    }
}

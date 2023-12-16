package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.9F5  reason: invalid class name */
public class AnonymousClass9F5 extends AnonymousClass95V {
    public final Context A00;
    public final View A01;
    public final ImageView A02;
    public final ProgressBar A03;
    public final RelativeLayout A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextEmojiLabel A08;
    public final WaImageView A09;
    public final AnonymousClass5X8 A0A;
    public final AnonymousClass5UX A0B;
    public final C114015mM A0C;
    public final C620633i A0D;
    public final AnonymousClass1VX A0E;
    public final C106715a2 A0F;

    public AnonymousClass9F5(View view, AnonymousClass5X8 r4, AnonymousClass5UX r5, C114015mM r6, C620633i r7, AnonymousClass1VX r8, C106715a2 r9) {
        super(view);
        this.A0E = r8;
        this.A0F = r9;
        this.A0C = r6;
        this.A0A = r4;
        this.A0B = r5;
        this.A0D = r7;
        this.A00 = view.getContext();
        this.A06 = C18300x5.A0G(view, R.id.payment_send_action);
        this.A07 = C18300x5.A0G(view, R.id.payment_send_action_time);
        this.A05 = C18300x5.A0G(view, R.id.payment_people_info);
        this.A04 = (RelativeLayout) C06560Yg.A02(view, R.id.payment_people_container);
        this.A02 = AnonymousClass0x9.A0E(view, R.id.payment_people_icon);
        this.A03 = (ProgressBar) C06560Yg.A02(view, R.id.payment_people_progress_bar);
        View A022 = C06560Yg.A02(view, R.id.incentive_info_container);
        this.A01 = A022;
        this.A08 = AnonymousClass0x7.A0K(A022, R.id.incentive_info_text);
        this.A09 = AnonymousClass0x9.A0L(view, R.id.open_indicator);
    }
}

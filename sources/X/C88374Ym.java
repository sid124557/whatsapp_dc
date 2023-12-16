package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.4Ym  reason: invalid class name and case insensitive filesystem */
public class C88374Ym extends C05570Ua {
    public boolean A00;
    public final ImageView A01;
    public final C55682qk A02;
    public final TextEmojiLabel A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final SelectionCheckView A06;
    public final C64773Ex A07;
    public final C105365Uq A08;
    public final AnonymousClass33p A09;

    public C88374Ym(View view, C55682qk r6, C64773Ex r7, C105365Uq r8, AnonymousClass33p r9) {
        super(view);
        this.A02 = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A09 = r9;
        View view2 = this.A0H;
        this.A01 = AnonymousClass0x9.A0E(view2, R.id.community_icon);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(view2, R.id.community_subject);
        this.A03 = A0K;
        this.A04 = AnonymousClass0x7.A0L(view2, R.id.community_new);
        this.A05 = AnonymousClass0x7.A0L(view2, R.id.community_suspended_subtitle);
        this.A06 = (SelectionCheckView) C06560Yg.A02(view, R.id.community_selection_check);
        AnonymousClass0x9.A0E(view, R.id.community_mark).setImageResource(C1001059l.A03 ? R.drawable.my_status_add_button_new : R.drawable.my_status_add_button);
        C107295b4.A06(view, true);
        C106905aM.A04(A0K);
    }
}

package X;

import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.4jD  reason: invalid class name and case insensitive filesystem */
public class C91244jD extends AnonymousClass4Z5 {
    public int A00;
    public long A01;
    public C117005rE A02;
    public C112425ji A03;
    public AnonymousClass7D6 A04;
    public AnonymousClass3ZH A05;
    public boolean A06;
    public final LinearLayout A07;
    public final AnonymousClass5YB A08;
    public final WaImageView A09;
    public final WaTextView A0A;
    public final SelectionCheckView A0B;
    public final ThumbnailButton A0C;
    public final C64773Ex A0D;
    public final C105365Uq A0E;

    public C91244jD(View view, AnonymousClass64J r3, C64773Ex r4, C105365Uq r5) {
        super(view);
        this.A0D = r4;
        this.A0E = r5;
        this.A09 = AnonymousClass0x9.A0L(view, R.id.call_type_icon);
        this.A0C = C86664Kz.A16(view, R.id.contact_photo);
        this.A08 = AnonymousClass5YB.A00(view, r3, R.id.schedule_call_group);
        this.A0A = AnonymousClass0x7.A0L(view, R.id.tap_to_join_text);
        this.A07 = C86654Ky.A0N(view, R.id.schedule_call_time_layout);
        this.A0B = (SelectionCheckView) C06560Yg.A02(view, R.id.selection_check);
    }
}

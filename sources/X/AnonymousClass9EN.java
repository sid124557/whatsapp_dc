package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.9EN  reason: invalid class name */
public class AnonymousClass9EN extends AnonymousClass95T {
    public final LinearLayout A00;
    public final LinearLayout A01;
    public final LinearLayout A02;
    public final WaImageView A03;
    public final WaImageView A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final WaTextView A08;
    public final C620733j A09;
    public final C1907099n A0A;
    public final AnonymousClass5UY A0B;

    public final void A08(C624034w r9) {
        if (r9 != null && r9.A06 > 0 && r9.A0G()) {
            WaTextView waTextView = this.A07;
            waTextView.setVisibility(0);
            Resources resources = this.A0H.getResources();
            boolean A0M = r9.A0M();
            int i = R.string.f11nameremoved;
            if (A0M) {
                i = R.string.f11nameremoved;
            }
            waTextView.setText(C18320x8.A0b(resources, C107505bQ.A03(this.A09, r9.A06), AnonymousClass002.A0L(), 0, i));
        }
    }

    public AnonymousClass9EN(View view, C620733j r3, C1907099n r4) {
        super(view);
        this.A09 = r3;
        this.A0A = r4;
        this.A05 = AnonymousClass0x7.A0L(view, R.id.additional_note);
        this.A00 = C86654Ky.A0N(view, R.id.additional_note_container);
        this.A02 = C86654Ky.A0N(view, R.id.payment_details);
        this.A01 = C86654Ky.A0N(view, R.id.message_biz);
        this.A03 = AnonymousClass0x9.A0L(view, R.id.payment_currency_symbol_icon);
        this.A07 = AnonymousClass0x7.A0L(view, R.id.payment_details_status);
        this.A06 = AnonymousClass0x7.A0L(view, R.id.message_biz_title);
        this.A0B = AnonymousClass0x2.A0M(view, R.id.payment_support_container);
        this.A04 = AnonymousClass0x9.A0L(view, R.id.payment_support_icon);
        this.A08 = AnonymousClass0x7.A0L(view, R.id.payment_support_title);
    }
}

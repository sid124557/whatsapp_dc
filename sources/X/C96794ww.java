package X;

import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.CircleWaImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.4ww  reason: invalid class name and case insensitive filesystem */
public class C96794ww extends AnonymousClass6mM {
    public C90754iG A00;
    public C56602sG A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final CircleWaImageView A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final AnonymousClass5UV A08;
    public final C29421in A09;
    public final C105365Uq A0A;

    public void A07() {
        AnonymousClass5U9 r1 = this.A08.A0P;
        r1.A09 = null;
        r1.A00();
        this.A0A.A00();
        C56602sG r12 = this.A01;
        if (r12 != null) {
            this.A09.A07(r12);
        }
    }

    public void A08() {
        C90754iG r1 = this.A00;
        if (r1 != null) {
            this.A08.A07(r1);
        }
    }

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C90754iG r5 = (C90754iG) obj;
        this.A00 = r5;
        boolean z = r5.A05;
        r5.A03 = !z;
        this.A08.A06(r5);
        this.A05.setVisibility(8);
        this.A02.setVisibility(8);
        this.A03.setVisibility(8);
        if (z) {
            this.A0A.A0A(this.A04, new AnonymousClass3ZH(C18310x6.A0S(r5.A04.A0F)), false);
            AnonymousClass680 r1 = new AnonymousClass680(r5, 1, this);
            this.A01 = r1;
            this.A09.A06(r1);
        }
        if (r5.A04.A08 == 2) {
            WaTextView waTextView = this.A07;
            waTextView.setText(R.string.f11nameremoved);
            waTextView.setVisibility(0);
        }
    }

    public C96794ww(View view, AnonymousClass5UV r4, C29421in r5, C114015mM r6) {
        super(view);
        this.A09 = r5;
        this.A0A = r6.A06(view.getContext(), "business-profile-typeahead-recent-item");
        this.A08 = r4;
        this.A04 = (CircleWaImageView) C06560Yg.A02(view, R.id.business_avatar);
        this.A02 = C86654Ky.A0N(view, R.id.open_status_layout);
        this.A05 = AnonymousClass0x7.A0L(view, R.id.address);
        this.A07 = AnonymousClass0x7.A0L(view, R.id.category);
        this.A06 = AnonymousClass0x7.A0L(view, R.id.price_tier);
        this.A03 = C86654Ky.A0N(view, R.id.service_offerings_layout);
        r4.A05(view);
    }
}

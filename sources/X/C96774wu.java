package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.CircleWaImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.4wu  reason: invalid class name and case insensitive filesystem */
public class C96774wu extends AnonymousClass6mM {
    public C56602sG A00;
    public C105365Uq A01;
    public final CircleWaImageView A02;
    public final WaImageView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final AnonymousClass5U9 A06;
    public final C29421in A07;

    public void A07() {
        this.A01.A00();
        C56602sG r1 = this.A00;
        if (r1 != null) {
            this.A07.A07(r1);
        }
        this.A06.A00();
    }

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C96364wF r5 = (C96364wF) obj;
        this.A01.A0A(this.A02, new AnonymousClass3ZH(C18310x6.A0S(r5.A03)), false);
        AnonymousClass680 r1 = new AnonymousClass680(r5, 0, this);
        this.A00 = r1;
        this.A07.A06(r1);
        List list = r5.A04;
        if (list.isEmpty() || AnonymousClass001.A0n(list, 0).isEmpty()) {
            this.A05.setVisibility(8);
        } else {
            WaTextView waTextView = this.A05;
            waTextView.setText(TextUtils.join(", ", list));
            waTextView.setVisibility(0);
        }
        this.A04.setText(r5.A02);
        C18290x4.A1H(this.A03, r5, 44);
        C109705f3.A00(this.A0H, this, r5, 33);
    }

    public C96774wu(View view, AnonymousClass5U9 r4, C29421in r5, C114015mM r6) {
        super(view);
        this.A07 = r5;
        this.A01 = r6.A06(view.getContext(), "business-profile-recent-item");
        this.A06 = r4;
        this.A02 = (CircleWaImageView) C06560Yg.A02(view, R.id.business_avatar);
        this.A04 = AnonymousClass0x7.A0L(view, R.id.business_name);
        this.A05 = AnonymousClass0x7.A0L(view, R.id.category);
        this.A03 = AnonymousClass0x9.A0L(view, R.id.delete_button);
    }
}

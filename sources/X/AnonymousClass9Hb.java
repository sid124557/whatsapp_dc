package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.9Hb  reason: invalid class name */
public abstract class AnonymousClass9Hb extends AnonymousClass983 {
    public AnonymousClass49I A00;

    public void A01(Intent intent, Bundle bundle) {
        if (intent != null) {
            this.A01 = intent.getStringExtra("bk_phoenix_navbar_title");
            intent.getStringExtra("bk_phoenix_navbar_leading_button_icon");
        }
        A04();
    }

    public void A04() {
        WaBloksActivity waBloksActivity = this.A03;
        C86634Kw.A0R(waBloksActivity).A0J(this.A01);
        Toolbar toolbar = (Toolbar) C005205m.A00(waBloksActivity, R.id.wabloks_screen_toolbar);
        C131666dx r0 = new C131666dx(C107335b8.A0B(waBloksActivity.getResources().getDrawable(R.drawable.ic_back), waBloksActivity.getResources().getColor(R.color.f5nameremoved)), this.A02);
        r0.clearColorFilter();
        toolbar.setNavigationIcon((Drawable) r0);
        toolbar.setBackgroundColor(waBloksActivity.getResources().getColor(AnonymousClass34K.A00(waBloksActivity)));
        toolbar.setTitleTextColor(waBloksActivity.getResources().getColor(AnonymousClass5Yj.A02(waBloksActivity, R.attr.f3nameremoved, R.color.f5nameremoved)));
        Drawable overflowIcon = toolbar.getOverflowIcon();
        if (overflowIcon != null) {
            Drawable A01 = C06130Wj.A01(overflowIcon);
            AnonymousClass0YG.A06(A01.mutate(), waBloksActivity.getResources().getColor(R.color.f5nameremoved));
            toolbar.setOverflowIcon(A01);
        }
    }

    public void A02(AnonymousClass49G r4) {
        try {
            this.A01 = AnonymousClass84O.A07(r4.B3p());
            C43432Sc r2 = new C43432Sc(r4.B3p().A0K(40));
            if (C107575bX.A0F(this.A01)) {
                this.A01 = r2.A05;
            }
            if (r2.A00 != null) {
                this.A00 = new C204719po(r2, 7);
            }
            A04();
        } catch (ClassCastException e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "Bloks: Invalid navigation bar type", e);
        }
    }

    public AnonymousClass9Hb(C620733j r1, WaBloksActivity waBloksActivity) {
        super(r1, waBloksActivity);
    }
}

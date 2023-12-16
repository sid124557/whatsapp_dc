package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.9Ha  reason: invalid class name */
public class AnonymousClass9Ha extends AnonymousClass983 {
    public ViewGroup A00;
    public ImageView A01;
    public TextView A02;
    public String A03;
    public final C46562bq A04;

    public void A01(Intent intent, Bundle bundle) {
        WaBloksActivity waBloksActivity = this.A03;
        C86634Kw.A0R(waBloksActivity).A0J("");
        ViewGroup viewGroup = (ViewGroup) AnonymousClass001.A0R(LayoutInflater.from(C86634Kw.A0R(waBloksActivity).A02()), (ViewGroup) waBloksActivity.findViewById(R.id.bk_navigation_custom_view), R.layout.f8nameremoved);
        this.A00 = viewGroup;
        this.A01 = AnonymousClass0x9.A0F(viewGroup, R.id.bk_navigation_logo);
        this.A02 = AnonymousClass002.A09(this.A00, R.id.bk_navigation_title);
        C626936e.A04(this.A00);
        C626936e.A04(this.A01);
        C626936e.A04(this.A02);
        C107295b4.A06(this.A02, true);
        if (bundle != null) {
            this.A03 = bundle.getString("bk_navigation_bar_logo");
            A04(this.A01);
        }
        C86634Kw.A0R(waBloksActivity).A0O(true);
        C86634Kw.A0R(waBloksActivity).A0G(this.A00);
    }

    public final void A04(String str) {
        String str2;
        TextView textView = this.A02;
        if (textView != null) {
            textView.setText(str);
            this.A02.setVisibility(0);
        }
        ImageView imageView = this.A01;
        if (imageView != null && (str2 = this.A03) != null) {
            this.A04.A00(imageView, (C58572vT) null, str2, str2);
            this.A01.setVisibility(0);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        bundle.putString("bk_navigation_bar_logo", this.A03);
        super.onActivitySaveInstanceState(activity, bundle);
    }

    public AnonymousClass9Ha(C620733j r1, WaBloksActivity waBloksActivity, C46562bq r3) {
        super(r1, waBloksActivity);
        this.A04 = r3;
    }

    public void A02(AnonymousClass49G r5) {
        try {
            AnonymousClass84O r3 = new C193179Nl(r5.B3p()).A00;
            String A07 = AnonymousClass84O.A07(r3);
            this.A01 = A07;
            this.A03 = r3.A0P(45, "");
            A04(A07);
        } catch (ClassCastException e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "Bloks: Invalid navigation bar type", e);
        }
    }
}

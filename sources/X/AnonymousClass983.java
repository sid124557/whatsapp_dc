package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.983  reason: invalid class name */
public abstract class AnonymousClass983 extends AnonymousClass5c4 {
    public Toolbar A00;
    public String A01;
    public final C620733j A02;
    public final WaBloksActivity A03;

    public abstract void A01(Intent intent, Bundle bundle);

    public abstract void A02(AnonymousClass49G r1);

    public void A00() {
        C54522or r2;
        C54522or r1;
        if (this instanceof AnonymousClass9Hb) {
            AnonymousClass9Hb r22 = (AnonymousClass9Hb) this;
            if (r22.A00 != null) {
                AnonymousClass8DJ.A0B(r22.A03.BEP(), r22.A00);
            }
        } else if (this instanceof AnonymousClass9Hc) {
            AnonymousClass9Hc r0 = (AnonymousClass9Hc) this;
            AnonymousClass9HW r6 = (AnonymousClass9HW) r0.A03;
            C50042hX r5 = r0.A00;
            String str = r5.A02;
            C162457s7.A0J(str, 0);
            String str2 = r6.A03;
            if (!(str2 == null || (r1 = r6.A00) == null)) {
                r1.A01(new C197979eB(str2, str));
            }
            String str3 = r5.A00;
            String str4 = r5.A01;
            if (r6.A05 && (r2 = r6.A00) != null) {
                r2.A01(new C197989eC(str3, true, str4));
            }
        }
    }

    public boolean A03() {
        if (this instanceof AnonymousClass9Hb) {
            return AnonymousClass000.A1W(((AnonymousClass9Hb) this).A00);
        }
        if (this instanceof AnonymousClass9Hc) {
            return true;
        }
        return false;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Drawable A0J;
        WaBloksActivity waBloksActivity = this.A03;
        C626936e.A0C(AnonymousClass000.A1Y(activity, waBloksActivity));
        if (bundle != null) {
            this.A01 = bundle.getString("bk_navigation_bar_title");
        }
        Toolbar toolbar = (Toolbar) C005205m.A00(waBloksActivity, R.id.wabloks_screen_toolbar);
        this.A00 = toolbar;
        toolbar.setTitle((CharSequence) "");
        Toolbar toolbar2 = this.A00;
        toolbar2.A07();
        waBloksActivity.setSupportActionBar(toolbar2);
        C86634Kw.A0R(waBloksActivity).A0N(true);
        Toolbar toolbar3 = this.A00;
        if (this instanceof AnonymousClass9Hc) {
            A0J = ((AnonymousClass9Hc) this).A00.A00();
        } else {
            A0J = AnonymousClass0x7.A0J(waBloksActivity, this.A02, R.drawable.ic_back);
            A0J.setColorFilter(waBloksActivity.getResources().getColor(AnonymousClass5Yj.A02(activity, R.attr.f3nameremoved, R.color.f5nameremoved)), PorterDuff.Mode.SRC_ATOP);
        }
        toolbar3.setNavigationIcon(A0J);
        this.A00.setBackgroundColor(waBloksActivity.getResources().getColor(AnonymousClass5Yj.A02(this.A00.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
        this.A00.setNavigationOnClickListener(C204249p3.A00(activity, 160));
        A01(activity.getIntent(), bundle);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        bundle.putString("bk_navigation_bar_title", this.A01);
        super.onActivitySaveInstanceState(activity, bundle);
    }

    public AnonymousClass983(C620733j r1, WaBloksActivity waBloksActivity) {
        this.A02 = r1;
        this.A03 = waBloksActivity;
    }
}

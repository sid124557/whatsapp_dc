package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.util.Objects;

/* renamed from: X.9Hc  reason: invalid class name */
public class AnonymousClass9Hc extends AnonymousClass983 {
    public final C50042hX A00;

    public void A01(Intent intent, Bundle bundle) {
        if (bundle != null) {
            this.A01 = bundle.getString("bk_navigation_bar_title");
        }
        WaBloksActivity waBloksActivity = this.A03;
        C86634Kw.A0R(waBloksActivity).A0J(this.A01);
        if (intent != null) {
            String stringExtra = intent.getStringExtra("fds_on_back");
            String stringExtra2 = intent.getStringExtra("fds_on_back_params");
            String stringExtra3 = intent.getStringExtra("fds_button_style");
            C50042hX r1 = this.A00;
            Toolbar toolbar = this.A00;
            Objects.requireNonNull(waBloksActivity);
            r1.A01(waBloksActivity, toolbar, new C198099eN(waBloksActivity), stringExtra, stringExtra2, stringExtra3);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        bundle.putString("bk_navigation_bar_title", this.A01);
        super.onActivitySaveInstanceState(activity, bundle);
    }

    public AnonymousClass9Hc(C620733j r1, WaBloksActivity waBloksActivity, C50042hX r3) {
        super(r1, waBloksActivity);
        this.A00 = r3;
    }

    public void A02(AnonymousClass49G r2) {
        this.A01 = AnonymousClass84O.A07(r2.B3p());
        C18310x6.A1E(this);
    }
}

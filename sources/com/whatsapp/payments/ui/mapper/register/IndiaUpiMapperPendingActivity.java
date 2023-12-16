package com.whatsapp.payments.ui.mapper.register;

import X.AnonymousClass001;
import X.AnonymousClass6C7;
import X.AnonymousClass97f;
import X.AnonymousClass9LV;
import X.C18270x1;
import X.C18290x4;
import X.C1891290c;
import X.C197109ca;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.R;

public final class IndiaUpiMapperPendingActivity extends AnonymousClass97f {
    public C197109ca A00;

    public void onBackPressed() {
        super.onBackPressed();
        C197109ca r3 = this.A00;
        if (r3 != null) {
            Integer A0f = AnonymousClass001.A0f();
            r3.BKB(A0f, A0f, "pending_alias_setup", AnonymousClass6C7.A0h(this));
            return;
        }
        throw C18270x1.A0S("indiaUpiFieldStatsLogger");
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        AnonymousClass6C7.A0y(this);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass9LV.A00(this, R.drawable.onboarding_actionbar_home_close);
        View findViewById = findViewById(R.id.mapper_pending_done_button);
        View findViewById2 = findViewById(R.id.mapper_pending_profile_button);
        C1891290c.A00(findViewById, this, 28);
        C1891290c.A00(findViewById2, this, 29);
        C197109ca r4 = this.A00;
        if (r4 != null) {
            Integer A0Z = C18290x4.A0Z();
            Intent intent = getIntent();
            if (intent != null) {
                str = intent.getStringExtra("extra_referral_screen");
            } else {
                str = null;
            }
            r4.BKB(A0Z, (Integer) null, "pending_alias_setup", str);
            return;
        }
        throw C18270x1.A0S("indiaUpiFieldStatsLogger");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) == 16908332) {
            C197109ca r4 = this.A00;
            if (r4 != null) {
                r4.BKB(AnonymousClass001.A0f(), C18290x4.A0a(), "pending_alias_setup", AnonymousClass6C7.A0h(this));
            } else {
                throw C18270x1.A0S("indiaUpiFieldStatsLogger");
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

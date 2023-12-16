package com.whatsapp.payments.ui.mapper.register;

import X.AnonymousClass001;
import X.AnonymousClass4GP;
import X.AnonymousClass6C7;
import X.AnonymousClass8WZ;
import X.AnonymousClass97i;
import X.AnonymousClass9LV;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C1897492m;
import X.C196629bS;
import X.C197109ca;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.whatsapp.R;

public final class IndiaUpiMapperLinkActivity extends AnonymousClass97i {
    public TextView A00;
    public C196629bS A01;
    public C197109ca A02;
    public IndiaUpiMapperLinkViewModel A03;
    public boolean A04;
    public final AnonymousClass4GP A05 = new AnonymousClass8WZ(this);

    public final C197109ca A74() {
        C197109ca r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("indiaUpiFieldStatsLogger");
    }

    public void onBackPressed() {
        String str;
        super.onBackPressed();
        C197109ca A74 = A74();
        Integer A0f = AnonymousClass001.A0f();
        if (this.A04) {
            str = "alias_switch_in_progress";
        } else {
            str = "alias_in_progress";
        }
        A74.BKB(A0f, A0f, str, AnonymousClass6C7.A0h(this));
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        AnonymousClass6C7.A0y(this);
        setContentView((int) R.layout.f8nameremoved);
        TextView textView = (TextView) C18290x4.A0N(this, R.id.mapper_link_title);
        C162457s7.A0J(textView, 0);
        this.A00 = textView;
        IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel = (IndiaUpiMapperLinkViewModel) this.A05.invoke();
        C162457s7.A0J(indiaUpiMapperLinkViewModel, 0);
        this.A03 = indiaUpiMapperLinkViewModel;
        if (bundle == null) {
            this.A04 = false;
            TextView textView2 = this.A00;
            if (textView2 != null) {
                textView2.setText(R.string.f11nameremoved);
                IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel2 = this.A03;
                if (indiaUpiMapperLinkViewModel2 != null) {
                    indiaUpiMapperLinkViewModel2.A0D(false);
                } else {
                    throw C18270x1.A0S("indiaUpiMapperLinkViewModel");
                }
            } else {
                throw C18270x1.A0S("titleTextView");
            }
        }
        AnonymousClass9LV.A00(this, R.drawable.onboarding_actionbar_home_close);
        IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel3 = this.A03;
        if (indiaUpiMapperLinkViewModel3 != null) {
            indiaUpiMapperLinkViewModel3.A05.A0B(this, new C1897492m(this, 310));
            onConfigurationChanged(AnonymousClass001.A0M(this));
            C197109ca A74 = A74();
            if (this.A04) {
                str = "alias_switch_in_progress";
            } else {
                str = "alias_in_progress";
            }
            Intent intent = getIntent();
            if (intent != null) {
                str2 = intent.getStringExtra("extra_referral_screen");
            } else {
                str2 = null;
            }
            A74.BKB(0, (Integer) null, str, str2);
            return;
        }
        throw C18270x1.A0S("indiaUpiMapperLinkViewModel");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (C18290x4.A04(menuItem) == 16908332) {
            C197109ca A74 = A74();
            Integer A0f = AnonymousClass001.A0f();
            Integer A0a = C18290x4.A0a();
            if (this.A04) {
                str = "alias_switch_in_progress";
            } else {
                str = "alias_in_progress";
            }
            A74.BKB(A0f, A0a, str, AnonymousClass6C7.A0h(this));
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

package com.whatsapp.payments.ui.mapper.register;

import X.AnonymousClass001;
import X.AnonymousClass5UX;
import X.AnonymousClass6C7;
import X.AnonymousClass97m;
import X.AnonymousClass9LV;
import X.C162457s7;
import X.C166557yt;
import X.C18270x1;
import X.C18290x4;
import X.C18310x6;
import X.C1891290c;
import X.C196629bS;
import X.C197109ca;
import X.C56972sr;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.Me;
import com.whatsapp.R;

public final class IndiaUpiMapperConfirmationActivity extends AnonymousClass97m {
    public ImageView A00;
    public AnonymousClass5UX A01;
    public C196629bS A02;
    public C197109ca A03;

    public void onBackPressed() {
        super.onBackPressed();
        C197109ca r3 = this.A03;
        if (r3 != null) {
            Integer A0f = AnonymousClass001.A0f();
            r3.BKB(A0f, A0f, "alias_complete", AnonymousClass6C7.A0h(this));
            return;
        }
        throw C18270x1.A0S("indiaUpiFieldStatsLogger");
    }

    public void onCreate(Bundle bundle) {
        String A032;
        String str;
        String str2;
        super.onCreate(bundle);
        AnonymousClass6C7.A0y(this);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass9LV.A00(this, R.drawable.onboarding_actionbar_home_close);
        TextView A0L = C18310x6.A0L(this, R.id.payment_name);
        C166557yt r0 = (C166557yt) getIntent().getParcelableExtra("extra_payment_name");
        if (r0 == null || (A032 = (String) r0.A00) == null) {
            A032 = this.A0A.A03();
        }
        A0L.setText(A032);
        int i = 3;
        if (this.A00.A0U()) {
            i = 5;
        }
        A0L.setGravity(i);
        View findViewById = findViewById(R.id.mapper_confirm_done);
        TextView A0L2 = C18310x6.A0L(this, R.id.vpa_id);
        TextView A0L3 = C18310x6.A0L(this, R.id.vpa_alias);
        ImageView imageView = (ImageView) C18290x4.A0N(this, R.id.profile_icon_placeholder);
        C162457s7.A0J(imageView, 0);
        this.A00 = imageView;
        AnonymousClass5UX r1 = this.A01;
        if (r1 != null) {
            r1.A06(imageView, R.drawable.avatar_contact);
            Resources resources = getResources();
            Object[] objArr = new Object[1];
            C196629bS r02 = this.A02;
            if (r02 != null) {
                objArr[0] = r02.A04().A00;
                A0L2.setText(resources.getString(R.string.f11nameremoved, objArr));
                Resources resources2 = getResources();
                Object[] objArr2 = new Object[1];
                C56972sr r03 = this.A01;
                r03.A0P();
                Me me = r03.A00;
                if (me != null) {
                    str = me.number;
                } else {
                    str = null;
                }
                objArr2[0] = str;
                A0L3.setText(resources2.getString(R.string.f11nameremoved, objArr2));
                C1891290c.A00(findViewById, this, 27);
                C197109ca r3 = this.A03;
                if (r3 != null) {
                    Intent intent = getIntent();
                    if (intent != null) {
                        str2 = intent.getStringExtra("extra_referral_screen");
                    } else {
                        str2 = null;
                    }
                    r3.BKB(0, (Integer) null, "alias_complete", str2);
                    return;
                }
                throw C18270x1.A0S("indiaUpiFieldStatsLogger");
            }
            throw C18270x1.A0S("paymentSharedPrefs");
        }
        throw C18270x1.A0S("contactAvatars");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) == 16908332) {
            C197109ca r4 = this.A03;
            if (r4 != null) {
                r4.BKB(AnonymousClass001.A0f(), C18290x4.A0a(), "alias_complete", AnonymousClass6C7.A0h(this));
            } else {
                throw C18270x1.A0S("indiaUpiFieldStatsLogger");
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

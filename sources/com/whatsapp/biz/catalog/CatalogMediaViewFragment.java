package com.whatsapp.biz.catalog;

import X.AnonymousClass000;
import X.AnonymousClass1VX;
import X.AnonymousClass5ZR;
import X.AnonymousClass69C;
import X.AnonymousClass7SV;
import X.C06560Yg;
import X.C105145Tt;
import X.C109015dw;
import X.C111095hX;
import X.C114855ni;
import X.C151257Ua;
import X.C152967aS;
import X.C86634Kw;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public class CatalogMediaViewFragment extends Hilt_CatalogMediaViewFragment {
    public int A00;
    public C111095hX A01;
    public C109015dw A02;
    public C105145Tt A03;
    public C151257Ua A04;
    public C152967aS A05;
    public AnonymousClass5ZR A06;
    public AnonymousClass1VX A07;
    public UserJid A08;
    public AnonymousClass7SV A09;
    public String A0A;

    public void A0a() {
        this.A05.A00();
        super.A0a();
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            this.A05 = new C152967aS(this.A04, this.A09);
            this.A08 = C86634Kw.A0l(bundle2, "cached_jid");
            this.A02 = (C109015dw) bundle2.getParcelable("product");
            this.A00 = bundle2.getInt("target_image_index", 0);
            A1U(new C114855ni(this));
            this.A09.A0F(this.A00, false);
            this.A09.A0G(new AnonymousClass69C(this, 0));
        }
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        if (bundle == null) {
            String str = this.A02.A0F;
            this.A0A = AnonymousClass000.A0Y("_", AnonymousClass000.A0l(str), this.A00);
            Bundle bundle2 = this.A00;
            if (bundle2 != null) {
                this.A0F = true;
                this.A0B.A0D(bundle2, this);
            }
        }
        this.A01.setVisibility(8);
        C06560Yg.A02(view, R.id.title_holder).setClickable(false);
    }
}

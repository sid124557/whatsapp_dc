package com.whatsapp;

import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass30V;
import X.AnonymousClass36P;
import X.AnonymousClass4SG;
import X.AnonymousClass6BN;
import X.C105145Tt;
import X.C107695bk;
import X.C131696e2;
import X.C131706e3;
import X.C131716e4;
import X.C18310x6;
import X.C64333Db;
import X.C86604Kt;
import X.C86624Kv;
import X.C86644Kx;
import X.C86664Kz;
import X.C89144bm;
import X.C95814uZ;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.biz.catalog.viewmodel.ShareProductViewModel;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class ShareProductLinkActivity extends C89144bm {
    public C105145Tt A00;
    public ShareProductViewModel A01;
    public AnonymousClass30V A02;
    public boolean A03;

    public void A5r() {
        if (!this.A03) {
            this.A03 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A00 = C86644Kx.A0P(A2Y);
            this.A02 = C86604Kt.A0f(A2Y);
        }
    }

    public void A66() {
        this.A02.A03((C95814uZ) null, 42);
        super.A66();
    }

    public boolean A6C() {
        return this.A0D.A0X(6547);
    }

    public ShareProductLinkActivity(int i) {
        this.A03 = false;
        C86604Kt.A1K(this, 7);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        A79();
        UserJid A0U = C86624Kv.A0U(AnonymousClass0x7.A0l(this));
        if (!(A0U instanceof PhoneUserJid)) {
            Log.e("share-product-link-activity/invalid-jid");
            finish();
            return;
        }
        this.A01 = (ShareProductViewModel) AnonymousClass0x9.A0H(this).A01(ShareProductViewModel.class);
        String A1J = C86664Kz.A1J(getIntent(), "product_id");
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = "https://wa.me";
        A1X[1] = A1J;
        A1X[2] = AnonymousClass36P.A05(A0U);
        String format = String.format("%s/p/%s/%s", A1X);
        setTitle(R.string.f11nameremoved);
        TextView textView = this.A02;
        if (textView != null) {
            textView.setText(format);
        }
        C18310x6.A0L(this, R.id.share_link_description).setText(R.string.f11nameremoved);
        if (AnonymousClass4SG.A46(this, A0U)) {
            str = AnonymousClass0x2.A0X(this, format, 1, R.string.f11nameremoved);
        } else {
            str = format;
        }
        C131706e3 A78 = A78();
        A78.A00 = str;
        A78.A01 = new AnonymousClass6BN(this, A0U, A1J, 0);
        C131696e2 A76 = A76();
        A76.A00 = format;
        A76.A01 = new AnonymousClass6BN(this, A0U, A1J, 1);
        C131716e4 A77 = A77();
        A77.A02 = str;
        A77.A00 = getString(R.string.f11nameremoved);
        A77.A01 = getString(R.string.f11nameremoved);
        A77.A01 = new AnonymousClass6BN(this, A0U, A1J, 2);
    }

    public ShareProductLinkActivity() {
        this(0);
    }
}

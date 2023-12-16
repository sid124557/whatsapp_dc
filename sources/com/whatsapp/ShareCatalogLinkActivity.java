package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass30V;
import X.AnonymousClass4SG;
import X.AnonymousClass6BF;
import X.C105145Tt;
import X.C107695bk;
import X.C116985rC;
import X.C131696e2;
import X.C131706e3;
import X.C131716e4;
import X.C18310x6;
import X.C64333Db;
import X.C86604Kt;
import X.C86624Kv;
import X.C86644Kx;
import X.C88744aj;
import X.C89144bm;
import X.C95814uZ;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;

public class ShareCatalogLinkActivity extends C89144bm {
    public C116985rC A00;
    public C105145Tt A01;
    public AnonymousClass30V A02;
    public boolean A03;

    public void A5r() {
        if (!this.A03) {
            this.A03 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A01 = C86644Kx.A0P(A2Y);
            this.A02 = C86604Kt.A0f(A2Y);
            this.A00 = C88744aj.A00;
        }
    }

    public void A66() {
        this.A02.A03((C95814uZ) null, 41);
        super.A66();
    }

    public boolean A6C() {
        return this.A0D.A0X(6547);
    }

    public ShareCatalogLinkActivity(int i) {
        this.A03 = false;
        C86604Kt.A1K(this, 5);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        A79();
        C116985rC r1 = this.A00;
        if (r1.A07()) {
            r1.A04();
            this.A06.A0H();
            throw AnonymousClass001.A0g("markRetired");
        }
        UserJid A0U = C86624Kv.A0U(AnonymousClass0x7.A0l(this));
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = "https://wa.me";
        A0M[1] = A0U.user;
        String format = String.format("%s/c/%s", A0M);
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
        A78.A01 = new AnonymousClass6BF(this, A0U, 0);
        C131696e2 A76 = A76();
        A76.A00 = format;
        A76.A01 = new AnonymousClass6BF(this, A0U, 1);
        C131716e4 A77 = A77();
        A77.A02 = str;
        A77.A00 = getString(R.string.f11nameremoved);
        A77.A01 = getString(R.string.f11nameremoved);
        A77.A01 = new AnonymousClass6BF(this, A0U, 2);
    }

    public ShareCatalogLinkActivity() {
        this(0);
    }
}

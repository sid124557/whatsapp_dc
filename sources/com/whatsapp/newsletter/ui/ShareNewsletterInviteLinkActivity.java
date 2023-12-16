package com.whatsapp.newsletter.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1RL;
import X.AnonymousClass31A;
import X.AnonymousClass4SG;
import X.AnonymousClass59F;
import X.AnonymousClass5YD;
import X.AnonymousClass5Yj;
import X.C107695bk;
import X.C109705f3;
import X.C131696e2;
import X.C131706e3;
import X.C131716e4;
import X.C162457s7;
import X.C175738Zn;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C56982ss;
import X.C626936e;
import X.C64333Db;
import X.C86604Kt;
import X.C89144bm;
import X.C95804uY;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;

public final class ShareNewsletterInviteLinkActivity extends C89144bm {
    public C131696e2 A00;
    public C131716e4 A01;
    public C131706e3 A02;
    public C131706e3 A03;
    public C56982ss A04;
    public AnonymousClass1RL A05;
    public C95804uY A06;
    public AnonymousClass59F A07;
    public AnonymousClass5YD A08;
    public boolean A09;

    public void A5r() {
        if (!this.A09) {
            this.A09 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A04 = C64333Db.A39(A2Y);
            this.A08 = (AnonymousClass5YD) A2Y.ANq.get();
        }
    }

    public void A7A(C131716e4 r6) {
        AnonymousClass5YD r4 = this.A08;
        if (r4 != null) {
            C95804uY r3 = this.A06;
            if (r3 == null) {
                throw C18270x1.A0S("jid");
            }
            r4.A07(r3, this.A07, 3, 4);
            super.A7A(r6);
            return;
        }
        throw C18270x1.A0S("newsletterLogging");
    }

    public void A7B(C131706e3 r6) {
        AnonymousClass5YD r4 = this.A08;
        if (r4 != null) {
            C95804uY r3 = this.A06;
            if (r3 == null) {
                throw C18270x1.A0S("jid");
            }
            r4.A07(r3, this.A07, 2, 4);
            super.A7B(r6);
            return;
        }
        throw C18270x1.A0S("newsletterLogging");
    }

    public void A7C(C131706e3 r6) {
        AnonymousClass5YD r4 = this.A08;
        if (r4 != null) {
            C95804uY r3 = this.A06;
            if (r3 == null) {
                throw C18270x1.A0S("jid");
            }
            r4.A07(r3, this.A07, 1, 4);
            super.A7C(r6);
            return;
        }
        throw C18270x1.A0S("newsletterLogging");
    }

    public final void A7D() {
        AnonymousClass1RL r0 = this.A05;
        if (r0 == null) {
            throw C18270x1.A0S("newsletterInfo");
        }
        String str = r0.A0G;
        if (str == null || C175738Zn.A0V(str)) {
            A7E(false);
            this.A02.setText(" \n ");
            return;
        }
        String A0V = AnonymousClass000.A0V("https://whatsapp.com/channel/", str, AnonymousClass001.A0o());
        this.A02.setText(A0V);
        AnonymousClass5Yj.A0B(this, this.A02, R.attr.f3nameremoved, R.color.f5nameremoved);
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass1RL r02 = this.A05;
        if (r02 == null) {
            throw C18270x1.A0S("newsletterInfo");
        }
        A0M[0] = r02.A0H;
        String A0e = C18300x5.A0e(this, str, A0M, 1, R.string.f11nameremoved);
        C131716e4 r4 = this.A01;
        if (r4 == null) {
            throw C18270x1.A0S("shareBtn");
        }
        r4.A02 = A0e;
        Object[] objArr = new Object[1];
        AnonymousClass1RL r03 = this.A05;
        if (r03 == null) {
            throw C18270x1.A0S("newsletterInfo");
        }
        r4.A01 = AnonymousClass002.A0F(this, r03.A0H, objArr, 0, R.string.f11nameremoved);
        C131716e4 r1 = this.A01;
        if (r1 == null) {
            throw C18270x1.A0S("shareBtn");
        }
        r1.A00 = getString(R.string.f11nameremoved);
        C131706e3 r04 = this.A02;
        if (r04 == null) {
            throw C18270x1.A0S("sendViaWhatsAppBtn");
        }
        r04.A00 = A0e;
        C131706e3 r05 = this.A03;
        if (r05 == null) {
            throw C18270x1.A0S("shareToStatusBtn");
        }
        r05.A00 = A0e;
        C131696e2 r06 = this.A00;
        if (r06 == null) {
            throw C18270x1.A0S("copyBtn");
        }
        r06.A00 = A0V;
    }

    public final void A7E(boolean z) {
        this.A02.setEnabled(z);
        C131696e2 r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("copyBtn");
        }
        r0.A00.setEnabled(z);
        C131716e4 r02 = this.A01;
        if (r02 == null) {
            throw C18270x1.A0S("shareBtn");
        }
        r02.A00.setEnabled(z);
        C131706e3 r03 = this.A02;
        if (r03 == null) {
            throw C18270x1.A0S("sendViaWhatsAppBtn");
        }
        r03.A00.setEnabled(z);
    }

    public ShareNewsletterInviteLinkActivity(int i) {
        this.A09 = false;
        C86604Kt.A1K(this, 70);
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass59F r1;
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        A79();
        C95804uY A012 = C95804uY.A03.A01(getIntent().getStringExtra("jid"));
        C626936e.A06(A012);
        C162457s7.A0D(A012);
        this.A06 = A012;
        int intExtra = getIntent().getIntExtra("entry_point", 0);
        AnonymousClass59F[] values = AnonymousClass59F.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r1 = null;
                break;
            }
            r1 = values[i];
            if (r1.value == intExtra) {
                break;
            }
            i++;
        }
        this.A07 = r1;
        C56982ss r12 = this.A04;
        if (r12 != null) {
            C95804uY r0 = this.A06;
            if (r0 == null) {
                throw C18270x1.A0S("jid");
            }
            AnonymousClass31A A0A = r12.A0A(r0, false);
            C162457s7.A0K(A0A, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
            this.A05 = (AnonymousClass1RL) A0A;
            this.A02 = A78();
            C131706e3 r3 = new C131706e3();
            C109705f3 r2 = new C109705f3((Object) this, 7, (Object) r3);
            r3.A00 = A75();
            r3.A00(r2, getString(R.string.f11nameremoved), R.drawable.ic_add_to_status);
            this.A03 = r3;
            this.A00 = A76();
            this.A01 = A77();
            ((TextView) C18290x4.A0N(this, R.id.share_link_description)).setText(R.string.f11nameremoved);
            A7E(true);
            A5n(false);
            A7D();
            return;
        }
        throw C18270x1.A0S("chatsCache");
    }

    public void onResume() {
        super.onResume();
        A7D();
    }

    public ShareNewsletterInviteLinkActivity() {
        this(0);
    }
}

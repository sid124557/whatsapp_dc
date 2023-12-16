package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass002;
import X.AnonymousClass214;
import X.C111095hX;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C369220g;
import X.C55312q9;
import X.C61242zw;
import X.C73153f1;
import X.C838349y;
import X.C95814uZ;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public class ConsumerMarketingDisclosureFragment extends Hilt_ConsumerMarketingDisclosureFragment implements C838349y {
    public C111095hX A00;
    public C55312q9 A01;
    public boolean A02;
    public final C95814uZ A03;
    public final C61242zw A04;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        AnonymousClass214 A1Y = A1Y();
        AnonymousClass214 r2 = AnonymousClass214.INFO;
        if (A1Y != r2) {
            this.A04.A05.A00(C369220g.MARKETING_MESSAGE);
        }
        if (A1Y() == AnonymousClass214.NON_BLOCKING_DISCLOSURE && !this.A02) {
            this.A04.A01(this.A03);
            this.A02 = true;
        }
        if (A1Y() == r2) {
            TextView A09 = AnonymousClass002.A09(view, R.id.action);
            view.findViewById(R.id.cancel).setVisibility(8);
            A09.setVisibility(0);
            C18290x4.A1G(A09, this, 41);
            A09.setText(R.string.f11nameremoved);
        }
        int ordinal = A1Y().ordinal();
        int i = 1;
        if (ordinal != 0) {
            i = 2;
            if (ordinal == 1) {
                i = 0;
            } else if (ordinal != 2) {
                throw C73153f1.A00();
            }
        }
        C55312q9 A1a = A1a();
        C95814uZ r3 = this.A03;
        C162457s7.A0J(r3, 0);
        A1a.A04(r3, (Integer) null, (Integer) null, Integer.valueOf(i), (Integer) null, (Integer) null, 3);
    }

    public final C55312q9 A1a() {
        C55312q9 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("disclosureLoggingUtil");
    }

    public ConsumerMarketingDisclosureFragment(C95814uZ r1, C61242zw r2) {
        this.A03 = r1;
        this.A04 = r2;
    }

    public void A0c() {
        C55312q9 A1a = A1a();
        C95814uZ r2 = this.A03;
        C162457s7.A0J(r2, 0);
        A1a.A04(r2, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 4);
        super.A0c();
    }
}

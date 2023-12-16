package com.whatsapp.bizintegrity.marketingoptout;

import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass35Y;
import X.AnonymousClass7PT;
import X.C111095hX;
import X.C29301ib;
import X.C61012zY;
import X.C620633i;
import X.C69263Wi;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import com.whatsapp.R;
import com.whatsapp.bizintegrity.utils.BizIntegrityFragment;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Map;

public class MarketingReOptInFragment extends BizIntegrityFragment {
    public Context A00;
    public C61012zY A01;
    public C29301ib A02;
    public UserJid A03;
    public String A04;

    public MarketingReOptInFragment(Context context, C111095hX r9, C69263Wi r10, C61012zY r11, AnonymousClass7PT r12, C29301ib r13, C620633i r14, AnonymousClass1VX r15, UserJid userJid, String str) {
        super(r9, r10, r12, r14, r15);
        this.A03 = userJid;
        this.A01 = r11;
        this.A04 = str;
        this.A02 = r13;
        this.A00 = context;
    }

    public void A1Y() {
        this.A01.A02(this.A03, (String) null, this.A04, 1);
        A1K();
    }

    public void A1a(LayoutInflater layoutInflater) {
        A1b(this.A02, R.id.marketing_opt_out_stop, R.string.f11nameremoved);
        A1b(this.A02, R.id.marketing_opt_out_offers, R.string.f11nameremoved);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C29301ib r1 = this.A02;
        if (r1 != null) {
            r1.A09(this.A03);
        }
        super.onDismiss(dialogInterface);
    }

    public Map A1X() {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("stop-business-info", new AnonymousClass35Y(this, 2));
        A0t.put("offers-updates", new AnonymousClass35Y(this, 3));
        return A0t;
    }

    public void A1Z() {
    }
}

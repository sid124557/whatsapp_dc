package com.whatsapp.bizintegrity.marketingoptout;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass35Y;
import X.AnonymousClass7PT;
import X.C111095hX;
import X.C29301ib;
import X.C43492Si;
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

public class MarketingOptOutFragment extends BizIntegrityFragment {
    public Context A00;
    public C43492Si A01;
    public C29301ib A02;
    public UserJid A03;
    public String A04;

    public MarketingOptOutFragment(Context context, C111095hX r9, C69263Wi r10, C43492Si r11, AnonymousClass7PT r12, C29301ib r13, C620633i r14, AnonymousClass1VX r15, UserJid userJid, String str) {
        super(r9, r10, r12, r14, r15);
        this.A01 = r11;
        this.A03 = userJid;
        this.A04 = str;
        this.A02 = r13;
        this.A00 = context;
    }

    public void A1a(LayoutInflater layoutInflater) {
        A1b(this.A02, R.id.marketing_opt_out_resume, R.string.f11nameremoved);
        A1b(this.A02, R.id.marketing_opt_out_text, R.string.f11nameremoved);
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
        A0t.put("resume-business-info", new AnonymousClass35Y(this, 0));
        A0t.put("intro-warning", new AnonymousClass35Y(this, 1));
        return A0t;
    }

    public void A1Y() {
        A1K();
        C43492Si r3 = this.A01;
        UserJid userJid = this.A03;
        AnonymousClass7PT r4 = new AnonymousClass7PT((Integer) null, (Integer) null, (Integer) null, Integer.valueOf(R.string.f11nameremoved), Integer.valueOf(R.string.f11nameremoved), R.layout.f8nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
        AnonymousClass1VX r12 = r3.A06;
        C69263Wi r7 = r3.A01;
        AnonymousClass7PT r9 = r4;
        MarketingOptOutReasonsFragment marketingOptOutReasonsFragment = new MarketingOptOutReasonsFragment(r3.A00, r7, r3.A02, r9, r3.A03, r3.A04, r12, userJid);
        marketingOptOutReasonsFragment.A1O(A0U(), AnonymousClass000.A0O(marketingOptOutReasonsFragment));
    }

    public void A1Z() {
        A1K();
    }
}

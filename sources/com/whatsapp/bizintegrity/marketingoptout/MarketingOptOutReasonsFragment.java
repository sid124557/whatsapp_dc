package com.whatsapp.bizintegrity.marketingoptout;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass7PT;
import X.C109425eb;
import X.C111095hX;
import X.C18310x6;
import X.C29301ib;
import X.C41152Jd;
import X.C61012zY;
import X.C620633i;
import X.C69263Wi;
import X.C85854Hw;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.bizintegrity.utils.BizIntegrityFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

public class MarketingOptOutReasonsFragment extends BizIntegrityFragment {
    public static final C41152Jd[] A08 = {new C41152Jd("too_many_messages", R.string.f11nameremoved), new C41152Jd("no_sign_up", R.string.f11nameremoved), new C41152Jd("no_sign_up", R.string.f11nameremoved), new C41152Jd("no_longer_relevant", R.string.f11nameremoved)};
    public View.OnClickListener A00 = new C109425eb(this, 4);
    public C61012zY A01;
    public C41152Jd A02;
    public C29301ib A03;
    public UserJid A04;
    public List A05;
    public boolean A06 = false;
    public final CompoundButton.OnCheckedChangeListener A07 = new C85854Hw(this, 0);

    public MarketingOptOutReasonsFragment(C111095hX r9, C69263Wi r10, C61012zY r11, AnonymousClass7PT r12, C29301ib r13, C620633i r14, AnonymousClass1VX r15, UserJid userJid) {
        super(r9, r10, r12, r14, r15);
        this.A04 = userJid;
        this.A01 = r11;
        this.A02 = null;
        this.A03 = r13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r1 != r3) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(android.widget.RadioButton r3, com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment r4) {
        /*
            r2 = 0
        L_0x0001:
            java.util.List r0 = r4.A05
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x0025
            java.util.List r0 = r4.A05
            java.lang.Object r1 = r0.get(r2)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            if (r1 == 0) goto L_0x0016
            r0 = 1
            if (r1 == r3) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r1.setChecked(r0)
            if (r0 == 0) goto L_0x0022
            X.2Jd[] r0 = A08
            r0 = r0[r2]
            r4.A02 = r0
        L_0x0022:
            int r2 = r2 + 1
            goto L_0x0001
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment.A00(android.widget.RadioButton, com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment):void");
    }

    public void A1Y() {
        this.A06 = true;
        A1K();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        C41152Jd r0;
        C61012zY r4 = this.A01;
        UserJid userJid = this.A04;
        if (!this.A06 || (r0 = this.A02) == null) {
            str = null;
        } else {
            str = r0.A01;
        }
        r4.A02(userJid, str, "quick_action", 0);
        super.onDismiss(dialogInterface);
    }

    public void A1Z() {
        A1K();
    }

    public void A1a(LayoutInflater layoutInflater) {
        this.A05 = AnonymousClass001.A0s();
        for (C41152Jd r7 : A08) {
            View A0H = C18310x6.A0H(layoutInflater, R.layout.f8nameremoved);
            TextView A09 = AnonymousClass002.A09(A0H, R.id.biz_integrity_row_text);
            CompoundButton compoundButton = (CompoundButton) A0H.findViewById(R.id.biz_integrity_radio_button);
            compoundButton.setOnCheckedChangeListener(this.A07);
            A09.setText(r7.A00);
            A0H.setOnClickListener(this.A00);
            this.A05.add(compoundButton);
            this.A02.addView(A0H);
        }
    }
}

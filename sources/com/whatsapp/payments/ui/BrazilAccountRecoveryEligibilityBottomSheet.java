package com.whatsapp.payments.ui;

import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass9PR;
import X.C06560Yg;
import X.C08310eF;
import X.C107635bd;
import X.C111095hX;
import X.C203499no;
import X.C204249p3;
import X.C620633i;
import X.C626936e;
import X.C69263Wi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class BrazilAccountRecoveryEligibilityBottomSheet extends Hilt_BrazilAccountRecoveryEligibilityBottomSheet {
    public C111095hX A00;
    public C69263Wi A01;
    public C620633i A02;
    public AnonymousClass1VX A03;
    public C203499no A04;
    public AnonymousClass9PR A05;
    public String A06;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A06 = A0H().getString("referral_screen");
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        Context context = inflate.getContext();
        AnonymousClass1VX r10 = this.A03;
        C69263Wi r7 = this.A01;
        C111095hX r6 = this.A00;
        C620633i r9 = this.A02;
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(inflate, R.id.desc);
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = "learn-more";
        C107635bd.A0E(context, Uri.parse("https://faq.whatsapp.com/1085240205511877"), r6, r7, A0K, r9, r10, C08310eF.A09(this).getString(R.string.f11nameremoved, A0L), "learn-more");
        return inflate;
    }

    public void A0d() {
        super.A0d();
        this.A05 = null;
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        C204249p3.A02(C06560Yg.A02(view, R.id.use_existing_payments_button), this, 12);
        C204249p3.A02(C06560Yg.A02(view, R.id.close), this, 13);
        C204249p3.A02(C06560Yg.A02(view, R.id.setup_payments_button), this, 14);
        String str = this.A06;
        C203499no r1 = this.A04;
        C626936e.A06(r1);
        r1.BKB(0, (Integer) null, "prompt_recover_payments", str);
    }
}

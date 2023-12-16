package com.whatsapp.payments.ui;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass39Q;
import X.AnonymousClass5X8;
import X.AnonymousClass9NL;
import X.AnonymousClass9VG;
import X.AnonymousClass9Wg;
import X.C08310eF;
import X.C106715a2;
import X.C194869Uu;
import X.C199529gj;
import X.C203499no;
import X.C56612sH;
import X.C620633i;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class PaymentIncentiveViewFragment extends Hilt_PaymentIncentiveViewFragment {
    public AnonymousClass5X8 A00;
    public C620633i A01;
    public C56612sH A02;
    public AnonymousClass1VX A03;
    public AnonymousClass9NL A04;
    public C106715a2 A05;
    public final C203499no A06;
    public final AnonymousClass9VG A07;

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        AnonymousClass9VG r2 = this.A07;
        C194869Uu r7 = r2.A01;
        AnonymousClass9Wg.A03(AnonymousClass9Wg.A00(this.A02, (AnonymousClass39Q) null, r2, (String) null, true), this.A06, "incentive_details", "new_payment");
        if (r7 == null) {
            Log.e("PAY: PaymentIncentiveViewFragment/PaymentIncentiveOfferInfo is null or has null items in it");
            return;
        }
        this.A02.setText(r7.A0F);
        String str = r7.A0C;
        if (!TextUtils.isEmpty(str)) {
            C106715a2 r8 = this.A05;
            Context context = this.A00.getContext();
            Object[] A0M = AnonymousClass002.A0M();
            A0M[0] = r7.A0B;
            A0M[1] = "learn-more";
            String[] strArr = new String[1];
            AnonymousClass0x7.A1E(this.A00.A00(str), strArr, 0);
            SpannableString A042 = r8.A04(context, C08310eF.A09(this).getString(R.string.f11nameremoved, A0M), new Runnable[]{new C199529gj(this)}, new String[]{"learn-more"}, strArr);
            AnonymousClass0x2.A12(this.A00, this.A01);
            AnonymousClass0x2.A14(this.A03, this.A00);
            this.A00.setText(A042);
            return;
        }
        this.A00.setText(r7.A0B);
    }

    public PaymentIncentiveViewFragment(C203499no r1, AnonymousClass9VG r2) {
        this.A07 = r2;
        this.A06 = r1;
    }

    public void A0d() {
        super.A0d();
        this.A04 = null;
    }
}

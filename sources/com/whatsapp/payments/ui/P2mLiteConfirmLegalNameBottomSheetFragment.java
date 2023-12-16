package com.whatsapp.payments.ui;

import X.AnonymousClass1VX;
import X.AnonymousClass5X8;
import X.C08310eF;
import X.C106715a2;
import X.C162457s7;
import X.C171658Hx;
import X.C18270x1;
import X.C57062t0;
import X.C58422vE;
import X.C626936e;
import X.C69933Zf;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;

public final class P2mLiteConfirmLegalNameBottomSheetFragment extends Hilt_P2mLiteConfirmLegalNameBottomSheetFragment {
    public C171658Hx A00;
    public String A01;
    public String A02;

    public void A1K(Integer num, String str, String str2, int i) {
        String str3 = str;
        C162457s7.A0J(str, 2);
        C171658Hx r0 = this.A00;
        if (r0 != null) {
            r0.A01(C57062t0.A00(), num, str3, str2, this.A02, this.A01, i, true);
            return;
        }
        throw C18270x1.A0S("p2mLiteEventLogger");
    }

    public CharSequence A1J() {
        C106715a2 r5 = this.A0C;
        if (r5 != null) {
            Context A1D = A1D();
            String string = C08310eF.A09(this).getString(R.string.f11nameremoved);
            String[] strArr = {"p2m-lite-desc-link"};
            String[] strArr2 = new String[1];
            AnonymousClass5X8 r3 = this.A06;
            if (r3 != null) {
                AnonymousClass1VX r2 = this.A08;
                if (r2 != null) {
                    String A0R = r2.A0R(C58422vE.A02, 2672);
                    C626936e.A06(A0R);
                    strArr2[0] = r3.A00(A0R).toString();
                    return r5.A04(A1D, string, new Runnable[]{new C69933Zf(this)}, strArr, strArr2);
                }
                throw C18270x1.A0R();
            }
            throw C18270x1.A0S("waLinkFactory");
        }
        throw C18270x1.A0S("linkifier");
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        Bundle A0H = A0H();
        this.A01 = A0H.getString("extra_payment_config_id");
        this.A02 = A0H.getString("extra_order_type");
    }
}

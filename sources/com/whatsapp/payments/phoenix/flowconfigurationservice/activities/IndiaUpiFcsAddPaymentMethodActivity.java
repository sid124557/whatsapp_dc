package com.whatsapp.payments.phoenix.flowconfigurationservice.activities;

import X.AnonymousClass0O1;
import X.AnonymousClass1Ha;
import X.AnonymousClass2CT;
import X.AnonymousClass4KP;
import X.AnonymousClass9CO;
import X.C003403v;
import X.C162457s7;
import X.C18270x1;
import X.C18320x8;
import X.C44512Wi;
import X.C44522Wj;
import X.C58422vE;
import android.content.Intent;
import android.os.Bundle;

public final class IndiaUpiFcsAddPaymentMethodActivity extends AnonymousClass9CO {
    public AnonymousClass2CT A00;
    public C44512Wi A01;
    public C44522Wj A02;
    public String A03;

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (this.A00 != null) {
            C44512Wi r0 = new C44512Wi(this);
            this.A01 = r0;
            if (r0.A00(bundle)) {
                String A1r = AnonymousClass1Ha.A1r(this);
                C162457s7.A0H(A1r);
                this.A03 = A1r;
                AnonymousClass0O1 Bid = Bid(new AnonymousClass4KP(this, 7), new C003403v());
                boolean z = !this.A0I.A0C();
                boolean A0C = this.A0I.A0C();
                boolean A0Y = this.A0D.A0Y(C58422vE.A02, 5601);
                Intent A07 = C18320x8.A07();
                String packageName = getPackageName();
                if (A0Y) {
                    str = "com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity";
                } else {
                    str = "com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld";
                }
                A07.setClassName(packageName, str);
                A07.putExtra("extra_payments_entry_type", 6);
                A07.putExtra("extra_is_first_payment_method", z);
                A07.putExtra("extra_skip_value_props_display", A0C);
                Bid.A01(A07);
                return;
            }
            return;
        }
        throw C18270x1.A0S("fcsActivityLifecycleManagerFactory");
    }
}

package com.whatsapp.payments.phoenix.flowconfigurationservice.activities;

import X.AnonymousClass001;
import X.AnonymousClass0O1;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass2CT;
import X.AnonymousClass4KP;
import X.AnonymousClass9CP;
import X.C003403v;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18320x8;
import X.C44512Wi;
import X.C44522Wj;
import android.content.Intent;
import android.os.Bundle;

public final class IndiaUpiFcsConsumerOnboardingActivity extends AnonymousClass9CP {
    public AnonymousClass2CT A00;
    public C44512Wi A01;
    public C44522Wj A02;
    public String A03;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.A00 != null) {
            C44512Wi r0 = new C44512Wi(this);
            this.A01 = r0;
            Class<IndiaUpiFcsConsumerOnboardingActivity> cls = IndiaUpiFcsConsumerOnboardingActivity.class;
            if (!r0.A00(bundle)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A0N(cls, A0o);
                C18260x0.A1K(A0o, ": Activity cannot be launch because it is no longer safe to create this activity");
                return;
            }
            String A1r = AnonymousClass1Ha.A1r(this);
            if (A1r != null) {
                this.A03 = A1r;
                boolean booleanExtra = getIntent().getBooleanExtra("extra_onboarding_skip_2fa", true);
                boolean booleanExtra2 = getIntent().getBooleanExtra("extra_is_full_screen", true);
                boolean A1N = AnonymousClass0x9.A1N(getIntent(), "extra_skip_value_props_screen");
                AnonymousClass0O1 Bid = Bid(new AnonymousClass4KP(this, 8), new C003403v());
                int i = 11;
                if (booleanExtra2) {
                    i = 9;
                }
                int A002 = C18280x3.A00(booleanExtra ? 1 : 0);
                Intent A07 = C18320x8.A07();
                A07.setClassName(getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity");
                A07.putExtra("extra_payments_entry_type", i);
                A07.putExtra("extra_setup_mode", A002);
                A07.putExtra("extra_is_first_payment_method", !this.A0I.A0C());
                A07.putExtra("extra_skip_value_props_display", A1N);
                Bid.A01(A07);
                return;
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C18260x0.A0N(cls, A0o2);
            throw AnonymousClass0x2.A0V(": FDS Manager ID is null", A0o2);
        }
        throw C18270x1.A0S("fcsActivityLifecycleManagerFactory");
    }
}

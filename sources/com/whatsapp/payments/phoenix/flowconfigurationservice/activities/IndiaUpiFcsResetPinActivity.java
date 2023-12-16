package com.whatsapp.payments.phoenix.flowconfigurationservice.activities;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass2CT;
import X.AnonymousClass4KP;
import X.AnonymousClass8EA;
import X.AnonymousClass9CQ;
import X.C003403v;
import X.C133686hm;
import X.C166587yw;
import X.C18260x0;
import X.C18270x1;
import X.C44512Wi;
import X.C44522Wj;
import android.os.Bundle;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;

public final class IndiaUpiFcsResetPinActivity extends AnonymousClass9CQ {
    public AnonymousClass2CT A00;
    public C44512Wi A01;
    public C44522Wj A02;
    public String A03;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.A00 != null) {
            C44512Wi r0 = new C44512Wi(this);
            this.A01 = r0;
            Class<IndiaUpiFcsResetPinActivity> cls = IndiaUpiFcsResetPinActivity.class;
            if (!r0.A00(bundle)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A0N(cls, A0o);
                C18260x0.A1K(A0o, ": Activity cannot be launch because it is no longer safe to create this activity");
                finish();
                return;
            }
            String A1r = AnonymousClass1Ha.A1r(this);
            if (A1r != null) {
                this.A03 = A1r;
                String stringExtra = getIntent().getStringExtra("extra_credential_id");
                if (stringExtra != null) {
                    C166587yw A002 = AnonymousClass8EA.A00(stringExtra, this.A0P.A0B().A0B());
                    if (A002 != null) {
                        boolean A1N = AnonymousClass0x9.A1N(getIntent(), "extra_is_forget_pin");
                        Bid(new AnonymousClass4KP(this, 9), new C003403v()).A01(IndiaUpiPinPrimerFullSheetActivity.A0C(this, (C133686hm) A002, this.A0a, A1N));
                        return;
                    }
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    C18260x0.A0N(cls, A0o2);
                    throw AnonymousClass0x2.A0V(": Payment method does not exist with credential ID", A0o2);
                }
                StringBuilder A0o3 = AnonymousClass001.A0o();
                C18260x0.A0N(cls, A0o3);
                throw AnonymousClass0x2.A0V(": Credential ID is null", A0o3);
            }
            StringBuilder A0o4 = AnonymousClass001.A0o();
            C18260x0.A0N(cls, A0o4);
            throw AnonymousClass0x2.A0V(": FDS Manager ID is null", A0o4);
        }
        throw C18270x1.A0S("fcsActivityLifecycleManagerFactory");
    }
}

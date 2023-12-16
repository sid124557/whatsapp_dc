package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass1YF;
import X.AnonymousClass214;
import X.AnonymousClass4FV;
import X.AnonymousClass66R;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C369220g;
import X.C49202g9;
import X.C58272uz;
import X.C77833u2;
import X.C95814uZ;
import android.content.DialogInterface;
import android.os.Bundle;

public final class ConsumerDisclosureFragment extends Hilt_ConsumerDisclosureFragment {
    public C49202g9 A00;
    public C58272uz A01;
    public final C95814uZ A02;
    public final Boolean A03;
    public final AnonymousClass66R A04 = C154517dI.A01(new C77833u2(this));

    public void onCancel(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onCancel(dialogInterface);
        C58272uz r1 = this.A01;
        if (r1 != null) {
            AnonymousClass214 A1Y = A1Y();
            if (A1Y != AnonymousClass214.BLOCKING_DISCLOSURE) {
                AnonymousClass4FV r2 = r1.A00;
                AnonymousClass1YF r12 = new AnonymousClass1YF();
                r12.A01 = Integer.valueOf(C58272uz.A00(A1Y));
                AnonymousClass1YF.A00(r2, r12, 5);
                return;
            }
            return;
        }
        throw C18270x1.A0S("dataSharingCtwaDisclosureLogger");
    }

    public ConsumerDisclosureFragment(C95814uZ r2, Boolean bool) {
        this.A02 = r2;
        this.A03 = bool;
    }

    public void A0p(Bundle bundle) {
        AnonymousClass214[] values = AnonymousClass214.values();
        Bundle bundle2 = this.A06;
        int i = 0;
        if (bundle2 != null) {
            i = bundle2.getInt("blocking_key", 0);
        }
        AnonymousClass214 r1 = values[i];
        C162457s7.A0J(r1, 0);
        this.A05 = r1;
        if (bundle == null) {
            C58272uz r12 = this.A01;
            if (r12 != null) {
                AnonymousClass214 A1Y = A1Y();
                if (A1Y != AnonymousClass214.BLOCKING_DISCLOSURE) {
                    AnonymousClass4FV r2 = r12.A00;
                    AnonymousClass1YF r13 = new AnonymousClass1YF();
                    r13.A01 = Integer.valueOf(C58272uz.A00(A1Y));
                    AnonymousClass1YF.A00(r2, r13, 0);
                }
                if (A1Y() != AnonymousClass214.INFO) {
                    C49202g9 r14 = this.A00;
                    if (r14 != null) {
                        r14.A00(C369220g.CTWA);
                    } else {
                        throw C18270x1.A0S("consumerDisclosureCooldownManager");
                    }
                }
            } else {
                throw C18270x1.A0S("dataSharingCtwaDisclosureLogger");
            }
        }
        super.A0p(bundle);
    }
}

package com.whatsapp.product.reporttoadmin;

import X.AnonymousClass22M;
import X.AnonymousClass2z0;
import X.C107395bF;
import X.C162457s7;
import X.C18270x1;
import X.C44652Wy;
import X.C47922e3;
import X.C55832qz;
import X.C624134x;
import X.C69263Wi;
import X.C95814uZ;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;

public final class ReportToAdminDialogFragment extends Hilt_ReportToAdminDialogFragment {
    public C69263Wi A00;
    public C47922e3 A01;
    public C624134x A02;
    public C44652Wy A03;
    public RtaXmppClient A04;
    public C55832qz A05;
    public boolean A06;

    public void onDismiss(DialogInterface dialogInterface) {
        String rawString;
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C624134x r0 = this.A02;
        if (r0 == null) {
            throw C18270x1.A0S("selectedMessage");
        }
        C95814uZ r02 = r0.A1J.A00;
        if (r02 != null && (rawString = r02.getRawString()) != null) {
            boolean z = this.A06;
            C44652Wy r1 = this.A03;
            if (r1 != null) {
                int i = 3;
                if (z) {
                    i = 2;
                }
                r1.A00(i, rawString);
                return;
            }
            throw C18270x1.A0S("rtaLoggingUtils");
        }
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        AnonymousClass2z0 A032 = C107395bF.A03(A0H(), "");
        C55832qz r0 = this.A05;
        if (r0 != null) {
            C624134x A052 = r0.A05(A032);
            if (A052 == null) {
                C47922e3 r2 = this.A01;
                if (r2 != null) {
                    r2.A01(AnonymousClass22M.A0K, (String) null);
                    return;
                }
                throw C18270x1.A0S("crashLogsWrapper");
            }
            this.A02 = A052;
            return;
        }
        throw C18270x1.A0S("fMessageDatabase");
    }
}

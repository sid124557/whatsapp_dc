package com.whatsapp.status.audienceselector;

import X.AnonymousClass3FH;
import X.AnonymousClass4SG;
import X.AnonymousClass5TZ;
import X.C107695bk;
import X.C108845de;
import X.C44132Uu;
import X.C49712gy;
import X.C64333Db;
import X.C86604Kt;
import X.C86634Kw;
import X.C88834as;

public final class StatusTemporalRecipientsActivity extends StatusRecipientsActivity {
    public C108845de A00;
    public AnonymousClass5TZ A01;
    public boolean A02;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r2 = A2X.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3D(this, r2);
            this.A03 = C86634Kw.A0h(r2);
            this.A01 = (C49712gy) r2.AaZ.get();
            this.A04 = C86634Kw.A0q(r2);
            this.A00 = (C44132Uu) A2X.A1U.get();
            this.A02 = (AnonymousClass3FH) r1.ABa.get();
            this.A01 = C107695bk.A5D(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r0 == null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C108845de A7B() {
        /*
            r6 = this;
            X.5de r0 = r6.A00
            if (r0 != 0) goto L_0x003b
            android.os.Bundle r1 = X.C86614Ku.A0D(r6)
            if (r1 == 0) goto L_0x0014
            X.5TZ r0 = r6.A01
            if (r0 == 0) goto L_0x0043
            X.5de r0 = r0.A00(r1)
            if (r0 != 0) goto L_0x0039
        L_0x0014:
            X.33e r0 = r6.A03
            if (r0 == 0) goto L_0x003c
            int r3 = r0.A02()
            java.util.List r0 = r6.A75()
            r4 = 0
            X.C162457s7.A0J(r0, r4)
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r0)
            java.util.List r0 = r6.A76()
            X.C162457s7.A0J(r0, r4)
            java.util.ArrayList r2 = X.AnonymousClass002.A0J(r0)
            X.5de r0 = new X.5de
            r5 = r4
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0039:
            r6.A00 = r0
        L_0x003b:
            return r0
        L_0x003c:
            java.lang.String r0 = "statusStore"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0043:
            java.lang.String r0 = "statusAudienceRepository"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity.A7B():X.5de");
    }

    public StatusTemporalRecipientsActivity(int i) {
        this.A02 = false;
        C86604Kt.A1K(this, 103);
    }

    public StatusTemporalRecipientsActivity() {
        this(0);
    }
}

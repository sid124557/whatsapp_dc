package com.whatsapp.jobqueue.job;

import X.AnonymousClass001;
import X.AnonymousClass32W;
import X.C1228065u;
import X.C18270x1;
import X.C18300x5;
import X.C389229y;
import X.C58812vr;
import android.content.Context;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.whispersystems.jobqueue.Job;

public final class SendStatusPrivacyListJob extends Job implements C1228065u {
    public static volatile long A01 = 0;
    public static final long serialVersionUID = 1;
    public transient C58812vr A00;
    public final Collection jids;
    public final int statusDistribution;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendStatusPrivacyListJob(java.util.Collection r3, int r4) {
        /*
            r2 = this;
            X.2gM r1 = X.C49332gM.A01()
            java.lang.String r0 = "SendStatusPrivacyListJob"
            X.C49332gM.A03(r0, r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A04()
            r2.<init>(r0)
            r2.statusDistribution = r4
            if (r3 != 0) goto L_0x0018
            r0 = 0
        L_0x0015:
            r2.jids = r0
            return
        L_0x0018:
            java.util.ArrayList r0 = X.C18300x5.A0u(r3)
            X.C627336j.A0H(r3, r0)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendStatusPrivacyListJob.<init>(java.util.Collection, int):void");
    }

    public final String A08() {
        String arrays;
        Jid A002;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("; statusDistribution=");
        A0o.append(this.statusDistribution);
        A0o.append("; jids=");
        Collection collection = this.jids;
        if (collection == null) {
            arrays = "null";
        } else {
            ArrayList A0u = C18300x5.A0u(collection);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                if (!(A0m == null || (A002 = AnonymousClass32W.A00(A0m)) == null)) {
                    A0u.add(A002);
                }
            }
            arrays = Arrays.toString(A0u.toArray());
        }
        A0o.append(arrays);
        C18270x1.A1I(A0o, this);
        return A0o.toString();
    }

    public void Bm4(Context context) {
        this.A00 = C389229y.A00(context).AcK.A00.APe();
    }
}

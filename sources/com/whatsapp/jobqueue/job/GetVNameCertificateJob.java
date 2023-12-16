package com.whatsapp.jobqueue.job;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass31C;
import X.AnonymousClass32Y;
import X.C1228065u;
import X.C18270x1;
import X.C183538qC;
import X.C389229y;
import X.C47472dJ;
import X.C55492qR;
import X.C55682qk;
import X.C56972sr;
import X.C64333Db;
import X.C72343dZ;
import X.C88744aj;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.jobqueue.Job;

public final class GetVNameCertificateJob extends Job implements C1228065u {
    public static final ConcurrentHashMap A02 = AnonymousClass0x9.A1D();
    public static final long serialVersionUID = 1;
    public transient C55492qR A00;
    public transient C47472dJ A01;
    public final String jid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GetVNameCertificateJob(com.whatsapp.jid.UserJid r4) {
        /*
            r3 = this;
            X.2gM r2 = X.C49332gM.A01()
            java.lang.String r0 = r4.getRawString()
            X.C49332gM.A03(r0, r2)
            com.whatsapp.jid.DeviceJid r1 = r4.getPrimaryDevice()
            X.C626936e.A06(r1)
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r1)
            r2.A05(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A04()
            r3.<init>(r0)
            java.lang.String r0 = r4.getRawString()
            X.C626936e.A05(r0)
            r3.jid = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.GetVNameCertificateJob.<init>(com.whatsapp.jid.UserJid):void");
    }

    public final String A08() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("; jid=");
        A0o.append(AnonymousClass32Y.A08(this.jid));
        C18270x1.A1I(A0o, this);
        return A0o.toString();
    }

    public void Bm4(Context context) {
        C64333Db A012 = C389229y.A01(context);
        AnonymousClass1VX A4B = C64333Db.A4B(A012);
        C55682qk A013 = C64333Db.A01(A012);
        C56972sr A06 = C64333Db.A06(A012);
        AnonymousClass31C A5u = C64333Db.A5u(A012);
        C183538qC A002 = C72343dZ.A00(A012.AbX);
        C183538qC A003 = C72343dZ.A00(A012.A44);
        C183538qC A004 = C72343dZ.A00(A012.AZn);
        this.A01 = new C47472dJ(C88744aj.A00, A013, A06, C64333Db.A2s(A012), A4B, A5u, A002, A003, A004, C72343dZ.A00(A012.AOj), C72343dZ.A00(A012.AOl), C72343dZ.A00(A012.AOk));
        this.A00 = (C55492qR) A012.AR3.get();
    }
}

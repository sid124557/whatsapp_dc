package com.whatsapp.jobqueue.job;

import X.AnonymousClass31C;
import X.AnonymousClass32Y;
import X.C1228065u;
import X.C389229y;
import X.C54812pK;
import X.C56642sK;
import X.C64333Db;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class GeneratePrivacyTokenJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C56642sK A00;
    public transient UserJid A01;
    public transient AnonymousClass31C A02;
    public transient C54812pK A03;
    public transient boolean A04 = false;
    public final String toJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GeneratePrivacyTokenJob(com.whatsapp.jid.UserJid r4) {
        /*
            r3 = this;
            X.2gM r2 = X.C49332gM.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "generate-tc-token-"
            java.lang.String r0 = X.C18260x0.A03(r4, r0, r1)
            X.C49332gM.A03(r0, r2)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A04()
            r3.<init>(r0)
            r0 = 0
            r3.A04 = r0
            java.lang.String r0 = r4.getRawString()
            r3.toJid = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob.<init>(com.whatsapp.jid.UserJid):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.A04 = true;
    }

    public void Bm4(Context context) {
        C64333Db A012 = C389229y.A01(context);
        this.A02 = A012.BLC();
        this.A00 = (C56642sK) A012.ARV.get();
        this.A03 = (C54812pK) A012.ARX.get();
        UserJid A08 = AnonymousClass32Y.A08(this.toJid);
        this.A01 = A08;
        if (this.A04 && A08 != null) {
            this.A03.A03(A08);
        }
    }
}

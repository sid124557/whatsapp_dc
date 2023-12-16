package com.whatsapp.jobqueue.job;

import X.AnonymousClass001;
import X.C1228065u;
import X.C18270x1;
import X.C18310x6;
import X.C18330xA;
import X.C389229y;
import X.C61222zu;
import X.C621233o;
import X.C64333Db;
import X.C95814uZ;
import android.content.Context;
import android.text.TextUtils;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public class SendDisableLiveLocationJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C621233o A00;
    public transient C61222zu A01;
    public final String rawJid;
    public final long sequenceNumber;

    public final String A08() {
        C95814uZ A0S = C18310x6.A0S(this.rawJid);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("; jid=");
        A0o.append(A0S);
        C18270x1.A1I(A0o, this);
        return A0o.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendDisableLiveLocationJob(X.C95814uZ r4, long r5) {
        /*
            r3 = this;
            X.2gM r2 = X.C49332gM.A01()
            java.lang.String r0 = r4.getRawString()
            r2.A00 = r0
            r1 = 1
            r2.A02 = r1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r2.A05(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A04()
            r3.<init>(r0)
            X.C626936e.A0B(r1)
            java.lang.String r0 = r4.getRawString()
            r3.rawJid = r0
            r3.sequenceNumber = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendDisableLiveLocationJob.<init>(X.4uZ, long):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.rawJid)) {
            throw C18330xA.A06("jid must not be empty");
        }
    }

    public void Bm4(Context context) {
        C64333Db A002 = C389229y.A00(context);
        this.A01 = (C61222zu) A002.AJD.get();
        this.A00 = (C621233o) A002.AJA.get();
    }
}

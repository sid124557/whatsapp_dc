package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass32Y;
import X.C1228065u;
import X.C18310x6;
import X.C18330xA;
import X.C389229y;
import X.C49422gV;
import X.C627336j;
import X.C64223Cq;
import X.C64333Db;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

public class SyncDevicesJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C64223Cq A00;
    public transient C49422gV A01;
    public final String[] jids;
    public final int syncType;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SyncDevicesJob(com.whatsapp.jid.UserJid[] r5, int r6) {
        /*
            r4 = this;
            X.2gM r1 = X.C49332gM.A01()
            java.lang.String r0 = "SyncDevicesJob"
            X.C49332gM.A03(r0, r1)
            org.whispersystems.jobqueue.JobParameters r0 = X.C49332gM.A02(r1)
            r4.<init>(r0)
            X.C626936e.A0H(r5)
            int r3 = r5.length
            r2 = 0
        L_0x0015:
            if (r2 >= r3) goto L_0x0021
            r1 = r5[r2]
            java.lang.String r0 = "an element of jids was empty."
            X.C626936e.A07(r1, r0)
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0021:
            java.lang.String[] r0 = X.C627336j.A0P(r5)
            r4.jids = r0
            r4.syncType = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDevicesJob.<init>(com.whatsapp.jid.UserJid[], int):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.jids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw C18330xA.A06("jids must not be empty");
        }
        int i = 0;
        while (AnonymousClass32Y.A08(strArr[i]) != null) {
            i++;
            if (i >= length) {
                return;
            }
        }
        throw C18330xA.A06("an jid is not a UserJid");
    }

    public final String A08() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("; jids=");
        return AnonymousClass000.A0X(C627336j.A09(this.jids), A0o);
    }

    public void Bm4(Context context) {
        int length;
        C64333Db A012 = C389229y.A01(context);
        this.A00 = (C64223Cq) A012.A6b.get();
        this.A01 = (C49422gV) A012.A8D.get();
        String[] strArr = this.jids;
        if (strArr != null && (length = strArr.length) > 0) {
            HashSet A0K = AnonymousClass002.A0K();
            int i = 0;
            do {
                AnonymousClass32Y.A0C(UserJid.Companion, strArr[i], A0K);
                i++;
            } while (i < length);
            C49422gV r6 = this.A01;
            Set set = r6.A03;
            synchronized (set) {
                set.addAll(A0K);
                long A0H = r6.A00.A0H();
                Iterator it = A0K.iterator();
                while (it.hasNext()) {
                    AnonymousClass0x2.A1K(C18310x6.A0T(it), r6.A01, A0H);
                }
            }
        }
    }
}

package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C1228065u;
import X.C135156kD;
import X.C18330xA;
import X.C389229y;
import X.C56972sr;
import X.C621133n;
import X.C621233o;
import X.C64333Db;
import android.content.Context;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class AxolotlFastRatchetSenderKeyRequirement implements Requirement, C1228065u {
    public static final long serialVersionUID = 1;
    public transient C56972sr A00;
    public transient C621133n A01;
    public transient C621233o A02;
    public String groupJid = C135156kD.A00.getRawString();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r1 <= 0) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BIR() {
        /*
            r5 = this;
            X.33o r0 = r5.A02
            boolean r0 = r0.A0b()
            r4 = 1
            if (r0 == 0) goto L_0x005b
            X.33o r0 = r5.A02
            java.util.List r0 = r0.A09()
            boolean r0 = r0.isEmpty()
            r3 = 0
            if (r0 != 0) goto L_0x001c
            X.33o r0 = r5.A02
            r0.A0c()
            return r3
        L_0x001c:
            X.2sr r0 = r5.A00
            X.6kH r0 = X.C56972sr.A03(r0)
            X.2ov r1 = X.AnonymousClass36G.A02(r0)
            X.6kD r0 = X.C135156kD.A00
            X.2oh r1 = X.C54422oh.A00(r1, r0)
            X.33n r0 = r5.A01
            X.3fe r2 = X.C614730x.A01(r0, r1)
            X.2ZK r0 = r0.A06     // Catch:{ all -> 0x0051 }
            X.2JM r0 = r0.A00(r1)     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0040
            byte[] r0 = r0.A01     // Catch:{ all -> 0x0051 }
            int r1 = r0.length     // Catch:{ all -> 0x0051 }
            r0 = 1
            if (r1 > 0) goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            r2.close()
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = "AxolotlFastRatchetSenderKeyRequirement/empty sender key record; reset key"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33o r0 = r5.A02
            r0.A0I()
            return r3
        L_0x0051:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0056 }
            throw r1
        L_0x0056:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x005b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement.BIR():boolean");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String rawString = C135156kD.A00.getRawString();
        String str = this.groupJid;
        if (!rawString.equals(str)) {
            throw C18330xA.A06(AnonymousClass000.A0V("groupJid is not location Jid, only location Jid supported for now; groupJid=", str, AnonymousClass001.A0o()));
        }
    }

    public void Bm4(Context context) {
        C64333Db A002 = C389229y.A00(context);
        this.A00 = A002.BL4();
        this.A01 = C64333Db.A2v(A002);
        this.A02 = (C621233o) A002.AJA.get();
    }
}

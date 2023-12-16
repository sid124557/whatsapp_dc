package com.whatsapp.messaging.xmpp;

import X.AnonymousClass1VX;
import X.AnonymousClass2C4;
import X.AnonymousClass46Q;
import X.C18260x0;
import X.C389229y;
import X.C46752c9;
import X.C615931l;
import X.C64333Db;
import X.C67823Qu;
import X.C73853gB;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

public final class XmppLogoutWorker extends CoroutineWorker {
    public final AnonymousClass1VX A00;
    public final C46752c9 A01;
    public final C67823Qu A02;
    public final C73853gB A03;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0D(X.C84814Du r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C74243go
            if (r0 == 0) goto L_0x0022
            r5 = r8
            X.3go r5 = (X.C74243go) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r6 = r5.result
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r3) goto L_0x0028
            java.lang.Object r0 = r5.L$0
            com.whatsapp.messaging.xmpp.XmppLogoutWorker r0 = (com.whatsapp.messaging.xmpp.XmppLogoutWorker) r0
            goto L_0x004d
        L_0x0022:
            X.3go r5 = new X.3go
            r5.<init>(r7, r8)
            goto L_0x0012
        L_0x0028:
            java.lang.IllegalStateException r6 = X.AnonymousClass001.A0d()
            throw r6
        L_0x002d:
            X.C57682u2.A01(r6)
            X.3Qu r2 = r7.A02     // Catch:{ all -> 0x0073 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0073 }
            r2.A05 = r0     // Catch:{ all -> 0x0073 }
            X.3gB r2 = r7.A03     // Catch:{ all -> 0x0073 }
            r1 = 0
            com.whatsapp.messaging.xmpp.XmppLogoutWorker$doWork$2 r0 = new com.whatsapp.messaging.xmpp.XmppLogoutWorker$doWork$2     // Catch:{ all -> 0x0073 }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x0073 }
            r5.L$0 = r7     // Catch:{ all -> 0x0073 }
            r5.label = r3     // Catch:{ all -> 0x0073 }
            java.lang.Object r6 = X.C616131n.A00(r5, r2, r0)     // Catch:{ all -> 0x0073 }
            if (r6 != r4) goto L_0x004b
            return r4
        L_0x004b:
            r0 = r7
            goto L_0x0050
        L_0x004d:
            X.C57682u2.A01(r6)     // Catch:{ all -> 0x0076 }
        L_0x0050:
            X.0Is r6 = (X.C03070Is) r6     // Catch:{ all -> 0x0076 }
            X.3Qu r5 = r0.A02
            long r1 = r5.A05
            java.lang.String r0 = "xmpp-logout-time"
            long r3 = r5.A00(r0, r1)
            r0 = -1
            r5.A05 = r0
            X.33p r5 = r5.A0C
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r5)
            java.lang.String r2 = "xmpp:logout_worker_runtime_seconds"
            long r0 = X.AnonymousClass0x2.A0B(r0, r2)
            long r3 = r3 + r0
            X.C18260x0.A0M(r5, r2, r3)
            return r6
        L_0x0073:
            r6 = move-exception
            r0 = r7
            goto L_0x0077
        L_0x0076:
            r6 = move-exception
        L_0x0077:
            X.3Qu r5 = r0.A02
            long r1 = r5.A05
            java.lang.String r0 = "xmpp-logout-time"
            long r3 = r5.A00(r0, r1)
            r0 = -1
            r5.A05 = r0
            X.33p r5 = r5.A0C
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r5)
            java.lang.String r2 = "xmpp:logout_worker_runtime_seconds"
            long r0 = X.AnonymousClass0x2.A0B(r0, r2)
            long r3 = r3 + r0
            X.C18260x0.A0M(r5, r2, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.xmpp.XmppLogoutWorker.A0D(X.4Du):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmppLogoutWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18260x0.A0Q(context, workerParameters);
        C64333Db A012 = C389229y.A01(context);
        this.A02 = (C67823Qu) A012.Ac6.get();
        AnonymousClass46Q r0 = AnonymousClass2C4.A00;
        C615931l.A00(r0);
        this.A03 = r0;
        this.A00 = A012.Avy();
        this.A01 = A012.AcK.A00.AMh();
    }
}

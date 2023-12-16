package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2g4  reason: invalid class name and case insensitive filesystem */
public final class C49152g4 {
    public final C56982ss A00;
    public final C56652sL A01;
    public final C49612go A02;

    public final void A00(C95804uY r8, List list) {
        C162457s7.A0J(r8, 0);
        AnonymousClass31A A0A = this.A00.A0A(r8, false);
        if (A0A == null) {
            Log.e("NewsletterMessageEnforcementUpdater/Unexpectedly couldn't find newsletter to update");
            return;
        }
        List A002 = this.A02.A00(A0A);
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : A002) {
            C624134x r3 = (C624134x) next;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C162457s7.A0P(C18300x5.A0T(it).A1J, r3.A1J)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            A0s.add(next);
        }
        A01(r8, list, A0s);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.AnonymousClass2A8.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        X.AnonymousClass2A8.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00eb, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C95804uY r13, java.util.List r14, java.util.List r15) {
        /*
            r12 = this;
            r4 = 0
            r5 = 1
            X.2ss r0 = r12.A00
            X.31A r3 = r0.A0A(r13, r4)
            if (r3 != 0) goto L_0x0010
            java.lang.String r0 = "NewsletterMessageEnforcementUpdater/Unexpectedly couldn't find newsletter to update"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x000f:
            return
        L_0x0010:
            java.util.Iterator r11 = r15.iterator()
        L_0x0014:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x006d
            X.34x r9 = X.C18300x5.A0T(r11)
            X.2go r8 = r12.A02
            X.C162457s7.A0J(r9, r4)
            X.3dV r0 = r8.A02     // Catch:{ all -> 0x005c }
            X.4Fq r10 = r0.A04()     // Catch:{ all -> 0x005c }
            r0 = r10
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0055 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x0055 }
            java.lang.String r6 = "newsletter_message_enforcements"
            java.lang.String r2 = "message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ all -> 0x0055 }
            X.C624134x.A0Y(r9, r1, r4)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/removeMessageEnforcement"
            r7.A07(r6, r2, r0, r1)     // Catch:{ all -> 0x0055 }
            r10.close()     // Catch:{ all -> 0x005c }
            X.2hU r0 = r8.A00     // Catch:{ all -> 0x005c }
            android.os.Handler r2 = r0.A02     // Catch:{ all -> 0x005c }
            r1 = 19
            X.3Zz r0 = new X.3Zz     // Catch:{ all -> 0x005c }
            r0.<init>(r8, r1, r9)     // Catch:{ all -> 0x005c }
            boolean r0 = r2.post(r0)     // Catch:{ all -> 0x005c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x005c }
            goto L_0x0061
        L_0x0055:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r10, r1)     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
        L_0x0061:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r0)
            if (r1 == 0) goto L_0x0014
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/failed to remove message enforcement"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0014
        L_0x006d:
            X.2go r6 = r12.A02
            java.util.List r0 = r6.A00(r3)
            java.util.ArrayList r3 = X.C73783g4.A0c(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x007b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008b
            X.34x r0 = X.C18300x5.A0T(r1)
            X.2z0 r0 = r0.A1J
            r3.add(r0)
            goto L_0x007b
        L_0x008b:
            java.util.Iterator r11 = r14.iterator()
        L_0x008f:
            r10 = 0
        L_0x0090:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0100
            X.34x r8 = X.C18300x5.A0T(r11)
            X.2z0 r2 = r8.A1J
            boolean r0 = r3.contains(r2)
            if (r0 == 0) goto L_0x00b4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NewsletterMessageEnforcementUpdater/skipping adding enforcement for msg: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " due to already existing"
            X.C18260x0.A1L(r1, r0)
            goto L_0x0090
        L_0x00b4:
            X.3dV r0 = r6.A02     // Catch:{ all -> 0x00ec }
            X.4Fq r9 = r0.A04()     // Catch:{ all -> 0x00ec }
            android.content.ContentValues r7 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x00e5 }
            X.C624134x.A0H(r7, r8)     // Catch:{ all -> 0x00e5 }
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00e5 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = "newsletter_message_enforcements"
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/insertMessageEnforcement"
            r2.A09(r1, r0, r7)     // Catch:{ all -> 0x00e5 }
            r9.close()     // Catch:{ all -> 0x00ec }
            X.2hU r0 = r6.A00     // Catch:{ all -> 0x00ec }
            android.os.Handler r2 = r0.A02     // Catch:{ all -> 0x00ec }
            r1 = 18
            X.3Zz r0 = new X.3Zz     // Catch:{ all -> 0x00ec }
            r0.<init>(r6, r1, r8)     // Catch:{ all -> 0x00ec }
            boolean r0 = r2.post(r0)     // Catch:{ all -> 0x00ec }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00ec }
            goto L_0x00f1
        L_0x00e5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r9, r1)     // Catch:{ all -> 0x00ec }
            throw r0     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
        L_0x00f1:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r0)
            if (r1 == 0) goto L_0x00fe
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/failed to insert message enforcement"
            com.whatsapp.util.Log.e(r0, r1)
            if (r10 == 0) goto L_0x008f
        L_0x00fe:
            r10 = 1
            goto L_0x0090
        L_0x0100:
            if (r10 == 0) goto L_0x0108
            X.2sL r0 = r12.A01
            r0.A02(r13, r5)
            return
        L_0x0108:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x000f
            X.2sL r0 = r12.A01
            r0.A02(r13, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49152g4.A01(X.4uY, java.util.List, java.util.List):void");
    }

    public C49152g4(C56982ss r1, C56652sL r2, C49612go r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}

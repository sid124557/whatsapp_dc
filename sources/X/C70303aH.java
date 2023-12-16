package X;

/* renamed from: X.3aH  reason: invalid class name and case insensitive filesystem */
public class C70303aH implements Runnable {
    public Object A00;
    public String A01;
    public boolean A02;
    public final int A03;

    public C70303aH(Object obj, String str, int i, boolean z) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = str;
        this.A02 = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.whatsapp.email.UpdateEmailActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.whatsapp.registration.RegisterEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: com.whatsapp.email.UpdateEmailActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: com.whatsapp.email.UpdateEmailActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.A03
            switch(r0) {
                case 0: goto L_0x00c6;
                case 1: goto L_0x01b1;
                case 2: goto L_0x0174;
                case 3: goto L_0x0139;
                case 4: goto L_0x003a;
                case 5: goto L_0x0106;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r7 = r9.A00
            com.whatsapp.registration.RegisterEmail r7 = (com.whatsapp.registration.RegisterEmail) r7
            boolean r3 = r9.A02
            java.lang.String r6 = r9.A01
            r1 = 0
            r0 = 2
            X.C162457s7.A0J(r6, r0)
            r0 = 1
            X.C621433s.A00(r7, r0)
            java.lang.String r2 = "invalidEmailViewStub"
            if (r3 == 0) goto L_0x002d
            X.33p r0 = r7.A09
            r0.A1W(r6)
            X.33p r0 = r7.A09
            r0.A1y(r1)
            X.5UY r1 = r7.A09
            if (r1 != 0) goto L_0x018a
            java.lang.RuntimeException r1 = X.C18270x1.A0S(r2)
            throw r1
        L_0x002d:
            X.5UY r0 = r7.A09
            if (r0 != 0) goto L_0x0036
            java.lang.RuntimeException r1 = X.C18270x1.A0S(r2)
            throw r1
        L_0x0036:
            r0.A06(r1)
            return
        L_0x003a:
            java.lang.Object r7 = r9.A00
            com.whatsapp.email.UpdateEmailActivity r7 = (com.whatsapp.email.UpdateEmailActivity) r7
            java.lang.String r8 = r9.A01
            boolean r1 = r9.A02
            r3 = 0
            r0 = 1
            X.C621433s.A00(r7, r0)
            int r0 = r8.length()
            if (r0 != 0) goto L_0x0067
            r1 = 0
            X.33p r0 = r7.A09
            r0.A1W(r1)
            X.33p r0 = r7.A09
            r0.A1y(r3)
            X.5hX r2 = r7.A00
            int r1 = r7.A00
            java.lang.String r0 = r7.A0C
            android.content.Intent r0 = X.C627736r.A0x(r7, r0, r3, r1)
            r2.A0A(r7, r0)
            goto L_0x01ad
        L_0x0067:
            if (r1 == 0) goto L_0x00ad
            X.33p r0 = r7.A09
            r0.A1W(r8)
            X.33p r0 = r7.A09
            r0.A1y(r3)
            X.5hX r6 = r7.A00
            int r5 = r7.A01
            int r4 = r7.A00
            java.lang.String r3 = r7.A0C
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "com.whatsapp.email.VerifyEmailActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "email"
            r2.putExtra(r0, r8)
            java.lang.String r0 = "state"
            r2.putExtra(r0, r5)
            X.C18310x6.A10(r2, r3, r4)
            r6.A0A(r7, r2)
            r7.finish()
            X.5UY r1 = r7.A09
            if (r1 != 0) goto L_0x00a7
            java.lang.String r0 = "invalidEmailViewStub"
            java.lang.RuntimeException r1 = X.C18270x1.A0S(r0)
            throw r1
        L_0x00a7:
            r0 = 8
            r1.A06(r0)
            return
        L_0x00ad:
            r7.A76()
            X.2eI r4 = r7.A05
            if (r4 == 0) goto L_0x00bf
            java.lang.String r3 = r7.A0C
            int r2 = r7.A00
            int r1 = r7.A01
            r0 = 2
            r4.A00(r2, r1, r3, r0)
            return
        L_0x00bf:
            java.lang.String r0 = "emailVerificationLogger"
            java.lang.RuntimeException r1 = X.C18270x1.A0S(r0)
            throw r1
        L_0x00c6:
            boolean r4 = r9.A02
            java.lang.String r3 = r9.A01
            java.lang.Object r2 = r9.A00
            X.3Ls r2 = (X.C66513Ls) r2
            java.util.HashMap r0 = X.C57772uB.A00
            if (r4 == 0) goto L_0x00f0
            java.lang.Object r0 = r0.remove(r3)
        L_0x00d6:
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 == 0) goto L_0x00f5
            java.util.Iterator r1 = r0.iterator()
        L_0x00de:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r1.next()
            X.4Ab r0 = (X.C83854Ab) r0
            if (r0 == 0) goto L_0x00de
            r0.BXc(r2, r4)
            goto L_0x00de
        L_0x00f0:
            java.lang.Object r0 = r0.get(r3)
            goto L_0x00d6
        L_0x00f5:
            boolean r0 = X.AnonymousClass5VE.A01(r3)
            if (r0 != 0) goto L_0x01b0
            X.8Tk r0 = X.C57782uC.A00
            monitor-enter(r0)
            r0.put(r3, r2)     // Catch:{ all -> 0x0103 }
            monitor-exit(r0)     // Catch:{ all -> 0x0103 }
            return
        L_0x0103:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0103 }
            throw r1
        L_0x0106:
            java.lang.Object r5 = r9.A00
            X.2nj r5 = (X.C53822nj) r5
            boolean r4 = r9.A02
            java.lang.String r3 = r9.A01
            r0 = 2
            X.C162457s7.A0J(r3, r0)
            X.1bM r2 = new X.1bM
            r2.<init>()
            r5.A00(r2)
            long r0 = r5.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A05 = r0
            java.lang.String r0 = r5.A02
            r2.A0K = r0
            r2.A0I = r3
            X.4FV r0 = r5.A05
            r0.BhA(r2)
            if (r4 == 0) goto L_0x01b0
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r0 = 1
            r5.A00 = r0
            return
        L_0x0139:
            java.lang.String r4 = r9.A01
            java.lang.Object r3 = r9.A00
            com.whatsapp.email.UpdateEmailActivity r3 = (com.whatsapp.email.UpdateEmailActivity) r3
            boolean r1 = r9.A02
            r2 = 0
            if (r4 == 0) goto L_0x0165
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0165
            X.33p r0 = r3.A09
            r0.A1W(r4)
            X.33p r0 = r3.A09
            r0.A1y(r1)
            X.5hX r2 = r3.A00
            int r1 = r3.A00
            java.lang.String r0 = r3.A0C
            android.content.Intent r0 = X.C627736r.A0v(r3, r0, r1)
            r2.A0A(r3, r0)
            r3.finish()
            return
        L_0x0165:
            X.33p r1 = r3.A09
            r0 = 0
            r1.A1W(r0)
            X.33p r0 = r3.A09
            r0.A1y(r2)
            com.whatsapp.email.UpdateEmailActivity.A0C(r3)
            return
        L_0x0174:
            java.lang.Object r0 = r9.A00
            X.5l7 r0 = (X.C113245l7) r0
            boolean r2 = r9.A02
            java.lang.String r1 = r9.A01
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r0.A40
            if (r0 == 0) goto L_0x01b0
            if (r2 == 0) goto L_0x0186
            r0.A0E(r1)
            return
        L_0x0186:
            r0.A0F(r1)
            return
        L_0x018a:
            r0 = 8
            r1.A06(r0)
            X.5hX r5 = r7.A00
            int r4 = r7.A00
            java.lang.String r3 = r7.A0E
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.VerifyEmail"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "email"
            r2.putExtra(r0, r6)
            X.C18310x6.A10(r2, r3, r4)
            r5.A0A(r7, r2)
        L_0x01ad:
            r7.finish()
        L_0x01b0:
            return
        L_0x01b1:
            java.lang.Object r2 = r9.A00
            com.whatsapp.calling.service.VoiceServiceEventCallback r2 = (com.whatsapp.calling.service.VoiceServiceEventCallback) r2
            java.lang.String r1 = r9.A01
            boolean r0 = r9.A02
            r2.lambda$linkCreateAcked$1(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70303aH.run():void");
    }
}

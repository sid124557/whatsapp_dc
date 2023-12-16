package X;

/* renamed from: X.2oQ  reason: invalid class name and case insensitive filesystem */
public abstract class C54252oQ {
    public abstract void A02(AnonymousClass36K r1);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass36K r7) {
        /*
            r6 = this;
            java.lang.String r0 = "error"
            java.util.Iterator r5 = X.AnonymousClass36K.A0M(r7, r0)
        L_0x0006:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00db
            X.36K r2 = X.C18310x6.A0Y(r5)
            if (r2 == 0) goto L_0x0006
            java.lang.String r0 = "code"
            r4 = 0
            java.lang.String r1 = r2.A0r(r0, r4)
            java.lang.String r0 = "text"
            r2.A0r(r0, r4)
            if (r1 == 0) goto L_0x0006
            int r3 = java.lang.Integer.parseInt(r1)
            r2 = r6
            boolean r0 = r6 instanceof X.C30651mn
            if (r0 == 0) goto L_0x0032
            X.1mn r2 = (X.C30651mn) r2
            X.4B6 r0 = r2.A02
            r0.BkI(r3)
            goto L_0x0006
        L_0x0032:
            boolean r0 = r6 instanceof X.AnonymousClass4HN
            if (r0 == 0) goto L_0x004c
            X.4HN r2 = (X.AnonymousClass4HN) r2
            int r0 = r2.A02
            switch(r0) {
                case 1: goto L_0x003e;
                case 2: goto L_0x00c2;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0006
        L_0x003e:
            java.lang.Object r0 = r2.A00
            X.30X r0 = (X.AnonymousClass30X) r0
            X.2yo r1 = r0.A09
            java.lang.Object r0 = r2.A01
            com.whatsapp.jid.DeviceJid[] r0 = (com.whatsapp.jid.DeviceJid[]) r0
            r1.A03(r0, r3)
            goto L_0x0006
        L_0x004c:
            boolean r0 = r6 instanceof X.AnonymousClass4HM
            if (r0 == 0) goto L_0x0006
            X.4HM r2 = (X.AnonymousClass4HM) r2
            int r0 = r2.A01
            switch(r0) {
                case 3: goto L_0x0096;
                case 4: goto L_0x008b;
                case 5: goto L_0x0076;
                case 6: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x0006
        L_0x0058:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionWriter/change number failed; code="
            X.C18260x0.A0z(r0, r1, r3)
            java.lang.Object r0 = r2.A00
            X.30X r0 = (X.AnonymousClass30X) r0
            X.2yo r2 = r0.A09
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-change-number-error="
            X.C18260x0.A0y(r0, r1, r3)
            X.4Ag r2 = r2.A01
            r1 = 0
            r0 = 201(0xc9, float:2.82E-43)
            goto L_0x00d2
        L_0x0076:
            java.lang.Object r0 = r2.A00
            X.30X r0 = (X.AnonymousClass30X) r0
            X.2yo r2 = r0.A09
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-number-normalization-error="
            X.C18260x0.A0y(r0, r1, r3)
            X.4Ag r2 = r2.A01
            r1 = 0
            r0 = 199(0xc7, float:2.79E-43)
            goto L_0x00d2
        L_0x008b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionWriter/sendClearFbnsToken/failed to clear code="
            X.C18260x0.A0x(r0, r1, r3)
            goto L_0x0006
        L_0x0096:
            r0 = 404(0x194, float:5.66E-43)
            if (r3 != r0) goto L_0x00ae
            java.lang.Object r0 = r2.A00
            X.30X r0 = (X.AnonymousClass30X) r0
            X.2yo r1 = r0.A09
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-get-pre-key-digest-none"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4Ag r2 = r1.A01
            r0 = 83
        L_0x00a9:
            android.os.Message r0 = X.AnonymousClass0x7.A0G(r0)
            goto L_0x00d6
        L_0x00ae:
            r0 = 503(0x1f7, float:7.05E-43)
            if (r3 != r0) goto L_0x0006
            java.lang.Object r0 = r2.A00
            X.30X r0 = (X.AnonymousClass30X) r0
            X.2yo r1 = r0.A09
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-get-pre-key-digest-server-error"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4Ag r2 = r1.A01
            r0 = 84
            goto L_0x00a9
        L_0x00c2:
            java.lang.Object r0 = r2.A00
            X.30X r0 = (X.AnonymousClass30X) r0
            X.2yo r1 = r0.A09
            java.lang.String r0 = "ConnectionThreadRequestsImpl/client_config_error"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4Ag r2 = r1.A01
            r1 = 0
            r0 = 27
        L_0x00d2:
            android.os.Message r0 = android.os.Message.obtain(r4, r1, r0, r3)
        L_0x00d6:
            r2.Bfr(r0)
            goto L_0x0006
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54252oQ.A01(X.36K):void");
    }
}

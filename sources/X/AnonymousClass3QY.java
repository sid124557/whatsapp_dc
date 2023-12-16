package X;

/* renamed from: X.3QY  reason: invalid class name */
public class AnonymousClass3QY implements AnonymousClass4DA {
    public final AnonymousClass317 A00;

    public int[] B81() {
        return new int[]{198, 199, 200, 201};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r2 < 500) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BFA(android.os.Message r8, int r9) {
        /*
            r7 = this;
            r3 = 1
            switch(r9) {
                case 198: goto L_0x0006;
                case 199: goto L_0x0022;
                case 200: goto L_0x009f;
                case 201: goto L_0x003c;
                default: goto L_0x0004;
            }
        L_0x0004:
            r0 = 0
            return r0
        L_0x0006:
            X.317 r0 = r7.A00
            java.lang.Object r2 = r8.obj
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r0 = r0.A12
            java.util.Iterator r1 = r0.iterator()
        L_0x0012:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r1.next()
            X.4DY r0 = (X.AnonymousClass4DY) r0
            r0.BXF(r2)
            goto L_0x0012
        L_0x0022:
            X.317 r0 = r7.A00
            int r2 = r8.arg2
            java.util.List r0 = r0.A12
            java.util.Iterator r1 = r0.iterator()
        L_0x002c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r1.next()
            X.4DY r0 = (X.AnonymousClass4DY) r0
            r0.BXE(r2)
            goto L_0x002c
        L_0x003c:
            X.317 r4 = r7.A00
            int r2 = r8.arg2
            X.2sr r5 = r4.A0I
            com.whatsapp.Me r1 = r5.A0E()
            X.2oU r0 = r4.A0a
            android.content.Context r6 = r0.A00
            if (r1 == 0) goto L_0x00a9
            r0 = 400(0x190, float:5.6E-43)
            if (r2 == r0) goto L_0x008d
            r0 = 401(0x191, float:5.62E-43)
            if (r2 == r0) goto L_0x0080
            r0 = 405(0x195, float:5.68E-43)
            if (r2 == r0) goto L_0x00a5
            r0 = 409(0x199, float:5.73E-43)
            if (r2 == r0) goto L_0x00a4
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 >= r0) goto L_0x00a4
        L_0x0060:
            X.33p r0 = r4.A0c
            r0.A1z(r3)
            X.1i9 r0 = r4.A0J
            r0.A0B()
        L_0x006a:
            r5.A0O()
            X.2nx r1 = r4.A0G
            java.lang.String r0 = "ChangeNumberManager/deleteChangeNumberContacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2oU r0 = r1.A02
            java.io.File r1 = X.C54292oU.A03(r0)
            java.lang.String r0 = "change_number_contacts.json"
            X.C18310x6.A1F(r1, r0)
            return r3
        L_0x0080:
            android.os.Handler r2 = r4.A01
            r1 = 9
            X.3a1 r0 = new X.3a1
            r0.<init>(r4, r1, r6)
            r2.post(r0)
            goto L_0x0060
        L_0x008d:
            java.lang.String r0 = "RegistrationManager/notifyChangeNumberError/match"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            android.os.Handler r2 = r4.A01
            r1 = 8
            X.3a1 r0 = new X.3a1
            r0.<init>(r4, r1, r6)
            r2.post(r0)
            goto L_0x006a
        L_0x009f:
            X.317 r0 = r7.A00
            r0.A05()
        L_0x00a4:
            return r3
        L_0x00a5:
            r4.A05()
            return r3
        L_0x00a9:
            java.lang.String r0 = "RegistrationManager/notifyChangeNumberError/response/error but already changed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QY.BFA(android.os.Message, int):boolean");
    }

    public AnonymousClass3QY(AnonymousClass317 r1) {
        this.A00 = r1;
    }
}

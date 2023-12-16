package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2eo  reason: invalid class name and case insensitive filesystem */
public class C48382eo {
    public final UserJid A00;
    public final String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r0 = r4.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 1
            if (r3 == r4) goto L_0x0022
            boolean r1 = r4 instanceof X.C48382eo
            r0 = 0
            if (r1 == 0) goto L_0x0025
            X.2eo r4 = (X.C48382eo) r4
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            boolean r0 = X.AnonymousClass75J.A00(r1, r0)
            if (r0 == 0) goto L_0x0023
            com.whatsapp.jid.UserJid r1 = r3.A00
            if (r1 == 0) goto L_0x0022
            com.whatsapp.jid.UserJid r0 = r4.A00
            if (r0 == 0) goto L_0x0022
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0023
        L_0x0022:
            return r2
        L_0x0023:
            r2 = 0
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48382eo.equals(java.lang.Object):boolean");
    }

    public C48382eo(UserJid userJid, String str) {
        this.A01 = str;
        this.A00 = userJid;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        return C18310x6.A08(this.A00, A0M, 1);
    }
}

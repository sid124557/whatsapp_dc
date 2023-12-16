package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5Yf  reason: invalid class name and case insensitive filesystem */
public class C106255Yf {
    public static final C184288rY A00 = new C171048Fn();

    public static AnonymousClass3ZH A00(C64773Ex r2, C66493Lq r3, C56572sD r4, AnonymousClass3ZF r5) {
        UserJid userJid;
        AnonymousClass3ZH A01;
        if (r5.A05 != null && (A01 = AnonymousClass36T.A01(r2, r3, r5.A05, r4, AnonymousClass000.A1U(r5.A0H, 2))) != null) {
            return A01;
        }
        if (r5.A0I == null || r5.A0I.A01 == null) {
            DeviceJid deviceJid = r5.A0C;
            if (deviceJid == null) {
                return null;
            }
            userJid = deviceJid.userJid;
        } else {
            userJid = r5.A0I.A01;
        }
        return r2.A0A(userJid);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r7.A0X(3675) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A01(X.C56972sr r6, X.AnonymousClass1VX r7, X.AnonymousClass3ZF r8) {
        /*
            java.util.List r3 = r8.A08()
            X.39J r0 = r8.A0E
            com.whatsapp.jid.UserJid r4 = r0.A01
            X.2mt r0 = r8.A07
            r2 = 0
            if (r0 == 0) goto L_0x0016
            r0 = 3675(0xe5b, float:5.15E-42)
            boolean r0 = r7.A0X(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r5 = 0
        L_0x0017:
            r1 = 0
        L_0x0018:
            int r0 = r3.size()
            if (r1 >= r0) goto L_0x002f
            java.lang.Object r0 = r3.get(r1)
            X.3ZE r0 = (X.AnonymousClass3ZE) r0
            com.whatsapp.jid.UserJid r0 = r0.A02
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x002f
            int r1 = r1 + 1
            goto L_0x0018
        L_0x002f:
            if (r1 == 0) goto L_0x0041
            int r0 = r3.size()
            if (r1 >= r0) goto L_0x0041
            java.lang.Object r0 = r3.get(r1)
            r3.remove(r1)
            r3.add(r2, r0)
        L_0x0041:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r3.iterator()
        L_0x0049:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r2 = r3.next()
            X.3ZE r2 = (X.AnonymousClass3ZE) r2
            if (r5 != 0) goto L_0x0060
            com.whatsapp.jid.UserJid r0 = r2.A02
            boolean r0 = r6.A0a(r0)
            if (r0 == 0) goto L_0x0065
            goto L_0x0049
        L_0x0060:
            int r1 = r2.A00
            r0 = 5
            if (r1 != r0) goto L_0x0049
        L_0x0065:
            com.whatsapp.jid.UserJid r0 = r2.A02
            r4.add(r0)
            goto L_0x0049
        L_0x006b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106255Yf.A01(X.2sr, X.1VX, X.3ZF):java.util.List");
    }
}

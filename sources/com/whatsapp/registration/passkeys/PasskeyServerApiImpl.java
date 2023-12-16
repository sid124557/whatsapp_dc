package com.whatsapp.registration.passkeys;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass31C;
import X.AnonymousClass36K;
import X.AnonymousClass4GQ;
import X.AnonymousClass5BH;
import X.C100555Bj;
import X.C143516z1;
import X.C143526z2;
import X.C143546z4;
import X.C143726zN;
import X.C162457s7;
import X.C18260x0;
import X.C73153f1;
import X.C96034vh;
import X.C96044vi;
import X.C96054vj;
import X.C97704z6;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

public final class PasskeyServerApiImpl {
    public final AnonymousClass31C A00;

    public PasskeyServerApiImpl(AnonymousClass31C r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final C100555Bj A00(AnonymousClass5BH r5, AnonymousClass4GQ r6) {
        Object obj;
        if (r5 instanceof C96044vi) {
            Log.d("PasskeyServer/parseResponse/success");
            AnonymousClass36K r3 = ((C96044vi) r5).A00;
            String A0r = r3.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
            if (C162457s7.A0P(A0r, "result")) {
                return (C100555Bj) r6.invoke(r3);
            }
            C18260x0.A0r("PasskeyServer/parseResponse/success response has bad type attribute: ", A0r, AnonymousClass001.A0o());
            obj = new C143526z2(AnonymousClass000.A0V("bad type attribute: ", A0r, AnonymousClass001.A0o()));
        } else if (r5 instanceof C96034vh) {
            AnonymousClass36K A0l = ((C96034vh) r5).A00.A0l("error");
            if (A0l != null) {
                int A0b = A0l.A0b("code", -1);
                String A0r2 = A0l.A0r("text", "unknown");
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("PasskeyServer/passkeyExists/response/error: ");
                A0o.append(A0b);
                A0o.append(' ');
                C18260x0.A1K(A0o, A0r2);
                obj = new C143546z4(A0b, A0r2);
            } else {
                Log.e("PasskeyServer/passkeyExists/response/error: malformed error response, no error node");
                obj = new C143516z1();
            }
        } else if (r5 instanceof C96054vj) {
            Log.e("PasskeyServer/parseResponse/deliveryFailure");
            obj = C143726zN.A00;
        } else {
            throw C73153f1.A00();
        }
        return new C97704z6(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(java.lang.String r12, X.C84814Du r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.AnonymousClass8UO
            r4 = r11
            if (r0 == 0) goto L_0x0055
            r6 = r13
            X.8UO r6 = (X.AnonymousClass8UO) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0055
            int r2 = r2 - r1
            r6.label = r2
        L_0x0013:
            java.lang.Object r3 = r6.result
            X.218 r2 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r1) goto L_0x005b
            java.lang.Object r4 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r4 = (com.whatsapp.registration.passkeys.PasskeyServerApiImpl) r4
            X.C57682u2.A01(r3)
        L_0x0025:
            X.5BH r3 = (X.AnonymousClass5BH) r3
            X.8ZE r0 = X.AnonymousClass8ZE.A00
            X.5Bj r2 = r4.A00(r3, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PasskeyServer/finishRegister: "
            X.C18260x0.A1R(r1, r0, r2)
            return r2
        L_0x0037:
            X.C57682u2.A01(r3)
            java.lang.String r0 = "PasskeyServer/finishRegister/sending request"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r5 = "set"
            X.8YZ r7 = new X.8YZ
            r7.<init>(r12)
            r6.L$0 = r11
            r6.label = r1
            r9 = 126(0x7e, double:6.23E-322)
            r8 = 418(0x1a2, float:5.86E-43)
            java.lang.Object r3 = r4.A02(r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0025
            return r2
        L_0x0055:
            X.8UO r6 = new X.8UO
            r6.<init>(r11, r13)
            goto L_0x0013
        L_0x005b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyServerApiImpl.A01(java.lang.String, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r16, X.C84814Du r17, X.AnonymousClass4GQ r18, int r19, long r20) {
        /*
            r15 = this;
            r3 = r17
            r11 = r19
            boolean r0 = r3 instanceof X.AnonymousClass8UV
            if (r0 == 0) goto L_0x00a0
            r10 = r3
            X.8UV r10 = (X.AnonymousClass8UV) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a0
            int r2 = r2 - r1
            r10.label = r2
        L_0x0016:
            java.lang.Object r4 = r10.result
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r10.label
            r2 = 32
            r5 = 1
            if (r0 == 0) goto L_0x003f
            if (r0 != r5) goto L_0x00a7
            int r11 = r10.I$0
            java.lang.Object r9 = r10.L$0
            java.lang.String r9 = (java.lang.String) r9
            X.C57682u2.A01(r4)
        L_0x002c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PasskeyServer/sendIq/response "
            r1.append(r0)
            r1.append(r11)
            r1.append(r2)
            X.C18260x0.A1J(r1, r9)
            return r4
        L_0x003f:
            X.C57682u2.A01(r4)
            X.31C r7 = r15.A00
            java.lang.String r9 = r7.A03()
            java.lang.String r0 = "iq"
            X.2rL r6 = new X.2rL
            r6.<init>(r0)
            java.lang.String r0 = "id"
            X.C56052rL.A0D(r6, r0, r9)
            java.lang.String r0 = "type"
            r1 = r16
            X.C56052rL.A0D(r6, r0, r1)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "passkey"
            X.C56052rL.A0D(r6, r1, r0)
            java.lang.String r4 = "smax_id"
            r0 = r20
            X.C56052rL.A0C(r6, r4, r0)
            java.lang.String r4 = "to"
            X.6kI r1 = X.C135206kI.A00
            X.39V r0 = new X.39V
            r0.<init>((com.whatsapp.jid.Jid) r1, (java.lang.String) r4)
            r6.A0G(r0)
            r0 = r18
            r0.invoke(r6)
            X.36K r8 = r6.A0F()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PasskeyServer/sendIq/request "
            r1.append(r0)
            r1.append(r11)
            r1.append(r2)
            X.C18260x0.A1J(r1, r9)
            r10.L$0 = r9
            r10.I$0 = r11
            r10.label = r5
            r12 = 32000(0x7d00, double:1.581E-319)
            r14 = 0
            java.lang.Object r4 = r7.A02(r8, r9, r10, r11, r12, r14)
            if (r4 != r3) goto L_0x002c
            return r3
        L_0x00a0:
            X.8UV r10 = new X.8UV
            r10.<init>(r15, r3)
            goto L_0x0016
        L_0x00a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyServerApiImpl.A02(java.lang.String, X.4Du, X.4GQ, int, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A03(X.C84814Du r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.AnonymousClass8UP
            r4 = r11
            if (r0 == 0) goto L_0x0052
            r6 = r12
            X.8UP r6 = (X.AnonymousClass8UP) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0052
            int r2 = r2 - r1
            r6.label = r2
        L_0x0013:
            java.lang.Object r3 = r6.result
            X.218 r2 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r1) goto L_0x0058
            java.lang.Object r4 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r4 = (com.whatsapp.registration.passkeys.PasskeyServerApiImpl) r4
            X.C57682u2.A01(r3)
        L_0x0025:
            X.5BH r3 = (X.AnonymousClass5BH) r3
            X.8ZI r0 = X.AnonymousClass8ZI.A00
            X.5Bj r2 = r4.A00(r3, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PasskeyServer/passkeyDelete: "
            X.C18260x0.A1R(r1, r0, r2)
            return r2
        L_0x0037:
            X.C57682u2.A01(r3)
            java.lang.String r0 = "PasskeyServer/passkeyDelete/sending request"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r5 = "set"
            X.8ZH r7 = X.AnonymousClass8ZH.A00
            r6.L$0 = r11
            r6.label = r1
            r9 = 129(0x81, double:6.37E-322)
            r8 = 420(0x1a4, float:5.89E-43)
            java.lang.Object r3 = r4.A02(r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0025
            return r2
        L_0x0052:
            X.8UP r6 = new X.8UP
            r6.<init>(r11, r12)
            goto L_0x0013
        L_0x0058:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyServerApiImpl.A03(X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(X.C84814Du r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.AnonymousClass8UQ
            r4 = r11
            if (r0 == 0) goto L_0x0052
            r6 = r12
            X.8UQ r6 = (X.AnonymousClass8UQ) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0052
            int r2 = r2 - r1
            r6.label = r2
        L_0x0013:
            java.lang.Object r3 = r6.result
            X.218 r2 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r1) goto L_0x0058
            java.lang.Object r4 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r4 = (com.whatsapp.registration.passkeys.PasskeyServerApiImpl) r4
            X.C57682u2.A01(r3)
        L_0x0025:
            X.5BH r3 = (X.AnonymousClass5BH) r3
            X.8ZF r0 = X.AnonymousClass8ZF.A00
            X.5Bj r2 = r4.A00(r3, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PasskeyServer/passkeyExists: "
            X.C18260x0.A1R(r1, r0, r2)
            return r2
        L_0x0037:
            X.C57682u2.A01(r3)
            java.lang.String r0 = "PasskeyServer/passkeyExists/sending request"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r5 = "get"
            X.8ZJ r7 = X.AnonymousClass8ZJ.A00
            r6.L$0 = r11
            r6.label = r1
            r9 = 127(0x7f, double:6.27E-322)
            r8 = 411(0x19b, float:5.76E-43)
            java.lang.Object r3 = r4.A02(r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0025
            return r2
        L_0x0052:
            X.8UQ r6 = new X.8UQ
            r6.<init>(r11, r12)
            goto L_0x0013
        L_0x0058:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyServerApiImpl.A04(X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A05(X.C84814Du r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.AnonymousClass8UR
            r4 = r11
            if (r0 == 0) goto L_0x004e
            r6 = r12
            X.8UR r6 = (X.AnonymousClass8UR) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r6.label = r2
        L_0x0013:
            java.lang.Object r3 = r6.result
            X.218 r2 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r1) goto L_0x0054
            java.lang.Object r4 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r4 = (com.whatsapp.registration.passkeys.PasskeyServerApiImpl) r4
            X.C57682u2.A01(r3)
        L_0x0025:
            X.5BH r3 = (X.AnonymousClass5BH) r3
            X.8ZG r0 = X.AnonymousClass8ZG.A00
            X.5Bj r1 = r4.A00(r3, r0)
            java.lang.String r0 = "PasskeyServer/startRegister result"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r1
        L_0x0033:
            X.C57682u2.A01(r3)
            java.lang.String r0 = "PasskeyServer/startRegister/sending request"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r5 = "get"
            X.8ZK r7 = X.AnonymousClass8ZK.A00
            r6.L$0 = r11
            r6.label = r1
            r9 = 125(0x7d, double:6.2E-322)
            r8 = 412(0x19c, float:5.77E-43)
            java.lang.Object r3 = r4.A02(r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0025
            return r2
        L_0x004e:
            X.8UR r6 = new X.8UR
            r6.<init>(r11, r12)
            goto L_0x0013
        L_0x0054:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyServerApiImpl.A05(X.4Du):java.lang.Object");
    }
}

package com.whatsapp.registration.passkeys;

import X.AnonymousClass001;
import X.AnonymousClass33p;
import X.AnonymousClass5OE;
import X.C1000159b;
import X.C105265Uf;
import X.C162457s7;
import X.C18260x0;
import X.C997658c;

public final class PasskeyFacade {
    public final AnonymousClass33p A00;
    public final PasskeyAndroidApiImpl A01;
    public final C105265Uf A02;
    public final AnonymousClass5OE A03;
    public final PasskeyServerApiImpl A04;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C009707r r13, X.C84814Du r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C118695tx
            if (r0 == 0) goto L_0x0184
            r6 = r14
            X.5tx r6 = (X.C118695tx) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0184
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r8 = r6.result
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 4
            r11 = 3
            r9 = 2
            r4 = 1
            r10 = 0
            r2 = 0
            if (r0 == 0) goto L_0x004f
            if (r0 == r4) goto L_0x0087
            if (r0 == r9) goto L_0x00df
            if (r0 == r11) goto L_0x012d
            if (r0 != r5) goto L_0x01a9
            java.lang.Object r3 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyFacade r3 = (com.whatsapp.registration.passkeys.PasskeyFacade) r3
            X.C57682u2.A01(r8)
        L_0x002f:
            X.5Bj r8 = (X.C100555Bj) r8
            boolean r0 = r8 instanceof X.C97714z7
            if (r0 == 0) goto L_0x018b
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server finishRegister success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5OE r1 = r3.A03
            r0 = 10
            r1.A00(r2, r0)
            X.33p r0 = r3.A00
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "reg_passkey_exists"
            X.C18270x1.A0l(r1, r0, r4)
            X.58h r0 = X.C998158h.PASSKEY_CREATED
            return r0
        L_0x004f:
            X.C57682u2.A01(r8)
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/passkeyEligibility check"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r12.A03()
            if (r0 != 0) goto L_0x0060
            X.58h r0 = X.C998158h.INELIGIBLE
            return r0
        L_0x0060:
            X.5Uf r0 = r12.A02
            X.33p r0 = r0.A02
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "reg_abprop_passkey_create"
            X.C18270x1.A0l(r1, r0, r10)
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server passkeyExists start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5OE r0 = r12.A03
            r0.A00(r2, r4)
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r0 = r12.A04
            r6.L$0 = r12
            r6.L$1 = r13
            r6.label = r4
            java.lang.Object r8 = r0.A04(r6)
            if (r8 == r7) goto L_0x01ec
            r3 = r12
            goto L_0x0092
        L_0x0087:
            java.lang.Object r13 = r6.L$1
            X.07r r13 = (X.C009707r) r13
            java.lang.Object r3 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyFacade r3 = (com.whatsapp.registration.passkeys.PasskeyFacade) r3
            X.C57682u2.A01(r8)
        L_0x0092:
            X.5Bj r8 = (X.C100555Bj) r8
            boolean r0 = r8 instanceof X.C97704z6
            if (r0 == 0) goto L_0x00ab
            X.4z6 r8 = (X.C97704z6) r8
            java.lang.Object r1 = r8.A00
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server passkeyExists error"
            com.whatsapp.util.Log.e(r0, r1)
            X.5OE r0 = r3.A03
            r0.A00(r1, r11)
            X.58h r0 = X.C998158h.ERROR_BEFORE_USER_INTERACTION
            return r0
        L_0x00ab:
            boolean r0 = r8 instanceof X.C97714z7
            if (r0 == 0) goto L_0x01e7
            X.4z7 r8 = (X.C97714z7) r8
            java.lang.Object r0 = r8.A00
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server passkeyExists already_exists"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5OE r0 = r3.A03
            r0.A00(r2, r9)
            X.58h r0 = X.C998158h.ALREADY_HAS_PASSKEY
            return r0
        L_0x00c6:
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server passkeyExists doesnt_exist_yet"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5OE r0 = r3.A03
            r0.A00(r2, r5)
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r0 = r3.A04
            r6.L$0 = r3
            r6.L$1 = r13
            r6.label = r9
            java.lang.Object r8 = r0.A05(r6)
            if (r8 != r7) goto L_0x00ea
            return r7
        L_0x00df:
            java.lang.Object r13 = r6.L$1
            X.07r r13 = (X.C009707r) r13
            java.lang.Object r3 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyFacade r3 = (com.whatsapp.registration.passkeys.PasskeyFacade) r3
            X.C57682u2.A01(r8)
        L_0x00ea:
            X.5Bj r8 = (X.C100555Bj) r8
            boolean r0 = r8 instanceof X.C97704z6
            if (r0 == 0) goto L_0x0104
            X.4z6 r8 = (X.C97704z6) r8
            java.lang.Object r2 = r8.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server startRegister error"
            com.whatsapp.util.Log.e(r0, r2)
            X.5OE r1 = r3.A03
            r0 = 6
            r1.A00(r2, r0)
            X.58h r0 = X.C998158h.ERROR_BEFORE_USER_INTERACTION
            return r0
        L_0x0104:
            boolean r0 = r8 instanceof X.C97714z7
            if (r0 == 0) goto L_0x01e2
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server startRegister success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5OE r1 = r3.A03
            r0 = 5
            r1.A00(r2, r0)
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/client start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl r1 = r3.A01
            X.4z7 r8 = (X.C97714z7) r8
            java.lang.Object r0 = r8.A00
            java.lang.String r0 = (java.lang.String) r0
            r6.L$0 = r3
            r6.L$1 = r2
            r6.label = r11
            java.lang.Object r8 = r1.A00(r13, r0, r6)
            if (r8 != r7) goto L_0x0134
            return r7
        L_0x012d:
            java.lang.Object r3 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyFacade r3 = (com.whatsapp.registration.passkeys.PasskeyFacade) r3
            X.C57682u2.A01(r8)
        L_0x0134:
            X.5Bj r8 = (X.C100555Bj) r8
            boolean r0 = r8 instanceof X.C97704z6
            if (r0 == 0) goto L_0x015d
            X.4z6 r8 = (X.C97704z6) r8
            java.lang.Object r1 = r8.A00
            X.5Ru r1 = (X.C104645Ru) r1
            X.58P r0 = r1.A00
            int r0 = r0.ordinal()
            if (r0 == r10) goto L_0x01cc
            if (r0 == r4) goto L_0x01bb
            r2 = 9
            java.lang.Throwable r1 = r1.A01
            if (r0 == r9) goto L_0x01ae
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/client error"
            com.whatsapp.util.Log.e(r0, r1)
            X.5OE r0 = r3.A03
            r0.A00(r1, r2)
            X.58h r0 = X.C998158h.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION
            return r0
        L_0x015d:
            boolean r0 = r8 instanceof X.C97714z7
            if (r0 == 0) goto L_0x01dd
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/client success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5OE r1 = r3.A03
            r0 = 7
            r1.A00(r2, r0)
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server finishRegister start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r1 = r3.A04
            X.4z7 r8 = (X.C97714z7) r8
            java.lang.Object r0 = r8.A00
            java.lang.String r0 = (java.lang.String) r0
            r6.L$0 = r3
            r6.label = r5
            java.lang.Object r8 = r1.A01(r0, r6)
            if (r8 != r7) goto L_0x002f
            return r7
        L_0x0184:
            X.5tx r6 = new X.5tx
            r6.<init>(r12, r14)
            goto L_0x0012
        L_0x018b:
            boolean r0 = r8 instanceof X.C97704z6
            if (r0 == 0) goto L_0x01a4
            X.4z6 r8 = (X.C97704z6) r8
            java.lang.Object r2 = r8.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server finishRegister error"
            com.whatsapp.util.Log.e(r0, r2)
            X.5OE r1 = r3.A03
            r0 = 11
            r1.A00(r2, r0)
            X.58h r0 = X.C998158h.ERROR_AFTER_USER_INTERACTION
            return r0
        L_0x01a4:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x01a9:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x01ae:
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/client error before user interaction"
            com.whatsapp.util.Log.e(r0, r1)
            X.5OE r0 = r3.A03
            r0.A00(r1, r2)
            X.58h r0 = X.C998158h.ERROR_BEFORE_USER_INTERACTION
            return r0
        L_0x01bb:
            java.lang.Throwable r2 = r1.A01
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/client canceled"
            com.whatsapp.util.Log.i(r0, r2)
            X.5OE r1 = r3.A03
            r0 = 8
            r1.A00(r2, r0)
            X.58h r0 = X.C998158h.USER_CANCELED
            return r0
        L_0x01cc:
            java.lang.Throwable r2 = r1.A01
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/client ineligible (even though eligibilty check passed)"
            com.whatsapp.util.Log.e(r0, r2)
            X.5OE r1 = r3.A03
            r0 = 19
            r1.A00(r2, r0)
            X.58h r0 = X.C998158h.INELIGIBLE
            return r0
        L_0x01dd:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x01e2:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x01e7:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x01ec:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyFacade.A00(X.07r, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C009707r r12, X.C84814Du r13, X.AnonymousClass4GP r14) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C118735u1
            if (r0 == 0) goto L_0x011a
            r6 = r13
            X.5u1 r6 = (X.C118735u1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x011a
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r9 = r6.result
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 3
            r8 = 2
            r4 = 1
            r10 = 0
            r2 = 0
            if (r0 == 0) goto L_0x004c
            if (r0 == r4) goto L_0x006c
            if (r0 == r8) goto L_0x00c3
            if (r0 != r5) goto L_0x013f
            java.lang.Object r3 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyFacade r3 = (com.whatsapp.registration.passkeys.PasskeyFacade) r3
            X.C57682u2.A01(r9)
        L_0x002c:
            X.5Bj r9 = (X.C100555Bj) r9
            boolean r0 = r9 instanceof X.C97714z7
            if (r0 == 0) goto L_0x0121
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server finishRegister success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5OE r1 = r3.A03
            r0 = 10
            r1.A00(r2, r0)
            X.33p r0 = r3.A00
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "reg_passkey_exists"
            X.C18270x1.A0l(r1, r0, r4)
            X.58d r0 = X.C997758d.SUCCESS
            return r0
        L_0x004c:
            X.C57682u2.A01(r9)
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server startRegister start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5OE r1 = r11.A03
            r0 = 4
            r1.A00(r2, r0)
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r0 = r11.A04
            r6.L$0 = r11
            r6.L$1 = r12
            r6.L$2 = r14
            r6.label = r4
            java.lang.Object r9 = r0.A05(r6)
            if (r9 == r7) goto L_0x017d
            r3 = r11
            goto L_0x007b
        L_0x006c:
            java.lang.Object r14 = r6.L$2
            X.4GP r14 = (X.AnonymousClass4GP) r14
            java.lang.Object r12 = r6.L$1
            X.07r r12 = (X.C009707r) r12
            java.lang.Object r3 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyFacade r3 = (com.whatsapp.registration.passkeys.PasskeyFacade) r3
            X.C57682u2.A01(r9)
        L_0x007b:
            X.5Bj r9 = (X.C100555Bj) r9
            r14.invoke()
            boolean r0 = r9 instanceof X.C97704z6
            if (r0 == 0) goto L_0x0098
            X.4z6 r9 = (X.C97704z6) r9
            java.lang.Object r2 = r9.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server startRegister error"
            com.whatsapp.util.Log.i(r0, r2)
            X.5OE r1 = r3.A03
            r0 = 6
            r1.A00(r2, r0)
            X.58d r0 = X.C997758d.ERROR_BEFORE_USER_INTERACTION
            return r0
        L_0x0098:
            boolean r0 = r9 instanceof X.C97714z7
            if (r0 == 0) goto L_0x0178
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server startRegister success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5OE r1 = r3.A03
            r0 = 5
            r1.A00(r2, r0)
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl r1 = r3.A01
            X.4z7 r9 = (X.C97714z7) r9
            java.lang.Object r0 = r9.A00
            java.lang.String r0 = (java.lang.String) r0
            r6.L$0 = r3
            r6.L$1 = r2
            r6.L$2 = r2
            r6.label = r8
            java.lang.Object r9 = r1.A00(r12, r0, r6)
            if (r9 != r7) goto L_0x00ca
            return r7
        L_0x00c3:
            java.lang.Object r3 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyFacade r3 = (com.whatsapp.registration.passkeys.PasskeyFacade) r3
            X.C57682u2.A01(r9)
        L_0x00ca:
            X.5Bj r9 = (X.C100555Bj) r9
            boolean r0 = r9 instanceof X.C97704z6
            if (r0 == 0) goto L_0x00f3
            X.4z6 r9 = (X.C97704z6) r9
            java.lang.Object r1 = r9.A00
            X.5Ru r1 = (X.C104645Ru) r1
            X.58P r0 = r1.A00
            int r0 = r0.ordinal()
            if (r0 == r10) goto L_0x0162
            if (r0 == r4) goto L_0x0151
            r2 = 9
            java.lang.Throwable r1 = r1.A01
            if (r0 == r8) goto L_0x0144
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client error"
            com.whatsapp.util.Log.e(r0, r1)
            X.5OE r0 = r3.A03
            r0.A00(r1, r2)
            X.58d r0 = X.C997758d.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION_BUT_BEFORE_SENDING_PASSKEY_TO_SERVER
            return r0
        L_0x00f3:
            boolean r0 = r9 instanceof X.C97714z7
            if (r0 == 0) goto L_0x0173
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5OE r1 = r3.A03
            r0 = 7
            r1.A00(r2, r0)
            X.4z7 r9 = (X.C97714z7) r9
            java.lang.Object r1 = r9.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server finishRegister start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r0 = r3.A04
            r6.L$0 = r3
            r6.label = r5
            java.lang.Object r9 = r0.A01(r1, r6)
            if (r9 != r7) goto L_0x002c
            return r7
        L_0x011a:
            X.5u1 r6 = new X.5u1
            r6.<init>(r11, r13)
            goto L_0x0012
        L_0x0121:
            boolean r0 = r9 instanceof X.C97704z6
            if (r0 == 0) goto L_0x013a
            X.4z6 r9 = (X.C97704z6) r9
            java.lang.Object r2 = r9.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server finishRegister error"
            com.whatsapp.util.Log.e(r0, r2)
            X.5OE r1 = r3.A03
            r0 = 11
            r1.A00(r2, r0)
            X.58d r0 = X.C997758d.ERROR_AFTER_USER_INTERACTION_AFTER_SENDING_PASSKEY_TO_SERVER
            return r0
        L_0x013a:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x013f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0144:
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client error before user interaction"
            com.whatsapp.util.Log.e(r0, r1)
            X.5OE r0 = r3.A03
            r0.A00(r1, r2)
            X.58d r0 = X.C997758d.ERROR_BEFORE_USER_INTERACTION
            return r0
        L_0x0151:
            java.lang.Throwable r2 = r1.A01
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client canceled"
            com.whatsapp.util.Log.i(r0, r2)
            X.5OE r1 = r3.A03
            r0 = 8
            r1.A00(r2, r0)
            X.58d r0 = X.C997758d.USER_CANCELED
            return r0
        L_0x0162:
            java.lang.Throwable r2 = r1.A01
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client ineligible"
            com.whatsapp.util.Log.i(r0, r2)
            X.5OE r1 = r3.A03
            r0 = 19
            r1.A00(r2, r0)
            X.58d r0 = X.C997758d.INELIGIBLE
            return r0
        L_0x0173:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x0178:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x017d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyFacade.A01(X.07r, X.4Du, X.4GP):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C84814Du r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C118625tq
            if (r0 == 0) goto L_0x0056
            r5 = r7
            X.5tq r5 = (X.C118625tq) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0056
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r5.label
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003f
            if (r0 != r1) goto L_0x0080
            java.lang.Object r1 = r5.L$0
            com.whatsapp.registration.passkeys.PasskeyFacade r1 = (com.whatsapp.registration.passkeys.PasskeyFacade) r1
            X.C57682u2.A01(r4)
        L_0x0025:
            X.5Bj r4 = (X.C100555Bj) r4
            boolean r0 = r4 instanceof X.C97704z6
            if (r0 == 0) goto L_0x005c
            X.4z6 r4 = (X.C97704z6) r4
            java.lang.Object r2 = r4.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r0 = "PasskeyFacade/checkPasskeyExists/server passkeyExists error"
            com.whatsapp.util.Log.e(r0, r2)
            X.5OE r1 = r1.A03
            r0 = 3
            r1.A00(r2, r0)
            X.587 r0 = X.AnonymousClass587.EXISTS_CHECK_ERROR
            return r0
        L_0x003f:
            X.C57682u2.A01(r4)
            X.5OE r0 = r6.A03
            r0.A00(r2, r1)
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r0 = r6.A04
            r5.L$0 = r6
            r5.label = r1
            java.lang.Object r4 = r0.A04(r5)
            if (r4 != r3) goto L_0x0054
            return r3
        L_0x0054:
            r1 = r6
            goto L_0x0025
        L_0x0056:
            X.5tq r5 = new X.5tq
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x005c:
            boolean r0 = r4 instanceof X.C97714z7
            if (r0 == 0) goto L_0x007b
            X.4z7 r4 = (X.C97714z7) r4
            java.lang.Object r0 = r4.A00
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "PasskeyFacade/checkPasskeyExists/server passkeyExists already_exists"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5OE r1 = r1.A03
            r0 = 2
            r1.A00(r2, r0)
            X.587 r0 = X.AnonymousClass587.ALREADY_HAS_PASSKEY
            return r0
        L_0x0078:
            X.587 r0 = X.AnonymousClass587.DOES_NOT_HAVE_PASSKEY
            return r0
        L_0x007b:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyFacade.A02(X.4Du):java.lang.Object");
    }

    public final boolean A03() {
        AnonymousClass5OE r4 = this.A03;
        r4.A00((Throwable) null, 17);
        C997658c A012 = this.A02.A01();
        C18260x0.A1R(AnonymousClass001.A0o(), "PasskeyFacade/checkAndLogEligibilityForCreationDuringRegFlow/passkeyEligibility ", A012);
        switch (A012.ordinal()) {
            case 0:
                return true;
            case 1:
                r4.A00(new C1000159b("not_rolled_out"), 18);
                return false;
            case 2:
                r4.A00(new C1000159b("android_too_old"), 18);
                return false;
            case 3:
                r4.A00(new C1000159b("device_not_secured"), 18);
                return false;
            case 4:
                r4.A00(new C1000159b("play_services_disabled"), 18);
                return false;
            default:
                r4.A00(new C1000159b("gms_too_old"), 18);
                return false;
        }
    }

    public PasskeyFacade(AnonymousClass33p r2, PasskeyAndroidApiImpl passkeyAndroidApiImpl, C105265Uf r4, AnonymousClass5OE r5, PasskeyServerApiImpl passkeyServerApiImpl) {
        C18260x0.A0Q(passkeyServerApiImpl, passkeyAndroidApiImpl);
        C162457s7.A0J(r2, 4);
        this.A04 = passkeyServerApiImpl;
        this.A01 = passkeyAndroidApiImpl;
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r5;
    }
}

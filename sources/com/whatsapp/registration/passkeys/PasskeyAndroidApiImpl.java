package com.whatsapp.registration.passkeys;

import X.C105265Uf;

public final class PasskeyAndroidApiImpl {
    public final C105265Uf A00;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        r0 = "PasskeyAndroidApi: Creating passkey: exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        r0 = "PasskeyAndroidApi: Creating passkey: AbortError";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bc, code lost:
        if ((r1 instanceof X.C008606z) != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ca, code lost:
        if (java.lang.Boolean.TRUE.equals(r3.A00.A03()) == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cc, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Creating passkey: Constraint Error (device not secured)", r5);
        r0 = X.AnonymousClass58P.INELIGIBLE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d4, code lost:
        r0 = "PasskeyAndroidApi: Creating passkey: Constraint Error (device secured)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        if ((r1 instanceof X.AnonymousClass078) != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00db, code lost:
        r0 = "PasskeyAndroidApi: Creating passkey: InvalidStateError";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e0, code lost:
        if ((r1 instanceof X.AnonymousClass07C) != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e2, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Creating passkey: NotAllowedError", r5);
        r0 = X.AnonymousClass58P.CANCELED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ec, code lost:
        if ((r1 instanceof X.AnonymousClass07F) != false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ee, code lost:
        r2 = X.AnonymousClass001.A1U((r3.A00.A00() > 230110000 ? 1 : (r3.A00.A00() == 230110000 ? 0 : -1)));
        X.C18260x0.A1E("PasskeyEligibility / gmsVersionIsNewEnough : ", X.AnonymousClass001.A0o(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0106, code lost:
        if (r2 == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0108, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Creating passkey: NotSupportedError (gms too old)", r5);
        r0 = X.AnonymousClass58P.INELIGIBLE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0110, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Creating passkey: NotSupportedError (gms new enough)", r5);
        r0 = X.AnonymousClass58P.ERROR_BEFORE_USER_INTERACTION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011a, code lost:
        if ((r1 instanceof X.AnonymousClass07K) != false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011c, code lost:
        r0 = "PasskeyAndroidApi: Creating passkey: SecurityError";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0121, code lost:
        if ((r1 instanceof X.AnonymousClass07M) != false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0123, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Creating passkey: TimeoutError", r5);
        r0 = X.AnonymousClass58P.CANCELED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012b, code lost:
        r0 = "PasskeyAndroidApi: Creating passkey: Other Error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012e, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012f, code lost:
        r0 = "PasskeyAndroidApi: Creating passkey: unknown exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013c, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Creating passkey: ineligible. play services not available", r2);
        r0 = X.AnonymousClass58P.INELIGIBLE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0144, code lost:
        r0 = "PasskeyAndroidApi: Creating passkey: credential provider configuration exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0147, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0148, code lost:
        r0 = "PasskeyAndroidApi: Creating passkey: no create option";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014b, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014c, code lost:
        r0 = "PasskeyAndroidApi: Creating passkey: unsupported";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014e, code lost:
        com.whatsapp.util.Log.i(r0, r2);
        r0 = X.AnonymousClass58P.ERROR_BEFORE_USER_INTERACTION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0154, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0155, code lost:
        r0 = "PasskeyAndroidApi: Creating passkey: interrupted";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0158, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0159, code lost:
        r0 = "PasskeyAndroidApi: Creating passkey: custom exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015c, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015d, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Creating passkey: cancelled", r2);
        r0 = X.AnonymousClass58P.CANCELED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0165, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0166, code lost:
        r0 = "PasskeyAndroidApi: Creating passkey: public key exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0168, code lost:
        com.whatsapp.util.Log.i(r0, r2);
        r0 = X.AnonymousClass58P.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x016d, code lost:
        r1 = new X.C104645Ru(r0, r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:13:0x0044, B:17:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d A[ExcHandler: 0GP (e X.0GP), Splitter:B:13:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012e A[ExcHandler: 06o (e X.06o), Splitter:B:13:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0147 A[ExcHandler: 06m (e X.06m), Splitter:B:13:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014b A[ExcHandler: 06p (e X.06p), Splitter:B:13:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0154 A[ExcHandler: 06l (e X.06l), Splitter:B:13:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0158 A[ExcHandler: 06i (e X.06i), Splitter:B:13:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015c A[ExcHandler: 06k (e X.06k), Splitter:B:13:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0165 A[ExcHandler: 06j (e X.06j), Splitter:B:13:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A00(X.C009707r r12, java.lang.String r13, X.C84814Du r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C118605to
            if (r0 == 0) goto L_0x0022
            r4 = r14
            X.5to r4 = (X.C118605to) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.218 r2 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r3) goto L_0x0028
            java.lang.Object r3 = r4.L$0
            com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl r3 = (com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl) r3
            goto L_0x006f
        L_0x0022:
            X.5to r4 = new X.5to
            r4.<init>(r11, r14)
            goto L_0x0012
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x002d:
            X.C57682u2.A01(r1)
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r6 = r12
            X.C162457s7.A0J(r12, r0)
            X.0dX r5 = new X.0dX
            r5.<init>(r12)
            X.06X r7 = new X.06X
            r7.<init>(r13)
            r4.L$0 = r11     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x0132, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0092, 06j -> 0x0165, 0GP -> 0x008d }
            r4.label = r3     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x0132, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0092, 06j -> 0x0165, 0GP -> 0x008d }
            X.46G r1 = X.C57702u4.A03(r4)     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x0132, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0092, 06j -> 0x0165, 0GP -> 0x008d }
            android.os.CancellationSignal r8 = new android.os.CancellationSignal     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x0132, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0092, 06j -> 0x0165, 0GP -> 0x008d }
            r8.<init>()     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x0132, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0092, 06j -> 0x0165, 0GP -> 0x008d }
            X.0p4 r0 = new X.0p4     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x0132, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0092, 06j -> 0x0165, 0GP -> 0x008d }
            r0.<init>(r8)     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x0132, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0092, 06j -> 0x0165, 0GP -> 0x008d }
            r1.BGs(r0)     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x0132, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0092, 06j -> 0x0165, 0GP -> 0x008d }
            r0 = 0
            X.0ww r10 = new X.0ww     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x0132, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0092, 06j -> 0x0165, 0GP -> 0x008d }
            r10.<init>(r1, r0)     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x0132, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0092, 06j -> 0x0165, 0GP -> 0x008d }
            X.0wb r9 = new X.0wb     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x0132, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0092, 06j -> 0x0165, 0GP -> 0x008d }
            r9.<init>(r3)     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x0132, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0092, 06j -> 0x0165, 0GP -> 0x008d }
            r5.B0W(r6, r7, r8, r9, r10)     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x0132, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0092, 06j -> 0x0165, 0GP -> 0x008d }
            java.lang.Object r1 = r1.A06()     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x0132, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0092, 06j -> 0x0165, 0GP -> 0x008d }
            if (r1 == r2) goto L_0x0177
            r3 = r11
            goto L_0x0072
        L_0x006f:
            X.C57682u2.A01(r1)     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x008a, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0088, 06j -> 0x0165, 0GP -> 0x008d }
        L_0x0072:
            X.0KR r1 = (X.AnonymousClass0KR) r1     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x008a, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0088, 06j -> 0x0165, 0GP -> 0x008d }
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x008a, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0088, 06j -> 0x0165, 0GP -> 0x008d }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.credentials.CreatePublicKeyCredentialResponse"
            X.C162457s7.A0K(r1, r0)     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x008a, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0088, 06j -> 0x0165, 0GP -> 0x008d }
            X.06Z r1 = (X.AnonymousClass06Z) r1     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x008a, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0088, 06j -> 0x0165, 0GP -> 0x008d }
            java.lang.String r0 = r1.A00     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x008a, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0088, 06j -> 0x0165, 0GP -> 0x008d }
            X.4z7 r2 = new X.4z7     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x008a, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0088, 06j -> 0x0165, 0GP -> 0x008d }
            r2.<init>(r0)     // Catch:{ 06k -> 0x015c, 06i -> 0x0158, 06l -> 0x0154, 06m -> 0x0147, 06n -> 0x008a, 06o -> 0x012e, 06p -> 0x014b, 07R -> 0x0088, 06j -> 0x0165, 0GP -> 0x008d }
            return r2
        L_0x0088:
            r5 = move-exception
            goto L_0x0094
        L_0x008a:
            r2 = move-exception
            goto L_0x0134
        L_0x008d:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: exception"
            goto L_0x0168
        L_0x0092:
            r5 = move-exception
            r3 = r11
        L_0x0094:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: public key dom exception ("
            r1.append(r0)
            X.0KV r0 = r5.domError
            java.lang.String r0 = X.C18260x0.A04(r0, r1)
            com.whatsapp.util.Log.i(r0, r5)
            X.0KV r1 = r5.domError
            boolean r0 = r1 instanceof X.C008506y
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: AbortError"
        L_0x00ae:
            com.whatsapp.util.Log.i(r0, r5)
            X.58P r0 = X.AnonymousClass58P.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION
        L_0x00b3:
            X.5Ru r1 = new X.5Ru
            r1.<init>(r0, r5)
            goto L_0x0172
        L_0x00ba:
            boolean r0 = r1 instanceof X.C008606z
            if (r0 == 0) goto L_0x00d7
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.5Uf r0 = r3.A00
            java.lang.Boolean r0 = r0.A03()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00d4
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: Constraint Error (device not secured)"
            com.whatsapp.util.Log.i(r0, r5)
            X.58P r0 = X.AnonymousClass58P.INELIGIBLE
            goto L_0x00b3
        L_0x00d4:
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: Constraint Error (device secured)"
            goto L_0x00ae
        L_0x00d7:
            boolean r0 = r1 instanceof X.AnonymousClass078
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: InvalidStateError"
            goto L_0x00ae
        L_0x00de:
            boolean r0 = r1 instanceof X.AnonymousClass07C
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: NotAllowedError"
            com.whatsapp.util.Log.i(r0, r5)
            X.58P r0 = X.AnonymousClass58P.CANCELED
            goto L_0x00b3
        L_0x00ea:
            boolean r0 = r1 instanceof X.AnonymousClass07F
            if (r0 == 0) goto L_0x0118
            X.5Uf r0 = r3.A00
            long r3 = r0.A00()
            r1 = 230110000(0xdb73330, double:1.13689446E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r2 = X.AnonymousClass001.A1U(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PasskeyEligibility / gmsVersionIsNewEnough : "
            X.C18260x0.A1E(r0, r1, r2)
            if (r2 != 0) goto L_0x0110
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: NotSupportedError (gms too old)"
            com.whatsapp.util.Log.i(r0, r5)
            X.58P r0 = X.AnonymousClass58P.INELIGIBLE
            goto L_0x00b3
        L_0x0110:
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: NotSupportedError (gms new enough)"
            com.whatsapp.util.Log.i(r0, r5)
            X.58P r0 = X.AnonymousClass58P.ERROR_BEFORE_USER_INTERACTION
            goto L_0x00b3
        L_0x0118:
            boolean r0 = r1 instanceof X.AnonymousClass07K
            if (r0 == 0) goto L_0x011f
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: SecurityError"
            goto L_0x00ae
        L_0x011f:
            boolean r0 = r1 instanceof X.AnonymousClass07M
            if (r0 == 0) goto L_0x012b
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: TimeoutError"
            com.whatsapp.util.Log.i(r0, r5)
            X.58P r0 = X.AnonymousClass58P.CANCELED
            goto L_0x00b3
        L_0x012b:
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: Other Error"
            goto L_0x00ae
        L_0x012e:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: unknown exception"
            goto L_0x0168
        L_0x0132:
            r2 = move-exception
            r3 = r11
        L_0x0134:
            X.5Uf r0 = r3.A00
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x0144
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: ineligible. play services not available"
            com.whatsapp.util.Log.i(r0, r2)
            X.58P r0 = X.AnonymousClass58P.INELIGIBLE
            goto L_0x016d
        L_0x0144:
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: credential provider configuration exception"
            goto L_0x014e
        L_0x0147:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: no create option"
            goto L_0x014e
        L_0x014b:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: unsupported"
        L_0x014e:
            com.whatsapp.util.Log.i(r0, r2)
            X.58P r0 = X.AnonymousClass58P.ERROR_BEFORE_USER_INTERACTION
            goto L_0x016d
        L_0x0154:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: interrupted"
            goto L_0x0168
        L_0x0158:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: custom exception"
            goto L_0x0168
        L_0x015c:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: cancelled"
            com.whatsapp.util.Log.i(r0, r2)
            X.58P r0 = X.AnonymousClass58P.CANCELED
            goto L_0x016d
        L_0x0165:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: public key exception"
        L_0x0168:
            com.whatsapp.util.Log.i(r0, r2)
            X.58P r0 = X.AnonymousClass58P.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION
        L_0x016d:
            X.5Ru r1 = new X.5Ru
            r1.<init>(r0, r2)
        L_0x0172:
            X.4z6 r2 = new X.4z6
            r2.<init>(r1)
        L_0x0177:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl.A00(X.07r, java.lang.String, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0096, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0099, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009a, code lost:
        r0 = "PasskeyAndroidApi: Logging in with passkey: exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b8, code lost:
        r0 = "PasskeyAndroidApi: Logging in with passkey: AbortError";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c8, code lost:
        if ((r1 instanceof X.C008606z) != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d6, code lost:
        if (java.lang.Boolean.TRUE.equals(r3.A00.A03()) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d8, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Logging in with passkey: Constraint Error (device not secured)", r5);
        r0 = X.AnonymousClass58Z.INELIGIBLE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e0, code lost:
        r0 = "PasskeyAndroidApi: Logging in with passkey: Constraint Error (device secured)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e5, code lost:
        if ((r1 instanceof X.AnonymousClass07C) != false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e7, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Logging in with passkey: NotAllowedError", r5);
        r0 = X.AnonymousClass58Z.CANCELED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f1, code lost:
        if ((r1 instanceof X.AnonymousClass07F) != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f3, code lost:
        r2 = X.AnonymousClass001.A1U((r3.A00.A00() > 230815045 ? 1 : (r3.A00.A00() == 230815045 ? 0 : -1)));
        X.C18260x0.A1E("PasskeyEligibility / gmsVersionIsNewEnough : ", X.AnonymousClass001.A0o(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010b, code lost:
        if (r2 == false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010d, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Logging in with passkey: NotSupportedError (gms too old)", r5);
        r0 = X.AnonymousClass58Z.INELIGIBLE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0115, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Logging in with passkey: NotSupportedError (gms new enough)", r5);
        r0 = X.AnonymousClass58Z.ERROR_BEFORE_USER_INTERACTION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011f, code lost:
        if ((r1 instanceof X.AnonymousClass07K) != false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0121, code lost:
        r0 = "PasskeyAndroidApi: Logging in with passkey: SecurityError";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0126, code lost:
        if ((r1 instanceof X.AnonymousClass07M) != false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0128, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Logging in with passkey: TimeoutError", r5);
        r0 = X.AnonymousClass58Z.CANCELED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0130, code lost:
        r0 = "PasskeyAndroidApi: Logging in with passkey: Other Error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0133, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0134, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Logging in with passkey: no credentials", r2);
        r0 = X.AnonymousClass58Z.NO_PASSKEY_AVAILABLE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013c, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013d, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Logging in with passkey: unsupported", r2);
        r0 = X.AnonymousClass58Z.ERROR_BEFORE_USER_INTERACTION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0145, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0146, code lost:
        r0 = "PasskeyAndroidApi: Logging in with passkey: unknown exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0153, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Logging in with passkey: ineligible. play services not available", r2);
        r0 = X.AnonymousClass58Z.INELIGIBLE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015b, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Logging in with passkey: credential provider configuration exception", r2);
        r0 = X.AnonymousClass58Z.ERROR_BEFORE_USER_INTERACTION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0163, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0164, code lost:
        r0 = "PasskeyAndroidApi: Logging in with passkey: interrupted";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0167, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0168, code lost:
        r0 = "PasskeyAndroidApi: Logging in with passkey: custom exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x016b, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016c, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Logging in with passkey: cancelled", r2);
        r0 = X.AnonymousClass58Z.CANCELED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0174, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0175, code lost:
        r0 = "PasskeyAndroidApi: Logging in with passkey: public key exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0177, code lost:
        com.whatsapp.util.Log.i(r0, r2);
        r0 = X.AnonymousClass58Z.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:13:0x004f, B:17:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099 A[ExcHandler: 0GQ (e X.0GQ), Splitter:B:13:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0133 A[ExcHandler: 06x (e X.06x), Splitter:B:13:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013c A[ExcHandler: 06w (e X.06w), Splitter:B:13:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0145 A[ExcHandler: 06v (e X.06v), Splitter:B:13:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0163 A[ExcHandler: 06t (e X.06t), Splitter:B:13:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0167 A[ExcHandler: 06q (e X.06q), Splitter:B:13:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016b A[ExcHandler: 06s (e X.06s), Splitter:B:13:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0174 A[ExcHandler: 06r (e X.06r), Splitter:B:13:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(X.C009707r r12, java.lang.String r13, X.C84814Du r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C118615tp
            if (r0 == 0) goto L_0x0022
            r4 = r14
            X.5tp r4 = (X.C118615tp) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.218 r2 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r3) goto L_0x0028
            java.lang.Object r3 = r4.L$0
            com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl r3 = (com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl) r3
            goto L_0x0079
        L_0x0022:
            X.5tp r4 = new X.5tp
            r4.<init>(r11, r14)
            goto L_0x0012
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x002d:
            X.C57682u2.A01(r1)
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r6 = r12
            X.C162457s7.A0J(r12, r0)
            X.0dX r5 = new X.0dX
            r5.<init>(r12)
            X.3d7 r1 = X.C72063d7.A00
            X.06f r0 = new X.06f
            r0.<init>(r13, r1)
            java.util.List r0 = X.C18290x4.A12(r0)
            X.0KT r7 = new X.0KT
            r7.<init>(r0)
            r4.L$0 = r11     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0149, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x009e, 06r -> 0x0174, 0GQ -> 0x0099 }
            r4.label = r3     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0149, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x009e, 06r -> 0x0174, 0GQ -> 0x0099 }
            X.46G r1 = X.C57702u4.A03(r4)     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0149, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x009e, 06r -> 0x0174, 0GQ -> 0x0099 }
            android.os.CancellationSignal r8 = new android.os.CancellationSignal     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0149, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x009e, 06r -> 0x0174, 0GQ -> 0x0099 }
            r8.<init>()     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0149, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x009e, 06r -> 0x0174, 0GQ -> 0x0099 }
            X.0p5 r0 = new X.0p5     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0149, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x009e, 06r -> 0x0174, 0GQ -> 0x0099 }
            r0.<init>(r8)     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0149, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x009e, 06r -> 0x0174, 0GQ -> 0x0099 }
            r1.BGs(r0)     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0149, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x009e, 06r -> 0x0174, 0GQ -> 0x0099 }
            X.0ww r10 = new X.0ww     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0149, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x009e, 06r -> 0x0174, 0GQ -> 0x0099 }
            r10.<init>(r1, r3)     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0149, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x009e, 06r -> 0x0174, 0GQ -> 0x0099 }
            X.0wb r9 = new X.0wb     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0149, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x009e, 06r -> 0x0174, 0GQ -> 0x0099 }
            r9.<init>(r3)     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0149, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x009e, 06r -> 0x0174, 0GQ -> 0x0099 }
            r5.B6G(r6, r7, r8, r9, r10)     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0149, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x009e, 06r -> 0x0174, 0GQ -> 0x0099 }
            java.lang.Object r1 = r1.A06()     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0149, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x009e, 06r -> 0x0174, 0GQ -> 0x0099 }
            if (r1 == r2) goto L_0x0186
            r3 = r11
            goto L_0x007c
        L_0x0079:
            X.C57682u2.A01(r1)     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0096, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x0094, 06r -> 0x0174, 0GQ -> 0x0099 }
        L_0x007c:
            X.0KU r1 = (X.AnonymousClass0KU) r1     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0096, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x0094, 06r -> 0x0174, 0GQ -> 0x0099 }
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0096, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x0094, 06r -> 0x0174, 0GQ -> 0x0099 }
            X.0KS r1 = r1.A00     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0096, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x0094, 06r -> 0x0174, 0GQ -> 0x0099 }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.credentials.PublicKeyCredential"
            X.C162457s7.A0K(r1, r0)     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0096, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x0094, 06r -> 0x0174, 0GQ -> 0x0099 }
            X.06c r1 = (X.C006306c) r1     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0096, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x0094, 06r -> 0x0174, 0GQ -> 0x0099 }
            java.lang.String r0 = r1.A00     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0096, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x0094, 06r -> 0x0174, 0GQ -> 0x0099 }
            X.4z7 r2 = new X.4z7     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0096, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x0094, 06r -> 0x0174, 0GQ -> 0x0099 }
            r2.<init>(r0)     // Catch:{ 06s -> 0x016b, 06q -> 0x0167, 06t -> 0x0163, 06u -> 0x0096, 06v -> 0x0145, 06w -> 0x013c, 06x -> 0x0133, 07S -> 0x0094, 06r -> 0x0174, 0GQ -> 0x0099 }
            return r2
        L_0x0094:
            r5 = move-exception
            goto L_0x00a0
        L_0x0096:
            r2 = move-exception
            goto L_0x014b
        L_0x0099:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: exception"
            goto L_0x0177
        L_0x009e:
            r5 = move-exception
            r3 = r11
        L_0x00a0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: public key dom exception ("
            r1.append(r0)
            X.0KV r0 = r5.domError
            java.lang.String r0 = X.C18260x0.A04(r0, r1)
            com.whatsapp.util.Log.i(r0, r5)
            X.0KV r1 = r5.domError
            boolean r0 = r1 instanceof X.C008506y
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: AbortError"
        L_0x00ba:
            com.whatsapp.util.Log.i(r0, r5)
            X.58Z r0 = X.AnonymousClass58Z.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION
        L_0x00bf:
            X.5Rv r1 = new X.5Rv
            r1.<init>(r0, r5)
            goto L_0x0181
        L_0x00c6:
            boolean r0 = r1 instanceof X.C008606z
            if (r0 == 0) goto L_0x00e3
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.5Uf r0 = r3.A00
            java.lang.Boolean r0 = r0.A03()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00e0
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: Constraint Error (device not secured)"
            com.whatsapp.util.Log.i(r0, r5)
            X.58Z r0 = X.AnonymousClass58Z.INELIGIBLE
            goto L_0x00bf
        L_0x00e0:
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: Constraint Error (device secured)"
            goto L_0x00ba
        L_0x00e3:
            boolean r0 = r1 instanceof X.AnonymousClass07C
            if (r0 == 0) goto L_0x00ef
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: NotAllowedError"
            com.whatsapp.util.Log.i(r0, r5)
            X.58Z r0 = X.AnonymousClass58Z.CANCELED
            goto L_0x00bf
        L_0x00ef:
            boolean r0 = r1 instanceof X.AnonymousClass07F
            if (r0 == 0) goto L_0x011d
            X.5Uf r0 = r3.A00
            long r3 = r0.A00()
            r1 = 230815045(0xdc1f545, double:1.140377843E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r2 = X.AnonymousClass001.A1U(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PasskeyEligibility / gmsVersionIsNewEnough : "
            X.C18260x0.A1E(r0, r1, r2)
            if (r2 != 0) goto L_0x0115
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: NotSupportedError (gms too old)"
            com.whatsapp.util.Log.i(r0, r5)
            X.58Z r0 = X.AnonymousClass58Z.INELIGIBLE
            goto L_0x00bf
        L_0x0115:
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: NotSupportedError (gms new enough)"
            com.whatsapp.util.Log.i(r0, r5)
            X.58Z r0 = X.AnonymousClass58Z.ERROR_BEFORE_USER_INTERACTION
            goto L_0x00bf
        L_0x011d:
            boolean r0 = r1 instanceof X.AnonymousClass07K
            if (r0 == 0) goto L_0x0124
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: SecurityError"
            goto L_0x00ba
        L_0x0124:
            boolean r0 = r1 instanceof X.AnonymousClass07M
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: TimeoutError"
            com.whatsapp.util.Log.i(r0, r5)
            X.58Z r0 = X.AnonymousClass58Z.CANCELED
            goto L_0x00bf
        L_0x0130:
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: Other Error"
            goto L_0x00ba
        L_0x0133:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: no credentials"
            com.whatsapp.util.Log.i(r0, r2)
            X.58Z r0 = X.AnonymousClass58Z.NO_PASSKEY_AVAILABLE
            goto L_0x017c
        L_0x013c:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: unsupported"
            com.whatsapp.util.Log.i(r0, r2)
            X.58Z r0 = X.AnonymousClass58Z.ERROR_BEFORE_USER_INTERACTION
            goto L_0x017c
        L_0x0145:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: unknown exception"
            goto L_0x0177
        L_0x0149:
            r2 = move-exception
            r3 = r11
        L_0x014b:
            X.5Uf r0 = r3.A00
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x015b
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: ineligible. play services not available"
            com.whatsapp.util.Log.i(r0, r2)
            X.58Z r0 = X.AnonymousClass58Z.INELIGIBLE
            goto L_0x017c
        L_0x015b:
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: credential provider configuration exception"
            com.whatsapp.util.Log.i(r0, r2)
            X.58Z r0 = X.AnonymousClass58Z.ERROR_BEFORE_USER_INTERACTION
            goto L_0x017c
        L_0x0163:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: interrupted"
            goto L_0x0177
        L_0x0167:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: custom exception"
            goto L_0x0177
        L_0x016b:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: cancelled"
            com.whatsapp.util.Log.i(r0, r2)
            X.58Z r0 = X.AnonymousClass58Z.CANCELED
            goto L_0x017c
        L_0x0174:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: public key exception"
        L_0x0177:
            com.whatsapp.util.Log.i(r0, r2)
            X.58Z r0 = X.AnonymousClass58Z.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION
        L_0x017c:
            X.5Rv r1 = new X.5Rv
            r1.<init>(r0, r2)
        L_0x0181:
            X.4z6 r2 = new X.4z6
            r2.<init>(r1)
        L_0x0186:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl.A01(X.07r, java.lang.String, X.4Du):java.lang.Object");
    }

    public PasskeyAndroidApiImpl(C105265Uf r1) {
        this.A00 = r1;
    }
}

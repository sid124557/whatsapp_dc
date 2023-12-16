package com.whatsapp.chatlock.passcode;

import X.AnonymousClass4GR;
import X.C105095To;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$validatePasscode$3", f = "ChatLockPasscodeManager.kt", i = {}, l = {209}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$validatePasscode$3 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $attempt;
    public int label;
    public final /* synthetic */ C105095To this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$validatePasscode$3(C105095To r2, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$attempt = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r5 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        if (r1 != r4.A01) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r13) {
        /*
            r12 = this;
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r12.label
            r2 = 1
            if (r0 == 0) goto L_0x0010
            if (r0 != r2) goto L_0x000b
            goto L_0x00b0
        L_0x000b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0010:
            X.C57682u2.A01(r13)
            X.5To r0 = r12.this$0     // Catch:{ Exception -> 0x00d2 }
            X.5My r4 = r0.A03     // Catch:{ Exception -> 0x00d2 }
            X.6cL r5 = r4.A00     // Catch:{ IOException -> 0x00b9 }
            if (r5 != 0) goto L_0x0032
            java.io.File r0 = r4.A00()     // Catch:{ IOException -> 0x00b9 }
            byte[] r1 = X.C627536m.A0V(r0)     // Catch:{ IOException -> 0x00b9 }
            X.C162457s7.A0D(r1)     // Catch:{ IOException -> 0x00b9 }
            X.6cL r0 = X.C130666cL.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x00b9 }
            X.6cX r5 = X.C130786cX.A05(r0, r1)     // Catch:{ IOException -> 0x00b9 }
            X.6cL r5 = (X.C130666cL) r5     // Catch:{ IOException -> 0x00b9 }
            r4.A00 = r5     // Catch:{ IOException -> 0x00b9 }
            if (r5 == 0) goto L_0x00cb
        L_0x0032:
            java.lang.String r9 = r12.$attempt     // Catch:{ Exception -> 0x00d2 }
            X.5To r4 = r12.this$0     // Catch:{ Exception -> 0x00d2 }
            X.5WP r6 = X.AnonymousClass5WP.A00     // Catch:{ Exception -> 0x00d2 }
            int r0 = r5.encoding_     // Catch:{ Exception -> 0x00d2 }
            if (r0 == 0) goto L_0x0046
            X.59T r7 = X.AnonymousClass59T.UNRECOGNIZED     // Catch:{ Exception -> 0x00d2 }
        L_0x003e:
            X.C162457s7.A0D(r7)     // Catch:{ Exception -> 0x00d2 }
            int r0 = r5.transformer_     // Catch:{ Exception -> 0x00d2 }
            if (r0 == 0) goto L_0x004f
            goto L_0x0049
        L_0x0046:
            X.59T r7 = X.AnonymousClass59T.UTF8     // Catch:{ Exception -> 0x00d2 }
            goto L_0x003e
        L_0x0049:
            if (r0 == r2) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            X.59U r8 = X.AnonymousClass59U.PBKDF2_HMAC_SHA512     // Catch:{ Exception -> 0x00d2 }
            goto L_0x0054
        L_0x004f:
            X.59U r8 = X.AnonymousClass59U.NONE     // Catch:{ Exception -> 0x00d2 }
            goto L_0x0054
        L_0x0052:
            X.59U r8 = X.AnonymousClass59U.UNRECOGNIZED     // Catch:{ Exception -> 0x00d2 }
        L_0x0054:
            X.C162457s7.A0D(r8)     // Catch:{ Exception -> 0x00d2 }
            X.8Lq r0 = r5.transformedData_     // Catch:{ Exception -> 0x00d2 }
            int r11 = r0.A03()     // Catch:{ Exception -> 0x00d2 }
            X.8Tq r0 = r5.transformerArgsMap_     // Catch:{ Exception -> 0x00d2 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ Exception -> 0x00d2 }
            X.C162457s7.A0D(r0)     // Catch:{ Exception -> 0x00d2 }
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x00d2 }
            r10.<init>(r0)     // Catch:{ Exception -> 0x00d2 }
            X.6cL r0 = r6.A00(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00d2 }
            X.8Lq r1 = r0.transformedData_     // Catch:{ Exception -> 0x00d2 }
            X.8Lq r0 = r5.transformedData_     // Catch:{ Exception -> 0x00d2 }
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ Exception -> 0x00d2 }
            if (r0 == 0) goto L_0x00b6
            r12.label = r2     // Catch:{ Exception -> 0x00d2 }
            int r0 = r5.encoding_     // Catch:{ Exception -> 0x00d2 }
            if (r0 == 0) goto L_0x008a
            X.59T r1 = X.AnonymousClass59T.UNRECOGNIZED     // Catch:{ Exception -> 0x00d2 }
        L_0x0081:
            X.59T r0 = r4.A00     // Catch:{ Exception -> 0x00d2 }
            if (r1 != r0) goto L_0x009c
            int r0 = r5.transformer_     // Catch:{ Exception -> 0x00d2 }
            if (r0 == 0) goto L_0x0093
            goto L_0x008d
        L_0x008a:
            X.59T r1 = X.AnonymousClass59T.UTF8     // Catch:{ Exception -> 0x00d2 }
            goto L_0x0081
        L_0x008d:
            if (r0 == r2) goto L_0x0090
            goto L_0x0096
        L_0x0090:
            X.59U r1 = X.AnonymousClass59U.PBKDF2_HMAC_SHA512     // Catch:{ Exception -> 0x00d2 }
            goto L_0x0098
        L_0x0093:
            X.59U r1 = X.AnonymousClass59U.NONE     // Catch:{ Exception -> 0x00d2 }
            goto L_0x0098
        L_0x0096:
            X.59U r1 = X.AnonymousClass59U.UNRECOGNIZED     // Catch:{ Exception -> 0x00d2 }
        L_0x0098:
            X.59U r0 = r4.A01     // Catch:{ Exception -> 0x00d2 }
            if (r1 == r0) goto L_0x00ab
        L_0x009c:
            X.3gB r2 = r4.A05     // Catch:{ Exception -> 0x00d2 }
            r1 = 0
            com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$3 r0 = new com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$3     // Catch:{ Exception -> 0x00d2 }
            r0.<init>(r4, r9, r1)     // Catch:{ Exception -> 0x00d2 }
            java.lang.Object r0 = X.C616131n.A00(r12, r2, r0)     // Catch:{ Exception -> 0x00d2 }
            if (r0 != r3) goto L_0x00ab
            return r3
        L_0x00ab:
            X.2wD r0 = X.C59022wD.A00     // Catch:{ Exception -> 0x00d2 }
            if (r0 != r3) goto L_0x00b3
            return r3
        L_0x00b0:
            X.C57682u2.A01(r13)     // Catch:{ Exception -> 0x00d2 }
        L_0x00b3:
            X.4kb r1 = X.C91634kb.A00     // Catch:{ Exception -> 0x00d2 }
            return r1
        L_0x00b6:
            X.4ka r1 = X.C91624ka.A00     // Catch:{ Exception -> 0x00d2 }
            return r1
        L_0x00b9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r0 = "ChatLockUserPasscodeStorage/getStoredPasscode: "
            java.lang.String r1 = X.AnonymousClass000.A0a(r0, r1, r2)     // Catch:{ Exception -> 0x00d2 }
            java.lang.Throwable r0 = r2.getCause()     // Catch:{ Exception -> 0x00d2 }
            com.whatsapp.util.Log.e(r1, r0)     // Catch:{ Exception -> 0x00d2 }
        L_0x00cb:
            r0 = 4
            X.4kZ r1 = new X.4kZ     // Catch:{ Exception -> 0x00d2 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00d2 }
            return r1
        L_0x00d2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ChatLockPasscodeManager/validatePasscode: "
            java.lang.String r1 = X.AnonymousClass000.A0a(r0, r1, r2)
            java.lang.Throwable r0 = r2.getCause()
            com.whatsapp.util.Log.e(r1, r0)
            r0 = 0
            X.4kZ r1 = new X.4kZ
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$validatePasscode$3.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ChatLockPasscodeManager$validatePasscode$3(this.this$0, this.$attempt, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

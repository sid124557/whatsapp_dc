package com.whatsapp.calling.avatar;

import X.AnonymousClass1VX;
import X.AnonymousClass218;
import X.AnonymousClass59B;
import X.AnonymousClass5HP;
import X.AnonymousClass5HQ;
import X.AnonymousClass66R;
import X.C103425Mx;
import X.C162457s7;
import X.C18260x0;
import X.C18280x3;
import X.C18310x6;
import X.C57162tC;
import X.C59022wD;
import X.C84814Du;

public final class CallAvatarFLMConsentManager {
    public Boolean A00;
    public final C103425Mx A01;
    public final AnonymousClass5HP A02;
    public final AnonymousClass5HQ A03;
    public final C57162tC A04;
    public final AnonymousClass1VX A05;

    public final AnonymousClass59B A00() {
        int A0N = this.A05.A0N(3221);
        for (AnonymousClass59B r1 : AnonymousClass59B.A00) {
            if (r1.abPropsValue == A0N) {
                return r1;
            }
        }
        return AnonymousClass59B.DISABLED;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.Boolean r10, X.C84814Du r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C118665tu
            if (r0 == 0) goto L_0x00ff
            r5 = r11
            X.5tu r5 = (X.C118665tu) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ff
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r3 = r5.result
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0056
            if (r1 == r0) goto L_0x007a
            if (r1 != r2) goto L_0x0106
            java.lang.Object r10 = r5.L$1
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Object r4 = r5.L$0
            com.whatsapp.calling.avatar.CallAvatarFLMConsentManager r4 = (com.whatsapp.calling.avatar.CallAvatarFLMConsentManager) r4
            X.C57682u2.A01(r3)
        L_0x002b:
            X.5AE r3 = (X.AnonymousClass5AE) r3
            X.4ip r0 = X.C91054ip.A00
            boolean r0 = X.C162457s7.A0P(r3, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "CallAvatarFLMConsentManager/setConsentResult Success"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x003a:
            r4.A00 = r10
        L_0x003c:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x003f:
            boolean r0 = r3 instanceof X.C91044io
            if (r0 == 0) goto L_0x003c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallAvatarFLMConsentManager/setConsentResult Error "
            r1.append(r0)
            X.4io r3 = (X.C91044io) r3
            int r0 = r3.A00
            X.C18260x0.A1F(r1, r0)
            X.4ih r0 = X.C90974ih.A00
            throw r0
        L_0x0056:
            X.C57682u2.A01(r3)
            if (r10 != 0) goto L_0x0065
            java.lang.Boolean r0 = r9.A00
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "CallAvatarFLMConsentManager/setConsentResult Attempting to set a non-null result to null"
        L_0x0061:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x003c
        L_0x0065:
            java.lang.Boolean r0 = r9.A00
            boolean r0 = X.C162457s7.A0P(r10, r0)
            if (r0 != 0) goto L_0x0077
            X.59B r1 = r9.A00()
            X.59B r0 = X.AnonymousClass59B.DISABLED
            if (r1 == r0) goto L_0x0077
            r4 = r9
            goto L_0x0085
        L_0x0077:
            java.lang.String r0 = "CallAvatarFLMConsentManager/setConsentResult No need for an update"
            goto L_0x0061
        L_0x007a:
            java.lang.Object r10 = r5.L$1
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Object r4 = r5.L$0
            com.whatsapp.calling.avatar.CallAvatarFLMConsentManager r4 = (com.whatsapp.calling.avatar.CallAvatarFLMConsentManager) r4
            X.C57682u2.A01(r3)
        L_0x0085:
            X.59B r1 = r4.A00()
            X.59B r0 = X.AnonymousClass59B.US
            if (r1 == r0) goto L_0x00ae
            X.5Mx r0 = r4.A01
            java.lang.String r2 = "pref_flm_consent_result"
            X.66R r0 = r0.A01
            if (r10 != 0) goto L_0x00a1
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A04(r0)
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)
        L_0x009d:
            r0.apply()
            goto L_0x003a
        L_0x00a1:
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A04(r0)
            boolean r0 = r10.booleanValue()
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r2, r0)
            goto L_0x009d
        L_0x00ae:
            X.5HQ r3 = r4.A03
            r5.L$0 = r4
            r5.L$1 = r10
            r5.label = r2
            X.31C r0 = r3.A00
            java.lang.String r2 = r0.A03()
            if (r10 != 0) goto L_0x00e4
            r0 = 0
        L_0x00c0:
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r0)
            X.1wi r7 = new X.1wi
            r7.<init>((java.lang.Long) r8)
            r1 = 0
            X.1wi r0 = new X.1wi
            r0.<init>(r2, r1)
            X.1xJ r8 = new X.1xJ
            r8.<init>((X.C35341wi) r7, (X.C35341wi) r0)
            X.3gB r7 = r3.A01
            r1 = 0
            com.whatsapp.calling.avatar.data.protocol.SetFLMConsentResultProtocol$sendRequest$2 r0 = new com.whatsapp.calling.avatar.data.protocol.SetFLMConsentResultProtocol$sendRequest$2
            r0.<init>(r3, r8, r2, r1)
            java.lang.Object r3 = X.C616131n.A00(r5, r7, r0)
            if (r3 != r6) goto L_0x002b
            return r6
        L_0x00e4:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00f2
            r0 = 1
            goto L_0x00c0
        L_0x00f2:
            java.lang.Boolean r0 = X.C18320x8.A0U()
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x010b
            r0 = 2
            goto L_0x00c0
        L_0x00ff:
            X.5tu r5 = new X.5tu
            r5.<init>(r9, r11)
            goto L_0x0012
        L_0x0106:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x010b:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.CallAvatarFLMConsentManager.A01(java.lang.Boolean, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C84814Du r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C118575tl
            if (r0 == 0) goto L_0x0071
            r7 = r9
            X.5tl r7 = (X.C118575tl) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0071
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r2 = r7.result
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r7.label
            r0 = 1
            if (r1 == 0) goto L_0x0043
            if (r1 != r0) goto L_0x007c
            java.lang.Object r1 = r7.L$0
            com.whatsapp.calling.avatar.CallAvatarFLMConsentManager r1 = (com.whatsapp.calling.avatar.CallAvatarFLMConsentManager) r1
            X.C57682u2.A01(r2)
        L_0x0024:
            X.5AD r2 = (X.AnonymousClass5AD) r2
            boolean r0 = r2 instanceof X.C91034in
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "CallAvatarFLMConsentManager/refreshConsentResultForUSConsentType Success"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4in r2 = (X.C91034in) r2
            java.lang.Boolean r0 = r2.A00
        L_0x0033:
            r1.A00 = r0
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0038:
            boolean r0 = r2 instanceof X.C91024im
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "CallAvatarFLMConsentManager/refreshConsentResultForUSConsentType Error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            goto L_0x0033
        L_0x0043:
            X.C57682u2.A01(r2)
            X.5HP r5 = r8.A02
            r7.L$0 = r8
            r7.label = r0
            X.31C r0 = r5.A00
            java.lang.String r4 = r0.A03()
            r0 = 29
            X.1wl r1 = new X.1wl
            r1.<init>((java.lang.String) r4, (int) r0)
            r0 = 24
            X.1xJ r3 = new X.1xJ
            r3.<init>((X.C35371wl) r1, (int) r0)
            X.3gB r2 = r5.A01
            r1 = 0
            com.whatsapp.calling.avatar.data.protocol.GetFLMConsentResultProtocol$sendRequest$2 r0 = new com.whatsapp.calling.avatar.data.protocol.GetFLMConsentResultProtocol$sendRequest$2
            r0.<init>(r5, r3, r4, r1)
            java.lang.Object r2 = X.C616131n.A00(r7, r2, r0)
            if (r2 != r6) goto L_0x006f
            return r6
        L_0x006f:
            r1 = r8
            goto L_0x0024
        L_0x0071:
            X.5tl r7 = new X.5tl
            r7.<init>(r8, r9)
            goto L_0x0012
        L_0x0077:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x007c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.CallAvatarFLMConsentManager.A03(X.4Du):java.lang.Object");
    }

    public CallAvatarFLMConsentManager(C103425Mx r2, AnonymousClass5HP r3, AnonymousClass5HQ r4, C57162tC r5, AnonymousClass1VX r6) {
        C18260x0.A0Q(r6, r2);
        C162457s7.A0J(r5, 5);
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final Object A02(C84814Du r4) {
        Boolean valueOf;
        Object A032;
        int ordinal = A00().ordinal();
        if (ordinal == 1 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
            AnonymousClass66R r2 = this.A01.A01;
            if (!C18310x6.A0F(r2).contains("pref_flm_consent_result")) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(C18280x3.A1W(C18310x6.A0F(r2), "pref_flm_consent_result"));
            }
            this.A00 = valueOf;
        } else if (ordinal == 2 && (A032 = A03(r4)) == AnonymousClass218.COROUTINE_SUSPENDED) {
            return A032;
        }
        return C59022wD.A00;
    }
}

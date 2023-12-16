package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass4GR;
import X.C49652gs;
import X.C51932kc;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarConfigRepository$hasAvatarAwait$2", f = "AvatarConfigRepository.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarConfigRepository$hasAvatarAwait$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C51932kc $avatarSharedPreferences;
    public final /* synthetic */ boolean $skipCache;
    public int label;
    public final /* synthetic */ C49652gs this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarConfigRepository$hasAvatarAwait$2(C49652gs r2, C51932kc r3, C84814Du r4, boolean z) {
        super(r4, 2);
        this.$avatarSharedPreferences = r3;
        this.$skipCache = z;
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r2 != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r7) {
        /*
            r6 = this;
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 != r4) goto L_0x0077
            X.C57682u2.A01(r7)
        L_0x000c:
            X.28K r7 = (X.AnonymousClass28K) r7
            boolean r0 = r7 instanceof X.AnonymousClass1l0
            if (r0 == 0) goto L_0x0039
            X.1l0 r7 = (X.AnonymousClass1l0) r7
            java.lang.Object r1 = r7.A00
            X.38c r1 = (X.C631438c) r1
            if (r1 == 0) goto L_0x004d
            X.2gs r0 = r6.this$0
            X.4C1 r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.2kc r0 = (X.C51932kc) r0
            boolean r2 = r1.A00
            X.66R r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A04(r0)
            java.lang.String r0 = "pref_has_avatar_config"
            X.C18270x1.A0l(r1, r0, r2)
            if (r2 == 0) goto L_0x004d
        L_0x0034:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            return r1
        L_0x0039:
            boolean r0 = r7 instanceof X.C29721kz
            if (r0 == 0) goto L_0x0072
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AvatarConfigRepository/hasAvatarWithCoroutines"
            r1.append(r0)
            X.1kz r7 = (X.C29721kz) r7
            java.lang.Object r0 = r7.A00
            X.C18260x0.A0n(r0, r1)
        L_0x004d:
            r4 = 0
            goto L_0x0034
        L_0x004f:
            X.C57682u2.A01(r7)
            X.2kc r0 = r6.$avatarSharedPreferences
            java.lang.Boolean r1 = r0.A00()
            boolean r0 = r6.$skipCache
            if (r0 != 0) goto L_0x005f
            if (r1 == 0) goto L_0x005f
            return r1
        L_0x005f:
            X.2gs r3 = r6.this$0
            r6.label = r4
            X.3gB r2 = r3.A03
            r1 = 0
            com.whatsapp.productinfra.avatar.data.AvatarConfigRepository$fetchAvatarAwait$2 r0 = new com.whatsapp.productinfra.avatar.data.AvatarConfigRepository$fetchAvatarAwait$2
            r0.<init>(r3, r1)
            java.lang.Object r7 = X.C616131n.A00(r6, r2, r0)
            if (r7 != r5) goto L_0x000c
            return r5
        L_0x0072:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x0077:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.AvatarConfigRepository$hasAvatarAwait$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new AvatarConfigRepository$hasAvatarAwait$2(this.this$0, this.$avatarSharedPreferences, r6, this.$skipCache);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

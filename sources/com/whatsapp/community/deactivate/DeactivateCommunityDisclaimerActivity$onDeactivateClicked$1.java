package com.whatsapp.community.deactivate;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1", f = "DeactivateCommunityDisclaimerActivity.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
public final class DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ DeactivateCommunityDisclaimerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1(DeactivateCommunityDisclaimerActivity deactivateCommunityDisclaimerActivity, C84814Du r3) {
        super(r3, 2);
        this.this$0 = deactivateCommunityDisclaimerActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r3 != 404) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r7) {
        /*
            r6 = this;
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r5) goto L_0x00ae
            X.C57682u2.A01(r7)
        L_0x000c:
            X.25N r7 = (X.AnonymousClass25N) r7
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = r6.this$0
            r0.BjL()
            boolean r0 = r7 instanceof X.AnonymousClass1Nv
            if (r0 == 0) goto L_0x0056
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r4 = r6.this$0
            r3 = 2131888446(0x7f12093e, float:1.9411528E38)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            X.5ZU r1 = r4.A03
            if (r1 == 0) goto L_0x004e
            X.3ZH r0 = r4.A05
            if (r0 != 0) goto L_0x0091
            java.lang.String r0 = "parentGroupContact"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x002e:
            X.C57682u2.A01(r7)
            com.whatsapp.community.deactivate.DeactivateCommunityIQProtocolHelper r2 = com.whatsapp.community.deactivate.DeactivateCommunityIQProtocolHelper.A00
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = r6.this$0
            X.31C r1 = r0.A07
            if (r1 == 0) goto L_0x00b3
            X.1fJ r0 = r0.A06
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "parentGroupJid"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0045:
            r6.label = r5
            java.lang.Object r7 = r2.A00(r0, r1, r6)
            if (r7 != r3) goto L_0x000c
            return r3
        L_0x004e:
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0056:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.community.deactivate.DeactivateCommunityIQProtocolHelper.DeactivateCommunityResult.Error"
            X.C162457s7.A0K(r7, r0)
            X.1Nu r7 = (X.AnonymousClass1Nu) r7
            int r3 = r7.A00
            r0 = -2
            r2 = -1
            if (r3 == r0) goto L_0x0075
            if (r3 == r2) goto L_0x0075
            r0 = 400(0x190, float:5.6E-43)
            if (r3 == r0) goto L_0x0075
            r0 = 401(0x191, float:5.62E-43)
            if (r3 == r0) goto L_0x0085
            r0 = 404(0x194, float:5.66E-43)
            r1 = 2131888441(0x7f120939, float:1.9411517E38)
            if (r3 == r0) goto L_0x0078
        L_0x0075:
            r1 = 2131888444(0x7f12093c, float:1.9411524E38)
        L_0x0078:
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = r6.this$0
            android.view.View r0 = r0.A00
            if (r0 != 0) goto L_0x0089
            java.lang.String r0 = "mainView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0085:
            r1 = 2131888440(0x7f120938, float:1.9411515E38)
            goto L_0x0078
        L_0x0089:
            X.4ab r0 = X.C88694ab.A00(r0, r1, r2)
            r0.A05()
            goto L_0x00a4
        L_0x0091:
            X.C18290x4.A1K(r1, r0, r2)
            java.lang.String r1 = r4.getString(r3, r2)
            X.C162457s7.A0D(r1)
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = r6.this$0
            X.3Ej r0 = r0.A01
            if (r0 == 0) goto L_0x00a7
            r0.BJc(r4, r1)
        L_0x00a4:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x00a7:
            java.lang.String r0 = "communityNavigator"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00ae:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x00b3:
            java.lang.String r0 = "messageClient"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1(this.this$0, (C84814Du) obj2));
    }
}

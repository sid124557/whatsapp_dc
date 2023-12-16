package X;

import com.whatsapp.accountswitching.AccountSwitchingContentProvider;

/* renamed from: X.3zh  reason: invalid class name and case insensitive filesystem */
public final class C81323zh extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C53892nq $currentAccount;
    public final /* synthetic */ C69903Yy $makeActiveLid;
    public final /* synthetic */ AccountSwitchingContentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81323zh(AccountSwitchingContentProvider accountSwitchingContentProvider, C53892nq r3, C69903Yy r4) {
        super(0);
        this.this$0 = accountSwitchingContentProvider;
        this.$currentAccount = r3;
        this.$makeActiveLid = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            com.whatsapp.accountswitching.AccountSwitchingContentProvider r0 = r10.this$0
            X.30k r7 = X.C18530xp.A01(r0)
            X.2nq r8 = r10.$currentAccount
            X.3Yy r0 = r10.$makeActiveLid
            java.lang.Object r9 = r0.element
            if (r9 == 0) goto L_0x00bd
            java.lang.String r9 = (java.lang.String) r9
            X.C18260x0.A0O(r8, r9)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingDataRepo/removeAndAddAccount/addAccount:"
            r1.append(r0)
            java.lang.String r6 = r8.A07
            java.lang.String r0 = X.C57072t2.A01(r6)
            r1.append(r0)
            java.lang.String r0 = ",removeLid:"
            X.C57072t2.A04(r0, r9, r1)
            X.5SO r5 = r7.A02()
            java.util.List r1 = r5.A01
            boolean r0 = X.C613630k.A01(r9, r1)
            if (r0 != 0) goto L_0x0086
            java.lang.String r0 = "AccountSwitchingDataRepo/addAndRemoveAccount/Account doesn't exist"
        L_0x0038:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2 = 0
        L_0x003c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingContentProvider/call/switch account action/dataRepoOps/success: "
            X.C18260x0.A1E(r0, r1, r2)
            if (r2 != 0) goto L_0x0083
            java.lang.String r0 = "AccountSwitchingContentProvider/call/switch account action/dataRepoOps/autocorrecting accounts file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.accountswitching.AccountSwitchingContentProvider r0 = r10.this$0
            X.30k r0 = X.C18530xp.A01(r0)
            java.lang.String r1 = r0.A05()
            if (r1 == 0) goto L_0x0064
            com.whatsapp.accountswitching.AccountSwitchingContentProvider r0 = r10.this$0
            X.30k r0 = X.C18530xp.A01(r0)
            boolean r0 = r0.A0A(r1)
            if (r0 == 0) goto L_0x0083
        L_0x0064:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingContentProvider/call/switch account action/dataRepoOps/autocorrecting accounts file/adding account "
            r1.append(r0)
            X.2nq r0 = r10.$currentAccount
            java.lang.String r0 = r0.A07
            java.lang.String r0 = X.C57072t2.A01(r0)
            X.C18260x0.A1L(r1, r0)
            com.whatsapp.accountswitching.AccountSwitchingContentProvider r0 = r10.this$0
            X.30k r1 = X.C18530xp.A01(r0)
            X.2nq r0 = r10.$currentAccount
            r1.A06(r0)
        L_0x0083:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0086:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r1.iterator()
        L_0x0092:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2nq r0 = (X.C53892nq) r0
            java.lang.String r0 = r0.A07
            X.C18280x3.A18(r0, r9, r1, r3)
            goto L_0x0092
        L_0x00a5:
            r4.addAll(r3)
            boolean r0 = X.C613630k.A01(r6, r4)
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = "AccountSwitchingDataRepo/addAndRemoveAccount/Account already exists"
            goto L_0x0038
        L_0x00b1:
            r4.add(r8)
            X.5SO r0 = X.C18310x6.A0P(r5, r4)
            boolean r2 = r7.A09(r0)
            goto L_0x003c
        L_0x00bd:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81323zh.invoke():java.lang.Object");
    }
}

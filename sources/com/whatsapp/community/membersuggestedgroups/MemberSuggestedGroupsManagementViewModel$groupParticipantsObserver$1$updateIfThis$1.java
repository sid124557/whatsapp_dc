package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {}, l = {127, 128}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = memberSuggestedGroupsManagementViewModel;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r6) {
        /*
            r5 = this;
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r5.label
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0012
            if (r1 == r0) goto L_0x0037
            if (r1 != r3) goto L_0x0045
            X.C57682u2.A01(r6)
        L_0x000f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0012:
            X.C57682u2.A01(r6)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r5.this$0
            r5.label = r0
            X.4Gp r2 = r1.A0K
            X.2so r0 = r1.A02
            X.1fJ r1 = r1.A0D
            X.2sj r0 = r0.A0A
            boolean r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x0034
            X.20T r0 = X.AnonymousClass20T.ADMIN
        L_0x0029:
            java.lang.Object r0 = r2.B2K(r0, r5)
            if (r0 == r4) goto L_0x0033
            X.2wD r0 = X.C59022wD.A00
            if (r0 != r4) goto L_0x003a
        L_0x0033:
            return r4
        L_0x0034:
            X.20T r0 = X.AnonymousClass20T.MEMBER
            goto L_0x0029
        L_0x0037:
            X.C57682u2.A01(r6)
        L_0x003a:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r5.this$0
            r5.label = r3
            java.lang.Object r0 = r0.A0G(r5)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x0045:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1(this.this$0, (C84814Du) obj2));
    }
}

package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass4GR;
import X.C370320r;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {}, l = {321, 329, 333, 337}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C370320r $action;
    public final /* synthetic */ boolean $skipConfirm;
    public final /* synthetic */ List $suggestions;
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C370320r r3, List list, C84814Du r5, boolean z) {
        super(r5, 2);
        this.this$0 = memberSuggestedGroupsManagementViewModel;
        this.$action = r3;
        this.$suggestions = list;
        this.$skipConfirm = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r14) {
        /*
            r13 = this;
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r13.label
            r8 = 4
            r9 = 1
            r10 = 0
            r7 = 3
            r6 = 2
            if (r0 == 0) goto L_0x0018
            if (r0 == r9) goto L_0x0113
            if (r0 == r6) goto L_0x0113
            if (r0 == r7) goto L_0x0113
            if (r0 == r8) goto L_0x0113
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0018:
            X.C57682u2.A01(r14)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r13.this$0
            X.1ip r0 = r0.A04
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0034
            X.1OF r1 = X.AnonymousClass1OF.A00
        L_0x0027:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r13.this$0
            X.4Gn r0 = r0.A0F
            r13.label = r9
            java.lang.Object r0 = r0.BlD(r1, r13)
        L_0x0031:
            if (r0 != r3) goto L_0x0116
            return r3
        L_0x0034:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r13.this$0
            X.20r r2 = r13.$action
            X.4Gp r0 = r0.A0K
            java.lang.Object r1 = r0.getValue()
            X.20T r0 = X.AnonymousClass20T.MEMBER
            if (r1 != r0) goto L_0x0049
            X.20r r0 = X.C370320r.CANCEL
            if (r2 == r0) goto L_0x0049
            X.1OE r1 = X.AnonymousClass1OE.A00
            goto L_0x0027
        L_0x0049:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r13.this$0
            java.util.List r0 = r13.$suggestions
            int r4 = r0.size()
            X.20r r2 = r13.$action
            boolean r5 = r13.$skipConfirm
            X.4Gt r11 = r1.A0M
            java.lang.Object r0 = r11.getValue()
            X.3Z6 r0 = (X.AnonymousClass3Z6) r0
            int r12 = X.AnonymousClass3Z6.A00(r0)
            int r12 = r12 + r4
            java.lang.Object r0 = r11.getValue()
            X.3Z6 r0 = (X.AnonymousClass3Z6) r0
            java.lang.Object r0 = r0.second
            int r0 = X.AnonymousClass001.A0K(r0)
            int r12 = r12 - r0
            if (r12 <= 0) goto L_0x009a
            X.20r r0 = X.C370320r.APPROVE
            if (r2 != r0) goto L_0x009a
            java.lang.Object r0 = r11.getValue()
            X.3Z6 r0 = (X.AnonymousClass3Z6) r0
            int r1 = X.AnonymousClass3Z6.A00(r0)
            java.lang.Object r0 = r11.getValue()
            X.3Z6 r0 = (X.AnonymousClass3Z6) r0
            java.lang.Object r0 = r0.second
            int r0 = X.AnonymousClass001.A0K(r0)
            if (r1 < r0) goto L_0x0090
            X.1OD r1 = X.AnonymousClass1OD.A00
            goto L_0x0027
        L_0x0090:
            if (r5 != 0) goto L_0x009a
            int r0 = r4 - r12
            X.1OC r1 = new X.1OC
            r1.<init>(r2, r4, r0)
            goto L_0x0027
        L_0x009a:
            java.util.List r0 = r13.$suggestions
            java.util.ArrayList r4 = X.C73783g4.A0d(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00a4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r1.next()
            X.2nf r0 = (X.C53782nf) r0
            X.1fJ r0 = r0.A02
            r4.add(r0)
            goto L_0x00a4
        L_0x00b6:
            java.util.List r0 = r13.$suggestions
            java.util.ArrayList r5 = X.C73783g4.A0d(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x00c0:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r0 = r11.next()
            X.2nf r0 = (X.C53782nf) r0
            X.1fJ r2 = r0.A02
            com.whatsapp.jid.UserJid r1 = r0.A04
            X.2ji r0 = new X.2ji
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x00c0
        L_0x00d9:
            X.20r r0 = r13.$action
            int r0 = r0.ordinal()
            r2 = 0
            if (r0 == r10) goto L_0x0104
            if (r0 == r9) goto L_0x00f5
            if (r0 != r6) goto L_0x0116
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r13.this$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$4 r0 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$4
            r0.<init>(r4, r2)
            r13.label = r8
            java.lang.Object r0 = r1.A0D(r4, r13, r0, r8)
            goto L_0x0031
        L_0x00f5:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r13.this$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$3 r0 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$3
            r0.<init>(r5, r2)
            r13.label = r7
            java.lang.Object r0 = r1.A0D(r4, r13, r0, r7)
            goto L_0x0031
        L_0x0104:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r13.this$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$2 r0 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$2
            r0.<init>(r5, r2)
            r13.label = r6
            java.lang.Object r0 = r1.A0D(r4, r13, r0, r6)
            goto L_0x0031
        L_0x0113:
            X.C57682u2.A01(r14)
        L_0x0116:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1(this.this$0, this.$action, this.$suggestions, r8, this.$skipConfirm);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

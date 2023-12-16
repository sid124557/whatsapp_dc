package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85524Gp;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {}, l = {471, 474, 476, 483}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ List $groupsToUpdate;
    public final /* synthetic */ AnonymousClass4GQ $networkCall;
    public final /* synthetic */ C85524Gp $this_apply;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1(List list, C84814Du r3, AnonymousClass4GQ r4, C85524Gp r5) {
        super(r3, 2);
        this.$networkCall = r4;
        this.$this_apply = r5;
        this.$groupsToUpdate = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r13) {
        /*
            r12 = this;
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r12.label
            r5 = 4
            r8 = 3
            r3 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 == r7) goto L_0x0025
            if (r0 == r3) goto L_0x00be
            if (r0 == r8) goto L_0x00be
            if (r0 == r5) goto L_0x00be
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0017:
            X.C57682u2.A01(r13)
            X.4GQ r0 = r12.$networkCall
            r12.label = r7
            java.lang.Object r13 = r0.invoke(r12)
            if (r13 != r4) goto L_0x0028
            return r4
        L_0x0025:
            X.C57682u2.A01(r13)
        L_0x0028:
            X.2FK r13 = (X.AnonymousClass2FK) r13
            boolean r0 = r13 instanceof X.AnonymousClass1O9
            if (r0 == 0) goto L_0x00a7
            X.1O9 r13 = (X.AnonymousClass1O9) r13
            java.util.List r10 = r13.A00
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x004d
            X.4Gp r2 = r12.$this_apply
            java.lang.Integer r1 = X.AnonymousClass0x9.A0k(r3)
            java.util.List r0 = r12.$groupsToUpdate
            java.util.Map r0 = X.C57692u3.A04(r1, r0)
            r12.label = r3
        L_0x0046:
            java.lang.Object r0 = r2.B2K(r0, r12)
        L_0x004a:
            if (r0 != r4) goto L_0x00c1
            return r4
        L_0x004d:
            X.4Gp r9 = r12.$this_apply
            X.3Z6[] r6 = new X.AnonymousClass3Z6[r3]
            java.lang.Integer r11 = X.AnonymousClass0x9.A0k(r3)
            java.util.List r1 = r12.$groupsToUpdate
            java.util.Set r5 = X.C73723fy.A0P(r10)
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            X.C162457s7.A0J(r5, r7)
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 != 0) goto L_0x006a
            java.util.List r5 = X.C73723fy.A0F(r5)
        L_0x006a:
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x008b
            java.util.List r3 = X.C73723fy.A0F(r1)
        L_0x0076:
            X.AnonymousClass3Z6.A04(r11, r3, r6)
            java.lang.Integer r0 = X.AnonymousClass0x9.A0k(r7)
            X.AnonymousClass3Z6.A09(r0, r10, r6, r7)
            java.util.Map r0 = X.C73813g7.A0F(r6)
            r12.label = r8
            java.lang.Object r0 = r9.B2K(r0, r12)
            goto L_0x004a
        L_0x008b:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r1.iterator()
        L_0x0093:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r1 = r2.next()
            boolean r0 = r5.contains(r1)
            if (r0 != 0) goto L_0x0093
            r3.add(r1)
            goto L_0x0093
        L_0x00a7:
            X.1OA r0 = X.AnonymousClass1OA.A00
            boolean r0 = X.C162457s7.A0P(r13, r0)
            if (r0 == 0) goto L_0x00c1
            X.4Gp r2 = r12.$this_apply
            java.lang.Integer r1 = X.AnonymousClass0x9.A0k(r7)
            java.util.List r0 = r12.$groupsToUpdate
            java.util.Map r0 = X.C57692u3.A04(r1, r0)
            r12.label = r5
            goto L_0x0046
        L_0x00be:
            X.C57682u2.A01(r13)
        L_0x00c1:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1(this.$groupsToUpdate, r6, this.$networkCall, this.$this_apply);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

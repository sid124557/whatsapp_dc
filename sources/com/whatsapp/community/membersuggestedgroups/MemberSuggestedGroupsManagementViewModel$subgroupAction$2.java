package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GQ;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$subgroupAction$2", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {}, l = {420}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementViewModel$subgroupAction$2 extends C75003pT implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4GQ $networkCall;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementViewModel$subgroupAction$2(C84814Du r2, AnonymousClass4GQ r3) {
        super(r2, 1);
        this.$networkCall = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4GQ r0 = this.$networkCall;
            this.label = 1;
            obj = r0.invoke(this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return C59022wD.A01(new MemberSuggestedGroupsManagementViewModel$subgroupAction$2((C84814Du) obj, this.$networkCall));
    }
}

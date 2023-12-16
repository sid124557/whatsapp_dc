package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass001;
import X.AnonymousClass1OG;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85504Gn;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$dismissNotification$1", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {}, l = {289}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementViewModel$dismissNotification$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementViewModel$dismissNotification$1(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = memberSuggestedGroupsManagementViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C85504Gn r1 = this.this$0.A0F;
            AnonymousClass1OG r0 = AnonymousClass1OG.A00;
            this.label = 1;
            if (r1.BlD(r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new MemberSuggestedGroupsManagementViewModel$dismissNotification$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new MemberSuggestedGroupsManagementViewModel$dismissNotification$1(this.this$0, (C84814Du) obj2));
    }
}

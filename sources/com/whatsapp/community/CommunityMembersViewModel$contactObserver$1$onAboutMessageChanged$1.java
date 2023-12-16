package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4C5;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C829545o;
import X.C84814Du;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onAboutMessageChanged$1", f = "CommunityMembersViewModel.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersViewModel$contactObserver$1$onAboutMessageChanged$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ UserJid $jid;
    public int label;
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersViewModel$contactObserver$1$onAboutMessageChanged$1(CommunityMembersViewModel communityMembersViewModel, UserJid userJid, C84814Du r4) {
        super(r4, 2);
        this.this$0 = communityMembersViewModel;
        this.$jid = userJid;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            CommunityMembersViewModel communityMembersViewModel = this.this$0;
            AnonymousClass4C5 A07 = C829545o.A07(this.$jid);
            this.label = 1;
            if (communityMembersViewModel.A0D(this, A07, false) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new CommunityMembersViewModel$contactObserver$1$onAboutMessageChanged$1(this.this$0, this.$jid, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

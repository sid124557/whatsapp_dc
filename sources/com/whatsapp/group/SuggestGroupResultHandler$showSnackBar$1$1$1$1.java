package com.whatsapp.group;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C18290x4;
import X.C27991fJ;
import X.C43742Th;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.SuggestGroupResultHandler$showSnackBar$1$1$1$1", f = "SuggestGroupResultHandler.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
public final class SuggestGroupResultHandler$showSnackBar$1$1$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C27991fJ $cancelGroupJid;
    public final /* synthetic */ C27991fJ $linkedParentGroupJid;
    public int label;
    public final /* synthetic */ C43742Th this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestGroupResultHandler$showSnackBar$1$1$1$1(C43742Th r2, C27991fJ r3, C27991fJ r4, C84814Du r5) {
        super(r5, 2);
        this.this$0 = r2;
        this.$linkedParentGroupJid = r3;
        this.$cancelGroupJid = r4;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            MemberSuggestedGroupsManager memberSuggestedGroupsManager = this.this$0.A05;
            C27991fJ r5 = this.$linkedParentGroupJid;
            List A12 = C18290x4.A12(this.$cancelGroupJid);
            this.label = 1;
            if (memberSuggestedGroupsManager.A04.A00(r5, (List) null, (List) null, A12, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new SuggestGroupResultHandler$showSnackBar$1$1$1$1(this.this$0, this.$linkedParentGroupJid, this.$cancelGroupJid, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

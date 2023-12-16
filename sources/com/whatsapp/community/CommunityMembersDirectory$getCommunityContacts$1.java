package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2C4;
import X.AnonymousClass46Q;
import X.AnonymousClass4GR;
import X.C27991fJ;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C64623Eg;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersDirectory$getCommunityContacts$1", f = "CommunityMembersDirectory.kt", i = {}, l = {423}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersDirectory$getCommunityContacts$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C27991fJ $parentJid;
    public int label;
    public final /* synthetic */ C64623Eg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersDirectory$getCommunityContacts$1(C64623Eg r2, C27991fJ r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$parentJid = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C64623Eg r4 = this.this$0;
            C27991fJ r3 = this.$parentJid;
            AnonymousClass46Q r2 = AnonymousClass2C4.A00;
            this.label = 1;
            obj = C616131n.A00(this, r2, new CommunityMembersDirectory$getCommunityContacts$3(r4, r3, (C84814Du) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new CommunityMembersDirectory$getCommunityContacts$1(this.this$0, this.$parentJid, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

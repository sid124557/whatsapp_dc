package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C27991fJ;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager$fetchSuggestedGroups$1", f = "MemberSuggestedGroupsManager.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManager$fetchSuggestedGroups$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C27991fJ $hintGroupJid;
    public final /* synthetic */ C27991fJ $parentGroupJid;
    public final /* synthetic */ boolean $useMex;
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManager$fetchSuggestedGroups$1(MemberSuggestedGroupsManager memberSuggestedGroupsManager, C27991fJ r3, C27991fJ r4, C84814Du r5, boolean z) {
        super(r5, 2);
        this.this$0 = memberSuggestedGroupsManager;
        this.$parentGroupJid = r3;
        this.$hintGroupJid = r4;
        this.$useMex = z;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            MemberSuggestedGroupsManager memberSuggestedGroupsManager = this.this$0;
            C27991fJ r2 = this.$parentGroupJid;
            C27991fJ r1 = this.$hintGroupJid;
            boolean z = this.$useMex;
            this.label = 1;
            if (memberSuggestedGroupsManager.A01(r2, r1, this, z) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new MemberSuggestedGroupsManager$fetchSuggestedGroups$1(this.this$0, this.$parentGroupJid, this.$hintGroupJid, r8, this.$useMex);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

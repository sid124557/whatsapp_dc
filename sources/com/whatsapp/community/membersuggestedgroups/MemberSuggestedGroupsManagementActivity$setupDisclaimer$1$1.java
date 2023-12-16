package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass001;
import X.AnonymousClass0GC;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C05100Ry;
import X.C57682u2;
import X.C59022wD;
import X.C73143f0;
import X.C75003pT;
import X.C84814Du;
import X.C85564Gt;
import X.C86074Is;
import com.whatsapp.WaTextView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupDisclaimer$1$1", f = "MemberSuggestedGroupsManagementActivity.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementActivity$setupDisclaimer$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ WaTextView $disclaimer;
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementActivity this$0;

    @DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupDisclaimer$1$1$1", f = "MemberSuggestedGroupsManagementActivity.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupDisclaimer$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                C85564Gt r4 = memberSuggestedGroupsManagementActivity.A74().A0O;
                C86074Is r0 = new C86074Is((Object) waTextView, 0, (Object) memberSuggestedGroupsManagementActivity);
                this.label = 1;
                if (r4.Az8(this, r0) == r6) {
                    return r6;
                }
            } else if (i != 1) {
                throw AnonymousClass001.A0d();
            } else {
                C57682u2.A01(obj);
            }
            throw new C73143f0();
        }

        public final C84814Du A0A(Object obj, C84814Du r5) {
            return new AnonymousClass1(waTextView, memberSuggestedGroupsManagementActivity, r5);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementActivity$setupDisclaimer$1$1(WaTextView waTextView, MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity, C84814Du r4) {
        super(r4, 2);
        this.this$0 = memberSuggestedGroupsManagementActivity;
        this.$disclaimer = waTextView;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity = this.this$0;
            AnonymousClass0GC r3 = AnonymousClass0GC.STARTED;
            final WaTextView waTextView = this.$disclaimer;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C05100Ry.A01(r3, memberSuggestedGroupsManagementActivity, this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new MemberSuggestedGroupsManagementActivity$setupDisclaimer$1$1(this.$disclaimer, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

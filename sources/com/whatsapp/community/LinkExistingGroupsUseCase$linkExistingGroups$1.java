package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass46G;
import X.AnonymousClass4GR;
import X.C27631eF;
import X.C27991fJ;
import X.C41342Jw;
import X.C57682u2;
import X.C57702u4;
import X.C59022wD;
import X.C626435x;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.LinkExistingGroupsUseCase$linkExistingGroups$1", f = "LinkExistingGroupsUseCase.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
public final class LinkExistingGroupsUseCase$linkExistingGroups$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ List $jids;
    public final /* synthetic */ C27991fJ $parentGroupJid;
    public int label;
    public final /* synthetic */ C41342Jw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkExistingGroupsUseCase$linkExistingGroups$1(C41342Jw r2, C27991fJ r3, List list, C84814Du r5) {
        super(r5, 2);
        this.this$0 = r2;
        this.$parentGroupJid = r3;
        this.$jids = list;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C41342Jw r7 = this.this$0;
            C27991fJ r6 = this.$parentGroupJid;
            List list = this.$jids;
            this.label = 1;
            if (list.isEmpty()) {
                obj = new C27631eF(R.string.f11nameremoved);
            } else {
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    GroupJid A03 = GroupJid.Companion.A03(AnonymousClass001.A0m(it));
                    if (A03 != null) {
                        A0s.add(A03);
                    }
                }
                AnonymousClass46G A04 = C57702u4.A04(this);
                r7.A01.A00(new C626435x(A04, 0), r6, A0s);
                obj = A04.A06();
            }
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

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new LinkExistingGroupsUseCase$linkExistingGroups$1(this.this$0, this.$parentGroupJid, this.$jids, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

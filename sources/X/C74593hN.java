package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager", f = "MemberSuggestedGroupsManager.kt", i = {0, 0, 0, 0}, l = {98, 100, 102}, m = "fetchSuggestedGroupsSuspended", n = {"this", "parentGroupJid", "hintGroupJid", "useMex"}, s = {"L$0", "L$1", "L$2", "Z$0"})
/* renamed from: X.3hN  reason: invalid class name and case insensitive filesystem */
public final class C74593hN extends C75013pU {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MemberSuggestedGroupsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74593hN(MemberSuggestedGroupsManager memberSuggestedGroupsManager, C84814Du r2) {
        super(r2);
        this.this$0 = memberSuggestedGroupsManager;
    }

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((C27991fJ) null, (C27991fJ) null, this, false);
    }
}

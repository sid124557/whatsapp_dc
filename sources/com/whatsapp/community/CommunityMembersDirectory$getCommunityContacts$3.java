package com.whatsapp.community;

import X.AnonymousClass4GR;
import X.C27991fJ;
import X.C59022wD;
import X.C64623Eg;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersDirectory$getCommunityContacts$3", f = "CommunityMembersDirectory.kt", i = {0}, l = {438}, m = "invokeSuspend", n = {"communityContacts"}, s = {"L$0"})
public final class CommunityMembersDirectory$getCommunityContacts$3 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C27991fJ $parentJid;
    public Object L$0;
    public int label;
    public final /* synthetic */ C64623Eg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersDirectory$getCommunityContacts$3(C64623Eg r2, C27991fJ r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$parentJid = r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.218} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.218} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.TreeSet} */
    /* JADX WARNING: type inference failed for: r6v5, types: [java.util.AbstractCollection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r9) {
        /*
            r8 = this;
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r8.label
            r7 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 != r7) goto L_0x0067
            java.lang.Object r6 = r8.L$0
            java.util.AbstractCollection r6 = (java.util.AbstractCollection) r6
            X.C57682u2.A01(r9)
        L_0x0010:
            java.util.Map r9 = (java.util.Map) r9
            java.util.Set r1 = r9.keySet()
            X.3Eg r0 = r8.this$0
            X.3Ex r0 = r0.A04
            java.util.Map r0 = r0.A0J(r1)
            java.util.Iterator r2 = X.AnonymousClass001.A0v(r0)
        L_0x0022:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006c
            X.3ZH r1 = X.C18310x6.A0R(r2)
            if (r1 == 0) goto L_0x0022
            X.3Eg r0 = r8.this$0
            X.2sr r0 = r0.A01
            boolean r0 = X.C56972sr.A08(r0, r1)
            if (r0 != 0) goto L_0x0022
            r6.add(r1)
            goto L_0x0022
        L_0x003c:
            X.C57682u2.A01(r9)
            X.3Eg r0 = r8.this$0
            X.5ZU r2 = r0.A05
            X.33j r1 = r0.A06
            X.5sc r0 = new X.5sc
            r0.<init>(r2, r1)
            java.util.TreeSet r5 = new java.util.TreeSet
            r5.<init>(r0)
            X.3Eg r4 = r8.this$0
            X.1fJ r3 = r8.$parentJid
            X.46Q r2 = X.AnonymousClass2C4.A00
            r8.L$0 = r5
            r8.label = r7
            r1 = 0
            com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$4 r0 = new com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$4
            r0.<init>(r4, r3, r1)
            java.lang.Object r9 = X.C616131n.A00(r8, r2, r0)
            if (r9 == r6) goto L_0x006c
            r6 = r5
            goto L_0x0010
        L_0x0067:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x006c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.CommunityMembersDirectory$getCommunityContacts$3.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new CommunityMembersDirectory$getCommunityContacts$3(this.this$0, this.$parentJid, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

package com.whatsapp.community;

import X.AnonymousClass4GR;
import X.C27991fJ;
import X.C59022wD;
import X.C64623Eg;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$4", f = "CommunityMembersDirectory.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersDirectory$getCommunityDirectory$4 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C27991fJ $parentJid;
    public int label;
    public final /* synthetic */ C64623Eg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersDirectory$getCommunityDirectory$4(C64623Eg r2, C27991fJ r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$parentJid = r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.1fJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.1fJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: com.whatsapp.jid.GroupJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.1fJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.util.LinkedHashMap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            if (r0 != 0) goto L_0x0196
            X.C57682u2.A01(r8)
            X.3Eg r4 = r7.this$0
            X.1fJ r3 = r7.$parentJid
            X.2ss r0 = r4.A07
            int r1 = r0.A06(r3)
            r0 = 1
            if (r1 != r0) goto L_0x0035
            X.2sj r2 = r4.A08
            boolean r0 = r2.A0D(r3)
            if (r0 != 0) goto L_0x0035
            X.2so r0 = r4.A02
            X.2rM r0 = r0.A0H
            X.2mC r0 = r0.A00(r3)
            if (r0 == 0) goto L_0x0035
            com.whatsapp.jid.GroupJid r1 = r0.A02
            boolean r0 = r2.A0C(r1)
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.C162457s7.A0K(r1, r0)
            r3 = r1
        L_0x0035:
            X.3Eg r0 = r7.this$0
            X.2sj r0 = r0.A08
            X.33k r0 = X.C56892sj.A01(r0, r3)
            X.6aS r0 = r0.A04()
            X.C162457s7.A0D(r0)
            r6 = 1
            X.35w r1 = new X.35w
            r1.<init>(r0, r6)
            X.44e r0 = X.C825944e.A00
            X.4C5 r1 = X.C829345m.A04(r0, r1)
            X.44f r0 = X.C826044f.A00
            X.4C5 r0 = X.C829345m.A04(r0, r1)
            java.util.LinkedHashMap r4 = X.C18320x8.A0r()
            java.util.Iterator r2 = r0.iterator()
        L_0x005e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2zG r0 = (X.C60842zG) r0
            com.whatsapp.jid.UserJid r0 = r0.A03
            r4.put(r0, r1)
            goto L_0x005e
        L_0x0071:
            X.3Eg r0 = r7.this$0
            X.2sj r1 = r0.A08
            X.1fJ r0 = r7.$parentJid
            boolean r0 = r1.A0D(r0)
            X.3Eg r3 = r7.this$0
            if (r0 == 0) goto L_0x00da
            X.2k1 r3 = r3.A09
            X.1fJ r0 = r7.$parentJid
            monitor-enter(r3)
            java.util.List r2 = r3.A01(r0)     // Catch:{ all -> 0x00d7 }
            int r0 = r2.size()     // Catch:{ all -> 0x00d7 }
            if (r0 != 0) goto L_0x0093
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x00d7 }
            goto L_0x009f
        L_0x0093:
            X.34p r1 = r3.A00     // Catch:{ all -> 0x00d7 }
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.util.Map r0 = r1.A0D(r0, r2)     // Catch:{ all -> 0x00d7 }
            java.util.ArrayList r0 = X.C18300x5.A0v(r0)     // Catch:{ all -> 0x00d7 }
        L_0x009f:
            monitor-exit(r3)
            X.35w r1 = new X.35w
            r1.<init>(r0, r6)
            X.44g r0 = X.C826144g.A00
            X.4C5 r1 = X.C829345m.A04(r0, r1)
            X.41M r0 = new X.41M
            r0.<init>(r4)
            X.4C5 r2 = X.C829345m.A04(r0, r1)
            X.44h r1 = X.C826244h.A00
            X.3e1 r0 = new X.3e1
            r0.<init>(r1, r2)
            java.util.LinkedHashMap r5 = X.C18320x8.A0r()
            X.3cz r2 = new X.3cz
            r2.<init>(r0)
        L_0x00c4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x018d
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2zG r0 = (X.C60842zG) r0
            com.whatsapp.jid.UserJid r0 = r0.A03
            r5.put(r0, r1)
            goto L_0x00c4
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00da:
            X.1fJ r5 = r7.$parentJid
            X.3Ex r0 = r3.A04
            X.3ZH r1 = r0.A0A(r5)
            X.2lX r0 = r3.A0C
            boolean r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x0118
            X.3e4 r3 = X.C72653e4.A00
        L_0x00ec:
            X.41N r0 = new X.41N
            r0.<init>(r4)
            X.4C5 r2 = X.C829345m.A04(r0, r3)
            X.44i r1 = X.C826344i.A00
            X.3e1 r0 = new X.3e1
            r0.<init>(r1, r2)
            java.util.LinkedHashMap r5 = X.C18320x8.A0r()
            X.3cz r2 = new X.3cz
            r2.<init>(r0)
        L_0x0105:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0167
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2zG r0 = (X.C60842zG) r0
            com.whatsapp.jid.UserJid r0 = r0.A03
            r5.put(r0, r1)
            goto L_0x0105
        L_0x0118:
            X.1VX r2 = r3.A0A
            r1 = 3795(0xed3, float:5.318E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x014f
            X.2so r0 = r3.A02
            java.util.Set r0 = r0.A05(r5)
            X.4C5 r1 = X.C73723fy.A0R(r0)
            X.44j r0 = X.C826444j.A00
            X.4C5 r1 = X.C829345m.A04(r0, r1)
            X.41O r0 = new X.41O
            r0.<init>(r3)
            X.3e1 r3 = new X.3e1
            r3.<init>(r0, r1)
            X.44k r2 = X.C826544k.A00
            X.3pX r0 = X.C75043pX.A00
            X.8PM r1 = new X.8PM
            r1.<init>(r2, r0, r3)
            X.44l r0 = X.C826644l.A00
            X.3e1 r3 = new X.3e1
            r3.<init>(r0, r1)
            goto L_0x00ec
        L_0x014f:
            com.whatsapp.jid.PhoneUserJid[] r2 = new com.whatsapp.jid.PhoneUserJid[r6]
            X.2sr r0 = r3.A01
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A04(r0)
            r0 = 0
            r2[r0] = r1
            X.4C5 r2 = X.C829545o.A07(r2)
            r1 = 0
            X.45G r0 = X.AnonymousClass45G.A00
            X.8PL r3 = new X.8PL
            r3.<init>(r0, r2, r1)
            goto L_0x00ec
        L_0x0167:
            X.3Eg r0 = r7.this$0
            X.2sr r0 = r0.A01
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A05(r0)
            if (r3 == 0) goto L_0x018d
            java.lang.Object r0 = r5.get(r3)
            if (r0 != 0) goto L_0x018d
            java.util.HashSet r2 = X.AnonymousClass002.A0K()
            r1 = 0
            X.2zG r0 = new X.2zG
            r0.<init>(r3, r2, r1, r1)
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r3, r0)
            java.util.Map r5 = X.C73813g7.A0E(r5, r0)
        L_0x018d:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r4)
            r0.putAll(r5)
            return r0
        L_0x0196:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$4.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new CommunityMembersDirectory$getCommunityDirectory$4(this.this$0, this.$parentJid, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

package com.whatsapp.community;

import X.AnonymousClass4GR;
import X.C27991fJ;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.DirectoryContactsLoader$loadContacts$2", f = "DirectoryContactsLoader.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
public final class DirectoryContactsLoader$loadContacts$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C27991fJ $groupJid;
    public Object L$0;
    public int label;
    public final /* synthetic */ DirectoryContactsLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectoryContactsLoader$loadContacts$2(DirectoryContactsLoader directoryContactsLoader, C27991fJ r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = directoryContactsLoader;
        this.$groupJid = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r9) {
        /*
            r8 = this;
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 != r6) goto L_0x0079
            java.lang.Object r7 = r8.L$0
            com.whatsapp.community.DirectoryContactsLoader r7 = (com.whatsapp.community.DirectoryContactsLoader) r7
            X.C57682u2.A01(r9)
        L_0x0010:
            java.util.Map r9 = (java.util.Map) r9
            java.util.Collection r0 = r9.values()
            X.4C5 r2 = X.C73723fy.A0R(r0)
            X.63d r0 = X.C1221163d.A00
            X.3e1 r1 = new X.3e1
            r1.<init>(r0, r2)
            X.60i r0 = new X.60i
            r0.<init>(r7)
            X.4C5 r2 = X.C829345m.A04(r0, r1)
            X.60j r1 = new X.60j
            r1.<init>(r7)
            X.3e1 r0 = new X.3e1
            r0.<init>(r1, r2)
            java.util.Set r0 = X.C829345m.A03(r0)
            return r0
        L_0x0039:
            X.C57682u2.A01(r9)
            com.whatsapp.community.DirectoryContactsLoader r0 = r8.this$0
            X.2ss r1 = r0.A04
            X.1fJ r0 = r8.$groupJid
            int r1 = r1.A06(r0)
            if (r1 == r6) goto L_0x005c
            r0 = 2
            if (r1 == r0) goto L_0x0051
            r0 = 6
            if (r1 == r0) goto L_0x0051
        L_0x004e:
            X.3d7 r0 = X.C72063d7.A00
            return r0
        L_0x0051:
            com.whatsapp.community.DirectoryContactsLoader r0 = r8.this$0
            X.2so r1 = r0.A01
            X.1fJ r0 = r8.$groupJid
            X.1fJ r4 = r1.A01(r0)
            goto L_0x005e
        L_0x005c:
            X.1fJ r4 = r8.$groupJid
        L_0x005e:
            if (r4 == 0) goto L_0x004e
            com.whatsapp.community.DirectoryContactsLoader r7 = r8.this$0
            X.4Cd r3 = r7.A02
            X.46Q r2 = X.AnonymousClass2C4.A01
            r8.L$0 = r7
            r8.label = r6
            X.3Eg r3 = (X.C64623Eg) r3
            r1 = 0
            com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$4 r0 = new com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$4
            r0.<init>(r3, r4, r1)
            java.lang.Object r9 = X.C616131n.A00(r8, r2, r0)
            if (r9 != r5) goto L_0x0010
            return r5
        L_0x0079:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.DirectoryContactsLoader$loadContacts$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new DirectoryContactsLoader$loadContacts$2(this.this$0, this.$groupJid, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

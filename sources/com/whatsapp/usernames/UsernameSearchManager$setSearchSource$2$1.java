package com.whatsapp.usernames;

import X.AnonymousClass4GR;
import X.C43702Td;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.UsernameSearchManager$setSearchSource$2$1", f = "UsernameSearchManager.kt", i = {}, l = {57, 58}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameSearchManager$setSearchSource$2$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $trimmedString;
    public int label;
    public final /* synthetic */ C43702Td this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameSearchManager$setSearchSource$2$1(C43702Td r2, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$trimmedString = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (X.C616231o.A00(r6, 800) == r5) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r7) {
        /*
            r6 = this;
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0012
            if (r1 == r0) goto L_0x0020
            if (r1 != r2) goto L_0x003c
            X.C57682u2.A01(r7)
        L_0x000f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0012:
            X.C57682u2.A01(r7)
            r6.label = r0
            r0 = 800(0x320, double:3.953E-321)
            java.lang.Object r0 = X.C616231o.A00(r6, r0)
            if (r0 != r5) goto L_0x0023
        L_0x001f:
            return r5
        L_0x0020:
            X.C57682u2.A01(r7)
        L_0x0023:
            X.2Td r4 = r6.this$0
            java.lang.String r3 = r6.$trimmedString
            r6.label = r2
            X.3gB r2 = r4.A07
            r1 = 0
            com.whatsapp.usernames.UsernameSearchManager$queryUsername$2 r0 = new com.whatsapp.usernames.UsernameSearchManager$queryUsername$2
            r0.<init>(r4, r3, r1)
            java.lang.Object r0 = X.C616131n.A00(r6, r2, r0)
            if (r0 == r5) goto L_0x001f
            X.2wD r0 = X.C59022wD.A00
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x003c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.usernames.UsernameSearchManager$setSearchSource$2$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new UsernameSearchManager$setSearchSource$2$1(this.this$0, this.$trimmedString, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

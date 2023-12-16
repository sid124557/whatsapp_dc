package com.whatsapp.expressionstray.avatars.datasource;

import X.AnonymousClass2UA;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$1", f = "AvatarExpressionsDataFlow.kt", i = {0}, l = {102, 104, 108}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
public final class AvatarExpressionsDataFlow$all$1 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass2UA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$all$1(AnonymousClass2UA r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r10) {
        /*
            r9 = this;
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r9.label
            r7 = 0
            r5 = 3
            r4 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 == r8) goto L_0x0047
            if (r0 == r4) goto L_0x0067
            if (r0 == r5) goto L_0x0067
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0015:
            X.C57682u2.A01(r10)
            java.lang.Object r3 = r9.L$0
            X.4C9 r3 = (X.AnonymousClass4C9) r3
            X.2UA r2 = r9.this$0
            X.1eh r0 = r2.A05
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x003e
            com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$searchabilityFlow$1 r0 = new com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$searchabilityFlow$1
            r0.<init>(r2, r7)
            X.4C8 r1 = X.AnonymousClass2AM.A00(r0)
            X.3gB r0 = r2.A0C
            X.4C8 r0 = X.AnonymousClass2AN.A00(r0, r1)
            r9.L$0 = r3
            r9.label = r8
            java.lang.Object r10 = X.C159517ly.A02(r9, r0)
            if (r10 != r6) goto L_0x004e
            return r6
        L_0x003e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r9.L$0 = r7
            r9.label = r5
            goto L_0x0060
        L_0x0047:
            java.lang.Object r3 = r9.L$0
            X.4C9 r3 = (X.AnonymousClass4C9) r3
            X.C57682u2.A01(r10)
        L_0x004e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L_0x0058
            boolean r0 = r10.booleanValue()
            if (r0 != 0) goto L_0x003e
        L_0x0058:
            java.lang.Boolean r0 = X.C18320x8.A0U()
            r9.L$0 = r7
            r9.label = r4
        L_0x0060:
            java.lang.Object r0 = r3.B2K(r0, r9)
            if (r0 != r6) goto L_0x006a
            return r6
        L_0x0067:
            X.C57682u2.A01(r10)
        L_0x006a:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        AvatarExpressionsDataFlow$all$1 avatarExpressionsDataFlow$all$1 = new AvatarExpressionsDataFlow$all$1(this.this$0, r4);
        avatarExpressionsDataFlow$all$1.L$0 = obj;
        return avatarExpressionsDataFlow$all$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

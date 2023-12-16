package com.whatsapp.expressionstray.avatars.datasource;

import X.AnonymousClass2UA;
import X.AnonymousClass4GS;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {292}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3 extends C75003pT implements AnonymousClass4GS {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ AnonymousClass2UA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3(AnonymousClass2UA r2, C84814Du r3) {
        super(r3, 3);
        this.this$0 = r2;
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r15) {
        /*
            r14 = this;
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r14.label
            r7 = 1
            if (r0 == 0) goto L_0x000f
            if (r0 != r7) goto L_0x0108
            X.C57682u2.A01(r15)
        L_0x000c:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x000f:
            X.C57682u2.A01(r15)
            java.lang.Object r5 = r14.L$0
            X.4C9 r5 = (X.AnonymousClass4C9) r5
            java.lang.Object r9 = r14.L$1
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            X.2Wu[] r9 = (X.C44622Wu[]) r9
            int r0 = r9.length
            int r1 = X.AnonymousClass8UG.A0I(r0)
            r0 = 16
            if (r1 >= r0) goto L_0x0027
            r1 = 16
        L_0x0027:
            java.util.LinkedHashMap r8 = X.C18330xA.A0C(r1)
            int r4 = r9.length
            r3 = 0
        L_0x002d:
            if (r3 >= r4) goto L_0x005a
            r2 = r9[r3]
            boolean r0 = r2 instanceof X.C29971le
            if (r0 == 0) goto L_0x004a
            r0 = r2
            X.1le r0 = (X.C29971le) r0
            X.28M r1 = r0.A00
        L_0x003a:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandSearchType.AvatarStickerCategory"
            X.C162457s7.A0K(r1, r0)
            X.1la r1 = (X.C29931la) r1
            X.2Uc r0 = r1.A00
            r8.put(r0, r2)
            int r3 = r3 + 1
            goto L_0x002d
        L_0x004a:
            boolean r0 = r2 instanceof X.C29951lc
            if (r0 == 0) goto L_0x0054
            r0 = r2
            X.1lc r0 = (X.C29951lc) r0
            X.28M r1 = r0.A00
            goto L_0x003a
        L_0x0054:
            r0 = r2
            X.1ld r0 = (X.C29961ld) r0
            X.28M r1 = r0.A00
            goto L_0x003a
        L_0x005a:
            X.2UA r0 = r14.this$0
            java.util.List r0 = r0.A00
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r13 = r0.iterator()
        L_0x0066:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r10 = r13.next()
            X.2Uc r10 = (X.C43952Uc) r10
            java.lang.Object r1 = r8.get(r10)
            X.2Wu r1 = (X.C44622Wu) r1
            if (r1 == 0) goto L_0x0066
            X.2UA r0 = r14.this$0
            X.2yn r9 = r0.A02
            X.C162457s7.A0J(r10, r7)
            java.lang.String r0 = r10.toString()
            X.1Tr r3 = new X.1Tr
            r3.<init>(r10, r0)
            boolean r0 = r1 instanceof X.C29971le
            if (r0 == 0) goto L_0x00d6
            X.1le r1 = (X.C29971le) r1
            java.util.List r0 = r1.A01
            java.util.ArrayList r2 = X.C73783g4.A0c(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x009a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r1 = r12.next()
            X.28N r1 = (X.AnonymousClass28N) r1
            boolean r0 = r1 instanceof X.C29991lg
            if (r0 == 0) goto L_0x00bb
            java.lang.String r11 = r9.A02(r10, r1)
            X.1lg r1 = (X.C29991lg) r1
            X.39M r0 = r1.A00
        L_0x00b2:
            X.1Tk r1 = new X.1Tk
            r1.<init>(r3, r0, r11)
        L_0x00b7:
            r2.add(r1)
            goto L_0x009a
        L_0x00bb:
            boolean r0 = r1 instanceof X.C29981lf
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = r9.A02(r10, r1)
            X.1Ti r1 = new X.1Ti
            r1.<init>(r3, r0)
            goto L_0x00b7
        L_0x00c9:
            boolean r0 = r1 instanceof X.C30001lh
            if (r0 == 0) goto L_0x010d
            java.lang.String r11 = r9.A02(r10, r1)
            X.1lh r1 = (X.C30001lh) r1
            X.39M r0 = r1.A00
            goto L_0x00b2
        L_0x00d6:
            boolean r0 = r1 instanceof X.C29961ld
            if (r0 != 0) goto L_0x00e3
            boolean r0 = r1 instanceof X.C29951lc
            if (r0 != 0) goto L_0x00e3
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x00e3:
            X.3d3 r1 = X.C72023d3.A00
            goto L_0x00f6
        L_0x00e6:
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            boolean r0 = X.AnonymousClass0x7.A1S(r2)
            if (r0 == 0) goto L_0x00f6
            X.C75003pT.A03(r9, r3, r10, r1)
            r1.addAll(r2)
        L_0x00f6:
            r4.add(r1)
            goto L_0x0066
        L_0x00fb:
            java.util.List r0 = X.C73783g4.A0e(r4)
            r14.label = r7
            java.lang.Object r0 = r5.B2K(r0, r14)
            if (r0 != r6) goto L_0x000c
            return r6
        L_0x0108:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x010d:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3.A09(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object BGj(Object obj, Object obj2, Object obj3) {
        AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3 avatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3 = new AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3(this.this$0, (C84814Du) obj3);
        avatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3.L$0 = obj;
        avatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3.L$1 = obj2;
        return C59022wD.A01(avatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3);
    }
}

package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass4GS;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1", f = "AvatarExpressionsViewModel.kt", i = {0}, l = {220, 193}, m = "invokeSuspend", n = {"searchQuery"}, s = {"L$1"})
public final class AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1 extends C75003pT implements AnonymousClass4GS {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C84814Du r3) {
        super(r3, 3);
        this.this$0 = avatarExpressionsViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (X.C616231o.A00(r8, 500) == r4) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r9) {
        /*
            r8 = this;
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r1) goto L_0x0034
            if (r0 != r6) goto L_0x007f
            X.C57682u2.A01(r9)
        L_0x000f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0012:
            X.C57682u2.A01(r9)
            java.lang.Object r5 = r8.L$0
            X.4C9 r5 = (X.AnonymousClass4C9) r5
            java.lang.Object r7 = r8.L$1
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0061
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x0061
            r8.L$0 = r5
            r8.L$1 = r7
            r8.label = r1
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.C616231o.A00(r8, r0)
            if (r0 != r4) goto L_0x003f
        L_0x0033:
            return r4
        L_0x0034:
            java.lang.Object r7 = r8.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r8.L$0
            X.4C9 r5 = (X.AnonymousClass4C9) r5
            X.C57682u2.A01(r9)
        L_0x003f:
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r3 = r8.this$0
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r2 = r3.A05
            X.1lb r1 = new X.1lb
            r1.<init>(r7)
            r0 = 0
            X.4C8 r0 = r2.A02(r1, r0)
            X.3eG r1 = new X.3eG
            r1.<init>(r3, r7, r0)
            X.3gB r0 = r3.A0D
            X.4C8 r2 = X.AnonymousClass2AN.A00(r0, r1)
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r1 = r8.this$0
            r0 = 0
            X.4J6 r3 = new X.4J6
            r3.<init>((java.lang.Object) r1, (int) r0, (java.lang.Object) r2)
            goto L_0x006d
        L_0x0061:
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r2 = r8.this$0
            X.2UA r0 = r2.A02
            X.4Gt r1 = r0.A0G
            r0 = 1
            X.4J6 r3 = new X.4J6
            r3.<init>((java.lang.Object) r2, (int) r0, (java.lang.Object) r1)
        L_0x006d:
            r0 = 0
            r8.L$0 = r0
            r8.L$1 = r0
            r8.label = r6
            java.lang.Object r0 = r3.Az8(r8, r5)
            if (r0 == r4) goto L_0x0033
            X.2wD r0 = X.C59022wD.A00
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x007f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1.A09(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object BGj(Object obj, Object obj2, Object obj3) {
        AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1 avatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1 = new AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1(this.this$0, (C84814Du) obj3);
        avatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1.L$0 = obj;
        avatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1.L$1 = obj2;
        return C59022wD.A01(avatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1);
    }
}

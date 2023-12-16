package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {333, 262}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3pM  reason: invalid class name and case insensitive filesystem */
public final class C74963pM extends C75003pT implements AnonymousClass4GS {
    public final /* synthetic */ AnonymousClass4GU $transform$inlined;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74963pM(C84814Du r2, AnonymousClass4GU r3) {
        super(r2, 3);
        this.$transform$inlined = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r12) {
        /*
            r11 = this;
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r11.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r3) goto L_0x0034
            if (r0 != r4) goto L_0x0047
            X.C57682u2.A01(r12)
        L_0x000f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0012:
            X.C57682u2.A01(r12)
            java.lang.Object r2 = r11.L$0
            X.4C9 r2 = (X.AnonymousClass4C9) r2
            java.lang.Object r1 = r11.L$1
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            X.4GU r6 = r11.$transform$inlined
            r0 = 0
            r7 = r1[r0]
            r8 = r1[r3]
            r9 = r1[r4]
            r0 = 3
            r10 = r1[r0]
            r11.L$0 = r2
            r11.label = r3
            java.lang.Object r12 = r6.BGl(r7, r8, r9, r10, r11)
            if (r12 != r5) goto L_0x003b
            return r5
        L_0x0034:
            java.lang.Object r2 = r11.L$0
            X.4C9 r2 = (X.AnonymousClass4C9) r2
            X.C57682u2.A01(r12)
        L_0x003b:
            r0 = 0
            r11.L$0 = r0
            r11.label = r4
            java.lang.Object r0 = r2.B2K(r12, r11)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x0047:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74963pM.A09(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object BGj(Object obj, Object obj2, Object obj3) {
        C74963pM r0 = new C74963pM((C84814Du) obj3, this.$transform$inlined);
        r0.L$0 = obj;
        r0.L$1 = obj2;
        return C59022wD.A01(r0);
    }
}

package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {217, 217}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3pL  reason: invalid class name and case insensitive filesystem */
public final class C74953pL extends C75003pT implements AnonymousClass4GS {
    public final /* synthetic */ AnonymousClass4GR $transform;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74953pL(C84814Du r2, AnonymousClass4GR r3) {
        super(r2, 3);
        this.$transform = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r7) {
        /*
            r6 = this;
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r3) goto L_0x0028
            if (r0 != r4) goto L_0x003b
            X.C57682u2.A01(r7)
        L_0x000f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0012:
            X.C57682u2.A01(r7)
            java.lang.Object r2 = r6.L$0
            X.4C9 r2 = (X.AnonymousClass4C9) r2
            java.lang.Object r1 = r6.L$1
            X.4GR r0 = r6.$transform
            r6.L$0 = r2
            r6.label = r3
            java.lang.Object r7 = r0.invoke(r1, r6)
            if (r7 != r5) goto L_0x002f
            return r5
        L_0x0028:
            java.lang.Object r2 = r6.L$0
            X.4C9 r2 = (X.AnonymousClass4C9) r2
            X.C57682u2.A01(r7)
        L_0x002f:
            r0 = 0
            r6.L$0 = r0
            r6.label = r4
            java.lang.Object r0 = r2.B2K(r7, r6)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x003b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74953pL.A09(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object BGj(Object obj, Object obj2, Object obj3) {
        C74953pL r0 = new C74953pL((C84814Du) obj3, this.$transform);
        r0.L$0 = obj;
        r0.L$1 = obj2;
        return C59022wD.A01(r0);
    }
}

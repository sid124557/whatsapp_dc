package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3pN  reason: invalid class name and case insensitive filesystem */
public final class C74973pN extends C75003pT implements AnonymousClass4GS {
    public final /* synthetic */ AnonymousClass4GS $transform;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74973pN(C84814Du r2, AnonymousClass4GS r3) {
        super(r2, 3);
        this.$transform = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r9) {
        /*
            r8 = this;
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r5) goto L_0x002f
            if (r0 != r6) goto L_0x0042
            X.C57682u2.A01(r9)
        L_0x000f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0012:
            X.C57682u2.A01(r9)
            java.lang.Object r4 = r8.L$0
            X.4C9 r4 = (X.AnonymousClass4C9) r4
            java.lang.Object r3 = r8.L$1
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            X.4GS r2 = r8.$transform
            r0 = 0
            r1 = r3[r0]
            r0 = r3[r5]
            r8.L$0 = r4
            r8.label = r5
            java.lang.Object r9 = r2.BGj(r1, r0, r8)
            if (r9 != r7) goto L_0x0036
            return r7
        L_0x002f:
            java.lang.Object r4 = r8.L$0
            X.4C9 r4 = (X.AnonymousClass4C9) r4
            X.C57682u2.A01(r9)
        L_0x0036:
            r0 = 0
            r8.L$0 = r0
            r8.label = r6
            java.lang.Object r0 = r4.B2K(r9, r8)
            if (r0 != r7) goto L_0x000f
            return r7
        L_0x0042:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74973pN.A09(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object BGj(Object obj, Object obj2, Object obj3) {
        C74973pN r0 = new C74973pN((C84814Du) obj3, this.$transform);
        r0.L$0 = obj;
        r0.L$1 = obj2;
        return C59022wD.A01(r0);
    }
}

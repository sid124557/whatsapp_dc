package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
/* renamed from: X.3pO  reason: invalid class name and case insensitive filesystem */
public final class C74983pO extends C75003pT implements AnonymousClass4GS {
    public /* synthetic */ int I$0;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C72913eV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74983pO(C84814Du r2, C72913eV r3) {
        super(r2, 3);
        this.this$0 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r10) {
        /*
            r9 = this;
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r9.label
            r4 = 5
            r7 = 4
            r8 = 3
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r5) goto L_0x0079
            if (r0 == r6) goto L_0x003f
            if (r0 == r8) goto L_0x0053
            if (r0 == r7) goto L_0x006a
            if (r0 == r4) goto L_0x0079
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x001a:
            X.C57682u2.A01(r10)
            java.lang.Object r2 = r9.L$0
            X.4C9 r2 = (X.AnonymousClass4C9) r2
            int r0 = r9.I$0
            if (r0 <= 0) goto L_0x0030
            X.20m r1 = X.C369820m.START
            r9.label = r5
        L_0x0029:
            java.lang.Object r0 = r2.B2K(r1, r9)
            if (r0 != r3) goto L_0x007c
            return r3
        L_0x0030:
            X.3eV r0 = r9.this$0
            long r0 = r0.A00
            r9.L$0 = r2
            r9.label = r6
            java.lang.Object r0 = X.C616231o.A00(r9, r0)
            if (r0 != r3) goto L_0x0046
            return r3
        L_0x003f:
            java.lang.Object r2 = r9.L$0
            X.4C9 r2 = (X.AnonymousClass4C9) r2
            X.C57682u2.A01(r10)
        L_0x0046:
            X.20m r0 = X.C369820m.STOP
            r9.L$0 = r2
            r9.label = r8
            java.lang.Object r0 = r2.B2K(r0, r9)
            if (r0 != r3) goto L_0x005a
            return r3
        L_0x0053:
            java.lang.Object r2 = r9.L$0
            X.4C9 r2 = (X.AnonymousClass4C9) r2
            X.C57682u2.A01(r10)
        L_0x005a:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9.L$0 = r2
            r9.label = r7
            java.lang.Object r0 = X.C616231o.A00(r9, r0)
            if (r0 != r3) goto L_0x0071
            return r3
        L_0x006a:
            java.lang.Object r2 = r9.L$0
            X.4C9 r2 = (X.AnonymousClass4C9) r2
            X.C57682u2.A01(r10)
        L_0x0071:
            X.20m r1 = X.C369820m.STOP_AND_RESET_REPLAY_CACHE
            r0 = 0
            r9.L$0 = r0
            r9.label = r4
            goto L_0x0029
        L_0x0079:
            X.C57682u2.A01(r10)
        L_0x007c:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74983pO.A09(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object BGj(Object obj, Object obj2, Object obj3) {
        int A0K = AnonymousClass001.A0K(obj2);
        C74983pO r0 = new C74983pO((C84814Du) obj3, this.this$0);
        r0.L$0 = obj;
        r0.I$0 = A0K;
        return C59022wD.A01(r0);
    }
}

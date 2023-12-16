package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, 219, 225}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3oc  reason: invalid class name and case insensitive filesystem */
public final class C74923oc extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Object $initialValue;
    public final /* synthetic */ C85534Gq $shared;
    public final /* synthetic */ C85154Fd $started;
    public final /* synthetic */ AnonymousClass4C8 $upstream;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74923oc(Object obj, C84814Du r3, AnonymousClass4C8 r4, C85534Gq r5, C85154Fd r6) {
        super(r3, 2);
        this.$started = r6;
        this.$upstream = r4;
        this.$shared = r5;
        this.$initialValue = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r0 != r3) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r15) {
        /*
            r14 = this;
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r14.label
            r6 = 4
            r5 = 3
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 == r2) goto L_0x00ad
            if (r0 == r7) goto L_0x0053
            if (r0 == r5) goto L_0x00ad
            if (r0 == r6) goto L_0x00ad
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0017:
            X.C57682u2.A01(r15)
            X.4Fd r4 = r14.$started
            X.4Fd r0 = X.C58102ui.A00
            if (r4 != r0) goto L_0x002d
            X.4C8 r1 = r14.$upstream
            X.4Gq r0 = r14.$shared
            r14.label = r2
        L_0x0026:
            java.lang.Object r0 = r1.Az8(r14, r0)
        L_0x002a:
            if (r0 != r3) goto L_0x00b0
        L_0x002c:
            return r3
        L_0x002d:
            X.4Fd r0 = X.C58102ui.A01
            r8 = 0
            X.4Gq r2 = r14.$shared
            X.2pE r2 = (X.C54752pE) r2
            monitor-enter(r2)
            if (r4 != r0) goto L_0x005d
            X.46n r1 = r2.A02     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x0044
            int r0 = r2.A00     // Catch:{ all -> 0x00b3 }
            X.46n r1 = new X.46n     // Catch:{ all -> 0x00b3 }
            r1.<init>(r0)     // Catch:{ all -> 0x00b3 }
            r2.A02 = r1     // Catch:{ all -> 0x00b3 }
        L_0x0044:
            monitor-exit(r2)
            X.3kO r0 = new X.3kO
            r0.<init>(r8)
            r14.label = r7
            java.lang.Object r0 = X.C159517ly.A00(r14, r0, r1)
            if (r0 != r3) goto L_0x0056
            return r3
        L_0x0053:
            X.C57682u2.A01(r15)
        L_0x0056:
            X.4C8 r1 = r14.$upstream
            X.4Gq r0 = r14.$shared
            r14.label = r5
            goto L_0x0026
        L_0x005d:
            X.46n r1 = r2.A02     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x006a
            int r0 = r2.A00     // Catch:{ all -> 0x00b3 }
            X.46n r1 = new X.46n     // Catch:{ all -> 0x00b3 }
            r1.<init>(r0)     // Catch:{ all -> 0x00b3 }
            r2.A02 = r1     // Catch:{ all -> 0x00b3 }
        L_0x006a:
            monitor-exit(r2)
            X.4C8 r0 = r4.Az9(r1)
            X.4C8 r5 = X.C58072uf.A00(r0)
            X.4C8 r4 = r14.$upstream
            X.4Gq r2 = r14.$shared
            java.lang.Object r0 = r14.$initialValue
            X.3ob r1 = new X.3ob
            r1.<init>(r0, r8, r4, r2)
            r14.label = r6
            X.3pL r0 = new X.3pL
            r0.<init>(r8, r1)
            X.4C8 r11 = X.C57752u9.A00(r0, r5)
            X.20l r10 = X.C369720l.SUSPEND
            r12 = 0
            boolean r0 = r11 instanceof X.C85554Gs
            if (r0 == 0) goto L_0x00a5
            X.4Gs r11 = (X.C85554Gs) r11
            X.3du r0 = X.C72553du.A00
            X.4C8 r7 = r11.B3e(r0, r10, r12)
        L_0x0098:
            X.3eQ r0 = X.C72863eQ.A00
            java.lang.Object r0 = r7.Az8(r14, r0)
            if (r0 == r3) goto L_0x002c
            X.2wD r0 = X.C59022wD.A00
            if (r0 != r3) goto L_0x002a
            return r3
        L_0x00a5:
            r13 = 2
            X.46v r7 = new X.46v
            r9 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L_0x0098
        L_0x00ad:
            X.C57682u2.A01(r15)
        L_0x00b0:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74923oc.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        C85154Fd r5 = this.$started;
        return new C74923oc(this.$initialValue, r8, this.$upstream, this.$shared, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

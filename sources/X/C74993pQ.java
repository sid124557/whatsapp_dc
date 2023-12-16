package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {221, 426}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* renamed from: X.3pQ  reason: invalid class name and case insensitive filesystem */
public final class C74993pQ extends C75003pT implements AnonymousClass4GS {
    public final /* synthetic */ AnonymousClass4C8 $this_debounceInternal;
    public final /* synthetic */ AnonymousClass4GQ $timeoutMillisSelector;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74993pQ(C84814Du r2, AnonymousClass4GQ r3, AnonymousClass4C8 r4) {
        super(r2, 3);
        this.$timeoutMillisSelector = r3;
        this.$this_debounceInternal = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ee A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r22) {
        /*
            r21 = this;
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            r4 = r21
            int r0 = r4.label
            r9 = 2
            r6 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00f4
            if (r0 == r6) goto L_0x005c
            if (r0 != r9) goto L_0x0122
            java.lang.Object r8 = r4.L$2
            X.3Yy r8 = (X.C69903Yy) r8
            java.lang.Object r7 = r4.L$1
            X.4FH r7 = (X.AnonymousClass4FH) r7
            java.lang.Object r2 = r4.L$0
            X.4C9 r2 = (X.AnonymousClass4C9) r2
            X.C57682u2.A01(r22)
        L_0x001e:
            java.lang.Object r1 = r8.element
            X.2XH r0 = X.AnonymousClass2C3.A00
            if (r1 == r0) goto L_0x011f
            X.3Yx r11 = new X.3Yx
            r11.<init>()
            if (r1 == 0) goto L_0x0071
            X.4GQ r0 = r4.$timeoutMillisSelector
            X.2XH r12 = X.AnonymousClass2C3.A01
            if (r1 != r12) goto L_0x0032
            r1 = r3
        L_0x0032:
            java.lang.Object r0 = r0.invoke(r1)
            long r0 = X.C18310x6.A0B(r0)
            r11.element = r0
            r13 = 0
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r10 < 0) goto L_0x0118
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x0071
            java.lang.Object r0 = r8.element
            if (r0 != r12) goto L_0x004b
            r0 = r3
        L_0x004b:
            r4.L$0 = r2
            r4.L$1 = r7
            r4.L$2 = r8
            r4.L$3 = r11
            r4.label = r6
            java.lang.Object r0 = r2.B2K(r0, r4)
            if (r0 != r5) goto L_0x006f
            return r5
        L_0x005c:
            java.lang.Object r11 = r4.L$3
            X.3Yx r11 = (X.C69893Yx) r11
            java.lang.Object r8 = r4.L$2
            X.3Yy r8 = (X.C69903Yy) r8
            java.lang.Object r7 = r4.L$1
            X.4FH r7 = (X.AnonymousClass4FH) r7
            java.lang.Object r2 = r4.L$0
            X.4C9 r2 = (X.AnonymousClass4C9) r2
            X.C57682u2.A01(r22)
        L_0x006f:
            r8.element = r3
        L_0x0071:
            X.4Gl r0 = r4.B5w()
            X.466 r10 = new X.466
            r10.<init>(r0)
            java.lang.Object r0 = r8.element
            if (r0 == 0) goto L_0x00b0
            long r0 = r11.element
            X.3hk r14 = new X.3hk
            r14.<init>(r3, r8, r2)
            X.2J9 r11 = new X.2J9
            r11.<init>(r0)
            X.3sE r1 = X.C76713sE.A00
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            X.C162457s7.A0K(r1, r0)
            r0 = 3
            X.AnonymousClass360.A03(r1, r0)
            X.2PQ r0 = new X.2PQ
            r0.<init>(r11, r1)
            java.lang.Object r12 = r0.A00
            X.4GS r15 = r0.A02
            X.4GS r0 = r0.A01
            X.2XH r13 = X.AnonymousClass2CB.A02
            X.2co r11 = new X.2co
            r17 = r10
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r0 = 0
            r10.A05(r11, r0)
        L_0x00b0:
            X.2PR r0 = r7.BAB()
            X.3oa r13 = new X.3oa
            r13.<init>(r3, r8, r2)
            java.lang.Object r12 = r0.A00
            X.4GS r11 = r0.A02
            X.4GS r0 = r0.A01
            X.2co r1 = new X.2co
            r14 = r1
            r15 = r12
            r16 = r3
            r17 = r13
            r18 = r11
            r19 = r0
            r20 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r0 = 0
            r10.A05(r1, r0)
            r4.L$0 = r2
            r4.L$1 = r7
            r4.L$2 = r8
            r4.L$3 = r3
            r4.label = r9
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AnonymousClass466.A05
            java.lang.Object r0 = r0.get(r10)
            boolean r0 = r0 instanceof X.C47162co
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r0 = r10.A02(r4)
        L_0x00ec:
            if (r0 != r5) goto L_0x001e
            return r5
        L_0x00ef:
            java.lang.Object r0 = r10.A03(r4)
            goto L_0x00ec
        L_0x00f4:
            X.C57682u2.A01(r22)
            java.lang.Object r12 = r4.L$0
            X.4C6 r12 = (X.AnonymousClass4C6) r12
            java.lang.Object r2 = r4.L$1
            X.4C9 r2 = (X.AnonymousClass4C9) r2
            X.4C8 r0 = r4.$this_debounceInternal
            X.3mk r11 = new X.3mk
            r11.<init>(r3, r0)
            X.3du r10 = X.C72553du.A00
            r15 = 0
            X.20l r14 = X.C369720l.SUSPEND
            X.20D r13 = X.AnonymousClass20D.DEFAULT
            X.4FH r7 = X.C57732u7.A01(r10, r11, r12, r13, r14, r15)
            X.3Yy r8 = new X.3Yy
            r8.<init>()
            goto L_0x001e
        L_0x0118:
            java.lang.String r0 = "Debounce timeout should not be negative"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x011f:
            X.2wD r5 = X.C59022wD.A00
            return r5
        L_0x0122:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74993pQ.A09(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object BGj(Object obj, Object obj2, Object obj3) {
        C74993pQ r0 = new C74993pQ((C84814Du) obj3, this.$timeoutMillisSelector, this.$this_debounceInternal);
        r0.L$0 = obj;
        r0.L$1 = obj2;
        return C59022wD.A01(r0);
    }
}

package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {54, 76, 79}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* renamed from: X.3pC  reason: invalid class name and case insensitive filesystem */
public final class C74943pC extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GP $arrayFactory;
    public final /* synthetic */ AnonymousClass4C8[] $flows;
    public final /* synthetic */ AnonymousClass4C9 $this_combineInternal;
    public final /* synthetic */ AnonymousClass4GS $transform;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74943pC(C84814Du r2, AnonymousClass4GP r3, AnonymousClass4GS r4, AnonymousClass4C9 r5, AnonymousClass4C8[] r6) {
        super(r2, 2);
        this.$flows = r6;
        this.$arrayFactory = r3;
        this.$transform = r4;
        this.$this_combineInternal = r5;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009d A[LOOP:1: B:29:0x009d->B:38:0x00bd, LOOP_START, PHI: r3 r11 
      PHI: (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:26:0x0098, B:38:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 X.2q1) = (r11v2 X.2q1), (r11v6 X.2q1) binds: [B:26:0x0098, B:38:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r16) {
        /*
            r15 = this;
            r1 = r16
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r15.label
            r6 = 3
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r4) goto L_0x007a
            if (r0 == r5) goto L_0x0016
            if (r0 == r6) goto L_0x0016
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0016:
            int r8 = r15.I$1
            int r3 = r15.I$0
            java.lang.Object r9 = r15.L$2
            byte[] r9 = (byte[]) r9
            java.lang.Object r12 = r15.L$1
            X.4FH r12 = (X.AnonymousClass4FH) r12
            java.lang.Object r2 = r15.L$0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            X.C57682u2.A01(r1)
            goto L_0x0060
        L_0x002a:
            X.C57682u2.A01(r1)
            java.lang.Object r1 = r15.L$0
            X.4C6 r1 = (X.AnonymousClass4C6) r1
            X.4C8[] r0 = r15.$flows
            int r3 = r0.length
            if (r3 == 0) goto L_0x009a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            X.2XH r8 = X.AnonymousClass2C3.A02
            r0 = 0
            java.util.Arrays.fill(r2, r0, r3, r8)
            r11 = 0
            r0 = 2147483647(0x7fffffff, float:NaN)
            X.8PR r12 = new X.8PR
            if (r3 == r0) goto L_0x0076
            r12.<init>(r3)
        L_0x0049:
            java.util.concurrent.atomic.AtomicInteger r10 = new java.util.concurrent.atomic.AtomicInteger
            r10.<init>(r3)
            r8 = 0
            r14 = 0
        L_0x0050:
            X.4C8[] r13 = r15.$flows
            X.3od r9 = new X.3od
            r9.<init>(r10, r11, r12, r13, r14)
            X.C616131n.A02(r11, r9, r1, r11, r6)
            int r14 = r14 + 1
            if (r14 < r3) goto L_0x0050
            byte[] r9 = new byte[r3]
        L_0x0060:
            int r0 = r8 + 1
            byte r8 = (byte) r0
            r15.L$0 = r2
            r15.L$1 = r12
            r15.L$2 = r9
            r15.I$0 = r3
            r15.I$1 = r8
            r15.label = r4
            java.lang.Object r11 = r12.BiR(r15)
            if (r11 != r7) goto L_0x0091
            return r7
        L_0x0076:
            r12.<init>(r0)
            goto L_0x0049
        L_0x007a:
            int r8 = r15.I$1
            int r3 = r15.I$0
            java.lang.Object r9 = r15.L$2
            byte[] r9 = (byte[]) r9
            java.lang.Object r12 = r15.L$1
            X.4FH r12 = (X.AnonymousClass4FH) r12
            java.lang.Object r2 = r15.L$0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            X.C57682u2.A01(r1)
            X.2yc r1 = (X.C60472yc) r1
            java.lang.Object r11 = r1.A00
        L_0x0091:
            boolean r0 = r11 instanceof X.C44012Ui
            if (r0 == 0) goto L_0x0096
            r11 = 0
        L_0x0096:
            X.2q1 r11 = (X.C55232q1) r11
            if (r11 != 0) goto L_0x009d
        L_0x009a:
            X.2wD r7 = X.C59022wD.A00
            return r7
        L_0x009d:
            int r10 = r11.A00
            r1 = r2[r10]
            java.lang.Object r0 = r11.A01
            r2[r10] = r0
            X.2XH r0 = X.AnonymousClass2C3.A02
            if (r1 != r0) goto L_0x00ab
            int r3 = r3 + -1
        L_0x00ab:
            byte r0 = r9[r10]
            if (r0 == r8) goto L_0x00bf
            byte r0 = (byte) r8
            r9[r10] = r0
            java.lang.Object r11 = r12.BrB()
            boolean r0 = r11 instanceof X.C44012Ui
            if (r0 == 0) goto L_0x00bb
            r11 = 0
        L_0x00bb:
            X.2q1 r11 = (X.C55232q1) r11
            if (r11 != 0) goto L_0x009d
        L_0x00bf:
            if (r3 != 0) goto L_0x0060
            X.4GP r0 = r15.$arrayFactory
            java.lang.Object r10 = r0.invoke()
            if (r10 != 0) goto L_0x00e0
            X.4GS r1 = r15.$transform
            X.4C9 r0 = r15.$this_combineInternal
            r15.L$0 = r2
            r15.L$1 = r12
            r15.L$2 = r9
            r15.I$0 = r3
            r15.I$1 = r8
            r15.label = r5
            java.lang.Object r0 = r1.BGj(r0, r2, r15)
            if (r0 != r7) goto L_0x0060
            return r7
        L_0x00e0:
            int r1 = r2.length
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r10, r0, r1)
            X.4GS r1 = r15.$transform
            X.4C9 r0 = r15.$this_combineInternal
            r15.L$0 = r2
            r15.L$1 = r12
            r15.L$2 = r9
            r15.I$0 = r3
            r15.I$1 = r8
            r15.label = r6
            java.lang.Object r0 = r1.BGj(r0, r10, r15)
            if (r0 != r7) goto L_0x0060
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74943pC.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        C84814Du r1 = r8;
        C74943pC r0 = new C74943pC(r1, this.$arrayFactory, this.$transform, this.$this_combineInternal, this.$flows);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

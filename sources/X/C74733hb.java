package X;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.3hb  reason: invalid class name and case insensitive filesystem */
public final class C74733hb extends C74743hc implements AnonymousClass4GR {
    public final /* synthetic */ Iterator $iterator;
    public final /* synthetic */ boolean $partialWindows;
    public final /* synthetic */ boolean $reuseBuffer;
    public final /* synthetic */ int $size;
    public final /* synthetic */ int $step;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74733hb(Iterator it, C84814Du r2, int i, int i2, boolean z, boolean z2) {
        super(r2);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0132, code lost:
        if (r13.$partialWindows == false) goto L_0x017a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x007d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r14) {
        /*
            r13 = this;
            X.218 r12 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r13.label
            r6 = 5
            r5 = 4
            r8 = 3
            r7 = 2
            r10 = 1
            r4 = 0
            if (r0 == 0) goto L_0x001b
            if (r0 == r10) goto L_0x0038
            if (r0 == r7) goto L_0x0177
            if (r0 == r8) goto L_0x00a6
            if (r0 == r5) goto L_0x0135
            if (r0 == r6) goto L_0x0177
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x001b:
            X.C57682u2.A01(r14)
            java.lang.Object r2 = r13.L$0
            X.3cv r2 = (X.C71943cv) r2
            int r9 = r13.$size
            r1 = r9
            r0 = 1024(0x400, float:1.435E-42)
            if (r9 <= r0) goto L_0x002b
            r1 = 1024(0x400, float:1.435E-42)
        L_0x002b:
            int r3 = r13.$step
            int r3 = r3 - r9
            if (r3 < 0) goto L_0x009b
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r1)
            java.util.Iterator r6 = r13.$iterator
            r8 = 0
            goto L_0x0051
        L_0x0038:
            int r8 = r13.I$0
            java.lang.Object r6 = r13.L$2
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r5 = r13.L$1
            java.util.AbstractCollection r5 = (java.util.AbstractCollection) r5
            java.lang.Object r2 = r13.L$0
            X.3cv r2 = (X.C71943cv) r2
            X.C57682u2.A01(r14)
            boolean r0 = r13.$reuseBuffer
            if (r0 == 0) goto L_0x0076
            r5.clear()
        L_0x0050:
            r3 = r8
        L_0x0051:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x007d
            java.lang.Object r0 = r6.next()
            if (r8 <= 0) goto L_0x0060
            int r8 = r8 + -1
            goto L_0x0051
        L_0x0060:
            r5.add(r0)
            int r1 = r5.size()
            int r0 = r13.$size
            if (r1 != r0) goto L_0x0051
            r13.L$0 = r2
            r13.L$1 = r5
            r13.L$2 = r6
            r13.I$0 = r3
            r13.label = r10
            goto L_0x0097
        L_0x0076:
            int r0 = r13.$size
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r0)
            goto L_0x0050
        L_0x007d:
            boolean r0 = X.AnonymousClass0x7.A1S(r5)
            if (r0 == 0) goto L_0x017a
            boolean r0 = r13.$partialWindows
            if (r0 != 0) goto L_0x008f
            int r1 = r5.size()
            int r0 = r13.$size
            if (r1 != r0) goto L_0x017a
        L_0x008f:
            r13.L$0 = r4
            r13.L$1 = r4
            r13.L$2 = r4
            r13.label = r7
        L_0x0097:
            r2.A02(r5, r13)
            return r12
        L_0x009b:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0 = 0
            X.3ft r3 = new X.3ft
            r3.<init>(r1, r0)
            java.util.Iterator r7 = r13.$iterator
            goto L_0x00ba
        L_0x00a6:
            java.lang.Object r7 = r13.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r3 = r13.L$1
            X.3ft r3 = (X.C73673ft) r3
            java.lang.Object r2 = r13.L$0
            X.3cv r2 = (X.C71943cv) r2
            X.C57682u2.A01(r14)
            int r0 = r13.$step
            r3.A02(r0)
        L_0x00ba:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0130
            java.lang.Object r11 = r7.next()
            int r0 = r3.size()
            int r1 = r3.A02
            if (r0 != r1) goto L_0x00d4
            java.lang.String r0 = "ring buffer is full"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x00d4:
            java.lang.Object[] r10 = r3.A03
            int r9 = r3.A01
            int r0 = r3.size()
            int r9 = r9 + r0
            int r9 = r9 % r1
            r10[r9] = r11
            int r0 = r3.size()
            int r0 = r0 + 1
            r3.A00 = r0
            int r0 = r3.size()
            if (r0 != r1) goto L_0x00ba
            int r0 = r3.size()
            int r9 = r13.$size
            if (r0 >= r9) goto L_0x011a
            int r0 = r1 >> 1
            int r1 = r1 + r0
            int r1 = r1 + 1
            if (r1 <= r9) goto L_0x00fe
            r1 = r9
        L_0x00fe:
            int r0 = r3.A01
            if (r0 != 0) goto L_0x0113
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r10, r1)
            X.C162457s7.A0D(r1)
        L_0x0109:
            int r0 = r3.size()
            X.3ft r3 = new X.3ft
            r3.<init>(r1, r0)
            goto L_0x00ba
        L_0x0113:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object[] r1 = r3.toArray(r0)
            goto L_0x0109
        L_0x011a:
            boolean r0 = r13.$reuseBuffer
            if (r0 == 0) goto L_0x012b
            r0 = r3
        L_0x011f:
            r13.L$0 = r2
            r13.L$1 = r3
            r13.L$2 = r7
            r13.label = r8
            r2.A02(r0, r13)
            return r12
        L_0x012b:
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r3)
            goto L_0x011f
        L_0x0130:
            boolean r0 = r13.$partialWindows
            if (r0 == 0) goto L_0x017a
            goto L_0x0145
        L_0x0135:
            java.lang.Object r3 = r13.L$1
            X.3ft r3 = (X.C73673ft) r3
            java.lang.Object r2 = r13.L$0
            X.3cv r2 = (X.C71943cv) r2
            X.C57682u2.A01(r14)
            int r0 = r13.$step
            r3.A02(r0)
        L_0x0145:
            int r1 = r3.size()
            int r0 = r13.$step
            if (r1 <= r0) goto L_0x0163
            boolean r0 = r13.$reuseBuffer
            if (r0 == 0) goto L_0x015e
            r0 = r3
        L_0x0152:
            r13.L$0 = r2
            r13.L$1 = r3
            r13.L$2 = r4
            r13.label = r5
            r2.A02(r0, r13)
            return r12
        L_0x015e:
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r3)
            goto L_0x0152
        L_0x0163:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x017a
            r13.L$0 = r4
            r13.L$1 = r4
            r13.L$2 = r4
            r13.label = r6
            r2.A02(r3, r13)
            return r12
        L_0x0177:
            X.C57682u2.A01(r14)
        L_0x017a:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74733hb.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r9) {
        C84814Du r2 = r9;
        C74733hb r0 = new C74733hb(this.$iterator, r2, this.$size, this.$step, this.$reuseBuffer, this.$partialWindows);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

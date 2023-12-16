package com.whatsapp.stickers.flow;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1", f = "StickerPackFlow.kt", i = {0, 1, 2, 2}, l = {57, 68, 86, 222}, m = "invokeSuspend", n = {"$this$callbackFlow", "$this$callbackFlow", "$this$callbackFlow", "stickerPack"}, s = {"L$0", "L$0", "L$0", "L$3"})
public final class StickerPackFlow$packFlow$1 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$1(StickerPackFlow stickerPackFlow, C84814Du r3) {
        super(r3, 2);
        this.this$0 = stickerPackFlow;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r13) {
        /*
            r12 = this;
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r12.label
            r6 = 4
            r9 = 3
            r8 = 2
            r7 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0019
            if (r0 == r7) goto L_0x0034
            if (r0 == r8) goto L_0x0051
            if (r0 == r9) goto L_0x00c7
            if (r0 != r6) goto L_0x013d
            X.C57682u2.A01(r13)
        L_0x0016:
            X.2wD r5 = X.C59022wD.A00
            return r5
        L_0x0019:
            X.C57682u2.A01(r13)
            java.lang.Object r3 = r12.L$0
            X.4Gm r3 = (X.AnonymousClass4Gm) r3
            com.whatsapp.stickers.flow.StickerPackFlow r2 = r12.this$0
            X.3gB r1 = r2.A0B
            com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$initialStickerPacks$1 r0 = new com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$initialStickerPacks$1
            r0.<init>(r2, r4)
            r12.L$0 = r3
            r12.label = r7
            java.lang.Object r13 = X.C616131n.A00(r12, r1, r0)
            if (r13 != r5) goto L_0x003b
            return r5
        L_0x0034:
            java.lang.Object r3 = r12.L$0
            X.4Gm r3 = (X.AnonymousClass4Gm) r3
            X.C57682u2.A01(r13)
        L_0x003b:
            java.util.List r13 = (java.util.List) r13
            com.whatsapp.stickers.flow.StickerPackFlow r2 = r12.this$0
            X.3gB r1 = r2.A0B
            com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$packsWithLoadingStickers$1 r0 = new com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$packsWithLoadingStickers$1
            r0.<init>(r2, r13, r4)
            r12.L$0 = r3
            r12.label = r8
            java.lang.Object r13 = X.C616131n.A00(r12, r1, r0)
            if (r13 != r5) goto L_0x0058
            return r5
        L_0x0051:
            java.lang.Object r3 = r12.L$0
            X.4Gm r3 = (X.AnonymousClass4Gm) r3
            X.C57682u2.A01(r13)
        L_0x0058:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r13.iterator()
        L_0x0062:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1rT r0 = (X.C32701rT) r0
            X.2iT r0 = r0.A00
            boolean r0 = r0.A0S
            if (r0 != 0) goto L_0x0062
            r7.add(r1)
            goto L_0x0062
        L_0x0079:
            r0 = 40
            java.util.List r8 = X.C73723fy.A0H(r7, r0)
            com.whatsapp.stickers.flow.StickerPackFlow r2 = r12.this$0
            X.1rQ r0 = new X.1rQ
            r0.<init>(r8)
            java.util.List r1 = r0.A00
            X.1rQ r0 = new X.1rQ
            r0.<init>(r1)
            r2.A00 = r0
            r3.BrD(r0)
            com.whatsapp.stickers.flow.StickerPackFlow r0 = r12.this$0
            X.1VX r2 = r0.A01
            r1 = 6548(0x1994, float:9.176E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x0118
            com.whatsapp.stickers.flow.StickerPackFlow r7 = r12.this$0
            java.util.Iterator r8 = r8.iterator()
        L_0x00a6:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0118
            java.lang.Object r0 = r8.next()
            X.2ed r0 = (X.C48272ed) r0
            X.2iT r10 = r0.A00()
            r12.L$0 = r3
            r12.L$1 = r7
            r12.L$2 = r8
            r12.L$3 = r10
            r12.label = r9
            java.lang.Object r13 = r7.A01(r10, r12)
            if (r13 != r5) goto L_0x00da
            return r5
        L_0x00c7:
            java.lang.Object r10 = r12.L$3
            X.2iT r10 = (X.C50612iT) r10
            java.lang.Object r8 = r12.L$2
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r7 = r12.L$1
            com.whatsapp.stickers.flow.StickerPackFlow r7 = (com.whatsapp.stickers.flow.StickerPackFlow) r7
            java.lang.Object r3 = r12.L$0
            X.4Gm r3 = (X.AnonymousClass4Gm) r3
            X.C57682u2.A01(r13)
        L_0x00da:
            X.1rQ r0 = r7.A00
            java.util.List r0 = r0.A00
            java.util.ArrayList r9 = X.C73783g4.A0c(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x00e6:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r2 = r11.next()
            X.2ed r2 = (X.C48272ed) r2
            X.2iT r0 = r2.A00()
            java.lang.String r1 = r0.A0G
            java.lang.String r0 = r10.A0G
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0101
            r2 = r13
        L_0x0101:
            r9.add(r2)
            goto L_0x00e6
        L_0x0105:
            X.1rQ r0 = new X.1rQ
            r0.<init>(r9)
            java.util.List r1 = r0.A00
            X.1rQ r0 = new X.1rQ
            r0.<init>(r1)
            r7.A00 = r0
            r3.BrD(r0)
            r9 = 3
            goto L_0x00a6
        L_0x0118:
            com.whatsapp.stickers.flow.StickerPackFlow r1 = r12.this$0
            r0 = 1
            X.4HP r2 = new X.4HP
            r2.<init>(r1, r0, r3)
            X.1ih r0 = r1.A03
            r0.A06(r2)
            com.whatsapp.stickers.flow.StickerPackFlow r1 = r12.this$0
            X.3zW r0 = new X.3zW
            r0.<init>(r2, r1)
            r12.L$0 = r4
            r12.L$1 = r4
            r12.L$2 = r4
            r12.L$3 = r4
            r12.label = r6
            java.lang.Object r0 = X.C57732u7.A00(r12, r0, r3)
            if (r0 != r5) goto L_0x0016
            return r5
        L_0x013d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        StickerPackFlow$packFlow$1 stickerPackFlow$packFlow$1 = new StickerPackFlow$packFlow$1(this.this$0, r4);
        stickerPackFlow$packFlow$1.L$0 = obj;
        return stickerPackFlow$packFlow$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$getInformation$2", f = "SearchFunStickersViewModel.kt", i = {3, 4, 4, 5, 6}, l = {298, 305, 306, 307, 312, 325, 327}, m = "invokeSuspend", n = {"result", "response", "funStickerModel", "response", "response"}, s = {"L$0", "L$0", "L$3", "L$0", "L$0"})
public final class SearchFunStickersViewModel$getInformation$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $prompt;
    public final /* synthetic */ boolean $shouldTriggerWithDelay;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$getInformation$2(SearchFunStickersViewModel searchFunStickersViewModel, String str, C84814Du r4, boolean z) {
        super(r4, 2);
        this.$shouldTriggerWithDelay = z;
        this.this$0 = searchFunStickersViewModel;
        this.$prompt = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r12.this$0.A06.A0G(new X.AnonymousClass1UF(r12.$prompt));
        r1 = r12.this$0;
        r12.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r1.A0E(r12) != r3) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r9 = r12.this$0.A0L;
        r7 = r12.$prompt;
        r12.label = 3;
        r6 = X.C57702u4.A02(r12);
        r9.A01.B0i(X.AnonymousClass2B5.A00, X.C67313Ou.A06, new X.AnonymousClass3OZ(r9, r7)).Bh4(new X.C86424Kb(r6, 0));
        r13 = r6.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0071, code lost:
        if (r13 != r3) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0073, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        r2 = (java.util.List) r13;
        r4 = r12.this$0;
        r1 = r2.size();
        r12.L$0 = r2;
        r12.label = 4;
        r9 = r4.A0M;
        r0 = (long) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008a, code lost:
        if (r9.A02 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        if (X.C616131n.A00(r12, r9.A0A, new com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMetadataReturned$2(r9, (X.C84814Du) null, r0)) != r3) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009a, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009b, code lost:
        r0 = X.C59022wD.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009d, code lost:
        if (r0 == r3) goto L_0x0027;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        if (r0 != r3) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
        r3 = X.AnonymousClass001.A0s();
        r6 = r12.this$0;
        r7 = r2.iterator();
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        if (r7.hasNext() == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b9, code lost:
        r9 = (X.AnonymousClass39D) r7.next();
        r11 = r6.A0M;
        r10 = r9.A00;
        r4 = r9.A01;
        r12.L$0 = r3;
        r12.L$1 = r6;
        r12.L$2 = r7;
        r12.L$3 = r9;
        r12.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00dc, code lost:
        if (X.C616131n.A00(r12, r11.A0A, new com.whatsapp.funstickers.logging.FunStickersFetchLogger$assignServerDurations$2(r11, r10, r4, (X.C84814Du) null)) == r5) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00de, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e0, code lost:
        if (X.C59022wD.A00 != r5) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e2, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f6, code lost:
        r3.add(new X.AnonymousClass1UD(r9, (X.AnonymousClass39M) null, r9.A05, false));
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0103, code lost:
        r8 = true ^ r3.isEmpty();
        r1 = r12.this$0;
        r12.L$0 = r3;
        r12.L$1 = null;
        r12.L$2 = null;
        r12.L$3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0113, code lost:
        if (r8 == false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0115, code lost:
        r12.label = 6;
        r4 = r1.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011c, code lost:
        if (r4.A02 == null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012a, code lost:
        if (X.C616131n.A00(r12, r4.A0A, new com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMediaDownloaded$2(r4, (X.C84814Du) null)) != r5) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012c, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012d, code lost:
        r12.label = 7;
        r0 = r1.A0M.A01((java.lang.Integer) null, r12, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013a, code lost:
        r0 = X.C59022wD.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013c, code lost:
        if (r0 == r5) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013e, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0140, code lost:
        if (X.C59022wD.A00 != r5) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0142, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0148, code lost:
        r1 = r12.this$0.A0M;
        r1.A03 = r1.A02;
        r1.A02 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0153, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (X.C616231o.A00(r12, r0) == r3) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r13) {
        /*
            r12 = this;
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            r5 = r3
            int r0 = r12.label
            r8 = 1
            switch(r0) {
                case 0: goto L_0x000e;
                case 1: goto L_0x0028;
                case 2: goto L_0x0045;
                case 3: goto L_0x0074;
                case 4: goto L_0x00a2;
                case 5: goto L_0x00e3;
                case 6: goto L_0x0143;
                case 7: goto L_0x0143;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x000e:
            X.C57682u2.A01(r13)
            boolean r0 = r12.$shouldTriggerWithDelay
            if (r0 == 0) goto L_0x002b
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0
            X.1VX r1 = r0.A0G
            r0 = 4614(0x1206, float:6.466E-42)
            long r0 = X.C56952sp.A06(r1, r0)
            r12.label = r8
            java.lang.Object r0 = X.C616231o.A00(r12, r0)
            if (r0 != r3) goto L_0x002b
        L_0x0027:
            return r3
        L_0x0028:
            X.C57682u2.A01(r13)
        L_0x002b:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0
            X.08M r2 = r0.A06
            java.lang.String r1 = r12.$prompt
            X.1UF r0 = new X.1UF
            r0.<init>(r1)
            r2.A0G(r0)
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r1 = r12.this$0
            r0 = 2
            r12.label = r0
            java.lang.Object r0 = r1.A0E(r12)
            if (r0 != r3) goto L_0x0048
            return r3
        L_0x0045:
            X.C57682u2.A01(r13)
        L_0x0048:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0
            X.2Kw r9 = r0.A0L
            java.lang.String r7 = r12.$prompt
            r0 = 3
            r12.label = r0
            X.3dl r6 = X.C57702u4.A02(r12)
            X.4AM r4 = r9.A01
            X.2iy r2 = X.AnonymousClass2B5.A00
            X.3OZ r1 = new X.3OZ
            r1.<init>(r9, r7)
            X.27A r0 = X.C67313Ou.A06
            X.3Ou r2 = r4.B0i(r2, r0, r1)
            r1 = 0
            X.4Kb r0 = new X.4Kb
            r0.<init>(r6, r1)
            r2.Bh4(r0)
            java.lang.Object r13 = r6.A00()
            if (r13 != r3) goto L_0x0077
            return r3
        L_0x0074:
            X.C57682u2.A01(r13)
        L_0x0077:
            r2 = r13
            java.util.List r2 = (java.util.List) r2
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r4 = r12.this$0
            int r1 = r2.size()
            r12.L$0 = r2
            r0 = 4
            r12.label = r0
            X.32l r9 = r4.A0M
            long r0 = (long) r1
            java.lang.Long r4 = r9.A02
            if (r4 == 0) goto L_0x009b
            X.3gB r7 = r9.A0A
            r6 = 0
            com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMetadataReturned$2 r4 = new com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMetadataReturned$2
            r4.<init>(r9, r6, r0)
            java.lang.Object r0 = X.C616131n.A00(r12, r7, r4)
            if (r0 != r3) goto L_0x009b
            return r3
        L_0x009b:
            X.2wD r0 = X.C59022wD.A00
            if (r0 == r3) goto L_0x0027
            if (r0 != r3) goto L_0x00a9
            return r3
        L_0x00a2:
            java.lang.Object r2 = r12.L$0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            X.C57682u2.A01(r13)
        L_0x00a9:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r6 = r12.this$0
            java.util.Iterator r7 = r2.iterator()
        L_0x00b3:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0103
            java.lang.Object r9 = r7.next()
            X.39D r9 = (X.AnonymousClass39D) r9
            X.32l r11 = r6.A0M
            java.lang.Long r10 = r9.A00
            java.lang.Long r4 = r9.A01
            r12.L$0 = r3
            r12.L$1 = r6
            r12.L$2 = r7
            r12.L$3 = r9
            r0 = 5
            r12.label = r0
            X.3gB r2 = r11.A0A
            r1 = 0
            com.whatsapp.funstickers.logging.FunStickersFetchLogger$assignServerDurations$2 r0 = new com.whatsapp.funstickers.logging.FunStickersFetchLogger$assignServerDurations$2
            r0.<init>(r11, r10, r4, r1)
            java.lang.Object r0 = X.C616131n.A00(r12, r2, r0)
            if (r0 == r5) goto L_0x00e2
            X.2wD r0 = X.C59022wD.A00
            if (r0 != r5) goto L_0x00f6
        L_0x00e2:
            return r5
        L_0x00e3:
            java.lang.Object r9 = r12.L$3
            X.39D r9 = (X.AnonymousClass39D) r9
            java.lang.Object r7 = r12.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r6 = r12.L$1
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r6 = (com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel) r6
            java.lang.Object r3 = r12.L$0
            java.util.List r3 = (java.util.List) r3
            X.C57682u2.A01(r13)
        L_0x00f6:
            java.lang.String r4 = r9.A05
            r2 = 0
            r1 = 0
            X.1UD r0 = new X.1UD
            r0.<init>(r9, r2, r4, r1)
            r3.add(r0)
            goto L_0x00b3
        L_0x0103:
            boolean r0 = r3.isEmpty()
            r8 = r8 ^ r0
            r0 = 0
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r1 = r12.this$0
            r12.L$0 = r3
            r12.L$1 = r0
            r12.L$2 = r0
            r12.L$3 = r0
            if (r8 == 0) goto L_0x012d
            r0 = 6
            r12.label = r0
            X.32l r4 = r1.A0M
            java.lang.Long r0 = r4.A02
            if (r0 == 0) goto L_0x013a
            X.3gB r2 = r4.A0A
            r1 = 0
            com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMediaDownloaded$2 r0 = new com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMediaDownloaded$2
            r0.<init>(r4, r1)
            java.lang.Object r0 = X.C616131n.A00(r12, r2, r0)
            if (r0 != r5) goto L_0x013a
            return r5
        L_0x012d:
            r0 = 7
            r12.label = r0
            X.32l r2 = r1.A0M
            r1 = 0
            r0 = 10
            java.lang.Object r0 = r2.A01(r1, r12, r0)
            goto L_0x013c
        L_0x013a:
            X.2wD r0 = X.C59022wD.A00
        L_0x013c:
            if (r0 == r5) goto L_0x00e2
            X.2wD r0 = X.C59022wD.A00
            if (r0 != r5) goto L_0x0148
            return r5
        L_0x0143:
            java.lang.Object r3 = r12.L$0
            X.C57682u2.A01(r13)
        L_0x0148:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r12.this$0
            X.32l r1 = r0.A0M
            java.lang.Long r0 = r1.A02
            r1.A03 = r0
            r0 = 0
            r1.A02 = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$getInformation$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new SearchFunStickersViewModel$getInformation$2(this.this$0, this.$prompt, r6, this.$shouldTriggerWithDelay);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

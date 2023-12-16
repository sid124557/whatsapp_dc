package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$startSearch$1", f = "SearchFunStickersViewModel.kt", i = {0, 1}, l = {223, 249}, m = "invokeSuspend", n = {"$this$launch", "finalException"}, s = {"L$0", "L$0"})
public final class SearchFunStickersViewModel$startSearch$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $prompt;
    public final /* synthetic */ boolean $shouldTriggerWithDelay;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$startSearch$1(SearchFunStickersViewModel searchFunStickersViewModel, String str, C84814Du r4, boolean z) {
        super(r4, 2);
        this.this$0 = searchFunStickersViewModel;
        this.$shouldTriggerWithDelay = z;
        this.$prompt = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fb, code lost:
        if (r0 != r4) goto L_0x0176;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080 A[Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c A[Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r10) {
        /*
            r9 = this;
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r9.label
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 == r2) goto L_0x002d
            if (r0 != r5) goto L_0x0189
            java.lang.Object r3 = r9.L$0
            java.lang.Exception r3 = (java.lang.Exception) r3
            X.C57682u2.A01(r10)
        L_0x0013:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r2 = r9.this$0
            X.32l r1 = r2.A0M
            java.lang.Long r0 = r1.A02
            r1.A03 = r0
            r0 = 0
            r1.A02 = r0
            X.08M r2 = r2.A06
            java.lang.String r1 = r9.$prompt
            X.1UG r0 = new X.1UG
            r0.<init>(r1, r3)
            r2.A0H(r0)
        L_0x002a:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x002d:
            java.lang.Object r6 = r9.L$0
            X.4C6 r6 = (X.AnonymousClass4C6) r6
            goto L_0x0065
        L_0x0032:
            X.C57682u2.A01(r10)
            java.lang.Object r6 = r9.L$0
            X.4C6 r6 = (X.AnonymousClass4C6) r6
            java.lang.String r0 = "SearchFunStickersViewModel/loadStickers/starting job"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r9.this$0     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            java.lang.String r1 = r0.A02     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            if (r1 == 0) goto L_0x004b
            X.1sQ r0 = r0.A0F     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            java.util.Map r0 = r0.A00     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            r0.remove(r1)     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
        L_0x004b:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r8 = r9.this$0     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            boolean r7 = r9.$shouldTriggerWithDelay     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            java.lang.String r3 = r9.$prompt     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            r9.L$0 = r6     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            r9.label = r2     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            X.3gB r2 = r8.A0U     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            r1 = 0
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$getInformation$2 r0 = new com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$getInformation$2     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            r0.<init>(r8, r3, r1, r7)     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            java.lang.Object r10 = X.C616131n.A00(r9, r2, r0)     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            if (r10 != r4) goto L_0x0068
            goto L_0x018e
        L_0x0065:
            X.C57682u2.A01(r10)     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
        L_0x0068:
            java.util.List r10 = (java.util.List) r10     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            java.lang.String r0 = "SearchFunStickersViewModel/loadStickers/Has Results"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            X.4Gl r0 = r6.B61()     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            X.AnonymousClass34A.A02(r0)     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r9.this$0     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            X.08M r3 = r0.A06     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            boolean r0 = r10.isEmpty()     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            if (r0 == 0) goto L_0x008c
            java.lang.String r2 = r9.$prompt     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            r0 = 0
            X.1UG r1 = new X.1UG     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            r1.<init>(r2, r0)     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
        L_0x0088:
            r3.A0H(r1)     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            goto L_0x002a
        L_0x008c:
            java.lang.String r0 = r9.$prompt     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            X.1UI r1 = new X.1UI     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            r1.<init>(r0, r10)     // Catch:{ CancellationException -> 0x0182, Exception -> 0x0094 }
            goto L_0x0088
        L_0x0094:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SearchFunStickersViewModel/loadStickers/General Exception "
            X.C18260x0.A1P(r1, r0, r2)
            boolean r0 = X.AnonymousClass349.A04(r6)
            if (r0 == 0) goto L_0x017b
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r9.this$0
            X.08M r0 = r0.A06
            java.lang.Object r1 = r0.A07()
            X.1UJ r0 = X.AnonymousClass1UJ.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x017b
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r9.this$0
            X.1ip r0 = r0.A0D
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0173
            X.23f r3 = new X.23f
            r3.<init>()
        L_0x00c3:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r1 = r9.this$0
            r9.L$0 = r3
            r9.label = r5
            boolean r0 = r2 instanceof X.C377823z
            if (r0 == 0) goto L_0x0105
            X.23z r2 = (X.C377823z) r2
            int r0 = r2.errorCode
            java.lang.Integer r7 = X.AnonymousClass0x9.A0k(r0)
            r6 = 7
        L_0x00d6:
            java.util.Set r2 = r1.A0T
            java.lang.Integer r0 = X.AnonymousClass0x9.A0k(r6)
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x00fe
            X.1VX r5 = r1.A0G
            r2 = 5325(0x14cd, float:7.462E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r5.A0Y(r0, r2)
            if (r0 != 0) goto L_0x00fe
            X.32l r2 = r1.A0M
            r1 = 0
            r0 = 9
            java.lang.Object r0 = r2.A01(r1, r9, r0)
        L_0x00f7:
            if (r0 == r4) goto L_0x00fd
            X.2wD r0 = X.C59022wD.A00
        L_0x00fb:
            if (r0 != r4) goto L_0x0176
        L_0x00fd:
            return r4
        L_0x00fe:
            X.32l r0 = r1.A0M
            java.lang.Object r0 = r0.A01(r7, r9, r6)
            goto L_0x00f7
        L_0x0105:
            boolean r0 = r2 instanceof X.C377723y
            if (r0 == 0) goto L_0x0114
            X.23y r2 = (X.C377723y) r2
            int r0 = r2.errorCode
            java.lang.Integer r7 = X.AnonymousClass0x9.A0k(r0)
            r6 = 8
            goto L_0x00d6
        L_0x0114:
            boolean r0 = r2 instanceof X.AnonymousClass240
            if (r0 == 0) goto L_0x0123
            X.240 r2 = (X.AnonymousClass240) r2
            int r0 = r2.errorCode
            java.lang.Integer r7 = X.AnonymousClass0x9.A0k(r0)
            r6 = 15
            goto L_0x00d6
        L_0x0123:
            boolean r0 = r2 instanceof X.AnonymousClass241
            if (r0 == 0) goto L_0x0132
            X.241 r2 = (X.AnonymousClass241) r2
            int r0 = r2.errorCode
            java.lang.Integer r7 = X.AnonymousClass0x9.A0k(r0)
            r6 = 12
            goto L_0x00d6
        L_0x0132:
            boolean r0 = r2 instanceof X.AnonymousClass242
            if (r0 == 0) goto L_0x0141
            X.242 r2 = (X.AnonymousClass242) r2
            int r0 = r2.errorCode
            java.lang.Integer r7 = X.AnonymousClass0x9.A0k(r0)
            r6 = 14
            goto L_0x00d6
        L_0x0141:
            boolean r0 = r2 instanceof X.AnonymousClass243
            if (r0 == 0) goto L_0x0150
            X.243 r2 = (X.AnonymousClass243) r2
            int r0 = r2.errorCode
            java.lang.Integer r7 = X.AnonymousClass0x9.A0k(r0)
            r6 = 13
            goto L_0x00d6
        L_0x0150:
            boolean r0 = r2 instanceof X.AnonymousClass245
            if (r0 == 0) goto L_0x0159
            r7 = 0
            r6 = 16
            goto L_0x00d6
        L_0x0159:
            boolean r0 = r2 instanceof X.C377623x
            if (r0 == 0) goto L_0x0165
            X.23x r2 = (X.C377623x) r2
            java.lang.Integer r7 = r2.errorCode
            r6 = 9
            goto L_0x00d6
        L_0x0165:
            boolean r0 = r2 instanceof X.C375923f
            if (r0 != 0) goto L_0x0176
            X.32l r2 = r1.A0M
            r1 = 0
            r0 = 9
            java.lang.Object r0 = r2.A01(r1, r9, r0)
            goto L_0x00fb
        L_0x0173:
            r3 = r2
            goto L_0x00c3
        L_0x0176:
            X.2wD r0 = X.C59022wD.A00
            if (r0 != r4) goto L_0x0013
            return r4
        L_0x017b:
            java.lang.String r0 = "SearchFunStickersViewModel/loadStickers/Start screen"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x002a
        L_0x0182:
            java.lang.String r0 = "SearchFunStickersViewModel/loadStickers/CancellationException"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x002a
        L_0x0189:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x018e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$startSearch$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        SearchFunStickersViewModel$startSearch$1 searchFunStickersViewModel$startSearch$1 = new SearchFunStickersViewModel$startSearch$1(this.this$0, this.$prompt, r6, this.$shouldTriggerWithDelay);
        searchFunStickersViewModel$startSearch$1.L$0 = obj;
        return searchFunStickersViewModel$startSearch$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

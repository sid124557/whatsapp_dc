package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85474Gj;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopLoadingStickers$1$1", f = "SearchFunStickersViewModel.kt", i = {}, l = {377, 379, 380}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$stopLoadingStickers$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ boolean $isRequestCancelled;
    public final /* synthetic */ C85474Gj $it;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$stopLoadingStickers$1$1(SearchFunStickersViewModel searchFunStickersViewModel, C84814Du r3, C85474Gj r4, boolean z) {
        super(r3, 2);
        this.$isRequestCancelled = z;
        this.this$0 = searchFunStickersViewModel;
        this.$it = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r7) {
        /*
            r6 = this;
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 == r2) goto L_0x0036
            if (r0 == r3) goto L_0x0044
            if (r0 != r5) goto L_0x0052
            X.C57682u2.A01(r7)
        L_0x0012:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0015:
            X.C57682u2.A01(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SearchFunStickersViewModel/stopLoadingStickers/isRequestCancelled="
            r1.append(r0)
            boolean r0 = r6.$isRequestCancelled
            X.C18260x0.A1U(r1, r0)
            boolean r0 = r6.$isRequestCancelled
            if (r0 == 0) goto L_0x0039
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r1 = r6.this$0
            r6.label = r2
            r0 = 6
            java.lang.Object r0 = r1.A0F(r6, r0)
            if (r0 != r4) goto L_0x0039
            return r4
        L_0x0036:
            X.C57682u2.A01(r7)
        L_0x0039:
            X.4Gj r0 = r6.$it
            r6.label = r3
            java.lang.Object r0 = X.AnonymousClass34A.A00(r6, r0)
            if (r0 != r4) goto L_0x0047
            return r4
        L_0x0044:
            X.C57682u2.A01(r7)
        L_0x0047:
            r6.label = r5
            r0 = 150(0x96, double:7.4E-322)
            java.lang.Object r0 = X.C616231o.A00(r6, r0)
            if (r0 != r4) goto L_0x0012
            return r4
        L_0x0052:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopLoadingStickers$1$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new SearchFunStickersViewModel$stopLoadingStickers$1$1(this.this$0, r6, this.$it, this.$isRequestCancelled);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

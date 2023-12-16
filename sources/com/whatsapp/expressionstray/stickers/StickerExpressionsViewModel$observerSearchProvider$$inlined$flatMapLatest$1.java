package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4C9;
import X.AnonymousClass4GS;
import X.AnonymousClass4J6;
import X.C57682u2;
import X.C59022wD;
import X.C72923eW;
import X.C75003pT;
import X.C84814Du;
import X.C85474Gj;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1 extends C75003pT implements AnonymousClass4GS {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1(StickerExpressionsViewModel stickerExpressionsViewModel, C84814Du r3) {
        super(r3, 3);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4J6 r0 = new AnonymousClass4J6((Object) new C72923eW((C85474Gj) null, this.this$0.A0G.A01), 4, this.L$1);
            this.label = 1;
            if (r0.Az8(this, (AnonymousClass4C9) this.L$0) == r6 || C59022wD.A00 == r6) {
                return r6;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public /* bridge */ /* synthetic */ Object BGj(Object obj, Object obj2, Object obj3) {
        StickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1 stickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1 = new StickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1(this.this$0, (C84814Du) obj3);
        stickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1.L$0 = obj;
        stickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1.L$1 = obj2;
        return C59022wD.A01(stickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1);
    }
}

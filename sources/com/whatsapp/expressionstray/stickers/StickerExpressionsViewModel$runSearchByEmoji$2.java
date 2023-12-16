package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass001;
import X.AnonymousClass1U7;
import X.AnonymousClass1U9;
import X.AnonymousClass320;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$runSearchByEmoji$2", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$runSearchByEmoji$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ List $allStickers;
    public final /* synthetic */ Set $emojiFilterSet;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$runSearchByEmoji$2(StickerExpressionsViewModel stickerExpressionsViewModel, List list, Set set, C84814Du r5) {
        super(r5, 2);
        this.this$0 = stickerExpressionsViewModel;
        this.$allStickers = list;
        this.$emojiFilterSet = set;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            List A01 = AnonymousClass320.A01(this.$allStickers, this.$emojiFilterSet);
            if (this.this$0.A0J("", A01).isEmpty()) {
                return AnonymousClass1U9.A00;
            }
            return new AnonymousClass1U7(this.this$0.A0J("", A01));
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new StickerExpressionsViewModel$runSearchByEmoji$2(this.this$0, this.$allStickers, this.$emojiFilterSet, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

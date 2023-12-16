package com.whatsapp.conversation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C194510y;
import X.C57682u2;
import X.C59022wD;
import X.C616231o;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$onInput$2", f = "CommentsBottomSheetViewModel.kt", i = {}, l = {224}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheetViewModel$onInput$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C194510y this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheetViewModel$onInput$2(C194510y r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            if (!this.this$0.A02.getAndSet(true)) {
                C194510y r0 = this.this$0;
                r0.A0H.A00(r0.A0G);
                this.label = 1;
                if (C616231o.A00(this, 2500) == r3) {
                    return r3;
                }
            }
            return C59022wD.A00;
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        this.this$0.A02.set(false);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CommentsBottomSheetViewModel$onInput$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new CommentsBottomSheetViewModel$onInput$2(this.this$0, (C84814Du) obj2));
    }
}

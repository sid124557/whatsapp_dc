package com.whatsapp.conversation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C194510y;
import X.C52322lI;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85504Gn;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2", f = "CommentsBottomSheetViewModel.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C194510y this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2(C194510y r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C85504Gn r2 = this.this$0.A0O;
            C52322lI r0 = new C52322lI((Integer) null, (Integer) null, true);
            this.label = 1;
            if (r2.BlD(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2(this.this$0, (C84814Du) obj2));
    }
}

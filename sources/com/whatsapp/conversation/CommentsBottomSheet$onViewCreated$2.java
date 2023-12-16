package com.whatsapp.conversation;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C18270x1;
import X.C52322lI;
import X.C57682u2;
import X.C59022wD;
import X.C69263Wi;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.CommentsBottomSheet$onViewCreated$2", f = "CommentsBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheet$onViewCreated$2 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CommentsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheet$onViewCreated$2(CommentsBottomSheet commentsBottomSheet, C84814Du r3) {
        super(r3, 2);
        this.this$0 = commentsBottomSheet;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C52322lI r4 = (C52322lI) this.L$0;
            if (r4.A02) {
                this.this$0.A1K();
            } else {
                CommentsBottomSheet commentsBottomSheet = this.this$0;
                Integer num = r4.A01;
                if (num != null) {
                    int intValue = num.intValue();
                    C69263Wi r0 = commentsBottomSheet.A02;
                    if (r0 != null) {
                        r0.A0H(intValue, 1);
                    } else {
                        throw C18270x1.A0S("globalUI");
                    }
                }
                Integer num2 = r4.A00;
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    C69263Wi r02 = commentsBottomSheet.A02;
                    if (r02 != null) {
                        r02.A0H(intValue2, 1);
                    } else {
                        throw C18270x1.A0S("globalUI");
                    }
                }
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        CommentsBottomSheet$onViewCreated$2 commentsBottomSheet$onViewCreated$2 = new CommentsBottomSheet$onViewCreated$2(this.this$0, r4);
        commentsBottomSheet$onViewCreated$2.L$0 = obj;
        return commentsBottomSheet$onViewCreated$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

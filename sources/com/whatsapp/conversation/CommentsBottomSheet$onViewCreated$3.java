package com.whatsapp.conversation;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.AnonymousClass4W9;
import X.C162457s7;
import X.C18270x1;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.CommentsBottomSheet$onViewCreated$3", f = "CommentsBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheet$onViewCreated$3 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CommentsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheet$onViewCreated$3(CommentsBottomSheet commentsBottomSheet, C84814Du r3) {
        super(r3, 2);
        this.this$0 = commentsBottomSheet;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            Object obj2 = this.L$0;
            AnonymousClass4W9 r1 = this.this$0.A07;
            if (r1 == null) {
                throw C18270x1.A0S("adapter");
            }
            C162457s7.A0J(obj2, 0);
            int indexOf = r1.A01.A02.indexOf(obj2);
            if (indexOf >= 0) {
                r1.A06(indexOf);
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        CommentsBottomSheet$onViewCreated$3 commentsBottomSheet$onViewCreated$3 = new CommentsBottomSheet$onViewCreated$3(this.this$0, r4);
        commentsBottomSheet$onViewCreated$3.L$0 = obj;
        return commentsBottomSheet$onViewCreated$3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

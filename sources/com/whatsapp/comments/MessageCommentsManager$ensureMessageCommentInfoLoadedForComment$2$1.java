package com.whatsapp.comments;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C624134x;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForComment$2$1", f = "MessageCommentsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MessageCommentsManager$ensureMessageCommentInfoLoadedForComment$2$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int $it;
    public final /* synthetic */ C624134x $message;
    public int label;
    public final /* synthetic */ MessageCommentsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageCommentsManager$ensureMessageCommentInfoLoadedForComment$2$1(MessageCommentsManager messageCommentsManager, C624134x r3, C84814Du r4, int i) {
        super(r4, 2);
        this.this$0 = messageCommentsManager;
        this.$message = r3;
        this.$it = i;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            this.this$0.A05.A0C(this.$message, this.$it);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new MessageCommentsManager$ensureMessageCommentInfoLoadedForComment$2$1(this.this$0, this.$message, r6, this.$it);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}

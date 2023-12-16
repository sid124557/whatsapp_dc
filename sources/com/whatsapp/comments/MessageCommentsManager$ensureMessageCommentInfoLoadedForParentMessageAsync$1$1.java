package com.whatsapp.comments;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C624134x;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessageAsync$1$1", f = "MessageCommentsManager.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessageAsync$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GQ $callback;
    public final /* synthetic */ C624134x $parentCommentMessage;
    public int label;
    public final /* synthetic */ MessageCommentsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessageAsync$1$1(MessageCommentsManager messageCommentsManager, C624134x r3, C84814Du r4, AnonymousClass4GQ r5) {
        super(r4, 2);
        this.this$0 = messageCommentsManager;
        this.$parentCommentMessage = r3;
        this.$callback = r5;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            MessageCommentsManager messageCommentsManager = this.this$0;
            C624134x r0 = this.$parentCommentMessage;
            this.label = 1;
            if (messageCommentsManager.B2Z(r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        AnonymousClass4GQ r1 = this.$callback;
        if (r1 != null) {
            r1.invoke(this.$parentCommentMessage);
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessageAsync$1$1(this.this$0, this.$parentCommentMessage, r6, this.$callback);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
